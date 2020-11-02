package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Item;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {
    @Test
    public void trackerSingleOne() {
        TrackerSingleOne trackerSingleOne = TrackerSingleOne.INSTANCE;
        TrackerSingleOne trackerSingleOne1 = TrackerSingleOne.INSTANCE;
        assertThat(trackerSingleOne,is(trackerSingleOne1));
    }

    @Test
    public void trackerSingleTwo() {
        TrackerSingleTwo trackerSingleTwo = TrackerSingleTwo.getInstance();
        TrackerSingleTwo trackerSingleTwo1 = TrackerSingleTwo.getInstance();
        assertThat(trackerSingleTwo, is(trackerSingleTwo1));
    }

    @Test
    public void trackerSingleThree() {
        TrackerSingleThree trackerSingleThree = TrackerSingleThree.getInstance();
        TrackerSingleThree trackerSingleThree1 = TrackerSingleThree.getInstance();
        assertThat(trackerSingleThree, is(trackerSingleThree1));
    }

    @Test
    public void trackerSingleFour() {
        TrackerSingleFour trackerSingleFour = TrackerSingleFour.getInstance();
        TrackerSingleFour trackerSingleFour1 = TrackerSingleFour.getInstance();
        assertThat(trackerSingleFour, is(trackerSingleFour1));
    }
}