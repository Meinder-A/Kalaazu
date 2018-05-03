package com.manulaiko.kalaazu.persistence.database.entities.accounts_quests.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_quests.AccountsQuests;
import com.manulaiko.kalaazu.persistence.database.entities.quests.Quests;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_quests.AccountsQuests}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsQuestsImpl implements AccountsQuests {

    private int       id;

    private short     questsId;

    private int       accountsId;

    private boolean   isCompleted;

    private Timestamp date;

    protected GeneratedAccountsQuestsImpl() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public short getQuestsId() {
        return questsId;
    }

    @Override
    public int getAccountsId() {
        return accountsId;
    }

    @Override
    public boolean getIsCompleted() {
        return isCompleted;
    }

    @Override
    public Timestamp getDate() {
        return date;
    }

    @Override
    public AccountsQuests setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsQuests setQuestsId(short questsId) {
        this.questsId = questsId;
        return this;
    }

    @Override
    public AccountsQuests setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsQuests setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }

    @Override
    public AccountsQuests setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    @Override
    public Quests findQuestsId(Manager<Quests> foreignManager) {
        return foreignManager.stream()
                             .filter(Quests.ID.equal(getQuestsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Accounts findAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream()
                             .filter(Accounts.ID.equal(getAccountsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("questsId = " + Objects.toString(getQuestsId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("isCompleted = " + Objects.toString(getIsCompleted()));
        sj.add("date = " + Objects.toString(getDate()));
        return "AccountsQuestsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsQuests)) {
            return false;
        }
        final AccountsQuests thatAccountsQuests = (AccountsQuests) that;
        if (this.getId() != thatAccountsQuests.getId()) {
            return false;
        }
        if (this.getQuestsId() != thatAccountsQuests.getQuestsId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsQuests.getAccountsId()) {
            return false;
        }
        if (this.getIsCompleted() != thatAccountsQuests.getIsCompleted()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatAccountsQuests.getDate())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Short.hashCode(getQuestsId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Boolean.hashCode(getIsCompleted());
        hash = 31 * hash + Objects.hashCode(getDate());
        return hash;
    }
}