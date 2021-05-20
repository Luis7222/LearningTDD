package test;


import java.util.List;

public class ShoppingBasket {
    private final List<Item> items;

    public ShoppingBasket(List<Item> items){
        this.items = items;
    }

    public double getTotal(){
      return items.stream().mapToDouble(item -> getSubtotal(item)).sum();


    }
    public double getSubtotal(Item item){
        return item.getUnitPrice()*item.getQuantity();
    }

}
