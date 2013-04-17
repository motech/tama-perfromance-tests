package org.motechproject.tama.performance.patient;


import org.databene.benerator.main.Benerator;
import org.junit.Test;

import java.io.IOException;

public class CallLogTest {

    @Test
    public void createCallLog() throws IOException {
        long startTime = System.currentTimeMillis();
        System.setProperty("count", String.valueOf(1));
        Benerator.main(new String[]{"call_log.ben.xml"});
        long endTime = System.currentTimeMillis();
        System.out.println("Timetaken: " + (endTime - startTime) / 1000 + " seconds");
    }
}
