package arfmetika.publishprojectwithgit.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Talaba {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "famelya")

    private String last_name;

}
