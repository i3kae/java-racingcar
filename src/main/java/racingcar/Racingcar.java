package racingcar;

public class Racingcar {
    private String name;
    private int moveDistance;

    public Racingcar(String name){
        this.name = name;
        this.moveDistance = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
    }
    public int getMoveDistance() {
        return moveDistance;
    }
    public String getName() {
        return name;
    }
}
