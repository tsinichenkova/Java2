package ru.geekbrains.qa.java2.generator;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;


public class Generator {

    private static String defaultFilePathForCR = "/defaultDataSlice.json";
    private static String defaultFilePathForNullCR = "/defaultDataSliceNullCR.json";

    public static String id = "$.id";
    public static String createTimestamp = "$.feederAudit.createTimestamp";
    public static String patientId = "$.patient.id.value";
    public static String registrationsEndDate = "$.patient.registrations[0].endDate.value";
    public static String registrationsStartDate = "$.patient.registrations[0].startDate.value";
    public static String registrationsRegistered = "$.patient.registrations[0].registered.value.code";
    public static String registrationsRegisteredValue = "$.patient.registrations[0].registered.value.value";
    public static String registrationsRemoveCause = "$.patient.registrations[0].removeCause.value.code";
    public static String registrationsRemoveCauseValue = "$.patient.registrations[0].removeCause.value.value";
    public static String registrations2EndDate = "$.patient.registrations[1].endDate.value";
    public static String registrations2StartDate = "$.patient.registrations[1].startDate.value";
    public static String registrations2Registered = "$.patient.registrations[1].registered.value.code";
    public static String registrations2RegisteredValue = "$.patient.registrations[1].registered.value.value";
    public static String registrations2RemoveCause = "$.patient.registrations[1].removeCause.value.code";
    public static String registrations2RemoveCauseValue = "$.patient.registrations[1].removeCause.value.value";
    public static String lastName = "$.patient.personalData.lastName.value";
    public static String historicalLastName = "$.patient.personalData.lastName.historicalDataValues[0].value";
    public static String firstName = "$.patient.personalData.firstName.value";
    public static String middleName = "$.patient.personalData.middleName.value";
    public static String birthDate = "$.patient.personalData.birthDate.value";
    public static String gender = "$.patient.personalData.gender.value.code";
    public static String genderValue = "$.patient.personalData.gender.value.value";
    public static String patientPolicy = "$.patient.personalData.patientPolicy.number.value";
    public static String clinicalGroups = "$.patient.clinicalGroups[0].value.value.code";
    public static String clinicalGroupsValue = "$.patient.clinicalGroups[0].value.value.value";
    public static String clinicalGroups2 = "$.patient.clinicalGroups[1].value.value.code";
    public static String clinicalGroups2Value = "$.patient.clinicalGroups[1].value.value.value";
    public static String clinicalGroups3 = "$.patient.clinicalGroups[2].value.value.code";
    public static String clinicalGroups3Value = "$.patient.clinicalGroups[2].value.value.value";
    public static String registrationStatus = "$.patient.registrationStatus.value.code";
    public static String registrationStatusValue = "$.patient.registrationStatus.value.value";
    public static String diagnosesValue = "$.diagnoses[0].value.value.code";
    public static String diagnosesValueValue = "$.diagnoses[0].value.value.value";
    public static String historicalDiagnosesValue = "$.diagnoses[0].value.historicalDataValues[0].value.code";
    public static String historicalDiagnosesValueValue = "$.diagnoses[0].value.historicalDataValues[0].value.value";
    public static String diagnosesTNMStageStage = "$.diagnoses[0].stage.tNMStage.stage.value.code";
    public static String diagnosesTNMStageStageValue = "$.diagnoses[0].stage.tNMStage.stage.value.value";
    public static String diagnoses2Value = "$.diagnoses[1].value.value.code";
    public static String diagnoses2ValueValue = "$.diagnoses[1].value.value.value";
    public static String diagnoses2TNMStageStage = "$.diagnoses[1].stage.tNMStage.stage.value.code";
    public static String diagnoses2TNMStageStageValue = "$.diagnoses[1].stage.tNMStage.stage.value.value";
    public static String diagnosesDispensaryRegistrationsEndDate = "$.diagnoses[0].dispensaryRegistrations[0].endDate.value";
    public static String diagnosesDispensaryRegistrationsObservingOrganization = "$.diagnoses[0].dispensaryRegistrations[0].observingOrganization.value.value.code";
    public static String diagnosesDispensaryRegistrationsObservingOrganizationValue = "$.diagnoses[0].dispensaryRegistrations[0].observingOrganization.value.value.value";
    public static String diagnosesDispensaryRegistrations2EndDate = "$.diagnoses[0].dispensaryRegistrations[1].endDate.value";
    public static String diagnosesDispensaryRegistrations2ObservingOrganization = "$.diagnoses[0].dispensaryRegistrations[1].observingOrganization.value.value.code";
    public static String diagnosesDispensaryRegistrations2ObservingOrganizationValue = "$.diagnoses[0].dispensaryRegistrations[1].observingOrganization.value.value.value";
    public static String diagnosesDispensaryRegistrations3EndDate = "$.diagnoses[0].dispensaryRegistrations[2].endDate.value";
    public static String diagnosesDispensaryRegistrations3ObservingOrganization = "$.diagnoses[0].dispensaryRegistrations[2].observingOrganization.value.value.code";
    public static String diagnosesDispensaryRegistrations3ObservingOrganizationValue = "$.diagnoses[0].dispensaryRegistrations[2].observingOrganization.value.value.value";
    public static String diagnoses2DispensaryRegistrationsEndDate = "$.diagnoses[1].dispensaryRegistrations[0].endDate.value";
    public static String diagnoses2DispensaryRegistrationsObservingOrganization = "$.diagnoses[1].dispensaryRegistrations[0].observingOrganization.value.value.code";
    public static String diagnoses2DispensaryRegistrationsObservingOrganizationValue = "$.diagnoses[1].dispensaryRegistrations[0].observingOrganization.value.value.value";
    public static String diagnosesPatientAgeAtEstablish = "$.diagnoses[0].patientAgeAtEstablish.value";
    public static String diagnoses2PatientAgeAtEstablish = "$.diagnoses[1].patientAgeAtEstablish.value";
    public static String diagnosesEstablishDate = "$.diagnoses[0].establishDate.value";
    public static String diagnoses2EstablishDate = "$.diagnoses[1].establishDate.value";
    public static String diagnosesIsMultiple = "$.diagnoses[0].isMultiple.value.code";
    public static String diagnosesIsMultipleValue = "$.diagnoses[0].isMultiple.value.value";
    public static String diagnoses2IsMultiple = "$.diagnoses[1].isMultiple.value.code";
    public static String diagnoses2IsMultipleValue = "$.diagnoses[1].isMultiple.value.value";
    public static String diagnosesSide = "$.diagnoses[0].side.value.code";
    public static String diagnosesSideValue = "$.diagnoses[0].side.value.value";
    public static String diagnoses2Side = "$.diagnoses[1].side.value.code";
    public static String diagnoses2SideValue = "$.diagnoses[1].side.value.value";
    public static String diagnosesConfirmationMethod = "$.diagnoses[0].confirmationMethod.value.code";
    public static String diagnosesConfirmationMethodValue = "$.diagnoses[0].confirmationMethod.value.value";
    public static String diagnoses2ConfirmationMethod = "$.diagnoses[1].confirmationMethod.value.code";
    public static String diagnoses2ConfirmationMethodValue = "$.diagnoses[1].confirmationMethod.value.value";
    public static String diagnosesSituationDetection = "$.diagnoses[0].situationDetection.value.code";
    public static String diagnosesSituationDetectionValue = "$.diagnoses[0].situationDetection.value.value";
    public static String diagnoses2SituationDetection = "$.diagnoses[1].situationDetection.value.code";
    public static String diagnoses2SituationDetectionValue = "$.diagnoses[1].situationDetection.value.value";
    public static String diagnosesTherapyPerformed = "$.diagnoses[0].therapy.therapyPerformed.value.code";
    public static String diagnosesTherapyPerformedValue = "$.diagnoses[0].therapy.therapyPerformed.value.value";
    public static String diagnoses2TherapyPerformed = "$.diagnoses[1].therapy.therapyPerformed.value.code";
    public static String diagnoses2TherapyPerformedValue = "$.diagnoses[1].therapy.therapyPerformed.value.value";
    public static String diagnosesMorphologicalType = "$.diagnoses[0].morphologicalType.value.code";
    public static String diagnosesMorphologicalTypeValue = "$.diagnoses[0].morphologicalType.value.value";
    public static String diagnoses2MorphologicalType = "$.diagnoses[1].morphologicalType.value.code";
    public static String diagnoses2MorphologicalTypeValue = "$.diagnoses[1].morphologicalType.value.value";
    public static String diagnosesImmunohistochemicalTypes = "$.diagnoses[0].immunohistochemicalTypes[0].terminologicalResult.value.code";
    public static String diagnosesImmunohistochemicalTypesValue = "$.diagnoses[0].immunohistochemicalTypes[0].terminologicalResult.value.value";
    public static String diagnosesImmunohistochemicalTypes2 = "$.diagnoses[0].immunohistochemicalTypes[1].terminologicalResult.value.code";
    public static String diagnosesImmunohistochemicalTypesValue2 = "$.diagnoses[0].immunohistochemicalTypes[1].terminologicalResult.value.value";
    public static String diagnoses2ImmunohistochemicalTypes = "$.diagnoses[1].immunohistochemicalTypes[1].terminologicalResult.value.code";
    public static String diagnoses2ImmunohistochemicalTypesValue = "$.diagnoses[1].immunohistochemicalTypes[1].terminologicalResult.value.value";
    public static String diagnosesMolecularGeneticTypes = "$.diagnoses[0].molecularGeneticTypes[0].terminologicalResult.value.code";
    public static String diagnosesMolecularGeneticTypesValue = "$.diagnoses[0].molecularGeneticTypes[0].terminologicalResult.value.value";
    public static String diagnosesMolecularGeneticTypes2 = "$.diagnoses[0].molecularGeneticTypes[1].terminologicalResult.value.code";
    public static String diagnosesMolecularGeneticTypesValue2 = "$.diagnoses[0].molecularGeneticTypes[1].terminologicalResult.value.value";
    public static String diagnoses2MolecularGeneticTypes = "$.diagnoses[0].molecularGeneticTypes[1].terminologicalResult.value.code";
    public static String diagnoses2MolecularGeneticTypesValue = "$.diagnoses[0].molecularGeneticTypes[1].terminologicalResult.value.value";
    public static String diagnosesStateControlsTurnoutDate = "$.diagnoses[0].stateControls[0].turnoutDate.value";
    public static String diagnosesStateControls2TurnoutDate = "$.diagnoses[0].stateControls[1].turnoutDate.value";
    public static String diagnoses2StateControlsTurnoutDate = "$.diagnoses[0].stateControls[1].turnoutDate.value";
    public static String yearsStatesValue = "$.patient.yearsStates[0].value.value.code";
    public static String yearsStatesValueValue = "$.patient.yearsStates[0].value.value.value";
    public static String yearsStatesValue2 = "$.patient.yearsStates[1].value.value.code";
    public static String yearsStatesValueValue2 = "$.patient.yearsStates[1].value.value.value";
    public static String yearsStatesYear = "$.patient.yearsStates[0].year.value";
    public static String yearsStatesYear2 = "$.patient.yearsStates[1].year.value";
    public static String diagnosesObservingOrganization = "$.diagnoses[0].observingOrganization.value.value.code";
    public static String diagnosesObservingOrganizationValue = "$.diagnoses[0].observingOrganization.value.value.value";
    public static String diagnoses2ObservingOrganization = "$.diagnoses[1].observingOrganization.value.value.code";
    public static String diagnoses2ObservingOrganizationValue = "$.diagnoses[1].observingOrganization.value.value.value";

