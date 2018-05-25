package com.kalaazu.persistence.database.entities.rewards_vouchers.generated;

import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Rewards;
import com.kalaazu.persistence.database.entities.RewardsVouchers;
import com.kalaazu.persistence.database.entities.Vouchers;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.rewards_vouchers.RewardsVouchers}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsVouchersImpl implements RewardsVouchers {

    private short id;

    private short vouchersId;

    private short rewardsId;

    protected GeneratedRewardsVouchersImpl() {
    }

    @Override
    public Short getId() {
        return id;
    }

    @Override
    public short getVouchersId() {
        return vouchersId;
    }

    @Override
    public short getRewardsId() {
        return rewardsId;
    }

    @Override
    public RewardsVouchers setId(short id) {
        this.id = id;
        return this;
    }

    @Override
    public RewardsVouchers setVouchersId(short vouchersId) {
        this.vouchersId = vouchersId;
        return this;
    }

    @Override
    public RewardsVouchers setRewardsId(short rewardsId) {
        this.rewardsId = rewardsId;
        return this;
    }

    @Override
    public Vouchers findVouchersId(Manager<Vouchers> foreignManager) {
        return foreignManager.stream()
                             .filter(Vouchers.ID.equal(getVouchersId()))
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
        sj.add("vouchersId = " + Objects.toString(getVouchersId()));
        sj.add("rewardsId = " + Objects.toString(getRewardsId()));
        return "RewardsVouchersImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof RewardsVouchers)) {
            return false;
        }
        final RewardsVouchers thatRewardsVouchers = (RewardsVouchers) that;
        if (this.getId() != thatRewardsVouchers.getId()) {
            return false;
        }
        if (this.getVouchersId() != thatRewardsVouchers.getVouchersId()) {
            return false;
        }
        if (this.getRewardsId() != thatRewardsVouchers.getRewardsId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getId());
        hash = 31 * hash + Short.hashCode(getVouchersId());
        hash = 31 * hash + Short.hashCode(getRewardsId());
        return hash;
    }
}