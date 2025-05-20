package org.example.tpPapetterie;

import org.example.tpPapetterie.model.ArticleUnitaire;

import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    public static Map<String, ArticleUnitaire> database = new HashMap<>();

    public static Map<String, ArticleUnitaire> getAllArticleUnitairePriceMax(double priceMax){
        Map<String, ArticleUnitaire> filtreDataBase = new HashMap<>();
        for(String key: database.keySet()){
            //System.out.println("la clé est: "+key);
            //System.out.println("Et sa valeur est :"+database.get(key));
            if(database.get(key).getPu()<=priceMax){
                filtreDataBase.put(key, database.get(key));
            }

        }
        return filtreDataBase;
    }

}
