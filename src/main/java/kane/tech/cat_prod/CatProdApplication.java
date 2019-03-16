package kane.tech.cat_prod;

import kane.tech.cat_prod.dao.CategorieRepository;
import kane.tech.cat_prod.dao.ProduitRepository;
import kane.tech.cat_prod.models.Categorie;
import kane.tech.cat_prod.models.Produit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class CatProdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatProdApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CategorieRepository categorieRepository, ProduitRepository produitRepository){
        return args->{

            categorieRepository.deleteAll();

            Stream.of("C1 Ordianateur","C2 Imprimente").forEach(
                    c->{
                        categorieRepository.save(new Categorie(c.split(" ")[0],c.split(" ")[1],new ArrayList<>()));
                    }
            );
            categorieRepository.findAll().forEach(c->{
                System.out.println(c);
            });


            produitRepository.deleteAll();
            Categorie categorie = categorieRepository.findById("C1").get();

            Stream.of("Ordinateur ASUS N551JX","Iphone 6 Plus Or","Ordinateur HP ProBook 4553s","ASUS Gamers GTX 850").forEach(
                    p->{
                       Produit p1 = produitRepository.save(new Produit(null,p,Math.random()*1000,categorie));
                       categorie.getProduits().add(p1);
                       categorieRepository.save(categorie);
                    }
            );




            produitRepository.findAll().forEach(
                    p->{
                        System.out.println(p);
                    }
            );

        };
    }

}
