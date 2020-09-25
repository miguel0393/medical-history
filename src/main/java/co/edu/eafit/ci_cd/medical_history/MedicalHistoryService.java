package co.edu.eafit.ci_cd.medical_history;

import reactor.core.publisher.Mono;

public class MedicalHistoryService {

    private final MedicalHistoryRepository medicalHistoryRepository;

    public MedicalHistoryService(MedicalHistoryRepository medicalHistoryRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    public Mono<MedicalHistory> getMedicalHistoryById(String id) {
        return medicalHistoryRepository.getMedicalHistoryById(id);
    }
}
