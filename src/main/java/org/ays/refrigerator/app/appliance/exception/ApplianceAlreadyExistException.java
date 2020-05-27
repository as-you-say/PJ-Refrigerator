package org.ays.refrigerator.app.appliance.exception;

public class ApplianceAlreadyExistException extends Exception {
    public ApplianceAlreadyExistException() {
        super("해당하는 ID의 냉장고를 찾을 수 없습니다.");
    }
}