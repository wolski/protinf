package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
/** quantified fragment */
public class QuantFragment {
    @Id
    public int idQuantFragment;
    public double mz;
    public double rt;
    public double area;
    public double intensity;
    public double interference;
    public double signalToNoise;
    @ManyToOne
    public Fragment fragment;
    @ManyToOne
    public Run run;
}
