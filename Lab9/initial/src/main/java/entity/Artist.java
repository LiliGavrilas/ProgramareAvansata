package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="country")
    private String country;
}
