package com.kalaazu.persistence.database.entities.skilltree_levels.generated;

import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.SkilltreeLevels;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.skilltree_levels.SkilltreeLevels}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSkilltreeLevelsManager extends Manager<SkilltreeLevels> {

    TableIdentifier<SkilltreeLevels> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "skilltree_levels"
    );

    List<Field<SkilltreeLevels>>     FIELDS     = unmodifiableList(asList(
            SkilltreeLevels.ID,
            SkilltreeLevels.SKILLTREE_SKILLS_ID,
            SkilltreeLevels.LEVELS_ID,
            SkilltreeLevels.CREDITS,
            SkilltreeLevels.SEPROM,
            SkilltreeLevels.POINTS
    ));

    @Override
    default Class<SkilltreeLevels> getEntityClass() {
        return SkilltreeLevels.class;
    }
}