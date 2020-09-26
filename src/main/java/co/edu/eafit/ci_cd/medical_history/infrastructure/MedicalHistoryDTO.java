package co.edu.eafit.ci_cd.medical_history.infrastructure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicalHistoryDTO {

    private String patientName;
    private String patientId;
    private String symptoms;
    private String diagnosis;
    private String prognosis;
    private String treatment;
}
