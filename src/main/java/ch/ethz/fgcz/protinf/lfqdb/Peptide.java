package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
public class Peptide {
    @Id
    private int idPeptide;
    private String name;
    private double mz;
    private double iRT;
    private String strippedSequence;
    private String modifiedSequence;
    private double score;
    private String scoreType;
    @ManyToMany
    private List<Protein> proteins;
    @OneToMany
    private List<Precursor> precursors;
}
