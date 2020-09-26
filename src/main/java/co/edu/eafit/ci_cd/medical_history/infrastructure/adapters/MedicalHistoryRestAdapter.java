package co.edu.eafit.ci_cd.medical_history.infrastructure.adapters;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistoryRepository;
import co.edu.eafit.ci_cd.medical_history.infrastructure.MedicalHistoryDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MedicalHistoryRestAdapter implements MedicalHistoryRepository {

    @Override
    public Mono<MedicalHistory> getMedicalHistoryById(String id) {
        return WebClient.create()
                .get()
                .uri("http://blockchainapi-env.eba-j7kjrmhb.us-east-2.elasticbeanstalk.com/bc/medicalhistory/" + id)
                .retrieve()
                .bodyToMono(MedicalHistoryDTO.class)
                .map(medicalHistoryDTO -> MedicalHistory.builder()
                        .patientId(medicalHistoryDTO.getPatientId())
                        .patientName(medicalHistoryDTO.getPatientName())
                        .symptoms(medicalHistoryDTO.getSymptoms())
                        .diagnosis(medicalHistoryDTO.getDiagnosis())
                        .prognosis(medicalHistoryDTO.getPrognosis())
                        .treatment(medicalHistoryDTO.getTreatment())
                        .build());
    }

    @Override
    public Flux<String> getAllMedicalHistory() {
        return WebClient.create()
                .get()
                .uri("http://blockchainapi-env.eba-j7kjrmhb.us-east-2.elasticbeanstalk.com/bc/blockchain")
                .retrieve()
                .bodyToFlux(String.class);
    }

    @Override
    public Mono<String> saveMedicalHistoryById(MedicalHistory medicalHistory) {
        return WebClient.create()
                .post()
                .uri("http://blockchainapi-env.eba-j7kjrmhb.us-east-2.elasticbeanstalk.com/bc/block")
                .body(Mono.just(medicalHistory), MedicalHistory.class)
                .retrieve()
                .bodyToMono(String.class);
    }
}
