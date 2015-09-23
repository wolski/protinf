package ch.ethz.fgcz.protinf;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by witold on 19/08/15.
 */


public class Occams {
    Map<String , Set<String> > proteins = new HashMap<String, Set<String>>();
    Map<String, Set<String> > peptides = new HashMap<String, Set<String>>();

    Occams(String filename) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(filename), ',', '\"');
        //List myEntries = reader.readAll();
        //myEntries.size();
        init(reader);
        System.out.println(peptides.size() + " " + proteins.size());
    }

    private void init(CSVReader reader) throws IOException {
        String [] header = reader.readNext();
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            String protein = nextLine[0];
            String peptide = nextLine[1];
            if (peptides.containsKey(peptide)) {
                peptides.get(peptide).add(protein);
            } else {
                Set tmp = new HashSet();
                tmp.add(protein);
                peptides.put(peptide, tmp);
            }

            if (proteins.containsKey(protein)) {
                proteins.get(protein).add(peptide);
            } else {
                Set tmp = new HashSet();
                tmp.add(peptide);
                proteins.put(protein, tmp);
            }
        }
    }

    static
    List<Map.Entry<String, Set<String> >> entriesSortedByValues(Map<String,Set<String> > map) {
        List<Map.Entry<String, Set<String>>> sortedEntries =
                new ArrayList<Map.Entry<String, Set<String>>>(map.entrySet());
        Collections.sort(sortedEntries,
                new Comparator<Map.Entry<String, Set<String> > > () {
                    public int compare(Map.Entry<String, Set<String>> e1, Map.Entry<String, Set<String>> e2) {
                        return Integer.compare(e2.getValue().size(), e1.getValue().size());
                    }
                }
        );
        return sortedEntries;
    }

    void doStuff(){
        List<Map.Entry<String, Set<String> >> peptidesSort = entriesSortedByValues(peptides);
        peptidesSort.size();
        for(int i=0; i< peptidesSort.size() ; ++i) {

            Map.Entry<String, Set<String> > tmp = peptidesSort.get(i);

        }
    }

}
