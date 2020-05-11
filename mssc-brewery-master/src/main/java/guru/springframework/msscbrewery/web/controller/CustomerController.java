package guru.springframework.msscbrewery.web.controller;

import guru.springframework.msscbrewery.services.BeerService;
import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.UserDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/user")
@RestController
public class CustomerController {

    private final BeerService beerService;

    public CustomerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{userId}"})
    public ResponseEntity<UserDto> getUser(@PathVariable("userId")  UUID userId){
    	return new ResponseEntity<>(beerService.getUserById(userId),HttpStatus.OK);
    }

}
