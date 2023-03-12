package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Part")
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "count")
    private long count;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "id_warehouse")
    private String idWarehouse;
}
