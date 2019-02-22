
package com.nissandigital.digithon.messengerplatform.model.incomming;

import java.io.Serializable;

public class Message implements Serializable
{

    private String mid;
    private Integer seq;
    private String text;
    private final static long serialVersionUID = 214692826654134234L;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
