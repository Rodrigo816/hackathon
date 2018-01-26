package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Advertisement;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MockAdvertisementService implements AdvertisementService {

    private Map<String, Advertisement> advertisements = new HashMap();

    @Override
    public void addAdvertisement(Advertisement advertisement) {
        advertisements.put(advertisement.getAdvertiser().getUser().getEmail(), advertisement);
    }

    @Override
    public void removeAdvertisement(Advertisement advertisement) {
        advertisements.remove(advertisement);
    }

    @Override
    public List<Advertisement> findAdvertisements(String location) {
        List advertisements = new LinkedList<>(this.advertisements.values());

        for (int i = 0; i < advertisements.size(); i++) {
            if(!((Advertisement)advertisements.toArray()[i]).getAdvertiser().getLocation().equals(location)){
                advertisements.remove(advertisements.toArray()[i]);
            }
        }
        return advertisements;
    }
}
