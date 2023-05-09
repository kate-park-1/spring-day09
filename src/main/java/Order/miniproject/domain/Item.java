package Order.miniproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype")
public abstract class Item {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="item_id")
  private Long id;
  @Column(length = 125, nullable = false)
  private String name;
  private int price;
  @Column(name="stock_quantity")
  private int stockQuantity;
}
