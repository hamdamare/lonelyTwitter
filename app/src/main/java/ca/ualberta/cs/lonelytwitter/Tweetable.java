package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hamdamare on 2018-01-17.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws ThrowNewException;
}
//Two classes sad and happy return a message saying im sad and im happy
