package ru.job4j.tracker;


public class StartUI {

    private final Output out;
    public StartUI(Output out) {
        this.out = out;
    }
            public void init(Input input, Tracker tracker, UserAction[] actions) {
                boolean run = true;
                while (run) {
                    this.showMenu(actions);
                    int select = Integer.valueOf(input.askStr("Select: "));
                    UserAction action = actions[select];
                    run = action.execute(input, tracker);

                }
            }
            private void showMenu(UserAction[] actions) {
                out.println("Menu.");
                for (int index = 0; index < actions.length; index++) {
                    out.println(index + ". " + actions[index].name());
                }
            }
            public static void main(String[] args) {
                Output output = new ConsoleOutput();
                Input input = new ConsoleInput();
                Tracker tracker = new Tracker();
                UserAction[] actions = {
                        new CreateAction(output),
                        new DeleteAction(output),
                        new FindAction(output),
                        new FindIdAction(output),
                        new FindNameAction(output),
                        new ReplaceAction(output),
                        new Exit(output)
                };
                new StartUI(output).init(input, tracker,actions);
            }
}
