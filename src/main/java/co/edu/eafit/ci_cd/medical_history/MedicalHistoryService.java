package co.edu.eafit.ci_cd.medical_history;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class MedicalHistoryService {

    private final MedicalHistoryRepository medicalHistoryRepository;

    public Mono<MedicalHistory> getMedicalHistoryById(String id) {
        return medicalHistoryRepository.getMedicalHistoryById(id);
    }
}
