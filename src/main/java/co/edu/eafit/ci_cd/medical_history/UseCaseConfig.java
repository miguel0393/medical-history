package co.edu.eafit.ci_cd.medical_history;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistoryRepository;
import co.edu.eafit.ci_cd.medical_history.domain.use_case.MedicalHistoryUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public MedicalHistoryUseCase medicalHistoryService(MedicalHistoryRepository medicalHistoryRepository) {
        return new MedicalHistoryUseCase(medicalHistoryRepository);
    }
}
