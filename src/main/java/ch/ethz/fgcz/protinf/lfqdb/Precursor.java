package ch.ethz.fgcz.protinf.lfqdb;

import ch.ethz.fgcz.protinf.lfqdb.Fragment;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
public class Precursor {
    @Id
    private int idPrecursor;
    private String name;
    private double mz;
    private int charge;
    private int idPeptide;
    @OneToMany
    private List<Fragment> fragments;
}
