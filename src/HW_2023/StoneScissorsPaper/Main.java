package HW_2023.StoneScissorsPaper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
    List<Person> gamers = new ArrayList<>();
        gamers.add("Алексей ", Action.STONE, 0, exchanger);

    }

}
