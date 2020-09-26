package co.edu.eafit.ci_cd.medical_history.infrastructure.receivers;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.infrastructure.MedicalHistoryDTO;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {

    public MedicalHistory buildMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) {
        return MedicalHistory.builder()
                .patientName(medicalHistoryDTO.getPatientName())
                .patientId(medicalHistoryDTO.getPatientId())
                .symptoms(medicalHistoryDTO.getSymptoms())
                .diagnosis(medicalHistoryDTO.getDiagnosis())
                .prognosis(medicalHistoryDTO.getPrognosis())
                .treatment(medicalHistoryDTO.getTreatment())
                .build();
    }
}
