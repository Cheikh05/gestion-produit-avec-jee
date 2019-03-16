package kane.tech.cat_prod.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class Categorie {
    @Id
    private String idCat;
    private String nom;
    @DBRef
    private Collection<Produit> produits = new ArrayList<>();

    @Override
    public String toString() {
        return "Categorie{" +
                "idCat='" + idCat + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
