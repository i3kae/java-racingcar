package racingcar;

import java.util.ArrayList;

public class StringUtils {
    public ArrayList<String> commaSplit(String originalStr){
        ArrayList<String> names = new ArrayList<>();

        if (commaCheck(originalStr) != 3){
            return null;
        }
        for (int i = 0; i < 3; i++){
            names.add(originalStr.substring(originalStr.lastIndexOf(",")+1));
        }

        return names;
    }

    public int commaCheck(String str){
        int commaNum = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ',')
                commaNum++;
        }
        return commaNum;
    }

    /*
    public int strIntegrityCheck(String str) {

    }
    */
}
