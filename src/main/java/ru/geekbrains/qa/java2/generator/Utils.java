package ru.geekbrains.qa.java2.generator;


import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static String readFromFiles(String fileName) throws IOException {
        return IOUtils.toString(Utils.class.getResourceAsStream(fileName), "UTF-8");
    }

    public static void writeToFile(String data, String fileName) throws IOException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String prepareFile() throws IOException {
        String message = Utils.readFromFiles("/dataSlice.json");

        String TermExample = Utils.readFromFiles("/DataValue/TermExample.json");
        String dataValueBoolean = Utils.readFromFiles("/DataValue/DataValueBoolean.json");
        String dataValueDouble = Utils.readFromFiles("/DataValue/DataValueDouble.json");
        String dataValueInteger = Utils.readFromFiles("/DataValue/DataValueInteger.json");
        String dataValueLocalDate = Utils.readFromFiles("/DataValue/DataValueLocalDate.json");
        String dataValueLocalDateTime = Utils.readFromFiles("/DataValue/DataValueLocalDateTime.json");
        String dataValueLong = Utils.readFromFiles("/DataValue/DataValueLong.json");
        String dataValueString = Utils.readFromFiles("/DataValue/DataValueString.json");
        String dataValueTerm = Utils.readFromFiles("/DataValue/DataValueTerm.json");

        LocalDateTime localDateTime = LocalDateTime.now();
        message = message.replace("\"Term\"", TermExample);
        message = message.replace("\"LocalDateTime\"", "\"" + localDateTime + "\"");
        message = message.replace("\"DataValue<Boolean>\"", dataValueBoolean);
        message = message.replace("\"DataValue<Double>\"", dataValueDouble);
        message = message.replace("\"DataValue<Integer>\"", dataValueInteger);
        message = message.replace("\"DataValue<LocalDate>\"", dataValueLocalDate);
        message = message.replace("\"DataValue<LocalDateTime>\"", dataValueLocalDateTime);
        message = message.replace("\"DataValue<Long>\"", dataValueLong);
        message = message.replace("\"DataValue<String>\"", dataValueString);
        message = message.replace("\"DataValue<Term>\"", dataValueTerm);

        HashMap<String, String> schemas = prepareSchemas();
        message = replaceValues(message, schemas);

        return message;
    }

    public static HashMap<String, String> prepareSchemas() {
        HashMap<String, String> schemas = new HashMap<>();
        schemas.put("$.diagnoses[0].autopsyResult.value.schema", "ru.mos.emias.terminology.oncods.autopsy");
        schemas.put("$.diagnoses[0].therapy.radioTherapies[0].kind.value.schema", "ru.mos.emias.terminology.oncods.type-radiation-therapy");
        schemas.put("$.diagnoses[0].geneticsAbnormalities[0].value.value.schema", "ru.mos.emias.terminology.oncods.genetic-disorder");
        schemas.put("$.diagnoses[0].immunohistochemicalTypes[0].significative.value.schema", "ru.mos.emias.terminology.oncods.ihc");
        schemas.put("$.patient.disability.value.schema", "ru.mos.emias.terminology.oncods.disablement");

        return schemas;
    }

    public static String replaceValues(String message, HashMap<String, String> values) throws IOException {
        for (Map.Entry<String, String> entry : values.entrySet()) {
            DocumentContext doc = JsonPath.parse(message).set(entry.getKey(), entry.getValue());
            message = doc.jsonString();
        }
        return message;
    }
}
