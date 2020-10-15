package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.Review;

import java.util.Optional;

@Service
public class ReviewStorage {

    private ReviewRepository reviewRepo;


    public ReviewStorage(ReviewRepository reviewRepo){
        this.reviewRepo = reviewRepo;
    }


    public Iterable<Review> retrieveAllReviews() {
        return reviewRepo.findAll();
    }

    public Review retrieveReviewById(Long id){
        Optional<Review> retrievedReviewOptional = reviewRepo.findById(id);
        if(retrievedReviewOptional.isPresent()){
            Review retrievedReview = retrievedReviewOptional.get();
            return retrievedReview;
        }
        else{
            return null;
        }
    }

    public void addReview(Review reviewToAdd){
        reviewRepo.save(reviewToAdd);
    }
}
