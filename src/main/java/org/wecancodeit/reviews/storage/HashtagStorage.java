package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.Hashtag;
import org.wecancodeit.reviews.models.Review;

import java.util.Collection;
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
        return retrievedHashtagOptional.orElse(null);
    }

//    public Hashtag addHashtag(String inputHashtag) {
//        Hashtag hashtagToAdd = new hashtagRepo.findHashtagByName(inputHashtag);
//        Optional<Hashtag> retrievedHashtagOptional = Optional.ofNullable(hashtagRepo.findHashtagByName(inputHashtag));
//        if (retrievedHashtagOptional.isPresent()) {
//            hashtagToAdd = retrievedHashtagOptional.get();
//            return hashtagToAdd;
//        }
//        hashtagRepo.save(hashtagToAdd);
//        return hashtagToAdd;
//    }

    public void retrieveOrCreateHashtagByName(String name, Review review) {
        Optional<Hashtag> retrievedHashtagOptional = Optional.ofNullable(hashtagRepo.findHashtagByName(name));
        Hashtag hashtagToStore;
        if (retrievedHashtagOptional.isPresent()) {
            hashtagToStore = retrievedHashtagOptional.get();
            hashtagToStore.addReview(review);
        } else {
            hashtagToStore = new Hashtag(name, review);
        }
        hashtagRepo.save(hashtagToStore);
    }

}
