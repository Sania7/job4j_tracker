package ru.job4j.tracker;

import java.util.Arrays;


        public class StartUI {
            public static void createItem(Input input, Tracker tracker) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            }
            public void init(Input input, Tracker tracker) {
                boolean run = true;
                while (run) {
                    this.showMenu();
                    int select = Integer.valueOf(input.askStr("Select: "));
                    if (select == 0) {
                        StartUI.createItem(input, tracker);
                    }
                    else if (select == 1) {
                        StartUI.createItem(input, tracker);
                        System.out.println("== Show all items ==");
                        Item[] n = tracker.findAll();
                        if (n.length == 0) {
                            System.out.println("Error, we can't find result!");
                        } else {
                            for (int i = 0; i < n.length; i++) {
                                System.out.println("Found: " + n[i]);
                            }
                        }
                    }

                    else if (select == 2) {
                        StartUI.createItem(input, tracker);
                        System.out.println("== Edit item ==");
                        int id = input.askInt("Enter id: ");
                        String name = input.askStr("Enter name: ");
                        Item newItem = new Item(name);
                        if (tracker.replace(id, newItem)) {
                            System.out.println("Operation completed successfully");
                        } else {
                            System.out.println("An error has occurred. Try again");
                        }
                    }

                    else if (select == 3) {
                        StartUI.createItem(input, tracker);
                        System.out.println("== Delete item ==");
                        int id = input.askInt("Enter id: ");
                        if (tracker.delete(id)) {
                            System.out.println("Operation completed successfully");
                        } else {
                            System.out.println("An error has occurred. Try again");
                        }
                    }

                    else if (select == 4) {
                        StartUI.createItem(input, tracker);
                        System.out.println("== Find item by id ==");
                        int id = input.askInt("Enter id: ");
                        Item item = tracker.findById(id);
                        if (item != null) {
                            System.out.println(item.getName() + ", " + item.getId());
                        } else {
                            System.out.println("An error has occurred. Try again");
                        }
                    }

                    else if (select == 5) {
                        StartUI.createItem(input, tracker);
                        System.out.println("== Find items by name ==");
                        String name = input.askStr("Enter name: ");
                        for (Item item : tracker.findByName(name)) {
                            System.out.println("Name " + item.getName() + " id" + item.getId());
                        }
                    }

                    else if (select == 6) {
                        System.out.println("== Exit Program ==");
                        run = false;
                    }
                }
            }
            private void showMenu() {
                System.out.println("Menu.");
                System.out.println("0. Add new Item.");
                System.out.println("1. Show all items.");
                System.out.println("2. Edit item.");
                System.out.println("3. Delete item.");
                System.out.println("4. Find item by Id.");
                System.out.println("5. Find items by name.");
                System.out.println("6. Exit Program.");
            }

            public static void main(String[] args) {
                Input input = new ConsoleInput();
                Tracker tracker = new Tracker();
                new StartUI().init(input, tracker);
            }
}
