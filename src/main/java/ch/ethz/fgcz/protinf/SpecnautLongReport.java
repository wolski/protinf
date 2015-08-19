package ch.ethz.fgcz.protinf;

import org.h2.tools.Csv;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by witold on 19/08/15.
 */
public class SpecnautLongReport {
    public ResultSet specNaut;

    SpecnautLongReport(String csvfile, char separator) {
        Csv csv = new Csv();
        csv.setFieldSeparatorRead(separator);
        try {
            specNaut = csv.read(csvfile, null, null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
