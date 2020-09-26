package co.edu.eafit.ci_cd.medical_history.domain.use_case;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistoryRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class MedicalHistoryUseCase {

    private final MedicalHistoryRepository medicalHistoryRepository;

    public Mono<MedicalHistory> getMedicalHistoryById(String id) {
        return medicalHistoryRepository.getMedicalHistoryById(id);
    }

    public Flux<MedicalHistory> getAllMedicalHistory() {
        return medicalHistoryRepository.getAllMedicalHistory();
    }

    public Mono<String> saveMedicalHistory(MedicalHistory medicalHistory) {
        return medicalHistoryRepository.saveMedicalHistoryById(medicalHistory);
    }
}
