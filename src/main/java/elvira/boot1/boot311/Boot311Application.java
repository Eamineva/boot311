package elvira.boot1.boot311;

import elvira.boot1.boot311.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import elvira.boot1.boot311.DAO.UserDao;

@SpringBootApplication
public class Boot311Application  {

	public static void main(String[] args) {
		SpringApplication.run(Boot311Application.class, args);
	}

}
