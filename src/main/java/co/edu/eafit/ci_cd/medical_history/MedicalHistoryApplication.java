package co.edu.eafit.ci_cd.medical_history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MedicalHistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalHistoryApplication.class, args);
	}

	@Bean
	public MedicalHistoryService medicalHistoryService(MedicalHistoryRepository medicalHistoryRepository) {
		return new MedicalHistoryService(medicalHistoryRepository);
	}

}
