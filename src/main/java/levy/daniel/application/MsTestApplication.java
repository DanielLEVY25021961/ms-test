package levy.daniel.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author daniel.levy
 *
 */
@SpringBootApplication
public class MsTestApplication { // NOPMD by daniel.levy on 16/10/2020 06:46

	
	
	/**
	 * CONSTRUCTEUR D'ARITE NULLE.
	 */
	public MsTestApplication() {
		super();
	} // Fin du CONSTRUCTEUR D'ARITE NULLE.________________________________
	
	

	/**
	 * @param pArgs : String[]
	 */
	public static void main(final String... pArgs) {
		SpringApplication.run(MsTestApplication.class, pArgs);
	}

}
