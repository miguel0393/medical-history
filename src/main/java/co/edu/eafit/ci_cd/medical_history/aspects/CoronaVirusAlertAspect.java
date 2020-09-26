package co.edu.eafit.ci_cd.medical_history.aspects;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.stream.Stream;

@Log
@Aspect
@Component
public class CoronaVirusAlertAspect {

    @AfterReturning(value = "execution(* co.edu.eafit.ci_cd.medical_history.infrastructure.receivers.RequestMapper.*(..))" +
            " and args(..)", returning = "medicalHistory")
    public void afterBuildMedicalHistory(JoinPoint joinPoint, MedicalHistory medicalHistory) {
        log.log(Level.INFO, "(After) Building Medical History : {0}", joinPoint.getSignature());

        final boolean coronaVirusAlert = Stream.of("tos", "fiebre", "dolor de garganta", "malestar general")
                .anyMatch(symtom -> medicalHistory.getSymptoms().contains(symtom));

        if (coronaVirusAlert) {
            log.log(Level.WARNING, "Posible caso de Corona Virus: {0}", medicalHistory.getPatientName());

        }
    }
}
