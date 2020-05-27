package org.ays.refrigerator.app.appliance.exception;

public class ApplianceSpaceNotFoundException extends Exception {
    public ApplianceSpaceNotFoundException() {
        super("해당하는 ID의 냉장고 공간을 찾을 수 없습니다.");
    }
}