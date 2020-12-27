package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleThree {
    public static final TrackerSingleThree INSTANCE = new TrackerSingleThree();
    private Tracker tracker;

    private TrackerSingleThree() {
        tracker = new Tracker();
    }

    public Tracker getTracker() {
        return tracker;
    }

    public static TrackerSingleThree getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        TrackerSingleThree tracker = TrackerSingleThree.getInstance();
    }
}
