package org.ays.refrigerator.app.appliance.service;

import org.ays.refrigerator.app.appliance.exception.*;
import org.ays.refrigerator.app.appliance.model.Appliance;

import java.util.List;

public interface ApplianceService {

    public List<Appliance> getAppliances() throws Exception;
    public Appliance getAppliance(String id) throws Exception;

    public int addAppliance(Appliance appliance) throws Exception;
    public int addAppliances(List<Appliance> appliances) throws Exception;

    public int modifyAppliance(Appliance appliance) throws Exception;
    public int modifyAppliances(List<Appliance> appliances) throws Exception;

    public int removeAppliance(Appliance appliance) throws Exception;
    public int removeAppliances(List<Appliance> appliances) throws Exception;

}
