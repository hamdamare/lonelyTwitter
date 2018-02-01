package ca.ualberta.cs.lonelytwitter;

/**
 * Represents a Normaltweet.
 * @author Hamda Mare
 * @version 1.5
 * @see Tweet
 */

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

    /**
     * Override
     * @return true
     */
    @Override
    public boolean isimportant() {
        return true;
    }

    /**
     *
     * @return false
     */
    public boolean isImportant() {
        return false;
    }

}
