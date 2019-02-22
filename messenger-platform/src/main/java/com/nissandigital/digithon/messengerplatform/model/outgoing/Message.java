
package com.nissandigital.digithon.messengerplatform.model.outgoing;

import java.io.Serializable;

public class Message implements Serializable
{

    private String text;
    private final static long serialVersionUID = -5492823005445664133L;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
