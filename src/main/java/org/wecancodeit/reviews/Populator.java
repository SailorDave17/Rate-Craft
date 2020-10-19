//package org.wecancodeit.reviews;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.wecancodeit.reviews.models.Category;
//import org.wecancodeit.reviews.models.Review;
//import org.wecancodeit.reviews.storage.CategoryStorage;
//import org.wecancodeit.reviews.storage.ReviewStorage;
//
//@Component
//public class Populator implements CommandLineRunner {
//    private ReviewStorage reviewStorage;
//    private CategoryStorage categoryStorage;
//
//    public Populator(ReviewStorage reviewStorage, CategoryStorage categoryStorage) {
//        this.reviewStorage = reviewStorage;
//        this.categoryStorage = categoryStorage;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Category catamaran = new Category("Catamaran");
//        Category dinghy = new Category("Dinghy");
//        Category motorsailer = new Category("Motorsailer");
//        Category historic = new Category("Historic");
//
//        categoryStorage.addCategory(catamaran);
//        categoryStorage.addCategory(dinghy);
//        categoryStorage.addCategory(motorsailer);
//        categoryStorage.addCategory(historic);
//
//        Review sampleReviewOne = new Review(catamaran, "Ford", "Prius", "Yes, you are reading this right, that is a Ford Prius Sailboat. Get over it.");
//
//        reviewStorage.addReview(sampleReviewOne);
//
//
//    }
//
//}

