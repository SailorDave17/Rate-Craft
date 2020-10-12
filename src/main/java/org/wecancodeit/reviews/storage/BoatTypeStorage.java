package org.wecancodeit.reviews.storage;
import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.BoatType;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BoatTypeStorage {
    Map<Long, BoatType> boatList = new HashMap<>();

    public BoatTypeStorage(){

    }

    public Collection<BoatType> retrieveAllBoats() {
        return boatList.values();
    }

    public BoatType retrieveBoatById(long id) {
        return boatList.get(id);
    }
}
