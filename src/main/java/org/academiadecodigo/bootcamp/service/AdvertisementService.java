package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Advertisement;

import java.util.List;

public interface AdvertisementService {
    void addAdvertisement(Advertisement advertisement);
    void removeAdvertisement(Advertisement advertisement);
    List<Advertisement> findAdvertisements(String location);
}
