package com.kalaazu.persistence.database.entities.galaxygates_stages.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesStages;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.galaxygates_stages.GalaxygatesStages}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedGalaxygatesStagesManager extends Manager<GalaxygatesStages> {

    TableIdentifier<GalaxygatesStages> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "galaxygates_stages"
    );

    List<Field<GalaxygatesStages>>     FIELDS     = unmodifiableList(asList(
            GalaxygatesStages.ID,
            GalaxygatesStages.GALAXYGATES_WAVES_ID,
            GalaxygatesStages.COMMENT
    ));

    @Override
    default Class<GalaxygatesStages> getEntityClass() {
        return GalaxygatesStages.class;
    }
}