    public static void main(String[] args) throws IOException {
        createDefaultFullPatientForCR();
        createFullPatientForTumorRegistry();
        createFullPatientForNullCR();

        createPatientForCR_1();
        createPatientForCR_2();
        createPatientForCR_3();
        createPatientForCR_4();
        createPatientForCR_5();
        createPatientForCR_6();
        createPatientForCR_7();
        createPatientForCR_8();
        createPatientForCR_9();
        createPatientForCR_10();
        createPatientForCR_11();
        createPatientForCR_12();
        createPatientForCR_13();
        createPatientForCR_14();
        createPatientForCR_15();
        createPatientForCR_16();
        createPatientForCR_17();
        createPatientForCR_18();
        createPatientForCR_19();
        createPatientForCR_20();
        createPatientForCR_21();
        createPatientForCR_22();
        createPatientForCR_23();
        createPatientForCR_24();
        createPatientForCR_25();
        createPatientForCR_26();
        createPatientForCR_27();
        createPatientForCR_28();
        createPatientForCR_29();
        createPatientForCR_30();
        createPatientForCR_31();
        createPatientForCR_32();
        createPatientForCR_33();
        createPatientForCR_34();
        createPatientForCR_35();
        createPatientForCR_36();
        createPatientForCR_37();
        createPatientForCR_38();
        createPatientForCR_39();
        createPatientForCR_40();
        createPatientForCR_41();
    }

//    полный пациент для поиска пациентов КР
    public static void createDefaultFullPatientForCR() throws IOException {
        String message = Utils.prepareFile("/dataSlice.json");
        Long patientIdValue = 1L;

        HashMap<String, Integer> nodes = new HashMap<>();
        nodes.put("$.patient.clinicalGroups", 2);
        nodes.put("$.patient.registrations", 1);
        nodes.put("$.diagnoses", 1);
        nodes.put("$.diagnoses[0].dispensaryRegistrations", 2);
        message = Utils.copyNodes(message, nodes);

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());

