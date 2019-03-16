package kane.tech.cat_prod.dao;

import kane.tech.cat_prod.models.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends MongoRepository<Produit,String> {
}
