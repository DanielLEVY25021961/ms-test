package levy.daniel.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * CLASSE MsTestApplication :<br/>
 * <ul>
 * <li>Point d'entrée de l'application SPRING BOOT.</li>
 * <li>L'annotation <code>SpringBootApplication</code> déclare à SPRING 
 * qu'il s'agit de la classe APPLICATIVE.</li>
 * <li>L'annotation <code>EnableConfigurationProperties</code> déclare à SPRING 
 * que l'on peut écrire un Bean qui récupère les valeurs 
 * dans les applications.properties.</li>
 * <li>L'annotation <code>EnableDiscoveryClient</code> déclare à SPRING 
 * que ce Micro-Service s'enregistre auprès du serveur annuaire EUREKA.</li>
 * <li>L'annotation <code>EnableSwagger2</code> déclare à SPRING 
 * que l'on va générer la documentation du MICRO-SERVICE avec Swagger2.</li>
 * </ul>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author Daniel Lévy
 * @version 1.0
 * @since 20 oct. 2020
 */
@EnableConfigurationProperties
@EnableDiscoveryClient
@EnableSwagger2
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
