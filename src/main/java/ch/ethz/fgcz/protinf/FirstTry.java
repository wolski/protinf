package ch.ethz.fgcz.protinf;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.h2.tools.Csv;

public class FirstTry {
    public ResultSet specNaut;
    public ResultSet mappings;

    public FirstTry(){}

    public static ResultSet readCSVintoH2(String csvfile, char separator) throws SQLException {
        Csv csv = new Csv();
        csv.setFieldSeparatorRead(separator);
        return csv.read(csvfile, null, null);
    }

    public static void showResultSet(ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        int  j = 0;
        while(rs.next())
        {
            ++j;
            if(j % 100 == 0) {
                System.out.println("test" + (j));
            }
            List list = new ArrayList();
            for (int i = 0; i < meta.getColumnCount(); i++) {
                meta.getColumnLabel(i + 1);
                list.add(rs.getString(i + 1));
            }
        }
        rs.close();
    }

    public static void main(String[] args) throws SQLException {
        FirstTry ft = new FirstTry();
        String headerMappings = "/Users/witold/prog/designdocuments/MappingSpectronaut.csv";

        ft.mappings = readCSVintoH2(headerMappings,',');
        showResultSet(ft.mappings);

        String csvFile = "/Users/witold/prog/imsbInfer/playground/20150811_131108_p1503_Sham_VS_Transection_Report.xls";
        ft.specNaut = readCSVintoH2(csvFile,'\t');
        showResultSet(ft.specNaut);
    }
}
