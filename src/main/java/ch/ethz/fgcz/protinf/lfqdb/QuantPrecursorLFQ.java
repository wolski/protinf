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
public class QuantPrecursorLFQ {
    @Id
    public int idQuantPrecursorLFQ;
    public double rt;
    public double mz;
    public double area;
    public double intensity;
    public double signalToNoise;
    @ManyToOne
    public Precursor precursor;
    @ManyToOne
    public Run run;
}
