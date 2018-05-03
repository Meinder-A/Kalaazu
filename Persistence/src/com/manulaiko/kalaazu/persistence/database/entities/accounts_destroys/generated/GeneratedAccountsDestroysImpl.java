package com.manulaiko.kalaazu.persistence.database.entities.accounts_destroys.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_destroys.AccountsDestroys;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_destroys.AccountsDestroys}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsDestroysImpl implements AccountsDestroys {

    private int   id;

    private int   accountsId;

    private byte  shipsId;

    private short points;

    private short amount;

    protected GeneratedAccountsDestroysImpl() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getAccountsId() {
        return accountsId;
    }

    @Override
    public byte getShipsId() {
        return shipsId;
    }

    @Override
    public short getPoints() {
        return points;
    }

    @Override
    public short getAmount() {
        return amount;
    }

    @Override
    public AccountsDestroys setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsDestroys setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsDestroys setShipsId(byte shipsId) {
        this.shipsId = shipsId;
        return this;
    }

    @Override
    public AccountsDestroys setPoints(short points) {
        this.points = points;
        return this;
    }

    @Override
    public AccountsDestroys setAmount(short amount) {
        this.amount = amount;
        return this;
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
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("shipsId = " + Objects.toString(getShipsId()));
        sj.add("points = " + Objects.toString(getPoints()));
        sj.add("amount = " + Objects.toString(getAmount()));
        return "AccountsDestroysImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsDestroys)) {
            return false;
        }
        final AccountsDestroys thatAccountsDestroys = (AccountsDestroys) that;
        if (this.getId() != thatAccountsDestroys.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsDestroys.getAccountsId()) {
            return false;
        }
        if (this.getShipsId() != thatAccountsDestroys.getShipsId()) {
            return false;
        }
        if (this.getPoints() != thatAccountsDestroys.getPoints()) {
            return false;
        }
        if (this.getAmount() != thatAccountsDestroys.getAmount()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Byte.hashCode(getShipsId());
        hash = 31 * hash + Short.hashCode(getPoints());
        hash = 31 * hash + Short.hashCode(getAmount());
        return hash;
    }
}