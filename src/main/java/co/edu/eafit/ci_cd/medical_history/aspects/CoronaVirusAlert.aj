package com.ponents.medicalbots.aspects;

import com.ponents.medicalbots.model.Triage;

public aspect CoronaVirusAlert {
    pointcut setSymptoms(Triage triage, String symptoms):
            call(public void com.ponents.medicalbots.model.Triage.setSymptoms());

    after(Triage triage, String symptom) : setSymptom(triage, symptom) {
        if (symptom.contains("tos")) {
            System.out.println("Alerta: posible caso de Coronavirus");
        }
    }
}
