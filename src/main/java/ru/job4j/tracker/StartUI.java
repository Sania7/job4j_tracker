package ru.job4j.tracker;



import java.util.Scanner;

// консольное приложение для работы с классом ru,job4j.tracker.Tracker.
//2.3. Реализация класса StartUI. Добавление заявки [#500744]
public class StartUI {

    // Метод init() - инициализирует приложение и запускает выполнение
    // различных пользовательских действий;
            public void init(Scanner scanner, Tracker tracker) {
                boolean run = true;
                while (run) {
                    showMenu();
                    System.out.println("Select: ");
                    int select = Integer.parseInt(scanner.nextLine());
                    if (select == 0) {
                        System.out.println("User selected: " + select);
                        System.out.println("=== Create a new Item ===");
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        Item item = new Item(name);
                        tracker.add(item);
                        System.out.println("Added application: " + item);
                    } else if (select == 6) {
                        System.out.println("User selected: " + select + ".");
                        System.out.println("The program is closed!");
                        run = false;
                    }
                }
            }

    // Метод showMenu() - выводит на экран меню доступных пользовательских действий;
            private void showMenu() {
                String[] menu = {"Add new Item.", "Show all items.",
                "Edit item.", "Delete item.", "Find item by id.", "Find items by name.",
                "Exit Program."};
                System.out.println("Menu:");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println(i + ". " + menu[i]);
                }
            }

    // main() просто запускает наше приложение
    // при этом в методе main() создается объект Scanner который позволяет получить
    //данные от пользователя, Tracker будет служить хранилищем заявок.
    // В следующей строке.
    //new StartUI().init(scanner, tracker)
    //мы создаем объект класса StartUI и сразу на этом объекте вызываем метод init().
    // Поскольку дальше этот объект мы не будем переиспользовать,
    // то мы не записываем созданный объект в переменную.

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Tracker tracker = new Tracker();
                new StartUI().init(scanner, tracker);
            }
}
