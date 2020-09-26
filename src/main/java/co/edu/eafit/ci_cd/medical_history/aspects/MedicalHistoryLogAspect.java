package co.edu.eafit.ci_cd.medical_history.aspects;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Log
@Aspect
@Component
public class MedicalHistoryLogAspect {

    @Before(value = "execution(* co.edu.eafit.ci_cd.medical_history.infrastructure.receivers.MedicalHistoryController.get*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.log(Level.INFO, "(Before) Getting Medical History from: {0}", joinPoint.getSignature());
    }
}
