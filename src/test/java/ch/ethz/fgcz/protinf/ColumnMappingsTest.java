package ch.ethz.fgcz.protinf;

import static org.junit.Assert.*;

/**
 * Created by witold on 19/08/15.
 */
public class ColumnMappingsTest {

    @org.junit.Test
    public void testToString() throws Exception {
        String headerMappings = "/Users/witold/prog/designdocuments/MappingSpectronaut.csv";
        ColumnMappings cm = new ColumnMappings(headerMappings);
        System.out.println(cm);
    }
}