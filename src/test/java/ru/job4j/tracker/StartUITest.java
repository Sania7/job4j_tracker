package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
     Output out = new StubOutput();
     Input in = new StubInput(new String[]{"0", "Item name", "1"});
     Tracker tracker = new Tracker();
     List<UserAction> actions = new ArrayList<>();
     actions.add(new CreateAction(out));
     actions.add(new Exit(out));
//     new StartUI(out).init(in, tracker, actions);
//     assertThat(tracker.findAll().get(0).getName(), is("Item name"));
    }

//    @Test
//    public void whenReplaceItem() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item("Created item"));
//        String replacedName = "New item name";
//        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()),
//                replacedName, "1"});
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new ReplaceAction(out));
//        actions.add(new Exit(out));
////        new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
//    }

//    @Test
//    public void whenFind() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item(""));
//        Input in = new StubInput(new String[]{"0", "1"});
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new FindAction(out));
//        actions.add(new Exit(out));
////        new StartUI(out).init(in, tracker, actions);
//        String ls = System.lineSeparator();
//        String menu = "Menu."
//                + ls
//                + "0. Show"
//                + ls
//                + "1. Exit"
//                + ls;
//        assertThat(out.toString(), is(item.getName()
//                + menu
//                + "Show all items"
//                + ls
//                + item.getName()
//                + "Item {"
//                + " id = "
//                + item.getId()
//                + ", name = "
//                + " }"
//                + ls
//                + menu
//                + "=== Exit ==="
//                + ls));
//    }

//    @Test
//    public void whenFindId() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item(""));
//        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new FindIdAction(out));
//        actions.add(new Exit(out));
////        new StartUI(out).init(in, tracker, actions);
//        String ls = System.lineSeparator();
//        String menu = "Menu."
//                + ls
//                + "0. Find"
//                + ls
//                + "1. Exit"
//                + ls;
//        assertThat(out.toString(), is(item.getName()
//                + menu
//                + "=== Find item by id ==="
//                + ls  + item.getName()
//                + ","
//                + item.getId()
//                + ls
//                + menu
//                + "=== Exit ==="
//                + ls));
//    }

//    @Test
//    public void whenFindName() {
//        Output out = new StubOutput();
//        Tracker tracker = new Tracker();
//        Item item = tracker.add(new Item(""));
//        Input in = new StubInput(new String[]{"0", String.valueOf(item.getName()), "1"});
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new FindNameAction(out));
//        actions.add(new Exit(out));
// //       new StartUI(out).init(in, tracker, actions);
//        String ls = System.lineSeparator();
//        String menu = "Menu."
//                + ls
//                + "0. Find"
//                + ls
//                + "1. Exit"
//                + ls;
//        assertThat(out.toString(), is(item.getName()
//                + menu
//                + "=== Find items by name ==="
//                + ls
//                + item
//                + ls
//                + menu
//                + "=== Exit ==="
//                + ls));
//    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        List<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(out));
        actions.add(new Exit(out));
 //       new StartUI(out).init(in, tracker, actions);
//        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

//    @Test
//    public void whenExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[] {"0"});
//        Tracker tracker = new Tracker();
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new Exit(out));
// //       new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is("Menu."
//                + System.lineSeparator()
//                + "0. Exit"
//                + System.lineSeparator()
//                + "=== Exit ==="
//                + System.lineSeparator()));
//    }

//    @Test
//    public void whenInvalidExit() {
//        Output out = new StubOutput();
//        Input in = new StubInput(new String[] {"1", "0"});
//        Tracker tracker = new Tracker();
//        List<UserAction> actions = new ArrayList<>();
//        actions.add(new Exit(out));
// //       new StartUI(out).init(in, tracker, actions);
//        assertThat(out.toString(), is(String.format("Menu.%n"
//                + "0. Exit%n"
//                + "Wrong input, you can select: 0 .. 0%n"
//                + "Menu.%n"
//                + "0. Exit%n"
//                + "=== Exit ===%n")));
//    }
}