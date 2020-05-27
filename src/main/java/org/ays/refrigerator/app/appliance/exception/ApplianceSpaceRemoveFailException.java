package org.ays.refrigerator.app.appliance.exception;

public class ApplianceSpaceRemoveFailException extends Exception {
    public ApplianceSpaceRemoveFailException() {
        super("해당하는 ID의 냉장고를 찾을 수 없습니다.");
    }
}