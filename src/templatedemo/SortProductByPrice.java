/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatedemo;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Asus
 */
public class SortProductByPrice extends SortCollection<Product>{

    @Override
    public int compare(Product t1, Product t2) {
        if (t1.price > t2.price) return 1;
        else if (t1.price == t2.price) return 0;
        else return -1;
    }
}
