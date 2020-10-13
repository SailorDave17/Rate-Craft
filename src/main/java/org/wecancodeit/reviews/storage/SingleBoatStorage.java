package org.wecancodeit.reviews.storage;
import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.SingleBoat;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SingleBoatStorage {
    Map<Long, SingleBoat> boatList = new HashMap<>();

    public SingleBoatStorage(){

    }

    public Collection<SingleBoat> retrieveAllBoats() {
        return boatList.values();
    }

    public SingleBoat retrieveBoatById(long id) {
        return boatList.get(id);
    }
}
