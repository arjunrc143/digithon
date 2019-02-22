package com.nissandigital.digithon.messengerplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nissandigital.digithon.messengerplatform.model.incomming.IncommingMessage;
import com.nissandigital.digithon.messengerplatform.service.impl.MessengerPlatformServiceImpl;

@RestController
@RequestMapping("/webhook")
public class MessengerPlatformController {
	private static final String VERIFY_TOKEN = "BROCODE_VERIFICATION_TOCKEN";
	@Autowired
	private MessengerPlatformServiceImpl messengerPlatformService;

	@PostMapping
	public ResponseEntity<String> processMessage(@RequestBody IncommingMessage incommingMessage) {
		try {

			messengerPlatformService.processMessage(incommingMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().body("Ok");
	}

	@GetMapping
	public String verify(@RequestParam("hub.mode") String hub_mode, @RequestParam("hub.verify_token") String tocken,
			@RequestParam("hub.challenge") String challenge) {
		if (hub_mode.equals("subscribe") && tocken.equals(VERIFY_TOKEN)) {

			return challenge;

		} else {
			// Responds with '403 Forbidden' if verify tokens do not match
			return null;
		}

	}
}
