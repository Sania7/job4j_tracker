package ru.job4j.tracker;

public class FindIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by id ===";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName() + ", " + item.getId());
        } else {
            System.out.println("An error has occurred. Try again");
        }
        return true;
    }
}
