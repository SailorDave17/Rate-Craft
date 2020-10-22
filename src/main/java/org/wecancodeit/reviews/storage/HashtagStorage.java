package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.Hashtag;

import java.util.Optional;

@Service
public class HashtagStorage {

    private HashtagRepository hashtagRepo;


    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }


    public Iterable<Hashtag> retrieveAllHashtags() {
        return hashtagRepo.findAll();
    }

    public Hashtag retrieveHashtagById(Long id) {
        Optional<Hashtag> retrievedHashtagOptional = hashtagRepo.findById(id);
        if (retrievedHashtagOptional.isPresent()) {
            Hashtag retrievedHashtag = retrievedHashtagOptional.get();
            return retrievedHashtag;
        } else {
            return null;
        }
    }

    public void addHashtag(Hashtag hashtagToAdd) {
        hashtagRepo.save(hashtagToAdd);
    }
}
