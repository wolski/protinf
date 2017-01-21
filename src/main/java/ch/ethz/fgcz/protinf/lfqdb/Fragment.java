package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by witold on 19/08/15.
 *
 * [Library...
 */
@Entity
@Data
public class Fragment {
    @Id
    private int idFragment;
    private double mz;
    private double mzPredicted;
    private double rt;
    private int charge;
    private double relativeIntensities; //verify
    /** b,y etc type */
    private String fragmentType;
    private int fragmentNumber;
    private String lossType;
    private int excludeFromQuantification;
}
