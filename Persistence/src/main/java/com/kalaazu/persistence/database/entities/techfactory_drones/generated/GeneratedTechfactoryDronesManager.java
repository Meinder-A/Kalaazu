package com.kalaazu.persistence.database.entities.techfactory_drones.generated;

import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.TechfactoryDrones;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.techfactory_drones.TechfactoryDrones}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedTechfactoryDronesManager extends Manager<TechfactoryDrones> {

    TableIdentifier<TechfactoryDrones> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "techfactory_drones"
    );

    List<Field<TechfactoryDrones>>     FIELDS     = unmodifiableList(asList(
            TechfactoryDrones.ID,
            TechfactoryDrones.NAME,
            TechfactoryDrones.DESCRIPTION,
            TechfactoryDrones.TIME,
            TechfactoryDrones.PARTS,
            TechfactoryDrones.PRICE,
            TechfactoryDrones.FACTOR
    ));

    @Override
    default Class<TechfactoryDrones> getEntityClass() {
        return TechfactoryDrones.class;
    }
}