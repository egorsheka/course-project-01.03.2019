package by.sheka.app.javaFX.dao.accountDAO;

import by.sheka.app.javaFX.dao.DAO;
import by.sheka.app.javaFX.entity.account.Account;

import java.util.Optional;

public interface AccountDAO extends DAO<Account> {
    Optional<Account> getAccount(Account account);
    boolean isExist(Account account);
}

