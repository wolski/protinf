package ch.ethz.fgcz.protinf;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by witold on 19/08/15.
 */
public class OccamsTest {

    @Test
    public void test() throws IOException {
        Occams oc = new Occams("src/main/resources/res2.csv");
        oc.doStuff();
    }
}