        values.put(registrationsEndDate, "2020-10-15");
        values.put(registrationsStartDate, "2019-02-15");
        values.put(registrationsRegistered, "2");
        values.put(registrationsRegisteredValue, "при жизни, повторно");
        values.put(registrationsRemoveCause, "2");
        values.put(registrationsRemoveCauseValue, "диагноз не подтвердился");

        values.put(lastName, "Иванов");
        values.put(firstName, "Иван");
        values.put(middleName, "Иванович");
        values.put(birthDate, "1945-05-12");
        values.put(gender, "1");
        values.put(genderValue, "Мужской");
        values.put(patientPolicy, "864512312464");

        values.put(clinicalGroups, "7");
        values.put(clinicalGroupsValue, "Iб");
        values.put(clinicalGroups2, "2");
        values.put(clinicalGroups2Value, "IIа");
        values.put(clinicalGroups3, "4");
        values.put(clinicalGroups3Value, "III");

        values.put(registrationStatus, "1");
        values.put(registrationStatusValue, "Стоит на учете");

        values.put(registrations2Registered, "1");
        values.put(registrations2RegisteredValue, "при жизни, впервые");
        values.put(registrations2RemoveCause, "2");
        values.put(registrations2RemoveCauseValue, "диагноз не подтвердился");
        values.put(registrations2StartDate, "2015-01-05");
        values.put(registrations2EndDate, "2016-12-06");

//        1 диагноз
        values.put(diagnosesValue, "C50.1");
        values.put(diagnosesValueValue, "Злокачественное новообразование центральной части молочной железы");
        values.put(diagnosesTNMStageStage, "1");
        values.put(diagnosesTNMStageStageValue, "IA");
        values.put(diagnosesDispensaryRegistrationsEndDate, "2019-05-06");
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "10468653");
        values.put(diagnosesDispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ № 40 ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations2EndDate, "2018-01-06");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "100000090538");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganizationValue, "ГБУЗ \"МКНЦ им. А.С. Логинова ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations3EndDate, "2017-05-06");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganization, "10267753");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\"");
        values.put(diagnosesPatientAgeAtEstablish, "46");

