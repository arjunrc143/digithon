package com.nissandigital.digithon.messengerplatform.service.impl;

import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nissandigital.digithon.messengerplatform.model.incomming.IncommingMessage;
import com.nissandigital.digithon.messengerplatform.model.outgoing.Message;
import com.nissandigital.digithon.messengerplatform.model.outgoing.Recipient;
import com.nissandigital.digithon.messengerplatform.model.outgoing.Reply;

@Service
public class MessengerPlatformServiceImpl {
	@Autowired
	private RestTemplate restTemplate;
    private static  final  String URL="https://graph.facebook.com/v2.6/me/messages?access_token=EAAFvqClrnlYBAN9OgH9id0Jq6zwoMoziqjGWtuzshI1I1ifsYHdsmBX6kKCXCPm7cPPKlEHirDp64WnvBTitmOc0LINhXO6eDppZBa3gKZBLHL2lv5SFK6R1Qf90p5VZBOPjqJtUYNyA11p9autROZAA8SmNfjS3vPJ3JoyJNgZDZD";
    public void processMessage(IncommingMessage incommingMessage){
        Reply reply=new Reply();
        reply.setMessagingType("RESPONSE");
        Recipient recipient=new Recipient();
        recipient.setId(incommingMessage.getEntry().get(0).getMessaging().get(0).getSender().getId());
        reply.setRecipient(recipient);
        Message message=new Message();
        message.setText(incommingMessage.getEntry().get(0).getMessaging().get(0).getMessage().getText());
        reply.setMessage(message);
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.postForObject(URL,reply,String.class);

    }
}
