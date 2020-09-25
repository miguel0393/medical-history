package co.edu.eafit.ci_cd.medical_history;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MedicalHistoryController {

    private final MedicalHistoryService medicalHistoryService;

    @GetMapping("/getValues")
    public Mono<String> getValues() {
        return Mono.just("OK");
    }

    @GetMapping(value = "/getMedicalHistory/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<MedicalHistory> getMedicalHistory(String id) {
        return medicalHistoryService.getMedicalHistoryById(id);
    }
}
