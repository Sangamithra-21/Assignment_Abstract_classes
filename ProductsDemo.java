package Assignment_13_Abstraction;
import java.util.ArrayList;
abstract class Product{
    String name;
    double price;

    Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }

    abstract double getPrice();
    abstract String getDescription();


}

class ElectronicProduct extends Product{

    ElectronicProduct(String name,double price)
    {
        super(name,price);
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return "Product Name    : "+name+"\n"+
               "Product Price  : "+getPrice()+"\n"+
               "------------------------------------------------------------------------------------------------------";

    }
}

class ClothingProduct extends Product{
     int size;
    ClothingProduct(String name,double price,int size)
    {
        super(name,price);
        this.size=size;
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return "Cloth Name    : "+name+"\n"+
                "Cloth Size   : "+size+"\n"+
                "Cloth Price  : "+price+"\n"+
                "------------------------------------------------------------------------------------------------------";

    }
}
class BookProduct extends Product{
    String author;
    BookProduct(String name,double price,String author)
    {
        super(name,price);
        this.author=author;
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    String getDescription() {
        return "Book Name     : "+name+"\n"+
                "Book Author   : "+author+"\n"+
                "Book Price    : "+price+"\n"+
                "-----------------------------------------------------------------------------------------------------";
    }
}
class ShoppingCart
{
    ArrayList<Product> cart;
    ShoppingCart()
    {
        cart=new ArrayList<>();
    }
    void addItems(Product P)
    {
        cart.add(P);
    }
    void getProductDetails()
    {
       for(Product p : cart)
       {
           System.out.println(p.getDescription());
       }
    }
    void getTotalPrice()
    {
        double sum=0;
        for(Product prd : cart)
        {
            sum=sum+prd.price;
        }
        System.out.println("Total Price : "+sum);
    }

}
public class ProductsDemo{
    public static void main(String[] args) {
        Product electronic=new ElectronicProduct("Mobile",14000);
        Product cloth=new ClothingProduct("Hoodie",3500,30);
        Product book=new BookProduct("Life of pie",350,"Yann Martel");
        ShoppingCart s=new ShoppingCart();
        s.addItems(electronic);
        s.addItems(cloth);
        s.addItems(book);
        s.getProductDetails();
        s.getTotalPrice();
    }
}