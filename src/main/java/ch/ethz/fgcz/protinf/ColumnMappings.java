package ch.ethz.fgcz.protinf;

import org.h2.tools.Csv;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by witold on 19/08/15.
 */
public class ColumnMappings {
    private final char SEPARTOR = ',';
    public ResultSet specNaut;
    //private Map<String,String> map = new HashMap();
    private Map<String, Map<String,String> > map2 = new HashMap();

    public ColumnMappings(String csvfile){
        Csv csv = new Csv();
        csv.setFieldSeparatorRead(SEPARTOR);
        try {
            specNaut = csv.read(csvfile, null, null);
            this.generateMap();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void generateMap() throws SQLException {
        ResultSetMetaData meta = specNaut.getMetaData();
        int j = 0;
        assert meta.getColumnCount() == 2;
        while (specNaut.next()) {
            String key = specNaut.getString(1);
            String [] keys = key.split("_");
            if( map2.containsKey(keys[0]) ){
                map2.get(keys[0]).put(keys[1],specNaut.getString(2));
            }else {
                Map<String,String> map = new HashMap<String,String>();
                map.put(keys[1], specNaut.getString(2));
                map2.put(keys[0], map ) ;
            }
        }
        specNaut.close();
    }

    public String toString(){
        String res="";
        for(Map.Entry<String, Map<String,String> > entry : map2.entrySet()){
            res += "[" + entry.getKey() + "=";
            Map<String,String> tmp = entry.getValue();
            for( Map.Entry entry2 : tmp.entrySet()  ){
                res+= "{" + entry2.getKey() + " =" + entry2.getValue() + "}";
            }
            res +="\n";
        }
        return res;
    }

}

