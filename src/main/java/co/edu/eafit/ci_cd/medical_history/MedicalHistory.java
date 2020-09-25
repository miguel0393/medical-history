package co.edu.eafit.ci_cd.medical_history;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MedicalHistory {

    private final String id;
    private final String clientName;
    private final String clientId;
    private final String symptoms;

}
