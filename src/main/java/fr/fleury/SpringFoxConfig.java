package fr.fleury;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
// L'annotation  @Configuration  appliquée à la classe permet de remplacer 
//un fichier de configuration classique en XML.
//Elle nous donne accès à plusieurs méthodes très intéressantes pour la 
//personnalisation de Swagger, grâce à la classe Docket qui gère toutes les configurations.
public class SpringFoxConfig{
    @Bean
    public Docket api() { 
	
	    //On commence alors par initialiser un objet 
	    //Docket en précisant que nous souhaitons utiliser swagger 2.
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()   // select permet d'initialiser une classe du nom de ApiSelectorBuilder                               
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
//Vous pouvez également accéder à une version au format HTML à l'adresse suivante : http://localhost:8081/rest/swagger-ui.html
}


