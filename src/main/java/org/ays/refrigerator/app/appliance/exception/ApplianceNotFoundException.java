package org.ays.refrigerator.app.appliance.exception;

public class ApplianceNotFoundException extends Exception {
    public ApplianceNotFoundException() {
        super("해당하는 ID의 냉장고를 찾을 수 없습니다.");
    }
}