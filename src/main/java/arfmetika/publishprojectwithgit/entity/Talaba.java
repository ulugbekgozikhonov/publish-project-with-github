package arfmetika.publishprojectwithgit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Talaba {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "famelya")

    private String last_name;


}
