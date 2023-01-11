package HW_2023.StoneScissorsPaper;

import java.util.concurrent.Exchanger;

public class Person extends Thread {
    private String name;
    private Action action;
    private Exchanger<Action> exchanger;
    double count = 0;

    public Person(String name, Action action, double count, Exchanger<Action> exchanger) {
        this.name = name;
        this.action = action;
        this.count = count;
        this.exchanger = exchanger;
        this.start();
    }

    public Action getRandomAction() {
        int random = (int) (Math.random() * Action.values().length);
        return Action.values()[random];
    }

    public double whoWins(Action[] myAction, Action[] otherAction) {
        double count = 0;
        myAction = Action.values();
        otherAction = Action.values();
        if (myAction == otherAction)
            count = count + 0.5;
        if (myAction == new Action[]{Action.STONE} && otherAction == new Action[]{Action.SCISSORS}
                || myAction == new Action[]{Action.SCISSORS} && otherAction == new Action[]{Action.PAPER}
                || myAction == new Action[]{Action.PAPER} && otherAction == new Action[]{Action.STONE})
            count = count + 1;
        return count;
    }

}