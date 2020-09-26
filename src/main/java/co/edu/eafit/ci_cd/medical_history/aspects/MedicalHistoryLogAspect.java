package co.edu.eafit.ci_cd.medical_history.aspects;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Level;

@Log
@Aspect
@Component
public class MedicalHistoryLogAspect {

    @Before(value = "execution(* co.edu.eafit.ci_cd.medical_history.infrastructure.receivers.MedicalHistoryController.getMedical*())")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.log(Level.INFO, "Before method: {0}", joinPoint.getSignature());

        log.log(Level.INFO, "Getting Medical History: {0}", joinPoint.getSignature());
    }

    @After(value = "execution(* co.edu.eafit.ci_cd.medical_history.infrastructure.receivers.MedicalHistoryController.getMedicalHistory(..)) " +
            "and args(id)")
    public void afterAdvice(JoinPoint joinPoint, String id) {
        System.out.println("After method:" + joinPoint.getSignature());

        if (id.equals("1")) {
            System.out.println("Coronavirus Warning");
        } else {
            System.out.println("OK");
        }
    }

}
