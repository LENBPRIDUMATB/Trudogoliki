package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "info")
    private String info;
}