//        2 диагноз
        values.put(diagnoses2Value, "C45");
        values.put(diagnoses2ValueValue, "Мезотелиома");
        values.put(diagnoses2TNMStageStage, "3");
        values.put(diagnoses2TNMStageStageValue, "IC");
        values.put(diagnoses2DispensaryRegistrationsEndDate, "2017-06-06");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "11394228");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\" (ЦАОП СВАО)");
        values.put(diagnoses2PatientAgeAtEstablish, "30");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "src/main/resources" + defaultFilePathForCR);
    }

    //    полный пациент для поиска реестра опухолей
    public static void createFullPatientForTumorRegistry() throws IOException {
        String message = Utils.prepareFile("/dataSlice.json");
        Long patientIdValue = 2L;

        HashMap<String, Integer> nodes = new HashMap<>();
        nodes.put("$.patient.registrations", 1);
        nodes.put("$.diagnoses", 1);
        nodes.put("$.diagnoses[0].dispensaryRegistrations", 2);
        nodes.put("diagnoses[0].immunohistochemicalTypes", 1);
        nodes.put("diagnoses[0].molecularGeneticTypes", 1);
        nodes.put("diagnoses[0].stateControls", 1);
        message = Utils.copyNodes(message, nodes);

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());

        values.put(registrationsEndDate, null);
        values.put(registrationsStartDate, "2021-02-15");
        values.put(registrationsRegistered, "1");
        values.put(registrationsRegisteredValue, "при жизни, впервые");
        values.put(registrationsRemoveCause, "2");
        values.put(registrationsRemoveCauseValue, "диагноз не подтвердился");

        values.put(registrations2Registered, "3");
        values.put(registrations2RegisteredValue, "посмертно, ранее не состоял");
        values.put(registrations2RemoveCause, "5");
        values.put(registrations2RemoveCauseValue, "умер от осложнений лечения");
        values.put(registrations2StartDate, "2020-01-05");
        values.put(registrations2EndDate, "2021-12-06");

