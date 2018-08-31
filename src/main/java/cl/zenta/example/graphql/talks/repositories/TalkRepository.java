package cl.zenta.example.graphql.talks.repositories;

import cl.zenta.example.graphql.talks.entities.Talk;
import org.springframework.data.repository.CrudRepository;

public interface TalkRepository extends CrudRepository<Talk, Integer> {
}
