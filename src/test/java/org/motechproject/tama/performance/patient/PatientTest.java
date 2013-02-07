package org.motechproject.tama.performance.patient;


import org.databene.benerator.main.Benerator;
import org.junit.Test;

import java.io.IOException;

public class PatientTest {

    @Test
    public void createPatient() throws IOException {
        Benerator.main(new String[]{"patient_registration.ben.xml"});
    }
}
