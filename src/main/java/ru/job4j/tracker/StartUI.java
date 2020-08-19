package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

        public class StartUI {
            public void init(Scanner scanner, Tracker tracker) {
                boolean run = true;
                while (run) {
                    this.showMenu();
                    System.out.println("Select: ");
                    int select = Integer.valueOf(scanner.nextLine());
                    if (select == 0) {
                        System.out.println("=== Create a new Item ====");
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        Item item = new Item(name);
                        tracker.add(item);
                    }
                    else if (select == 1) {
                        System.out.println("== Show all items ==");
                        System.out.println("Enter name: ");
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
                        System.out.println("== Edit item ==");
                        System.out.println("Enter name: ");
                    }

                    else if (select == 3) {
                        System.out.println("== Delete item ==");
                    }

                    else if (select == 4) {
                        System.out.println("== Find item by id ==");
                    }

                    else if (select == 5) {
                        System.out.println("== Find items by name ==");
                        System.out.println("Enter name: ");
                        String name = scanner.nextLine();
                        Item[] n = tracker.findByName(name);
                        if (n.length == 0) {
                            System.out.println("Error, we can't find result!");
                        } else {
                            for (int i = 0; i < n.length; i++) {
                                System.out.println();
                            }
                        }
                    }

                    else if (select == 6) {
                        System.out.println("== Exit Program ==");
                        run = false;
                    }
                }
            }
            private void showMenu() {
                System.out.println();
                /*добавить нужные пункты*/
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Tracker tracker = new Tracker();
                new StartUI().init(scanner, tracker);
            }
}
