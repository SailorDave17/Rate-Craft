package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.Category;
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
            Category nullCategory = new Category("NullCat");
            Review nullReview = new Review(nullCategory, "", "", "nobody here but us chickens");
            return  nullReview;
        }
    }

    public void addReview(Review reviewToAdd){
        reviewRepo.save(reviewToAdd);
    }

    public void updateReview(Review editedReview) {
        reviewRepo.save(editedReview);
    }

    public void deleteReview(Long id) {
        reviewRepo.delete(retrieveReviewById(id));
    }
}

