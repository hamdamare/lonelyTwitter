package ca.ualberta.cs.lonelytwitter;

/**
 * Created by hamdamare on 2018-01-17.
 */


/**
 * Represents a tweetable tweet.
 * @author Hamda Mare
 * @version 1.5
 */


public interface Tweetable {
    /**
     *
     * @return message Message
     */
    public String getMessage();

    /**
     *
     * @param message Tweetable message
     * @throws ThrowNewException ThrowsNewException Error
     */
    public void setMessage(String message) throws ThrowNewException;
}
//Two classes sad and happy return a message saying im sad and im happy
