package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
public class QuantPeptide {
    @Id
    public int idQuantProtein;
    public double area;
    public double intensity;
    public double signalToNoise;
    @ManyToOne
    public Peptide peptide;
    @ManyToOne
    public Run Run;
}
