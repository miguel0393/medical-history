package co.edu.eafit.ci_cd.medical_history.domain.use_case;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.ArgumentMatchers.any;


@RunWith(MockitoJUnitRunner.class)
public class MedicalHistoryUseCaseTest {

    @Mock
    private MedicalHistoryRepository medicalHistoryRepository;

    @InjectMocks
    private MedicalHistoryUseCase medicalHistoryUseCase;

    @Test
    public void getMedicalHistoryById() {

        final MedicalHistory medicalHistory = MedicalHistory.builder()
                .diagnosis("1")
                .patientId("1")
                .patientName("1")
                .prognosis("1")
                .symptoms("1")
                .treatment("1")
                .build();

        Mockito.when(medicalHistoryRepository.getMedicalHistoryById(any()))
                .thenReturn(Mono.just(medicalHistory));

        final Mono<MedicalHistory> actualResponse = medicalHistoryUseCase.getMedicalHistoryById("1");

        StepVerifier.create(actualResponse)
                .expectNext(medicalHistory)
                .verifyComplete();
    }

    @Test
    public void getAllMedicalHistory() {

        Mockito.when(medicalHistoryRepository.getAllMedicalHistory())
                .thenReturn(Flux.just("1"));

        final Flux<String> actualResponse = medicalHistoryUseCase.getAllMedicalHistory();

        StepVerifier.create(actualResponse)
                .expectNext("1")
                .verifyComplete();
    }

    @Test
    public void saveMedicalHistory() {

        final MedicalHistory medicalHistory = MedicalHistory.builder()
                .diagnosis("1")
                .patientId("1")
                .patientName("1")
                .prognosis("1")
                .symptoms("1")
                .treatment("1")
                .build();

        Mockito.when(medicalHistoryRepository.saveMedicalHistoryById(any()))
                .thenReturn(Mono.just("ok"));

        final Mono<String> actualResponse = medicalHistoryUseCase.saveMedicalHistory(medicalHistory);

        StepVerifier.create(actualResponse)
                .expectNext("ok")
                .verifyComplete();
    }
}