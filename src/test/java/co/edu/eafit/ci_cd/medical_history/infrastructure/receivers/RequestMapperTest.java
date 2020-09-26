package co.edu.eafit.ci_cd.medical_history.infrastructure.receivers;


import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.infrastructure.MedicalHistoryDTO;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestMapperTest {

    @Test
    public void buildMedicalHistory() {

        final RequestMapper requestMapper = new RequestMapper();

        final MedicalHistoryDTO medicalHistoryDTO = MedicalHistoryDTO.builder()
                .diagnosis("1")
                .patientId("1")
                .patientName("1")
                .prognosis("1")
                .symptoms("1")
                .treatment("1")
                .build();

        final MedicalHistory expectedResponse = MedicalHistory.builder()
                .diagnosis("1")
                .patientId("1")
                .patientName("1")
                .prognosis("1")
                .symptoms("1")
                .treatment("1")
                .build();

        final MedicalHistory actualResponse = requestMapper.buildMedicalHistory(medicalHistoryDTO);

        assertThat(actualResponse)
                .isEqualTo(expectedResponse);
    }
}