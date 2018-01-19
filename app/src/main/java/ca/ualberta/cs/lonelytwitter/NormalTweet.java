package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hamdamare on 2018-01-17.
 */

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }
    NormalTweet(String message, String date){
        super(message,date);
    }
    @Override
    public boolean isimportant(){
        return true;

}
