
package com.nissandigital.digithon.messengerplatform.model.incomming;

import java.io.Serializable;

public class Sender implements Serializable
{

    private String id;
    private final static long serialVersionUID = -240327177580715051L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
