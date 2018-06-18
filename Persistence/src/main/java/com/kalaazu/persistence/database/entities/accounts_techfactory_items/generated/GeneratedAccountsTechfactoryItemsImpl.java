package com.kalaazu.persistence.database.entities.accounts_techfactory_items.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsTechfactoryItems;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.TechfactoryItems;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * AccountsTechfactoryItems}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsTechfactoryItemsImpl implements AccountsTechfactoryItems {

    private int id;

    private int accountsId;

    private byte techfactoryItemsId;

    private short amount;

    private Timestamp date;

    protected GeneratedAccountsTechfactoryItemsImpl() {

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
    public byte getTechfactoryItemsId() {
        return techfactoryItemsId;
    }

    @Override
    public short getAmount() {
        return amount;
    }

    @Override
    public Optional<Timestamp> getDate() {
        return Optional.ofNullable(date);
    }

    @Override
    public AccountsTechfactoryItems setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsTechfactoryItems setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsTechfactoryItems setTechfactoryItemsId(byte techfactoryItemsId) {
        this.techfactoryItemsId = techfactoryItemsId;
        return this;
    }

    @Override
    public AccountsTechfactoryItems setAmount(short amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public AccountsTechfactoryItems setDate(Timestamp date) {
        this.date = date;
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
    public TechfactoryItems findTechfactoryItemsId(Manager<TechfactoryItems> foreignManager) {
        return foreignManager.stream()
                             .filter(TechfactoryItems.ID.equal(getTechfactoryItemsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("techfactoryItemsId = " + Objects.toString(getTechfactoryItemsId()));
        sj.add("amount = " + Objects.toString(getAmount()));
        sj.add("date = " + Objects.toString(OptionalUtil.unwrap(getDate())));
        return "AccountsTechfactoryItemsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsTechfactoryItems)) {
            return false;
        }
        final AccountsTechfactoryItems thatAccountsTechfactoryItems = (AccountsTechfactoryItems) that;
        if (this.getId() != thatAccountsTechfactoryItems.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsTechfactoryItems.getAccountsId()) {
            return false;
        }
        if (this.getTechfactoryItemsId() != thatAccountsTechfactoryItems.getTechfactoryItemsId()) {
            return false;
        }
        if (this.getAmount() != thatAccountsTechfactoryItems.getAmount()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatAccountsTechfactoryItems.getDate())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Byte.hashCode(getTechfactoryItemsId());
        hash = 31 * hash + Short.hashCode(getAmount());
        hash = 31 * hash + Objects.hashCode(getDate());
        return hash;
    }
}