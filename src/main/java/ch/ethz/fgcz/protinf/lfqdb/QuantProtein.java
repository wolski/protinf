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
public class QuantProtein {
    @Id
    public int idQuantProtein;
    public double area;
    public double intensity;
    public double signalToNoise;
    @ManyToOne
    public Protein protein;
    @ManyToOne
    public Run run;
}

