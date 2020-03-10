package foodfinder.services.impl;

import foodfinder.dto.FavoriteRestaurant;
import foodfinder.repository.FavoriteRestaurantRepository;
import foodfinder.services.interfaces.FavoriteRestaurantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FavoriteRestaurantImpl implements FavoriteRestaurantServices {

    @Autowired
    FavoriteRestaurantRepository favoriteRestaurantRepository;


    @Override
    public FavoriteRestaurant saveFavoriteRestaurant(FavoriteRestaurant favoriteRestaurant) {

        if (favoriteRestaurant.getUserId() > 0) {

            FavoriteRestaurant favoriteRestaurantForSpecificUser = favoriteRestaurantRepository.save(favoriteRestaurant);

            return favoriteRestaurantForSpecificUser;

        }
        return null;
    }

    @Override
    public List<Integer> fetchFavoriteRestaurant(Integer userId) {

        if (userId >= 1) {

            List<Integer> listOfFavoriteRestaurantsFromUser = favoriteRestaurantRepository.findFavoriteRestaurantByUserId(userId);


            return listOfFavoriteRestaurantsFromUser;
        }

        return null;

    }
}

