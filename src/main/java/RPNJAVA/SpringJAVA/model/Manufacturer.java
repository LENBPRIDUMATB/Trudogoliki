package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Manufacturer")
public class Manufacturer {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;


}

