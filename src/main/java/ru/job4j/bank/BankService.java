package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>(); // все пользователи со счетами

    // добавляем пользователя в систему Map.put, с начала пустой new ArrayList<Account>();
    // проверить наличие пользователя
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    //новый счет, пользователя найти по паспорту use findByPassport, проверить наличие счета
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
                if (!users.get(user.get()).contains(account)) {
                    users.get(user.get()).add(account);
                }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        return users.keySet()
                .stream()// запускаем стрим
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> userFind = findByPassport(passport);
        if (userFind.isPresent()) {
            return users.get(userFind.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent()
                && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
