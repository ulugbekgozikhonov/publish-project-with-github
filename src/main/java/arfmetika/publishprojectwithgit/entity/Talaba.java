package arfmetika.publishprojectwithgit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Talaba {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "famelya")

    private String last_name;

}
