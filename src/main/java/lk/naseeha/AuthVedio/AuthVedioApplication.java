package lk.naseeha.AuthVedio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthVedioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthVedioApplication.class, args);
	}

}
