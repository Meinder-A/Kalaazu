package com.manulaiko.kalaazu.persistence.database.entities.rewards_npcs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.npcs.Npcs;
import com.manulaiko.kalaazu.persistence.database.entities.rewards.Rewards;
import com.manulaiko.kalaazu.persistence.database.entities.rewards_npcs.RewardsNpcs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.rewards_npcs.RewardsNpcs}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsNpcsImpl implements RewardsNpcs {
    
    private int id;
    private int npcsId;
    private int rewardsId;
    
    protected GeneratedRewardsNpcsImpl() {
        
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public int getNpcsId() {
        return npcsId;
    }
    
    @Override
    public int getRewardsId() {
        return rewardsId;
    }
    
    @Override
    public RewardsNpcs setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public RewardsNpcs setNpcsId(int npcsId) {
        this.npcsId = npcsId;
        return this;
    }
    
    @Override
    public RewardsNpcs setRewardsId(int rewardsId) {
        this.rewardsId = rewardsId;
        return this;
    }
    
    @Override
    public Npcs findNpcsId(Manager<Npcs> foreignManager) {
        return foreignManager.stream().filter(Npcs.ID.equal(getNpcsId())).findAny().orElse(null);
    }
    
    @Override
    public Rewards findRewardsId(Manager<Rewards> foreignManager) {
        return foreignManager.stream().filter(Rewards.ID.equal(getRewardsId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "        + Objects.toString(getId()));
        sj.add("npcsId = "    + Objects.toString(getNpcsId()));
        sj.add("rewardsId = " + Objects.toString(getRewardsId()));
        return "RewardsNpcsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof RewardsNpcs)) { return false; }
        final RewardsNpcs thatRewardsNpcs = (RewardsNpcs)that;
        if (this.getId() != thatRewardsNpcs.getId()) {return false; }
        if (this.getNpcsId() != thatRewardsNpcs.getNpcsId()) {return false; }
        if (this.getRewardsId() != thatRewardsNpcs.getRewardsId()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getNpcsId());
        hash = 31 * hash + Integer.hashCode(getRewardsId());
        return hash;
    }
}