package ru.babyhall.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ru.babyhall.domain.InventoryStatus;

import ru.babyhall.domain.Offer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class OfferService {

    private List<Offer> offers = new ArrayList<>();

    @PostConstruct
    public void init() {
        //offers.add(new Offer(1000, "f230fh0g3", "Bamboo Watch", "Product Description", "bamboo-watch.jpg", 65, "Accessories", 24, InventoryStatus.INSTOCK, 5));

    }

    /*public List<Offer> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Offer> getProducts(int size) {

        if (size > products.size()) {
            Random rand = new Random();

            List<Offer> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(products.size());
                randomList.add(products.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(products.subList(0, size));
        }

    }

    public List<Offer> getClonedProducts(int size) {
        List<Offer> results = new ArrayList<>();
        List<Offer> originals = getProducts(size);
        for (Offer original : originals) {
            results.add(original.clone());
        }
        return results;
    }*/
}
