package co.edu.eafit.ci_cd.medical_history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MedicalHistory implements Serializable {

    @JsonProperty("id")
    private String id;

    @JsonProperty("clientName")
    private String clientName;

    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("symptoms")
    private String symptoms;

    public MedicalHistory(String id, String clientName, String clientId, String symptoms) {
        this.id = id;
        this.clientName = clientName;
        this.clientId = clientId;
        this.symptoms = symptoms;
    }
}
