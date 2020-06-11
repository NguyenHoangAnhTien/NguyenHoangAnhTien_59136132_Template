/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedemo;

/**
 *
 * @author Asus
 */
public class Product {
    String name;
    int price;
    int quality;

    public Product(String name, int price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product: "+this.name+". Price: "+this.price+". Quality: "+this.quality; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
}
