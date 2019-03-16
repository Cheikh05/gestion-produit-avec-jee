package kane.tech.cat_prod.dao;

import kane.tech.cat_prod.models.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends MongoRepository<Categorie,String> {
}
