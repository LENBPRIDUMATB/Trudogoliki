package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Buyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

}
