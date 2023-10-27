package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class InputName {
    public ArrayList<String> inputName(){
        ArrayList<String> names;
        String originalStr = Console.readLine();
        names = commaSplit(originalStr);

        return names;
    }

    public ArrayList<String> commaSplit(String originalStr){
        ArrayList<String> names = new ArrayList<>();

        if (commaCheck(originalStr) != 2){
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
}
