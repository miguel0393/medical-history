package co.edu.eafit.ci_cd.medical_history.aspects;

import co.edu.eafit.ci_cd.medical_history.domain.entities.MedicalHistory;
import co.edu.eafit.ci_cd.medical_history.infrastructure.MedicalHistoryDTO;
import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Log
@Aspect
@Component
public class CoronaVirusAlertAspect {

    @AfterReturning(value = "execution(* co.edu.eafit.ci_cd.medical_history.infrastructure.receivers.RequestMapper.*(..))" +
            " and args(medicalHistoryDTO)", returning = "medicalHistory")
    public void afterBuildMedicalHistory(JoinPoint joinPoint, MedicalHistoryDTO medicalHistoryDTO, MedicalHistory medicalHistory) {
        log.log(Level.INFO, "(After) Building Medical History : {0}", joinPoint.getSignature());
    }
}
