package com.kalaazu.persistence.database.entities.skilltree_skills.generated;

import com.kalaazu.persistence.database.entities.SkilltreeSkills;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * SkilltreeSkills}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSkilltreeSkillsManager extends Manager<SkilltreeSkills> {

    List<Field<SkilltreeSkills>> FIELDS = unmodifiableList(asList(
            SkilltreeSkills.ID,
            SkilltreeSkills.NAME,
            SkilltreeSkills.DESCRIPTION,
            SkilltreeSkills.TYPE,
            SkilltreeSkills.IS_ADVANCED,
            SkilltreeSkills.BONUS_TYPE,
            SkilltreeSkills.BONUS_AMOUNT,
            SkilltreeSkills.BONUS_FACTOR
    ));

    @Override
    default Class<SkilltreeSkills> getEntityClass() {
        return SkilltreeSkills.class;
    }
}