//        1 диагноз
        values.put(diagnosesValue, "C50.1");
        values.put(diagnosesValueValue, "Злокачественное новообразование центральной части молочной железы");
        values.put(diagnosesEstablishDate, "2011-06-04");
        values.put(diagnosesTNMStageStage, "1");
        values.put(diagnosesTNMStageStageValue, "IA");
        values.put(diagnosesIsMultiple, null);
        values.put(diagnosesIsMultipleValue, "Метахронная");
        values.put(diagnosesSide, null);
        values.put(diagnosesSideValue, "Двусторонняя");
        values.put(diagnosesConfirmationMethod, "1");
        values.put(diagnosesConfirmationMethodValue, "морфологический");
        values.put(diagnosesSituationDetection, "3");
        values.put(diagnosesSituationDetectionValue, "активно, в смотровом кабинете");
        values.put(diagnosesTherapyPerformed, "2");
        values.put(diagnosesTherapyPerformedValue, "радикальное неполное");
        values.put(diagnosesMorphologicalType, "8000/6");
        values.put(diagnosesMorphologicalTypeValue, "8000/6 Новообразование, метастатическое");
        values.put(diagnosesImmunohistochemicalTypes, "15");
        values.put(diagnosesImmunohistochemicalTypesValue, "CD30");
        values.put(diagnosesImmunohistochemicalTypes2, "21");
        values.put(diagnosesImmunohistochemicalTypesValue2, "CD5");
        values.put(diagnosesMolecularGeneticTypes, "8");
        values.put(diagnosesMolecularGeneticTypesValue, "CBL");
        values.put(diagnosesMolecularGeneticTypes2, "23");
        values.put(diagnosesMolecularGeneticTypesValue2, "IDH");
        values.put(diagnosesStateControlsTurnoutDate, "2015-06-08");
        values.put(diagnosesStateControls2TurnoutDate, "2014-08-09");
        values.put(diagnosesDispensaryRegistrationsEndDate, "2021-05-06");
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "10468653");
        values.put(diagnosesDispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ № 40 ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations2EndDate, "2020-01-06");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "100000090538");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganizationValue, "ГБУЗ \"МКНЦ им. А.С. Логинова ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations3EndDate, "2019-05-06");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganization, "10267753");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\"");

//      2 диагноз
        values.put(diagnoses2Value, "C45");
        values.put(diagnoses2ValueValue, "Мезотелиома");
        values.put(diagnoses2EstablishDate, "2015-06-04");
        values.put(diagnoses2TNMStageStage, "3");
        values.put(diagnoses2TNMStageStageValue, "IC");
        values.put(diagnoses2IsMultiple, null);
        values.put(diagnoses2IsMultipleValue, "Неизвестно");
        values.put(diagnoses2Side, null);
        values.put(diagnoses2SideValue, "Слева");
        values.put(diagnoses2ConfirmationMethod, "5");
        values.put(diagnoses2ConfirmationMethodValue, "только клинический");
        values.put(diagnoses2SituationDetection, "6");
        values.put(diagnoses2SituationDetectionValue, "при других обстоятельствах");
        values.put(diagnoses2TherapyPerformed, "3");
        values.put(diagnoses2TherapyPerformedValue, "паллиативное");
        values.put(diagnoses2MorphologicalType, "8003/3");
        values.put(diagnoses2MorphologicalTypeValue, "8003/3 Злокачественная опухоль, гигантоклеточная");
        values.put(diagnoses2ImmunohistochemicalTypes, "42");
        values.put(diagnoses2ImmunohistochemicalTypesValue, "PAX-5");
        values.put(diagnoses2MolecularGeneticTypes, "32");
        values.put(diagnoses2MolecularGeneticTypesValue, "LNK");
        values.put(diagnoses2StateControlsTurnoutDate, "2012-08-09");
        values.put(diagnoses2DispensaryRegistrationsEndDate, "2019-06-06");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "11394228");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\" (ЦАОП СВАО)");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "tumorRegistry/full_patient_" + patientIdValue + ".json");
    }

    //    полный пациент для поиска пациентов в нулевом КР
    public static void createFullPatientForNullCR() throws IOException {
        String message = Utils.prepareFile("/dataSlinceNullCR.json");
        Long patientIdValue = 3L;

        HashMap<String, Integer> nodes = new HashMap<>();
        nodes.put("$.patient.registrations", 1);
        nodes.put("$.patient.yearsStates", 1);
        nodes.put("$.diagnoses", 1);
        message = Utils.copyNodes(message, nodes);

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());

        values.put(registrationsEndDate, null);
        values.put(registrationsStartDate, "2021-02-15");
        values.put(registrationsRegistered, "1");
        values.put(registrationsRegisteredValue, "при жизни, впервые");
        values.put(registrationsRemoveCause, "2");
        values.put(registrationsRemoveCauseValue, "диагноз не подтвердился");

        values.put(lastName, "Иванов");
        values.put(firstName, "Иван");
        values.put(middleName, "Иванович");
        values.put(birthDate, "1945-05-12");
        values.put(gender, "1");
        values.put(genderValue, "Мужской");
        values.put(patientPolicy, "864512312464");

        values.put(registrationStatus, "1");
        values.put(registrationStatusValue, "Стоит на учете");

        values.put(registrations2Registered, "3");
        values.put(registrations2RegisteredValue, "посмертно, ранее не состоял");
        values.put(registrations2RemoveCause, "5");
        values.put(registrations2RemoveCauseValue, "умер от осложнений лечения");
        values.put(registrations2StartDate, "2020-01-05");
        values.put(registrations2EndDate, "2021-12-06");

        values.put(yearsStatesValue, "1");
        values.put(yearsStatesValueValue, "Ia");
        values.put(yearsStatesValue2, "6");
        values.put(yearsStatesValueValue2, "IV");
        values.put(yearsStatesYear, String.valueOf(LocalDate.now().minusYears(1).getYear()));
        values.put(yearsStatesYear2, String.valueOf(LocalDate.now().minusYears(2).getYear()));

