package pl.venustus.RichardsonRestExample;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {

    List<Animal> findByLastName(@Param("name") String name);

}
