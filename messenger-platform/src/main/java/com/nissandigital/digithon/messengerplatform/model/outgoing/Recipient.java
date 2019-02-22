
package com.nissandigital.digithon.messengerplatform.model.outgoing;

import java.io.Serializable;

public class Recipient implements Serializable
{

    private String id;
    private final static long serialVersionUID = -6011058278252279222L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
