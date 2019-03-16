package kane.tech.cat_prod.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Produit {
    @Id
    private String idProd;
    private String nom;
    private double price;
    @DBRef
    private Categorie categorie;

}
