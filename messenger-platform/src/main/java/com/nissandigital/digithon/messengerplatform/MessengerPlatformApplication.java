package com.nissandigital.digithon.messengerplatform;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MessengerPlatformApplication {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.put("http.proxyHost", "http://binu.radhakrishnan@nissanmotor.com:6Jb!nu143@@JP-NML-SJ024004.NMCorp.Nissan.Biz");
		props.put("http.proxyPort", "8080");
		SpringApplication.run(MessengerPlatformApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
	    /*SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();

	    Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("http://binu.radhakrishnan@nissanmotor.com:6Jb!nu143@@JP-NML-SJ024004.NMCorp.Nissan.Biz", 8080));
	    requestFactory.setProxy(proxy);*/

	    return new RestTemplate();
	}
}
