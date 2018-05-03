package com.manulaiko.kalaazu.persistence.database.entities.techfactory_costs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.techfactory_costs.TechfactoryCosts;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.techfactory_costs.TechfactoryCosts}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedTechfactoryCostsManager extends Manager<TechfactoryCosts> {

    List<Field<TechfactoryCosts>> FIELDS = unmodifiableList(asList(
            TechfactoryCosts.ID,
            TechfactoryCosts.TECHFACTORY_ITEMS_ID,
            TechfactoryCosts.ITEMS_ID,
            TechfactoryCosts.AMOUNT
    ));

    @Override
    default Class<TechfactoryCosts> getEntityClass() {
        return TechfactoryCosts.class;
    }
}