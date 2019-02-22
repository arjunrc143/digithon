
package com.nissandigital.digithon.messengerplatform.model.outgoing;

import java.io.Serializable;

public class Reply implements Serializable
{

    private String messagingType;
    private Recipient recipient;
    private Message message;
    private final static long serialVersionUID = 6029973119328200567L;

    public String getMessagingType() {
        return messagingType;
    }

    public void setMessagingType(String messagingType) {
        this.messagingType = messagingType;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

}
