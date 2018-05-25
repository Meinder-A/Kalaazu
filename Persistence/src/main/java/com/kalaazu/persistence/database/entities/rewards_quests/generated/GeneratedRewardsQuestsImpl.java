package com.kalaazu.persistence.database.entities.rewards_quests.generated;

import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Quests;
import com.kalaazu.persistence.database.entities.Rewards;
import com.kalaazu.persistence.database.entities.RewardsQuests;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.rewards_quests.RewardsQuests}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsQuestsImpl implements RewardsQuests {

    private short id;

    private short questsId;

    private short rewardsId;

    protected GeneratedRewardsQuestsImpl() {
    }

    @Override
    public Short getId() {
        return id;
    }

    @Override
    public short getQuestsId() {
        return questsId;
    }

    @Override
    public short getRewardsId() {
        return rewardsId;
    }

    @Override
    public RewardsQuests setId(short id) {
        this.id = id;
        return this;
    }

    @Override
    public RewardsQuests setQuestsId(short questsId) {
        this.questsId = questsId;
        return this;
    }

    @Override
    public RewardsQuests setRewardsId(short rewardsId) {
        this.rewardsId = rewardsId;
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
    public Rewards findRewardsId(Manager<Rewards> foreignManager) {
        return foreignManager.stream()
                             .filter(Rewards.ID.equal(getRewardsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("questsId = " + Objects.toString(getQuestsId()));
        sj.add("rewardsId = " + Objects.toString(getRewardsId()));
        return "RewardsQuestsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof RewardsQuests)) {
            return false;
        }
        final RewardsQuests thatRewardsQuests = (RewardsQuests) that;
        if (this.getId() != thatRewardsQuests.getId()) {
            return false;
        }
        if (this.getQuestsId() != thatRewardsQuests.getQuestsId()) {
            return false;
        }
        if (this.getRewardsId() != thatRewardsQuests.getRewardsId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getId());
        hash = 31 * hash + Short.hashCode(getQuestsId());
        hash = 31 * hash + Short.hashCode(getRewardsId());
        return hash;
    }
}