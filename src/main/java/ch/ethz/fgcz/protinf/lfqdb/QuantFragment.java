package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
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
