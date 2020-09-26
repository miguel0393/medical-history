package co.edu.eafit.ci_cd.medical_history.domain.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MedicalHistory {

    private final String medicalHistoryId;
    private final String patientName;
    private final String patientId;
    private final String symptoms;
    private final String diagnosis;
    private final String prognosis;
    private final String treatment;

}
