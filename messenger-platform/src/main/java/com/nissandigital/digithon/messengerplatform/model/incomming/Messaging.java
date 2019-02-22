
package com.nissandigital.digithon.messengerplatform.model.incomming;

import java.io.Serializable;
import java.util.Date;

public class Messaging implements Serializable
{

    private Sender sender;
    private Recipient recipient;
    private Date timestamp;
    private Message message;
    private final static long serialVersionUID = 1702590885406097022L;

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
