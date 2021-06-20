package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;

// консольное приложение для работы с классом ru,job4j.tracker.Tracker.
//2.3. Реализация класса StartUI. Добавление заявки [#500744]
public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

            public void init(Input input, Tracker tracker, List<UserAction> actions) {
                boolean run = true;
                while (run) {
                    this.showMenu(actions);
                    int select = input.askInt("Select: ");
                    if (select < 0 || select >= actions.size()) {
                        out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                        continue;
                    }
                    UserAction action = actions.get(select);
                    run = action.execute(input, tracker);
                }
            }

            private void showMenu(List<UserAction> actions) {
                out.println("Menu:");
                for (int i = 0; i < actions.size(); i++) {
                    System.out.println(i + ". " + actions.get(i).name());
                }
            }

            public static void main(String[] args) {
                Output output = new ConsoleOutput();
                Input input = new ValidateInput(output, new ConsoleInput());
                Tracker tracker = new Tracker();
                List<UserAction> actions = new ArrayList<>();
                        actions.add(new CreateAction(output));
                        actions.add(new FindAction(output));
                        actions.add(new ReplaceAction(output));
                        actions.add(new DeleteAction(output));
                        actions.add(new FindIdAction(output));
                        actions.add(new FindNameAction(output));
                        actions.add(new Exit(output));

                new StartUI(output).init(input, tracker, actions);
            }
}
