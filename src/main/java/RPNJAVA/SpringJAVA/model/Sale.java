package RPNJAVA.SpringJAVA.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Sale")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "partId")
    private long partId;

    @Column(name = "count")
    private long count;

    @Column(name = "buyerId")
    private long buyerId;

//    @Column(name = "date")
//    private Date date;


}
