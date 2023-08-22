package eai.formation.appbancaire;

import eai.formation.appbancaire.entities.*;
import eai.formation.appbancaire.mappers.ClientMapper;
import eai.formation.appbancaire.services.IClientService;
import eai.formation.appbancaire.services.IUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppBancaireApplication implements CommandLineRunner {

	private final IClientService iClientService;
	private final ClientMapper clientMapper ;

	private final IUserService userService;

	public AppBancaireApplication(IClientService iClientService, ClientMapper clientMapper, IUserService userService) {
		this.iClientService = iClientService;
		this.clientMapper = clientMapper;
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppBancaireApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user= new User();
		user.setUsername("imad");
		user.setPassword(new BCryptPasswordEncoder().encode("imad"));
		user.setRole(ERole.ADMIN.toString());

		//userService.AddUser(user);


	//	iClientService.addClient(client);

	}
	@Bean
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}

}
