
package com.nissandigital.digithon.messengerplatform.model.incomming;

import java.io.Serializable;
import java.util.List;

public class IncommingMessage implements Serializable
{

    private String object;
    private List<Entry> entry ;
    private final static long serialVersionUID = -3233009644557769365L;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

}
