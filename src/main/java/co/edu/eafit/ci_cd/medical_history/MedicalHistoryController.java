package co.edu.eafit.ci_cd.medical_history;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MedicalHistoryController {

    private final MedicalHistoryService medicalHistoryService;

    @GetMapping("/")
    public Mono<String> getHealthCheck() {
        return Mono.just("Ok, service is working");
    }

    @GetMapping(value = "/getMedicalHistory/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<MedicalHistory> getMedicalHistory(@PathVariable String id) {
        return medicalHistoryService.getMedicalHistoryById(id);
    }
}
