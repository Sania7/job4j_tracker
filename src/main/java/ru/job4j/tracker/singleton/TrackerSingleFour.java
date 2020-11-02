package ru.job4j.tracker.singleton;


import ru.job4j.tracker.Tracker;

    public class TrackerSingleFour {
        private Tracker tracker;
        private TrackerSingleFour() {
            tracker = new Tracker();
        }
        public static TrackerSingleFour getInstance() {
            return Holder.INSTANCE;
        }

        public Tracker getTracker() {
            return tracker;
        }
        private static final class Holder {
            private static final TrackerSingleFour INSTANCE = new TrackerSingleFour();
        }

        public static void main(String[] args) {
            TrackerSingleFour tracker = TrackerSingleFour.getInstance();
        }
    }

