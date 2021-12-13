package ru.geekbrains.qa.java2.generator;

import java.io.IOException;
import java.time.Instant;
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
    public static String diagnosesDispensaryRegistrationsEndDate = "diagnoses[0].dispensaryRegistrations[0].endDate.value";
    public static String diagnosesDispensaryRegistrationsObservingOrganization = "diagnoses[0].dispensaryRegistrations[0].observingOrganization.value.value.code";
    public static String diagnosesDispensaryRegistrationsObservingOrganizationValue = "diagnoses[0].dispensaryRegistrations[0].observingOrganization.value.value.value";
    public static String diagnosesDispensaryRegistrations2EndDate = "diagnoses[0].dispensaryRegistrations[1].endDate.value";
    public static String diagnosesDispensaryRegistrations2ObservingOrganization = "diagnoses[0].dispensaryRegistrations[1].observingOrganization.value.value.code";
    public static String diagnosesDispensaryRegistrations2ObservingOrganizationValue = "diagnoses[0].dispensaryRegistrations[1].observingOrganization.value.value.value";
    public static String diagnosesDispensaryRegistrations3EndDate = "diagnoses[0].dispensaryRegistrations[2].endDate.value";
    public static String diagnosesDispensaryRegistrations3ObservingOrganization = "diagnoses[0].dispensaryRegistrations[2].observingOrganization.value.value.code";
    public static String diagnosesDispensaryRegistrations3ObservingOrganizationValue = "diagnoses[0].dispensaryRegistrations[2].observingOrganization.value.value.value";
    public static String diagnoses2DispensaryRegistrationsEndDate = "diagnoses[1].dispensaryRegistrations[0].endDate.value";
    public static String diagnoses2DispensaryRegistrationsObservingOrganization = "diagnoses[1].dispensaryRegistrations[0].observingOrganization.value.value.code";
    public static String diagnoses2DispensaryRegistrationsObservingOrganizationValue = "diagnoses[1].dispensaryRegistrations[0].observingOrganization.value.value.value";
    public static String diagnosesPatientAgeAtEstablish = "diagnoses[0].patientAgeAtEstablish.value";
    public static String diagnoses2PatientAgeAtEstablish = "diagnoses[1].patientAgeAtEstablish.value";

    public static void main(String[] args) throws IOException {
        createFullPatient();
    }

    public static void createFullPatient() throws IOException {
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

        values.put(diagnosesValue, "C50.1");
        values.put(diagnosesValueValue, "Злокачественное новообразование центральной части молочной железы");
        values.put(diagnosesTNMStageStage, "1");
        values.put(diagnosesTNMStageStageValue, "IA");
        values.put(diagnoses2Value, "C45");
        values.put(diagnoses2ValueValue, "Мезотелиома");
        values.put(diagnoses2TNMStageStage, "3");
        values.put(diagnoses2TNMStageStageValue, "IC");

        values.put(diagnosesDispensaryRegistrationsEndDate, "2021-05-06");
        values.put(diagnosesDispensaryRegistrationsObservingOrganization, "10468653");
        values.put(diagnosesDispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКБ № 40 ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations2EndDate, "2020-01-06");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganization, "100000090538");
        values.put(diagnosesDispensaryRegistrations2ObservingOrganizationValue, "ГБУЗ \"МКНЦ им. А.С. Логинова ДЗМ\"");
        values.put(diagnosesDispensaryRegistrations3EndDate, "2019-05-06");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganization, "10267753");
        values.put(diagnosesDispensaryRegistrations3ObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\"");

        values.put(diagnoses2DispensaryRegistrationsEndDate, "2019-06-06");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganization, "11394228");
        values.put(diagnoses2DispensaryRegistrationsObservingOrganizationValue, "ГБУЗ \"ГКОБ № 1 ДЗМ\" (ЦАОП СВАО)");

        values.put(diagnosesPatientAgeAtEstablish, "46");
        values.put(diagnoses2PatientAgeAtEstablish, "30");
        message = Utils.replaceValues(message, values);
        Utils.writeToFile(message, "KR_patient/" + patientIdValue + ".json");
    }
}
