package org.wecancodeit.reviews.storage;
import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.models.Hashtag;


public interface HashtagRepository extends CrudRepository<Hashtag, Long>{
    Hashtag findHashtagByName(String name);
}
