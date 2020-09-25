package co.edu.eafit.ci_cd.medical_history;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MedicalHistoryRestAdapter implements MedicalHistoryRepository {

    @Override
    public Mono<MedicalHistory> getMedicalHistoryById(String id) {
        return Mono.just(new MedicalHistory("1", "1", "1", "1"));

        //        return WebClient.create()
//                .get()
//                .uri("url")
//                .retrieve()
//                .bodyToMono(String.class)
//                .map(x -> new MedicalHistory("1", "1", "1"));
    }

    @Override
    public Flux<MedicalHistory> getAllMedicalHistory() {
        return Flux.just(new MedicalHistory("1", "1", "1", "1"));
//        return WebClient.create()
//                .get()
//                .uri("url")
//                .retrieve()
//                .bodyToFlux(String.class)
//                .map(x -> new MedicalHistory("1", "1", "1"));
    }
}
