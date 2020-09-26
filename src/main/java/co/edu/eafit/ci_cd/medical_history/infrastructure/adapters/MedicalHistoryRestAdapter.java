package co.edu.eafit.ci_cd.medical_history.infrastructure.adapters;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistoryRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MedicalHistoryRestAdapter implements MedicalHistoryRepository {

    @Override
    public Mono<MedicalHistory> getMedicalHistoryById(String id) {
        return Mono.just(MedicalHistory.builder()
                .medicalHistoryId("1")
                .patientId("1")
                .patientName("1")
                .symptoms("1")
                .diagnosis("1")
                .prognosis("1")
                .treatment("1")
                .build());

        //        return WebClient.create()
//                .get()
//                .uri("url")
//                .retrieve()
//                .bodyToMono(String.class)
//                .map(x -> new MedicalHistory("1", "1", "1"));
    }

    @Override
    public Flux<MedicalHistory> getAllMedicalHistory() {
        return Flux.just(MedicalHistory.builder()
                        .medicalHistoryId("1")
                        .patientId("1")
                        .patientName("1")
                        .symptoms("1")
                        .diagnosis("1")
                        .prognosis("1")
                        .treatment("1")
                        .build(),
                MedicalHistory.builder()
                        .medicalHistoryId("2")
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
}
