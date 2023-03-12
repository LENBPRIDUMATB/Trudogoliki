package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Warehouse")
public class Warehouse {

    @Id
    @Column(name = "id_warehouse")
    private long idWarehouse;

    @Column(name = "password")
    private String password;

}