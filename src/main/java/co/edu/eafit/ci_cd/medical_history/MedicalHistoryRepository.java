package co.edu.eafit.ci_cd.medical_history;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MedicalHistoryRepository {

    Mono<MedicalHistory> getMedicalHistoryById(String id);
    Flux<MedicalHistory> getAllMedicalHistory();
}
