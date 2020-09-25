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

//    @JsonProperty("id")
//    private String id;
//
//    @JsonProperty("clientName")
//    private String clientName;
//
//    @JsonProperty("clientId")
//    private String clientId;
//
//    @JsonProperty("symptoms")
//    private String symptoms;
//
//    public MedicalHistory(String id, String clientName, String clientId, String symptoms) {
//        this.id = id;
//        this.clientName = clientName;
//        this.clientId = clientId;
//        this.symptoms = symptoms;
//    }
}
