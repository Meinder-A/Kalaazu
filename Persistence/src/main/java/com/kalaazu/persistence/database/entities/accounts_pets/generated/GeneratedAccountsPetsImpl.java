package com.kalaazu.persistence.database.entities.accounts_pets.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsPets;
import com.kalaazu.persistence.database.entities.Levels;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.accounts_pets.AccountsPets}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsPetsImpl implements AccountsPets {

    private int id;

    private int accountsId;

    private byte levelsId;

    private String name;

    private int experience;

    private int fuel;

    private int health;

    private byte slotsLasersTotal;

    private byte slotsLasersAvailable;

    private byte slotsGeneratorsTotal;

    private byte slotsGeneratorsAvailable;

    private byte slotsProtocolsTotal;

    private byte slotsProtocolsAvailable;

    private byte slotsGearsTotal;

    private byte slotsGearsAvailable;

    protected GeneratedAccountsPetsImpl() {
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
    public byte getLevelsId() {
        return levelsId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public byte getSlotsLasersTotal() {
        return slotsLasersTotal;
    }

    @Override
    public byte getSlotsLasersAvailable() {
        return slotsLasersAvailable;
    }

    @Override
    public byte getSlotsGeneratorsTotal() {
        return slotsGeneratorsTotal;
    }

    @Override
    public byte getSlotsGeneratorsAvailable() {
        return slotsGeneratorsAvailable;
    }

    @Override
    public byte getSlotsProtocolsTotal() {
        return slotsProtocolsTotal;
    }

    @Override
    public byte getSlotsProtocolsAvailable() {
        return slotsProtocolsAvailable;
    }

    @Override
    public byte getSlotsGearsTotal() {
        return slotsGearsTotal;
    }

    @Override
    public byte getSlotsGearsAvailable() {
        return slotsGearsAvailable;
    }

    @Override
    public AccountsPets setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsPets setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsPets setLevelsId(byte levelsId) {
        this.levelsId = levelsId;
        return this;
    }

    @Override
    public AccountsPets setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AccountsPets setExperience(int experience) {
        this.experience = experience;
        return this;
    }

    @Override
    public AccountsPets setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }

    @Override
    public AccountsPets setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public AccountsPets setSlotsLasersTotal(byte slotsLasersTotal) {
        this.slotsLasersTotal = slotsLasersTotal;
        return this;
    }

    @Override
    public AccountsPets setSlotsLasersAvailable(byte slotsLasersAvailable) {
        this.slotsLasersAvailable = slotsLasersAvailable;
        return this;
    }

    @Override
    public AccountsPets setSlotsGeneratorsTotal(byte slotsGeneratorsTotal) {
        this.slotsGeneratorsTotal = slotsGeneratorsTotal;
        return this;
    }

    @Override
    public AccountsPets setSlotsGeneratorsAvailable(byte slotsGeneratorsAvailable) {
        this.slotsGeneratorsAvailable = slotsGeneratorsAvailable;
        return this;
    }

    @Override
    public AccountsPets setSlotsProtocolsTotal(byte slotsProtocolsTotal) {
        this.slotsProtocolsTotal = slotsProtocolsTotal;
        return this;
    }

    @Override
    public AccountsPets setSlotsProtocolsAvailable(byte slotsProtocolsAvailable) {
        this.slotsProtocolsAvailable = slotsProtocolsAvailable;
        return this;
    }

    @Override
    public AccountsPets setSlotsGearsTotal(byte slotsGearsTotal) {
        this.slotsGearsTotal = slotsGearsTotal;
        return this;
    }

    @Override
    public AccountsPets setSlotsGearsAvailable(byte slotsGearsAvailable) {
        this.slotsGearsAvailable = slotsGearsAvailable;
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
    public Levels findLevelsId(Manager<Levels> foreignManager) {
        return foreignManager.stream()
                             .filter(Levels.ID.equal(getLevelsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("levelsId = " + Objects.toString(getLevelsId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("experience = " + Objects.toString(getExperience()));
        sj.add("fuel = " + Objects.toString(getFuel()));
        sj.add("health = " + Objects.toString(getHealth()));
        sj.add("slotsLasersTotal = " + Objects.toString(getSlotsLasersTotal()));
        sj.add("slotsLasersAvailable = " + Objects.toString(getSlotsLasersAvailable()));
        sj.add("slotsGeneratorsTotal = " + Objects.toString(getSlotsGeneratorsTotal()));
        sj.add("slotsGeneratorsAvailable = " + Objects.toString(getSlotsGeneratorsAvailable()));
        sj.add("slotsProtocolsTotal = " + Objects.toString(getSlotsProtocolsTotal()));
        sj.add("slotsProtocolsAvailable = " + Objects.toString(getSlotsProtocolsAvailable()));
        sj.add("slotsGearsTotal = " + Objects.toString(getSlotsGearsTotal()));
        sj.add("slotsGearsAvailable = " + Objects.toString(getSlotsGearsAvailable()));
        return "AccountsPetsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsPets)) {
            return false;
        }
        final AccountsPets thatAccountsPets = (AccountsPets) that;
        if (this.getId() != thatAccountsPets.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsPets.getAccountsId()) {
            return false;
        }
        if (this.getLevelsId() != thatAccountsPets.getLevelsId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatAccountsPets.getName())) {
            return false;
        }
        if (this.getExperience() != thatAccountsPets.getExperience()) {
            return false;
        }
        if (this.getFuel() != thatAccountsPets.getFuel()) {
            return false;
        }
        if (this.getHealth() != thatAccountsPets.getHealth()) {
            return false;
        }
        if (this.getSlotsLasersTotal() != thatAccountsPets.getSlotsLasersTotal()) {
            return false;
        }
        if (this.getSlotsLasersAvailable() != thatAccountsPets.getSlotsLasersAvailable()) {
            return false;
        }
        if (this.getSlotsGeneratorsTotal() != thatAccountsPets.getSlotsGeneratorsTotal()) {
            return false;
        }
        if (this.getSlotsGeneratorsAvailable() != thatAccountsPets.getSlotsGeneratorsAvailable()) {
            return false;
        }
        if (this.getSlotsProtocolsTotal() != thatAccountsPets.getSlotsProtocolsTotal()) {
            return false;
        }
        if (this.getSlotsProtocolsAvailable() != thatAccountsPets.getSlotsProtocolsAvailable()) {
            return false;
        }
        if (this.getSlotsGearsTotal() != thatAccountsPets.getSlotsGearsTotal()) {
            return false;
        }
        if (this.getSlotsGearsAvailable() != thatAccountsPets.getSlotsGearsAvailable()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Byte.hashCode(getLevelsId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Integer.hashCode(getExperience());
        hash = 31 * hash + Integer.hashCode(getFuel());
        hash = 31 * hash + Integer.hashCode(getHealth());
        hash = 31 * hash + Byte.hashCode(getSlotsLasersTotal());
        hash = 31 * hash + Byte.hashCode(getSlotsLasersAvailable());
        hash = 31 * hash + Byte.hashCode(getSlotsGeneratorsTotal());
        hash = 31 * hash + Byte.hashCode(getSlotsGeneratorsAvailable());
        hash = 31 * hash + Byte.hashCode(getSlotsProtocolsTotal());
        hash = 31 * hash + Byte.hashCode(getSlotsProtocolsAvailable());
        hash = 31 * hash + Byte.hashCode(getSlotsGearsTotal());
        hash = 31 * hash + Byte.hashCode(getSlotsGearsAvailable());
        return hash;
    }
}