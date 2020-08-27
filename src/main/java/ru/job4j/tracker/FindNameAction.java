package ru.job4j.tracker;

public class FindNameAction implements UserAction{
    private final Output out;
    public FindNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        for (Item item : tracker.findByName(name)) {
            out.println("Name " + item.getName() + " id" + item.getId());
        }
        return true;
    }
}
