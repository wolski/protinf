package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;

import javax.persistence.*;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
public class Run {
    @Id
    public int idRun;
    public String fileName;
    public String condition;
    public String bioReplicate;
    public int idExperiment;
    @OneToMany
    public List<QuantProtein> quantProteinList;
    @OneToMany
    public List<QuantPeptide> quantPeptideList;
    @OneToMany
    public List<QuantPrecursorLFQ> quantPrecursorLFQList;
    @OneToMany
    public List<QuantPrecursorDIA> quantPrecursorDIAList;
    @OneToMany
    public List<QuantFragment> quantFragmentList;

}
