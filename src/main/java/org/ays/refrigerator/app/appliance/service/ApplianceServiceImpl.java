package org.ays.refrigerator.app.appliance.service;

import org.ays.refrigerator.app.appliance.exception.*;
import org.ays.refrigerator.app.appliance.mapper.ApplianceMapper;
import org.ays.refrigerator.app.appliance.model.Appliance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplianceServiceImpl implements ApplianceService {

    @Resource(name = "applianceMapper")
    ApplianceMapper applianceMapper;

    @Transactional
    @Override
    public List<Appliance> getAppliances() {
        // 전체 데이터목록 조회
        List<Appliance> appliances = applianceMapper.getAppliances();
        return appliances;
    }

    @Transactional
    @Override
    public Appliance getAppliance(String id) throws ApplianceNotFoundException {
        // 해당하는 아이디의 데이터 조회
        Appliance appliance = applianceMapper.getAppliance(id);

        // 해당하는 아이디의 데이터가 있는가?
        if(appliance == null){
            throw new ApplianceNotFoundException();
        }
        return appliance;
    }

    @Transactional
    @Override
    public int addAppliance(Appliance appliance) throws ApplianceAddFailException, ApplianceAlreadyExistException {
        // 추가된 데이터 개수
        int addRows = 0;

        // 같은 아이디를 가지는 데이터가 이미 있는가?
        boolean isExist = applianceMapper.getAppliance(appliance.getId()) != null;
        if (isExist) {
            throw new ApplianceAlreadyExistException();
        }

        // 추가
        applianceMapper.addAppliance(appliance);

        // 추가 되었는가?
        Appliance addAppliance = applianceMapper.getAppliance(appliance.getId());
        if (addAppliance == null) {
            throw new ApplianceAddFailException();
        }

        // 추가된 데이터 개수 증가
        addRows++;
        return addRows;
    }

    @Transactional
    @Override
    public int addAppliances(List<Appliance> appliances) throws ApplianceAddFailException, ApplianceAlreadyExistException {
        // 추가된 데이터 개수
        int addRows = 0;

        for (Appliance appliance : appliances) {
            // 같은 아이디를 가지는 데이터가 이미 있는가?
            boolean isExist = applianceMapper.getAppliance(appliance.getId()) != null;
            if (isExist) {
                throw new ApplianceAlreadyExistException();
            }

            // 추가
            applianceMapper.addAppliance(appliance);

            // 추가 되었는가?
            Appliance addAppliance = applianceMapper.getAppliance(appliance.getId());
            if (addAppliance == null) {
                throw new ApplianceAddFailException();
            }

            // 추가된 데이터 개수 증가
            addRows++;
        }

        return addRows;
    }

    @Transactional
    @Override
    public int modifyAppliance(Appliance appliance) throws ApplianceNotFoundException, ApplianceModifyFailException {
        // 수정된 데이터 개수
        int modifyRows = 0;

        // 수정할 데이터가 있는가?
        boolean isNotExist = applianceMapper.getAppliance(appliance.getId()) == null;
        if (isNotExist) {
            throw new ApplianceNotFoundException();
        }

        // 수정
        applianceMapper.modifyAppliance(appliance);
        Appliance modifyAppliance = applianceMapper.getAppliance(appliance.getId());

        // 수정이 되었는가?
        boolean isNotModified = !appliance.equals(modifyAppliance);
        if (isNotModified) {
            throw new ApplianceModifyFailException();
        }

        // 수정된 데이터 개수 증가
        modifyRows++;
        return modifyRows;
    }

    @Override
    public int modifyAppliances(List<Appliance> appliances) throws ApplianceNotFoundException, ApplianceModifyFailException {
        // 수정된 데이터 개수
        int modifyRows = 0;

        for (Appliance appliance : appliances) {
            // 수정할 데이터가 있는가?
            boolean isNotExist = applianceMapper.getAppliance(appliance.getId()) == null;
            if (isNotExist) {
                throw new ApplianceNotFoundException();
            }

            // 수정
            applianceMapper.modifyAppliance(appliance);
            Appliance modifyAppliance = applianceMapper.getAppliance(appliance.getId());

            // 수정이 되었는가?
            boolean isNotModified = !appliance.equals(modifyAppliance);
            if (isNotModified) {
                throw new ApplianceModifyFailException();
            }

            // 수정된 데이터 개수 증가
            modifyRows++;
        }

        return modifyRows;
    }

    @Override
    public int removeAppliance(Appliance appliance) throws ApplianceNotFoundException, ApplianceRemoveFailException {
        // 삭제된 데이터 개수
        int removeRows = 0;

        // 삭제할 데이터가 있는가?
        boolean isNotExist = applianceMapper.getAppliance(appliance.getId()) == null;
        if (isNotExist) {
            throw new ApplianceNotFoundException();
        }

        // 삭제
        applianceMapper.removeAppliance(appliance);
        Appliance removeAppliance = applianceMapper.getAppliance(appliance.getId());

        // 삭제 되었는가?
        boolean isNotRemoved = removeAppliance != null;
        if (isNotRemoved) {
            throw new ApplianceRemoveFailException();
        }

        // 삭제된 데이터 개수 증가
        removeRows++;
        return removeRows;
    }

    @Override
    public int removeAppliances(List<Appliance> appliances) throws ApplianceNotFoundException, ApplianceRemoveFailException {
        // 삭제된 데이터 개수
        int removeRows = 0;

        for (Appliance appliance : appliances) {
            // 삭제할 데이터가 있는가?
            boolean isNotExist = applianceMapper.getAppliance(appliance.getId()) == null;
            if (isNotExist) {
                throw new ApplianceNotFoundException();
            }

            // 삭제
            applianceMapper.removeAppliance(appliance);
            Appliance removeAppliance = applianceMapper.getAppliance(appliance.getId());

            // 삭제 되었는가?
            boolean isNotRemoved = removeAppliance != null;
            if (isNotRemoved) {
                throw new ApplianceRemoveFailException();
            }

            // 삭제된 데이터 개수 증가
            removeRows++;
        }

        return removeRows;
    }

}
