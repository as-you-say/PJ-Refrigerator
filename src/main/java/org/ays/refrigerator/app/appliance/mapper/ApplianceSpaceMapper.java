package org.ays.refrigerator.app.appliance.mapper;

import org.ays.refrigerator.app.appliance.model.ApplianceSpace;

import java.util.List;

public interface ApplianceSpaceMapper {
    public List<ApplianceSpace> getApplianceSpaces();
    public ApplianceSpace getApplianceSpace(String id);
    public int addApplianceSpace(ApplianceSpace applianceSpace);
    public int modifyApplianceSpace(ApplianceSpace applianceSpace);
    public int removeApplianceSpace(ApplianceSpace applianceSpace);
}
