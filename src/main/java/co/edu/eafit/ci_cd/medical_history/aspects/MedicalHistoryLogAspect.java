package co.edu.eafit.ci_cd.medical_history.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MedicalHistoryLogAspect {

    @Before(value = "execution(* co.edu.eafit.ci_cd.medical_history.MedicalHistoryController.getValues())")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("hola");

//        System.out.println("Before method:" + joinPoint.getSignature());
//
//        System.out.println("Creating Employee with name - " + name + " and id - " + empId);
    }

//    @After(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
//    public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
//        System.out.println("After method:" + joinPoint.getSignature());
//
//        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
//    }
}
