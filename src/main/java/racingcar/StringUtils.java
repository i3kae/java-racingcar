package racingcar;

import java.util.ArrayList;

public class StringUtils {
    public String[] commaSplit(String originalStr){
        String[] names;

        if (commaCheck(originalStr) != 2){
            throw new IllegalArgumentException();
        }

        names = originalStr.split(",");
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
}
