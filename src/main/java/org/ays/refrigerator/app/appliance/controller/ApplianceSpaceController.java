package org.ays.refrigerator.app.appliance.controller;

import org.ays.refrigerator.app.appliance.model.Appliance;
import org.ays.refrigerator.app.appliance.model.ApplianceSpace;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplianceSpaceController {

    /* GET */
    @GetMapping(value = "/appliance/spaces")
    public Object getApplianceSpaces(){
        return null;
    }
    @GetMapping(value = "/appliance/space/{id}")
    public Object getApplianceSpace(@PathVariable String id){
        return null;
    }

    /* POST */
    @PostMapping(value = "/appliance/space")
    public Object postApplianceSpace(@RequestBody ApplianceSpace applianceSpace){
        return null;
    }
    @PostMapping(value = "/appliance/spaces")
    public Object postApplianceSpaces(@RequestBody List<ApplianceSpace> applianceSpaces){
        return null;
    }

    /* PUT */
    @PutMapping(value = "/appliance/space")
    public Object putApplianceSpace(@RequestBody ApplianceSpace applianceSpace){
        return null;
    }
    @PutMapping(value = "/appliance/spaces")
    public Object putApplianceSpaces(@RequestBody List<ApplianceSpace> applianceSpaces){
        return null;
    }

    /* DELETE */
    @DeleteMapping(value = "/appliance/space")
    public Object deleteApplianceSpace(@RequestBody ApplianceSpace applianceSpace){
        return null;
    }
    @DeleteMapping(value = "/appliance/spaces")
    public Object deleteApplianceSpaces(@RequestBody List<ApplianceSpace> applianceSpaces){
        return null;
    }

}
