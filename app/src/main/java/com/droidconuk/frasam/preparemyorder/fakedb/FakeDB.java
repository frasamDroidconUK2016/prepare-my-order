package com.droidconuk.frasam.preparemyorder.fakedb;

import com.droidconuk.frasam.preparemyorder.model.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by francescoditrani on 29/10/16.
 */

public class FakeDB {

    public static final Map<String, Product> halloweenProducts;
    static
    {
        halloweenProducts = new HashMap<String, Product>();
        halloweenProducts.put("123456", new Product("Pumpkin", new Double(29.99)));
        halloweenProducts.put("327645", new Product("Cauldron", new Double(199.99)));
        halloweenProducts.put("327645", new Product("Bat eyes", new Double(0.99)));
        halloweenProducts.put("327645", new Product("Lizard tail", new Double(3.99)));
        halloweenProducts.put("472384", new Product("Nimbus 2000", new Double(3.99)));
    }


}
