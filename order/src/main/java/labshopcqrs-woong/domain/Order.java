package labshopcqrs-woong.domain;

import labshopcqrs-woong.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Order_table")
@Data

//<<< DDD / Aggregate Root
public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private String productId;
    
    
    
    
    private Integer qty;
    
    
    
    
    private String customerId;
    
    
    
    
    private Double amount;
    
    
    
    
    private String status;
    
    
    
    
    private String address;


    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
//>>> DDD / Aggregate Root
