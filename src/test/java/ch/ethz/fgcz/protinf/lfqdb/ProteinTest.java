package ch.ethz.fgcz.protinf.lfqdb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wewol on 12/16/2015.
 */
public class ProteinTest {
    Protein protein;
    @Before
    public void setUp() throws Exception {
        protein = new Protein();
    }

    @Test
    public void testIdiotmethod() throws Exception {
        protein.setIdProtein(1);
        protein.setDescription("Q123415");
    }

}