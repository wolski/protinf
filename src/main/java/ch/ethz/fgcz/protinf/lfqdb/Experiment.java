package ch.ethz.fgcz.protinf.lfqdb;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by witold on 19/08/15.
 */
@Entity
@Data
public class Experiment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int idExperiment;
    @Column(unique = true)
    public String name;
    public String description;
    @OneToMany
    public final List<Run> runs = new ArrayList<Run>();
}
