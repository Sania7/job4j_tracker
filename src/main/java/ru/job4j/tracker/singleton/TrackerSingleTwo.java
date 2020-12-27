package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleTwo {
    private static TrackerSingleTwo instance;
    private Tracker tracker;

    private TrackerSingleTwo() {
        tracker = new Tracker();
    }

    public static TrackerSingleTwo getInstance() {
        if (instance == null) {
            instance = new TrackerSingleTwo();
        }
        return instance;
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        TrackerSingleOne trackerSingleOne = TrackerSingleOne.INSTANCE;
        TrackerSingleTwo trackerSingleTwo = TrackerSingleTwo.getInstance();
    }
}
