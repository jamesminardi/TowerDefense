package com.se309.socket;

/**
 * Event object for a message received from the backend
 *
 * @author Gavin Tersteeg
 */
public class MessageEvent extends NetworkEvent {

    private Message message;

    /**
     * Constructor for message event
     * @param time Time of message
     * @param m Message
     */
    public MessageEvent(long time, Message m) {
        super(time);

        message = m;
    }

    /**
     * Gets the stored message
     * @return Message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets the stored message
     * @param message Message
     */
    public void setMessage(Message message) {
        this.message = message;
    }
}
