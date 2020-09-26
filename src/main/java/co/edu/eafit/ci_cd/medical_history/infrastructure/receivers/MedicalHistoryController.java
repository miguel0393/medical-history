package co.edu.eafit.ci_cd.medical_history.infrastructure.receivers;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.domain.use_case.MedicalHistoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MedicalHistoryController {

    private final MedicalHistoryUseCase medicalHistoryUseCase;

    @GetMapping("/")
    public Mono<String> healthCheck() {
        return Mono.just("Ok, service is working");
    }

    @GetMapping(value = "/getMedicalHistory/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<MedicalHistory> getMedicalHistoryById(@PathVariable String id) {
        return medicalHistoryUseCase.getMedicalHistoryById(id);
    }

    @GetMapping(value = "/getMedicalHistory", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<MedicalHistory> getMedicalHistory() {
        return medicalHistoryUseCase.getAllMedicalHistory();
    }
}
