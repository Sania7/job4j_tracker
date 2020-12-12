package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>(); // все пользователи со счетами

    // добавляем пользователя в систему Map.put, с начала пустой new ArrayList<Account>(); проверить наличие пользователя
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
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rslAccount = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (accounts != null) {
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        rslAccount = account;
                        break;
                    }
                }
            }
        }
        return rslAccount;
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
