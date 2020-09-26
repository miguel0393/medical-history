package co.edu.eafit.ci_cd.medical_history.infrastructure;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MedicalHistoryDTOTest {

    @Test
    public void buildMedicalHistoryDTOTest() {

        final MedicalHistoryDTO medicalHistoryDTO = MedicalHistoryDTO.builder()
                .diagnosis("1")
                .patientId("1")
                .patientName("1")
                .prognosis("1")
                .symptoms("1")
                .treatment("1")
                .build();

        assertThat(medicalHistoryDTO)
                .isEqualTo(MedicalHistoryDTO.builder()
                        .diagnosis("1")
                        .patientId("1")
                        .patientName("1")
                        .prognosis("1")
                        .symptoms("1")
                        .treatment("1")
                        .build());
    }
}