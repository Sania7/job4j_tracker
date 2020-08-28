package ru.job4j.tracker;

import org.junit.Test;

import java.io.OutputStream;
import java.util.TreeMap;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
     Output out = new StubOutput();
     Tracker tracker = new Tracker();
     Input in = new StubInput(new String[]{"0", "Item name", "1"});
     UserAction[] actions = {new CreateAction(out), new Exit(out)};
     new StartUI(out).init(in, tracker, actions);
     assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), replacedName, "1"});
        UserAction[] actions = {new ReplaceAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }
    @Test
    public void whenFind() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Show all items"));
        Input in = new StubInput(new String[]{"0", "1"});
        UserAction[] actions = {new FindAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker,actions);
        assertThat(out.toString(), is("0. Name: "+ item.getName() + " id: " + item.getId() + System.lineSeparator()));
    }
    @Test
    public void whenFindId() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New Item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new FindIdAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(item.getId() + System.lineSeparator()));
    }
    @Test
    public void whenFindName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Found by name item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new FindNameAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Name: "+ item.getName() + " id: " + item.getId() + System.lineSeparator()));
    }
    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new DeleteAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
                                                            + "=== Exit ===" + System.lineSeparator()));
    }
}