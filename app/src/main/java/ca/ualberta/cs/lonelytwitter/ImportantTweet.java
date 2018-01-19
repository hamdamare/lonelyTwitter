package ca.ualberta.cs.lonelytwitter;


/**
 * Created by hamdamare on 2018-01-17.
 */

public class ImportantTweet extends Tweet {
    ImportantTweet(String message){
        super(message);
    }
    ImportantTweet(String message, String date){
        super(message,date);

    }

    public boolean isimportant() {
        return false;
    }

    @Override
    public boolean isImportant(){
        return true;
    }
}
