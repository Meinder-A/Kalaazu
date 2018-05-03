package com.manulaiko.kalaazu.persistence.database.entities.levels.generated;

import com.manulaiko.kalaazu.persistence.database.entities.levels.Levels;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.levels.Levels}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLevelsImpl implements Levels {

    private byte   id;

    private long   account;

    private short  drone;

    private int    pet;

    private double damage;

    private double shield;

    protected GeneratedLevelsImpl() {

    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public long getAccount() {
        return account;
    }

    @Override
    public short getDrone() {
        return drone;
    }

    @Override
    public int getPet() {
        return pet;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public double getShield() {
        return shield;
    }

    @Override
    public Levels setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public Levels setAccount(long account) {
        this.account = account;
        return this;
    }

    @Override
    public Levels setDrone(short drone) {
        this.drone = drone;
        return this;
    }

    @Override
    public Levels setPet(int pet) {
        this.pet = pet;
        return this;
    }

    @Override
    public Levels setDamage(double damage) {
        this.damage = damage;
        return this;
    }

    @Override
    public Levels setShield(double shield) {
        this.shield = shield;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("account = " + Objects.toString(getAccount()));
        sj.add("drone = " + Objects.toString(getDrone()));
        sj.add("pet = " + Objects.toString(getPet()));
        sj.add("damage = " + Objects.toString(getDamage()));
        sj.add("shield = " + Objects.toString(getShield()));
        return "LevelsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Levels)) {
            return false;
        }
        final Levels thatLevels = (Levels) that;
        if (this.getId() != thatLevels.getId()) {
            return false;
        }
        if (this.getAccount() != thatLevels.getAccount()) {
            return false;
        }
        if (this.getDrone() != thatLevels.getDrone()) {
            return false;
        }
        if (this.getPet() != thatLevels.getPet()) {
            return false;
        }
        if (this.getDamage() != thatLevels.getDamage()) {
            return false;
        }
        if (this.getShield() != thatLevels.getShield()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Long.hashCode(getAccount());
        hash = 31 * hash + Short.hashCode(getDrone());
        hash = 31 * hash + Integer.hashCode(getPet());
        hash = 31 * hash + Double.hashCode(getDamage());
        hash = 31 * hash + Double.hashCode(getShield());
        return hash;
    }
}