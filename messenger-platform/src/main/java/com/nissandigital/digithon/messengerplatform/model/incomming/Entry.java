
package com.nissandigital.digithon.messengerplatform.model.incomming;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Entry implements Serializable
{

    private String id;
    private Date time;
    private List<Messaging> messaging;
    private final static long serialVersionUID = -4524154547058589159L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public List<Messaging> getMessaging() {
        return messaging;
    }

    public void setMessaging(List<Messaging> messaging) {
        this.messaging = messaging;
    }

}
