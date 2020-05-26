package org.ays.refrigerator.app.appliance.controller;

import org.ays.refrigerator.app.appliance.model.Appliance;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplianceController {

    /* GET */
    @GetMapping(value = "/appliances")
    public List<Appliance> getAppliances(){return null;}
    @GetMapping(value = "/appliance/{id}")
    public Appliance getAppliance(@PathVariable String id) {return null;}

    /* POST */
    @PostMapping(value = "/appliance")
    public int postAppliance(@RequestBody Appliance appliance){
        return 0;
    }
    @PostMapping(value = "/appliances")
    public int postAppliances(@RequestBody List<Appliance> appliances){
        return 0;
    }

    /* PUT */
    @PutMapping(value = "/appliance")
    public int putAppliance(@RequestBody Appliance appliance){
        return 0;
    }
    @PutMapping(value = "/appliances")
    public int putAppliances(@RequestBody List<Appliance> appliances){
        return 0;
    }

    /* DELETE */
    @DeleteMapping(value = "/appliance")
    public int deleteAppliance(@RequestBody Appliance appliance){
        return 0;
    }
    @DeleteMapping(value = "/appliances")
    public int deleteAppliances(@RequestBody List<Appliance> appliances){
        return 0;
    }

}