//        1 диагноз
        values.put(diagnosesValue, "C50.1");
        values.put(diagnosesValueValue, "Злокачественное новообразование центральной части молочной железы");
        values.put(diagnosesEstablishDate, "2011-06-04");
        values.put(diagnosesPatientAgeAtEstablish, "46");
        values.put(diagnosesObservingOrganization, "127");
        values.put(diagnosesObservingOrganizationValue, "ГБУЗ \"ГП № 22 ДЗМ\" филиал 1");

//        2 диагноз
        values.put(diagnoses2Value, "C45");
        values.put(diagnoses2ValueValue, "Мезотелиома");
        values.put(diagnoses2EstablishDate, "2013-06-04");
        values.put(diagnoses2PatientAgeAtEstablish, "30");
        values.put(diagnoses2ObservingOrganization, "10000342");
        values.put(diagnoses2ObservingOrganizationValue, "ГБУЗ \"ДКЦ № 1 ДЗМ\" филиал 1");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "src/main/resources" + defaultFilePathForNullCR);
    }

    private static String getDateSomeDaysAgo (int daysAgo, String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -daysAgo);
        return sdf.format(cal.getTime());
    }

    private static String getDateSomeYearsAgo (int yearsAgo, String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, -yearsAgo);
        return sdf.format(cal.getTime());
    }

    private static void putDefaultParams (HashMap<String, String> values, Long patientIdValue){
        values.put(patientId, patientIdValue.toString());
        values.put(registrationsEndDate, null);
        values.put(id, UUID.randomUUID().toString());
    }

    //    1.1 Проверка поиска пациентов по умолчанию https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_1() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 1L;

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());
        values.put(id, UUID.randomUUID().toString());

        values.put(registrationsEndDate, null);

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1 Проверка поиска пациентов по умолчанию https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_12() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 12L;

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());
        values.put(id, UUID.randomUUID().toString());

        values.put(registrations2EndDate, getDateSomeDaysAgo(100, "yyyy-MM-dd"));


        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1 Проверка поиска пациентов по умолчанию https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_2() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 2L;

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());
        values.put(id, UUID.randomUUID().toString());

        values.put(registrations2EndDate, getDateSomeYearsAgo(1, "yyyy-MM-dd"));


        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1 Проверка поиска пациентов по умолчанию https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_3() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 3L;

        HashMap<String, String> values = new HashMap<>();
        values.put(patientId, patientIdValue.toString());
        values.put(id, UUID.randomUUID().toString());

        values.put(registrations2EndDate, getDateSomeDaysAgo(367, "yyyy-MM-dd"));


        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/full_patient_" + patientIdValue + ".json");
    }

    //    1.1.2.1 Проверка поиска по lastName https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_4() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 4L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(lastName, "Петров");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.2.2 Проверка поиска по firstName https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_5() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 5L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(firstName, "Сергей");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.2.3 Проверка поиска по middleName https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_6() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 6L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(middleName, "Сергеевич");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.2.4 Проверка поиска по birthDate https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_7() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 7L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(birthDate, "2003-02-01");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.2.5 Проверка поиска по gender https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_8() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 8L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(gender, "2");
        values.put(genderValue, "Женский");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.2.6 Проверка поиска по policyNumber https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_9() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 9L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(patientPolicy, "123456789");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.3 Проверка поиска по clinicalGroups https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_10() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 10L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(clinicalGroups2, "6");
        values.put(clinicalGroups2Value, "Iа");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.3 Проверка поиска по clinicalGroups https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_34() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 34L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(clinicalGroups3, "6");
        values.put(clinicalGroups3Value, "Iа");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.4 Проверка поиска по registrationStatus https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_11() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 11L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationStatus, "2");
        values.put(registrationStatusValue, "Снят с учета");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.1 Проверка поиска по startDate https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_13() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 13L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsStartDate, "2021-12-02");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.1 Проверка поиска по startDate https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_35() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 35L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrations2StartDate, "2021-12-02");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.2 Проверка поиска по registered https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_14() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 14L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsRegistered, "4");
        values.put(registrationsRegisteredValue, "посмертно, ранее состоял на учете");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.2 Проверка поиска по registered https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_36() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 36L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrations2Registered, "4");
        values.put(registrations2RegisteredValue, "посмертно, ранее состоял на учете");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.3 Проверка поиска по endDate https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_15() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 15L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsEndDate, "02.12.2021");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.3 Проверка поиска по endDate https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_37() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 37L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrations2EndDate, "02.12.2021");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.4 Проверка поиска по removeCause https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_16() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 16L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsRemoveCause, "3");
        values.put(registrationsRemoveCauseValue, "состоял по базалиоме");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5.4 Проверка поиска по removeCause https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_38() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 38L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrations2RemoveCause, "3");
        values.put(registrations2RemoveCauseValue, "состоял по базалиоме");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.1.5 Поиск по Учету в КР https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_24() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 24L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsEndDate, "2021-12-03");
        values.put(registrationsStartDate, "2021-12-03");
        values.put(registrationsRegistered, "4");
        values.put(registrationsRegisteredValue, "посмертно, ранее состоял на учете");
        values.put(registrationsRemoveCause, "0");
        values.put(registrationsRemoveCauseValue, "неизвестно");

        values.put(registrations2Registered, "1");
        values.put(registrations2RegisteredValue, "при жизни, впервые");
        values.put(registrations2RemoveCause, "1");
        values.put(registrations2RemoveCauseValue, "выехал");
        values.put(registrations2StartDate, "2021-12-04");
        values.put(registrations2EndDate, "2021-12-04");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.1 Проверка поиска по топографии опухоли https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_17() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 17L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesValue, "C69.9");
        values.put(diagnosesValueValue, "Злокачественное новообразование глаза неуточненной части");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.1 Проверка поиска по топографии опухоли https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_39() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 39L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnoses2Value, "C69.9");
        values.put(diagnoses2ValueValue, "Злокачественное новообразование глаза неуточненной части");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.2  Проверка поиска по стадии опухоли https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_18() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 18L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesTNMStageStage, "2");
        values.put(diagnosesTNMStageStageValue, "IB");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.2  Проверка поиска по стадии опухоли https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_40() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 40L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnoses2TNMStageStage, "2");
        values.put(diagnoses2TNMStageStageValue, "IB");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.3  Проверка поиска по observingOrganization https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_19() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 19L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesDispensaryRegistrationsEndDate, null);
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "14932313409");
        values.put(diagnosesDispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ им. В.В. Вересаева ДЗМ\"");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.3  Проверка поиска по observingOrganization https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_25() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 25L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesDispensaryRegistrations2EndDate, getDateSomeDaysAgo(100, "yyyy-MM-dd"));
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "14932313409");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganizationValue, "ГБУЗ \"ГКБ им. В.В. Вересаева ДЗМ\"");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.3  Проверка поиска по observingOrganization https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_26() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 26L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnoses2DispensaryRegistrationsEndDate, getDateSomeDaysAgo(100, "yyyy-MM-dd"));
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "14932313409");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ им. В.В. Вересаева ДЗМ\"");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    1.2.4 Проверка поиска по patientAgeAtEstablish https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_20() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 20L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesPatientAgeAtEstablish, "56");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }



    //    1.2.4 Проверка поиска по patientAgeAtEstablish https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_21() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 21L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnoses2PatientAgeAtEstablish, "56");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Поиск по нескольким условиям диагноза https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_30() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 30L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesValue, "C53");
        values.put(diagnosesValueValue, "Злокачественное новообразование шейки матки");
        values.put(diagnosesTNMStageStage, "12");
        values.put(diagnosesTNMStageStageValue, "III");
        values.put(diagnosesPatientAgeAtEstablish, "66");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Поиск по нескольким условиям диагноза https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_31() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 31L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesValue, "C54");
        values.put(diagnosesValueValue, "Злокачественное новообразование тела матки");
        values.put(diagnosesTNMStageStage, "12");
        values.put(diagnosesTNMStageStageValue, "III");
        values.put(diagnosesPatientAgeAtEstablish, "66");

        values.put(diagnoses2Value, "C53");
        values.put(diagnoses2ValueValue, "Злокачественное новообразование шейки матки");
        values.put(diagnoses2TNMStageStage, "13");
        values.put(diagnoses2TNMStageStageValue, "IVA");
        values.put(diagnoses2PatientAgeAtEstablish, "65");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Проверка игнорирования исторических значений https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_32() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 32L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesValue, "C56");
        values.put(diagnosesValueValue, "Злокачественное новообразование яичника");

        values.put(diagnoses2Value, "C57");
        values.put(diagnoses2ValueValue, "Злокачественное новообразование других и неуточненных женских половых органов");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Поиск по полностью заполненным полям https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_22() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 22L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(lastName, "Петрова");
        values.put(historicalLastName, "Иванова");
        values.put(diagnosesValue, "C69.9");
        values.put(diagnosesValueValue, "Злокачественное новообразование глаза неуточненной части");
        values.put(historicalDiagnosesValue, "C69.6");
        values.put(historicalDiagnosesValueValue, "Злокачественное новообразование глазницы");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Поиск по полностью заполненным полям https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_23() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 23L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsEndDate, "2021-12-03");
        values.put(registrationsStartDate, "2021-12-03");
        values.put(registrationsRegistered, "5");
        values.put(registrationsRegisteredValue, "смена МО");
        values.put(registrationsRemoveCause, "5");
        values.put(registrationsRemoveCauseValue, "умер от осложнений лечения");

        values.put(lastName, "Кузнецов");
        values.put(firstName, "Антон");
        values.put(middleName, "Петрович");
        values.put(birthDate, "2001-02-03");
        values.put(gender, "1");
        values.put(genderValue, "Мужской");
        values.put(patientPolicy, "987654321");

        values.put(clinicalGroups2, "5");
        values.put(clinicalGroups2Value, "IV");

        values.put(registrationStatus, "1");
        values.put(registrationStatusValue, "Стоит на учете");

        values.put(diagnosesValue, "C69.1");
        values.put(diagnosesValueValue, "Злокачественное новообразование роговицы");
        values.put(diagnosesTNMStageStage, "4");
        values.put(diagnosesTNMStageStageValue, "I");
        values.put(diagnosesDispensaryRegistrationsEndDate, null);
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "11385003");
        values.put(diagnosesDispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ № 40 ДЗМ\" (Первичный онкологический кабинет № 3)\"");
        values.put(diagnosesPatientAgeAtEstablish, "16");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Проверка, что персона не возвращается, если выполнены все условия условия для элементов массивов, но для для разных его элементов https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_27() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 27L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(registrationsStartDate, "1999-12-01");
        values.put(registrations2EndDate, "2021-12-01");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Проверка, что персона не возвращается, если выполнены все условия условия для элементов массивов, но для для разных его элементов https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_28() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 28L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesValue, "C69.1");
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "11326578");;
        values.put(diagnosesDispensaryRegistrationsEndDate, "2021-12-13");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "11385003");
        values.put(diagnosesDispensaryRegistrations2EndDate, "2021-15-15");

        values.put(diagnoses2Value, "C69.6");
        values.put(diagnoses2DispensaryRegistrationsEndDate, "13-12-2021");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "11385003");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Проверка, что персона не возвращается, если выполнены все условия условия для элементов массивов, но для для разных его элементов https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_29() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 29L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(diagnosesValue, "C69.1");
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "11326578");;
        values.put(diagnosesDispensaryRegistrationsEndDate, null);
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "11385003");
        values.put(diagnosesDispensaryRegistrations2EndDate, "2021-15-15");

        values.put(diagnoses2Value, "C69.6");
        values.put(diagnoses2DispensaryRegistrationsEndDate, null);
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "11385003");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Проверка, что возвращается только последний САД https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_33() throws IOException {
        createPatientForCR_33_1();
        createPatientForCR_33_2();
    }

    //    Проверка, что возвращается только последний САД https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    private static void createPatientForCR_33_1() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 33L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(createTimestamp, getDateSomeDaysAgo(1, "yyyy-MM-dd"));

        values.put(lastName, "Дубов");
        values.put(firstName, "Игорь");
        values.put(middleName, "Васильевич");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + "_1.json");
    }

    //    Проверка, что возвращается только последний САД https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    private static void createPatientForCR_33_2() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 33L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(createTimestamp, getDateSomeDaysAgo(0, "yyyy-MM-dd"));

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + "_2.json");
    }

    //    Проверка, что персона не возвращается, если выполнены все условия условия для элементов массивов, но для для разных его элементов https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_41() throws IOException {
        createPatientForCR_41_CR();
        createPatientForCR_41_NullCR();
    }

    //    Проверка, что персона не возвращается, если выполнены все условия условия для элементов массивов, но для для разных его элементов https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_41_CR() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForCR);
        Long patientIdValue = 41L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(lastName, "Дубов");
        values.put(firstName, "Игорь");
        values.put(middleName, "Васильевич");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/patient_" + patientIdValue + ".json");
    }

    //    Проверка, что персона не возвращается, если выполнены все условия условия для элементов массивов, но для для разных его элементов https://confluence.infinnity.ru/pages/viewpage.action?pageId=135500316
    public static void createPatientForCR_41_NullCR() throws IOException {
        String message = Utils.prepareFile(defaultFilePathForNullCR);
        Long patientIdValue = 41L;

        HashMap<String, String> values = new HashMap<>();
        putDefaultParams(values, patientIdValue);

        values.put(lastName, "Дубов");
        values.put(firstName, "Игорь");
        values.put(middleName, "Васильевич");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "nullCR/patient_" + patientIdValue + ".json");
    }
}
