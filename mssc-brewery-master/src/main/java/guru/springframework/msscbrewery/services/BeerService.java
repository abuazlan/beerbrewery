package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.UserDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    UserDto getUserById(UUID userId);
    BeerDto saveBeer(BeerDto beerDto);
	void updateBeer(UUID id, BeerDto beerDto);
}
