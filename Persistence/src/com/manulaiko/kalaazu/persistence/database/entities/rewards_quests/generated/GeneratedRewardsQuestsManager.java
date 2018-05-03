package com.manulaiko.kalaazu.persistence.database.entities.rewards_quests.generated;

import com.manulaiko.kalaazu.persistence.database.entities.rewards_quests.RewardsQuests;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.rewards_quests.RewardsQuests}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRewardsQuestsManager extends Manager<RewardsQuests> {

    List<Field<RewardsQuests>> FIELDS = unmodifiableList(asList(
            RewardsQuests.ID,
            RewardsQuests.QUESTS_ID,
            RewardsQuests.REWARDS_ID
    ));

    @Override
    default Class<RewardsQuests> getEntityClass() {
        return RewardsQuests.class;
    }
}