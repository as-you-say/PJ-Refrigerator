package org.ays.refrigerator.app.appliance.service;

import org.ays.refrigerator.app.appliance.model.Appliance;
import org.ays.refrigerator.app.appliance.model.ApplianceSpace;

import java.util.List;

public interface ApplianceSpaceService {

    public List<ApplianceSpace> getApplianceSpaces() throws Exception;
    public ApplianceSpace getApplianceSpace(String id) throws Exception;

    public int addApplianceSpace(ApplianceSpace applianceSpace) throws Exception;
    public int addApplianceSpaces(List<ApplianceSpace> applianceSpaces) throws Exception;

    public int modifyApplianceSpace(ApplianceSpace applianceSpace) throws Exception;
    public int modifyApplianceSpaces(List<ApplianceSpace> applianceSpaces) throws Exception;

    public int removeApplianceSpace(ApplianceSpace applianceSpace) throws Exception;
    public int removeApplianceSpaces(List<ApplianceSpace> applianceSpaces) throws Exception;

}
