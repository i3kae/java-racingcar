package racingcar;

import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Console;
public class RacingCarGame {
    private ArrayList<String> names;
    public void start(){
        String originalStr = "";
        StringUtils strUtils = new StringUtils();

        originalStr = Console.readLine();
        names = strUtils.commaSplit(originalStr);
    }
}
