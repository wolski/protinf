package ch.ethz.fgcz.protinf.lfqdb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by witold on 19/08/15.
 */
@Entity
public class Protein {
    @Id
    private int idProtein;
    private String name;
    private int housekeeping;
    @ManyToMany
    private List<Peptide> peptides;
}
