/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class TemplateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Product> list = new ArrayList<>();
        list.add(new Product("Sản phẩm 1", 10, 1));
        list.add(new Product("Sản phẩm 12", 5, 1));
        list.add(new Product("Sản phẩm", 11, 1));
        SortCollection sortByName = new SortProductByName();
        SortCollection sortByPrice = new SortProductByPrice();
        System.out.println("Mặc định");
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).toString());
        System.out.println("Sort by name");
        sortByName.sort(list);
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).toString());
        System.out.println("Sort by price");
        sortByPrice.sort(list);
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).toString());
        
    }
    
}
