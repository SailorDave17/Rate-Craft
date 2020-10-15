package org.wecancodeit.reviews.storage;
import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.Category;

import java.util.Optional;

@Service
public class CategoryStorage {

    private CategoryRepository categoryRepo;


    public CategoryStorage(CategoryRepository categoryRepo){
        this.categoryRepo = categoryRepo;
    }


    public Iterable<Category> retrieveAllCategories() {
        return categoryRepo.findAll();
    }

    public Category retrieveCategoryById(Long id){
        Optional<Category> retrievedCategoryOptional = categoryRepo.findById(id);
        if(retrievedCategoryOptional.isPresent()){
            Category retrievedCategory = retrievedCategoryOptional.get();
            return retrievedCategory;
        }
        else{
            return null;
        }
    }

    public void addCategory(Category categoryToAdd){
        categoryRepo.save(categoryToAdd);
    }
}
