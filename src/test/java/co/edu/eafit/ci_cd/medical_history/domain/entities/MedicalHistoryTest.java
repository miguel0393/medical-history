package co.edu.eafit.ci_cd.medical_history.domain.entities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MedicalHistoryTest {

    @Test
    public void buildMedicalHistoryTest() {

        final MedicalHistory medicalHistory = MedicalHistory.builder()
                .diagnosis("1")
                .patientId("1")
                .patientName("1")
                .prognosis("1")
                .symptoms("1")
                .treatment("1")
                .build();

        assertThat(medicalHistory)
                .isEqualTo(MedicalHistory.builder()
                        .diagnosis("1")
                        .patientId("1")
                        .patientName("1")
                        .prognosis("1")
                        .symptoms("1")
                        .treatment("1")
                        .build());
    }

}