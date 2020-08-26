package ru.job4j.tracker;


public class StartUI {
            public static void createItem(Input input, Tracker tracker) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            }
            public static void findItem(Input input, Tracker tracker) {
                System.out.println("=== Show all items ===");
                Item[] n = tracker.findAll();
                if (n.length == 0) {
                    System.out.println("Error, we can't find result!");
                } else {
                    for (int i = 0; i < n.length; i++) {
                        System.out.println("Found: " + n[i]);
                    }
                }
            }
            public static void replaceItem(Input input, Tracker tracker) {
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
            public static void deleteItem(Input input, Tracker tracker) {
                System.out.println("== Delete item ==");
                int id = input.askInt("Enter id: ");
                if (tracker.delete(id)) {
                    System.out.println("Operation completed successfully");
                } else {
                    System.out.println("An error has occurred. Try again");
                }
            }
            public static void findByItem(Input input, Tracker tracker) {
                System.out.println("=== Find item by id ===");
                int id = input.askInt("Enter id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getName() + ", " + item.getId());
                } else {
                    System.out.println("An error has occurred. Try again");
                }
            }
            public static void findByNameItem(Input input, Tracker tracker) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name: ");
                for (Item item : tracker.findByName(name)) {
                    System.out.println("Name " + item.getName() + " id" + item.getId());
                }
            }


            public void init(Input input, Tracker tracker, UserAction[] actions) {
                boolean run = true;
                while (run) {
                    this.showMenu(actions);
                    int select = Integer.valueOf(input.askStr("Select: "));
                    UserAction action = actions[select];
                    run = action.execute(input, tracker);

                    if (select == 0) {
                        StartUI.createItem(input, tracker);
                    }
                    else if (select == 1) {
                        StartUI.findItem(input, tracker);
                    }

                    else if (select == 2) {
                        StartUI.replaceItem(input, tracker);
                    }

                    else if (select == 3) {
                        StartUI.deleteItem(input, tracker);
                    }

                    else if (select == 4) {
                        StartUI.findByItem(input, tracker);
                    }

                    else if (select == 5) {
                        StartUI.findByNameItem(input, tracker);
                    }

                    else if (select == 6) {
                        System.out.println("== Exit Program ==");
                        run = false;
                    }
                }
            }



            private void showMenu(UserAction[] actions) {
                System.out.println("Menu.");
                for (int index = 0; index < actions.length; index++) {
                    System.out.println(index + ". " + actions[index].name());
                }
            }

            public static void main(String[] args) {
                Input input = new ConsoleInput();
                Tracker tracker = new Tracker();
                UserAction[] actions = {new CreateAction()};
                new StartUI().init(input, tracker,actions);
            }
}
