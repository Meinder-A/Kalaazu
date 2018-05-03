package com.manulaiko.kalaazu.persistence.database.entities.rewards_collectables.generated;

import com.manulaiko.kalaazu.persistence.database.entities.rewards_collectables.RewardsCollectables;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.rewards_collectables.RewardsCollectables}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRewardsCollectablesManager extends Manager<RewardsCollectables> {

    List<Field<RewardsCollectables>> FIELDS = unmodifiableList(asList(
            RewardsCollectables.ID,
            RewardsCollectables.COLLECTABLES_ID,
            RewardsCollectables.REWARDS_ID
    ));

    @Override
    default Class<RewardsCollectables> getEntityClass() {
        return RewardsCollectables.class;
    }
}