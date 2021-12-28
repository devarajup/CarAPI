package com.cjss.deva.CarAPI.rest;

import com.cjss.deva.CarAPI.model.DealerDetails;
import com.cjss.deva.CarAPI.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRestController {

    @Autowired
    public CarService service;



    @PostMapping("/add")
    public String addDealer(@RequestBody DealerDetails dealer) {
        System.out.println(dealer.getAddress()
        +" "+dealer.getPhoneNo());
      service.add(dealer);
        return dealer.getName() + " added";
    }
    @GetMapping("/getone/{name}")
    public DealerDetails getOneDealer(@PathVariable  String name) {
        return service.getOneDealer(name);
    }

    @GetMapping("/getall")
    public List<DealerDetails> getAllDealers() {
        return service.getAllDealers();
    }
    @DeleteMapping("/removeone/{name}")
    public String removeOneDealer(@PathVariable  String name) {
        return service.removeOneDealer(name);
    }

    @DeleteMapping("/removeall")
    public String removeAllDealers() {
        return service.removeAllDealers();
    }

    @PatchMapping("/upadate/{name}")
    public String updateDealer(String name, DealerDetails details) {

        return service.updateDealerDeatails(name, details);
    }


}
