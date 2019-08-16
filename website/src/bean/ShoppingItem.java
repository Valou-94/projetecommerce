package bean;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class ShoppingItem {	
	
 public int productId;
 public String name;
 public String description;
 public double price;
 public int quantity;

}