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
public class QuantPrecursorDIA {
    @Id
    public int idQuantPrecursorDIA;
    public double rt;
    public double area;
    public double intensity;
    public double cScore;
    public double qValue;
    public double signalToNoise;
    @ManyToOne
    public Precursor precursor;
    @ManyToOne
    public Run run;
}
