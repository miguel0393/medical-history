package co.edu.eafit.ci_cd.medical_history.aspects;

public aspect MedicalHistoryLog {

    pointcut getall() : call(* MedicalHistoryService.*);

    before() : getall() {
        System.out.println("Getting Medical History...");
    }
}