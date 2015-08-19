package ch.ethz.fgcz.protinf;

import java.util.List;
import java.util.Set;

/**
 * Created by witold on 19/08/15.
 */

class Peptide{
    Set<Protein> proteins;
}

class Protein{
    Set<Peptide> peptides;
}

public class Ocams {
    List<Protein> proteins;
    List<Peptide> peptides;



}
