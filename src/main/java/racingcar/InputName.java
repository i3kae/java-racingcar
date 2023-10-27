package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;

public class InputName {
    public ArrayList<Racingcar> inputName(){
        String[] names;
        ArrayList<Racingcar> cars = new ArrayList<>();
        StringUtils strUtils = new StringUtils();
        IntegrityCheck integrityCheck = new IntegrityCheck();
        String originalStr = "";

        originalStr = Console.readLine();
        names = strUtils.commaSplit(originalStr);

        for (int i = 0; i < 3; i++){
            if (integrityCheck.nameIntegrityCheck(names[i])){
                cars.add(new Racingcar(names[i]));
            }
        }
        return cars;
    }
}
