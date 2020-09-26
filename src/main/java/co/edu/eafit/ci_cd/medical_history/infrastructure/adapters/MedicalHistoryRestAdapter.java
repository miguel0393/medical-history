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
    public Flux<MedicalHistory> getAllMedicalHistory() {
        return Flux.just(MedicalHistory.builder()
                        .patientId("1")
                        .patientName("1")
                        .symptoms("1")
                        .diagnosis("1")
                        .prognosis("1")
                        .treatment("1")
                        .build(),
                MedicalHistory.builder()
                        .patientId("2")
                        .patientName("2")
                        .symptoms("2")
                        .diagnosis("2")
                        .prognosis("2")
                        .treatment("2")
                        .build());
//        return WebClient.create()
//                .get()
//                .uri("url")
//                .retrieve()
//                .bodyToFlux(String.class)
//                .map(x -> new MedicalHistory("1", "1", "1"));
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
