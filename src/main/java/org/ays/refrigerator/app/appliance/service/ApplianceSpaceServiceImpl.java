package org.ays.refrigerator.app.appliance.service;

import org.ays.refrigerator.app.appliance.exception.*;
import org.ays.refrigerator.app.appliance.mapper.ApplianceSpaceMapper;
import org.ays.refrigerator.app.appliance.model.Appliance;
import org.ays.refrigerator.app.appliance.model.ApplianceSpace;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplianceSpaceServiceImpl implements ApplianceSpaceService {

    @Resource(name = "applianceSpaceMapper")
    ApplianceSpaceMapper applianceSpaceMapper;

    @Transactional
    @Override
    public List<ApplianceSpace> getApplianceSpaces() {
        // 전체 데이터목록 조회
        List<ApplianceSpace> applianceSpaces = applianceSpaceMapper.getApplianceSpaces();
        return applianceSpaces;
    }

    @Transactional
    @Override
    public ApplianceSpace getApplianceSpace(String id) throws ApplianceSpaceNotFoundException {
        // 해당하는 아이디의 데이터 조회
        ApplianceSpace applianceSpace = applianceSpaceMapper.getApplianceSpace(id);

        // 해당하는 아이디의 데이터가 있는가?
        if(applianceSpace == null){
            throw new ApplianceSpaceNotFoundException();
        }
        return applianceSpace;
    }

    @Transactional
    @Override
    public int addApplianceSpace(ApplianceSpace applianceSpace) throws ApplianceSpaceAddFailException, ApplianceSpaceAlreadyExistException {
        // 추가된 데이터 개수
        int addRows = 0;

        // 같은 아이디를 가지는 데이터가 이미 있는가?
        boolean isExist = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId()) != null;
        if (isExist) {
            throw new ApplianceSpaceAlreadyExistException();
        }

        // 추가
        applianceSpaceMapper.addApplianceSpace(applianceSpace);

        // 추가 되었는가?
        ApplianceSpace addApplianceSpace = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId());
        if (addApplianceSpace == null) {
            throw new ApplianceSpaceAddFailException();
        }

        // 추가된 데이터 개수 증가
        addRows++;
        return addRows;
    }

    @Transactional
    @Override
    public int addApplianceSpaces(List<ApplianceSpace> applianceSpaces) throws ApplianceSpaceAddFailException, ApplianceSpaceAlreadyExistException {
        // 추가된 데이터 개수
        int addRows = 0;

        for (ApplianceSpace applianceSpace : applianceSpaces) {
            // 같은 아이디를 가지는 데이터가 이미 있는가?
            boolean isExist = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId()) != null;
            if (isExist) {
                throw new ApplianceSpaceAlreadyExistException();
            }

            // 추가
            applianceSpaceMapper.addApplianceSpace(applianceSpace);

            // 추가 되었는가?
            ApplianceSpace addApplianceSpace = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId());
            if (addApplianceSpace == null) {
                throw new ApplianceSpaceAddFailException();
            }

            // 추가된 데이터 개수 증가
            addRows++;
        }

        return addRows;
    }

    @Transactional
    @Override
    public int modifyApplianceSpace(ApplianceSpace applianceSpace) throws ApplianceSpaceNotFoundException, ApplianceSpaceModifyFailException {
        // 수정된 데이터 개수
        int modifyRows = 0;

        // 수정할 데이터가 있는가?
        boolean isNotExist = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId()) == null;
        if (isNotExist) {
            throw new ApplianceSpaceNotFoundException();
        }

        // 수정
        applianceSpaceMapper.modifyApplianceSpace(applianceSpace);
        ApplianceSpace modifyApplianceSpace = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId());

        // 수정이 되었는가?
        boolean isNotModified = !applianceSpace.equals(modifyApplianceSpace);
        if (isNotModified) {
            throw new ApplianceSpaceModifyFailException();
        }

        // 수정된 데이터 개수 증가
        modifyRows++;
        return modifyRows;
    }

    @Override
    public int modifyApplianceSpaces(List<ApplianceSpace> applianceSpaces) throws ApplianceSpaceNotFoundException, ApplianceSpaceModifyFailException {
        // 수정된 데이터 개수
        int modifyRows = 0;

        for (ApplianceSpace applianceSpace : applianceSpaces) {
            // 수정할 데이터가 있는가?
            boolean isNotExist = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId()) == null;
            if (isNotExist) {
                throw new ApplianceSpaceNotFoundException();
            }

            // 수정
            applianceSpaceMapper.modifyApplianceSpace(applianceSpace);
            ApplianceSpace modifyApplianceSpace = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId());

            // 수정이 되었는가?
            boolean isNotModified = !applianceSpace.equals(modifyApplianceSpace);
            if (isNotModified) {
                throw new ApplianceSpaceModifyFailException();
            }

            // 수정된 데이터 개수 증가
            modifyRows++;
        }

        return modifyRows;
    }

    @Override
    public int removeApplianceSpace(ApplianceSpace applianceSpace) throws ApplianceSpaceNotFoundException, ApplianceSpaceRemoveFailException {
        // 삭제된 데이터 개수
        int removeRows = 0;

        // 삭제할 데이터가 있는가?
        boolean isNotExist = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId()) == null;
        if (isNotExist) {
            throw new ApplianceSpaceNotFoundException();
        }

        // 삭제
        applianceSpaceMapper.removeApplianceSpace(applianceSpace);
        ApplianceSpace removeApplianceSpace = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId());

        // 삭제 되었는가?
        boolean isNotRemoved = removeApplianceSpace != null;
        if (isNotRemoved) {
            throw new ApplianceSpaceRemoveFailException();
        }

        // 삭제된 데이터 개수 증가
        removeRows++;
        return removeRows;
    }

    @Override
    public int removeApplianceSpaces(List<ApplianceSpace> applianceSpaces) throws ApplianceSpaceNotFoundException, ApplianceSpaceRemoveFailException {
        // 삭제된 데이터 개수
        int removeRows = 0;

        for (ApplianceSpace applianceSpace : applianceSpaces) {
            // 삭제할 데이터가 있는가?
            boolean isNotExist = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId()) == null;
            if (isNotExist) {
                throw new ApplianceSpaceNotFoundException();
            }

            // 삭제
            applianceSpaceMapper.removeApplianceSpace(applianceSpace);
            ApplianceSpace removeApplianceSpace = applianceSpaceMapper.getApplianceSpace(applianceSpace.getId());

            // 삭제 되었는가?
            boolean isNotRemoved = removeApplianceSpace != null;
            if (isNotRemoved) {
                throw new ApplianceSpaceRemoveFailException();
            }

            // 삭제된 데이터 개수 증가
            removeRows++;
        }

        return removeRows;
    }
}
