package org.ays.refrigerator.app.appliance.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ays.refrigerator.app.appliance.model.Appliance;

import java.util.List;

@Mapper
public interface ApplianceMapper {
    public List<Appliance> getAppliances();
    public Appliance getAppliance(String id);
    public int addAppliance(Appliance appliance);
    public int modifyAppliance(Appliance appliance);
    public int removeAppliance(Appliance appliance);
}
