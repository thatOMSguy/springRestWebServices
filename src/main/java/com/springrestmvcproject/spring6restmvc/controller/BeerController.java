package com.springrestmvcproject.spring6restmvc.controller;


import com.springrestmvcproject.spring6restmvc.model.Beer;
import com.springrestmvcproject.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {


    private final BeerService beerService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> listBeers(){

        return beerService.listBeers();

    }

    @RequestMapping(value = "{beerId}", method = RequestMethod.GET)
    public Beer getBearById(@PathVariable("beerId") UUID beerId) {

        log.debug("Get Beer By Id : Inside Controller");
        return beerService.getBeerById(beerId);


    }


}
