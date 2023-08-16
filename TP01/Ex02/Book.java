//Vinicius Lopes Nunes CB1640879
//Diego negrete Alves CB1740229

package tp01;

import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> authors = new ArrayList();
    private double price;
    int qty = 0;

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public Book(String name, ArrayList<Author> authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, ArrayList<Author> authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String toString(){
        String ret = "Book[ name = " + name + ", Author[ ";
        
        for (int i = 0; i < authors.size(); i++) {
            ret += "name = " + authors.get(i).getName() + ", email = " + authors.get(i).getEmail() + ", gender = " + authors.get(i).getGender() + ", ";
        }
        ret += "], price = " + price + " qty = " + qty;
        
        return ret;
    }
}
