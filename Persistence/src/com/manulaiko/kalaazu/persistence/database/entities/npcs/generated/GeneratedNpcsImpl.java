package com.manulaiko.kalaazu.persistence.database.entities.npcs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.npcs.Npcs;
import com.speedment.common.annotation.GeneratedCode;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.npcs.Npcs}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedNpcsImpl implements Npcs {
    
    private int id;
    private String name;
    private int health;
    private int shield;
    private BigDecimal shieldAbsorption;
    private int damage;
    private int speed;
    private int gfx;
    private int ai;
    
    protected GeneratedNpcsImpl() {
        
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getHealth() {
        return health;
    }
    
    @Override
    public int getShield() {
        return shield;
    }
    
    @Override
    public BigDecimal getShieldAbsorption() {
        return shieldAbsorption;
    }
    
    @Override
    public int getDamage() {
        return damage;
    }
    
    @Override
    public int getSpeed() {
        return speed;
    }
    
    @Override
    public int getGfx() {
        return gfx;
    }
    
    @Override
    public int getAi() {
        return ai;
    }
    
    @Override
    public Npcs setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Npcs setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Npcs setHealth(int health) {
        this.health = health;
        return this;
    }
    
    @Override
    public Npcs setShield(int shield) {
        this.shield = shield;
        return this;
    }
    
    @Override
    public Npcs setShieldAbsorption(BigDecimal shieldAbsorption) {
        this.shieldAbsorption = shieldAbsorption;
        return this;
    }
    
    @Override
    public Npcs setDamage(int damage) {
        this.damage = damage;
        return this;
    }
    
    @Override
    public Npcs setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
    
    @Override
    public Npcs setGfx(int gfx) {
        this.gfx = gfx;
        return this;
    }
    
    @Override
    public Npcs setAi(int ai) {
        this.ai = ai;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "               + Objects.toString(getId()));
        sj.add("name = "             + Objects.toString(getName()));
        sj.add("health = "           + Objects.toString(getHealth()));
        sj.add("shield = "           + Objects.toString(getShield()));
        sj.add("shieldAbsorption = " + Objects.toString(getShieldAbsorption()));
        sj.add("damage = "           + Objects.toString(getDamage()));
        sj.add("speed = "            + Objects.toString(getSpeed()));
        sj.add("gfx = "              + Objects.toString(getGfx()));
        sj.add("ai = "               + Objects.toString(getAi()));
        return "NpcsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Npcs)) { return false; }
        final Npcs thatNpcs = (Npcs)that;
        if (this.getId() != thatNpcs.getId()) {return false; }
        if (!Objects.equals(this.getName(), thatNpcs.getName())) {return false; }
        if (this.getHealth() != thatNpcs.getHealth()) {return false; }
        if (this.getShield() != thatNpcs.getShield()) {return false; }
        if (!Objects.equals(this.getShieldAbsorption(), thatNpcs.getShieldAbsorption())) {return false; }
        if (this.getDamage() != thatNpcs.getDamage()) {return false; }
        if (this.getSpeed() != thatNpcs.getSpeed()) {return false; }
        if (this.getGfx() != thatNpcs.getGfx()) {return false; }
        if (this.getAi() != thatNpcs.getAi()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Integer.hashCode(getHealth());
        hash = 31 * hash + Integer.hashCode(getShield());
        hash = 31 * hash + Objects.hashCode(getShieldAbsorption());
        hash = 31 * hash + Integer.hashCode(getDamage());
        hash = 31 * hash + Integer.hashCode(getSpeed());
        hash = 31 * hash + Integer.hashCode(getGfx());
        hash = 31 * hash + Integer.hashCode(getAi());
        return hash;
    }
}