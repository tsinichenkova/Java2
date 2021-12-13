package ru.geekbrains.qa.java2.generator;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;


public class Generator {
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
        createFullPatientForCR();
        createFullPatientForTumorRegistry();
        createFullPatientForNullCR();
    }

//    полный пациент для поиска пациентов КР
    public static void createFullPatientForCR() throws IOException {
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

        values.put(clinicalGroups, "7");
        values.put(clinicalGroupsValue, "Iб");
        values.put(clinicalGroups2, "2");
        values.put(clinicalGroups2Value, "IIа");
        values.put(clinicalGroups3, "4");
        values.put(clinicalGroups3Value, "III");

        values.put(registrationStatus, "1");
        values.put(registrationStatusValue, "Стоит на учете");

        values.put(registrations2Registered, "3");
        values.put(registrations2RegisteredValue, "посмертно, ранее не состоял");
        values.put(registrations2RemoveCause, "5");
        values.put(registrations2RemoveCauseValue, "умер от осложнений лечения");
        values.put(registrations2StartDate, "2020-01-05");
        values.put(registrations2EndDate, "2021-12-06");

//        1 диагноз
        values.put(diagnosesValue, "C50.1");
        values.put(diagnosesValueValue, "Злокачественное новообразование центральной части молочной железы");
        values.put(diagnosesTNMStageStage, "1");
        values.put(diagnosesTNMStageStageValue, "IA");
        values.put(diagnosesDispensaryRegistrationsEndDate, "2021-05-06");
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "10468653");
        values.put(diagnosesDispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ № 40 ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations2EndDate, "2020-01-06");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "100000090538");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganizationValue, "ГБУЗ \"МКНЦ им. А.С. Логинова ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations3EndDate, "2019-05-06");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganization, "10267753");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\"");
        values.put(diagnosesPatientAgeAtEstablish, "46");

//        2 диагноз
        values.put(diagnoses2Value, "C45");
        values.put(diagnoses2ValueValue, "Мезотелиома");
        values.put(diagnoses2TNMStageStage, "3");
        values.put(diagnoses2TNMStageStageValue, "IC");
        values.put(diagnoses2DispensaryRegistrationsEndDate, "2019-06-06");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "11394228");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\" (ЦАОП СВАО)");
        values.put(diagnoses2PatientAgeAtEstablish, "30");

        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "crPatient/full_patient_" + patientIdValue + ".json");
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
        Utils.writeToFile(message, "nullCR/full_patient_" + patientIdValue + ".json");
    }
}
