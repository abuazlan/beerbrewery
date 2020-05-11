package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.UserDto;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
public class BeerServiceImpl implements BeerService {
	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("Pale Ale").build();
	}

	@Override
	public UserDto getUserById(UUID userId) {
		return UserDto.builder().userId(UUID.randomUUID()).name("Vipul Bhai").build();
	}

	@Override
	public BeerDto saveBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName(beerDto.getBeerName()).build();

	}

	@Override
	public void updateBeer(UUID id, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}
}
