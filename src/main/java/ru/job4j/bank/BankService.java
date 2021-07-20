package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>(); // все пользователи со счетами

    // добавляем пользователя в систему Map.put, с начала пустой new ArrayList<Account>();
    // проверить наличие пользователя
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    //новый счет, пользователя найти по паспорту use findByPassport, проверить наличие счета
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccount = users.get(user);
                if (!userAccount.contains(account)) {
                    userAccount.add(account);
                }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()// запускаем стрим
                .filter(s -> s.getPassport().equals(passport)) // применяем фильтр
                .findFirst() // Метод findFirst() возвращает первый элемент по порядку из Stream,
                // в виде обертки Optional
                .orElse(null); // метод делает проверку объекта на null
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
