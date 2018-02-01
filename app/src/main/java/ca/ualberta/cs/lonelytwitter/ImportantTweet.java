package ca.ualberta.cs.lonelytwitter;


/**
 * Represents an Important tweet
 * @author Hamda Mare
 * @version 1.5
 * @see Tweet
 */

/**
 * Created by hamdamare on 2018-01-17.
 */

public class ImportantTweet extends Tweet {
    /**
     *
     * @param message ImportantTweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     *
     * @param message ImportantTweet message
     * @param date ImportantTweet date
     */
    ImportantTweet(String message, String date){
        super(message,date);
    }

    /**
     *
     * @return false
     */

    public boolean isimportant() {
        return false;
    }

    /**
     * OVERRIDE
     * @return true
     */
    @Override
    public boolean isImportant(){
        return true;
    }
}
