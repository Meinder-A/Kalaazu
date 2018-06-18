package com.kalaazu.persistence.database.entities.accounts_configurations.generated;

import com.kalaazu.persistence.database.entities.AccountsConfigurations;
import com.kalaazu.persistence.database.entities.AccountsHangars;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * AccountsConfigurations}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsConfigurationsImpl implements AccountsConfigurations {

    private int id;

    private int accountsHangarsId;

    private byte configurationId;

    private String name;

    private int shield;

    private short speed;

    private int damage;

    protected GeneratedAccountsConfigurationsImpl() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getAccountsHangarsId() {
        return accountsHangarsId;
    }

    @Override
    public byte getConfigurationId() {
        return configurationId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getShield() {
        return shield;
    }

    @Override
    public short getSpeed() {
        return speed;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public AccountsConfigurations setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsConfigurations setAccountsHangarsId(int accountsHangarsId) {
        this.accountsHangarsId = accountsHangarsId;
        return this;
    }

    @Override
    public AccountsConfigurations setConfigurationId(byte configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    @Override
    public AccountsConfigurations setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AccountsConfigurations setShield(int shield) {
        this.shield = shield;
        return this;
    }

    @Override
    public AccountsConfigurations setSpeed(short speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public AccountsConfigurations setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public AccountsHangars findAccountsHangarsId(Manager<AccountsHangars> foreignManager) {
        return foreignManager.stream()
                             .filter(AccountsHangars.ID.equal(getAccountsHangarsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("accountsHangarsId = " + Objects.toString(getAccountsHangarsId()));
        sj.add("configurationId = " + Objects.toString(getConfigurationId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("shield = " + Objects.toString(getShield()));
        sj.add("speed = " + Objects.toString(getSpeed()));
        sj.add("damage = " + Objects.toString(getDamage()));
        return "AccountsConfigurationsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsConfigurations)) {
            return false;
        }
        final AccountsConfigurations thatAccountsConfigurations = (AccountsConfigurations) that;
        if (this.getId() != thatAccountsConfigurations.getId()) {
            return false;
        }
        if (this.getAccountsHangarsId() != thatAccountsConfigurations.getAccountsHangarsId()) {
            return false;
        }
        if (this.getConfigurationId() != thatAccountsConfigurations.getConfigurationId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatAccountsConfigurations.getName())) {
            return false;
        }
        if (this.getShield() != thatAccountsConfigurations.getShield()) {
            return false;
        }
        if (this.getSpeed() != thatAccountsConfigurations.getSpeed()) {
            return false;
        }
        if (this.getDamage() != thatAccountsConfigurations.getDamage()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsHangarsId());
        hash = 31 * hash + Byte.hashCode(getConfigurationId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Integer.hashCode(getShield());
        hash = 31 * hash + Short.hashCode(getSpeed());
        hash = 31 * hash + Integer.hashCode(getDamage());
        return hash;
    }
}