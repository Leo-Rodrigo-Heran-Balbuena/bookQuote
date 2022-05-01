package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {

    private HashMap<String, Double> bookInfo = new HashMap<>();

    public Quoter(){
        bookInfo.put("1",10.0);
        bookInfo.put("2",45.0);
        bookInfo.put("3",20.0);
        bookInfo.put("4",35.0);
        bookInfo.put("5",50.0);
    }

    public Double getBookPrice(String book){
        if (bookInfo.containsKey(book)){
            return bookInfo.get(book);
        }
        return 0.0;
    }
}
