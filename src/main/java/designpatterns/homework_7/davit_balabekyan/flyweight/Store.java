package designpatterns.homework_7.davit_balabekyan.flyweight;

import designpatterns.flyweight.Book;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<TV> tvs = new ArrayList<>();

    public void storeTv(double price,String type){
        TVType tvType = TVFactory.getTVType(type);
        tvs.add(new TV(price,tvType));
    }
}
