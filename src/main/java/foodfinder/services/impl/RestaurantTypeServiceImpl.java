package foodfinder.services.impl;

import foodfinder.dto.RestaurantTypeDTO;
import foodfinder.repository.RestaurantTypeRepository;
import foodfinder.services.interfaces.RestaurantTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantTypeServiceImpl implements RestaurantTypeService {

    @Autowired
    RestaurantTypeRepository typeRepository;

    @Override
    public List<RestaurantTypeDTO> fetchTypeList() {

        return typeRepository.findAll();
    }

}
