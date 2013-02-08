package org.motechproject.tama.performance.patient;


import org.databene.benerator.main.Benerator;
import org.junit.Test;

import java.io.IOException;

public class PatientTest {

    @Test
    public void createPatient() throws IOException {
        long startTime = System.currentTimeMillis();
        Benerator.main(new String[]{"patient_registration.ben.xml"});
        long endTime = System.currentTimeMillis();
        System.out.println("Timetaken: " + (endTime - startTime)/1000 + " seconds");
    }
}
