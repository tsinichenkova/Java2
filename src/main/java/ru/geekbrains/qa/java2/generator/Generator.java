package ru.geekbrains.qa.java2.generator;

import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;

public class Generator {
    public static void main(String[] args) throws IOException {
        createFullPatient();
    }

    public static void createFullPatient() throws IOException {
        String message = Utils.prepareFile();
        Long patientId = Instant.now().toEpochMilli();

        HashMap<String, Integer> nodes = new HashMap<>();
        nodes.put("$.patient.clinicalGroups", 2);
        nodes.put("$.patient.registrations", 1);
        message = Utils.copyNodes(message, nodes);

        HashMap<String, String> values = new HashMap<>();
        values.put("$.patient.id.value", patientId.toString());
        values.put("$.patient.registrations[0].endDate.value", null);
        values.put("$.patient.personalData.lastName.value", "Иванов");
        values.put("$.patient.personalData.firstName.value", "Иван");
        values.put("$.patient.personalData.middleName.value", "Иванович");
        values.put("$.patient.personalData.birthDate.value", "1945-05-12");
        values.put("$.patient.personalData.gender.value.code", "1");
        values.put("$.patient.personalData.patientPolicy.number.value", "864512312464");
        values.put("$.patient.clinicalGroups[0].value.value.value", "Iб");
        values.put("$.patient.clinicalGroups[1].value.value.value", "IIа");
        values.put("$.patient.clinicalGroups[2].value.value.value", "III");
        values.put("$.patient.registrationStatus.value.code", "1");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, patientId + ".json");
    }
}
