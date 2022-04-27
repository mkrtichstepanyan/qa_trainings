package designpatterns.homework_7.davit_balabekyan.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TVFactory {

    private static final Map<String,TVType> tvTypes = new HashMap<>();

    public static TVType getTVType(String type){
        if (tvTypes.get(type) == null){
            tvTypes.put(type,new TVType(type));
        }
        return tvTypes.get(type);
    }
}
