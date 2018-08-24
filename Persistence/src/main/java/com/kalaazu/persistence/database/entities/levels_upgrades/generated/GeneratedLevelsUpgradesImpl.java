package com.kalaazu.persistence.database.entities.levels_upgrades.generated;

import com.kalaazu.persistence.database.entities.Levels;
import com.kalaazu.persistence.database.entities.LevelsUpgrades;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import lombok.Data;

/**
 * The generated base implementation of the {@link
 * LevelsUpgrades}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
@Data
public abstract class GeneratedLevelsUpgradesImpl implements LevelsUpgrades {

    private Integer id;

    private byte levelsId;

    private byte probability;

    private int credits;

    private short uridium;

    protected GeneratedLevelsUpgradesImpl() {

    }

    @Override
    public Levels findLevelsId(Manager<Levels> foreignManager) {
        return foreignManager.stream()
                             .filter(Levels.ID.equal(levelsId()))
                             .findAny()
                             .orElse(null);
    }
}