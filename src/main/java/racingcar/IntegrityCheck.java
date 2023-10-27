package racingcar;

import java.util.ArrayList;

public class IntegrityCheck {
    public boolean nameIntegrityCheck(String name){
        // 길이에 따른 제약 사항 검사
        if (name.length() > 5 || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        // 제어 문자 포함 여부 검사
        for (int i = 0; i < name.length(); i++){
            if ((name.charAt(i) <= 8) && (14 <= name.charAt(i) && name.charAt(i) <= 31)){
                throw new IllegalArgumentException();
            }
        }

        return true;
    }

    public void tryIntegrityCheck(int tryNum){

    }
}
