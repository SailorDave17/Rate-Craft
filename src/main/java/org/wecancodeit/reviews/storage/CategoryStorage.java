package org.wecancodeit.reviews.storage;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {
    Map<Long, org.wecancodeit.reviews.models.Category> categoryList = new HashMap<>();

    public CategoryStorage(){

    }

    public Collection<org.wecancodeit.reviews.models.Category> retrieveAllCategories() {
        return categoryList.values();
    }

    public org.wecancodeit.reviews.models.Category retrieveCategoryById(long id) {
        return categoryList.get(id);
    }
}
