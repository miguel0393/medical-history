package co.edu.eafit.ci_cd.medical_history;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MedicalHistoryController {

    @GetMapping("/getValues")
    public Mono<String> getValues() {
        return Mono.just("OK");
    }
}
