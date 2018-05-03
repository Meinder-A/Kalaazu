package com.manulaiko.kalaazu.persistence.database.entities.ships.generated;

import com.manulaiko.kalaazu.persistence.database.entities.ships.Ships;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.ships.Ships} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedShipsManager extends Manager<Ships> {

    List<Field<Ships>> FIELDS = unmodifiableList(asList(
            Ships.ID,
            Ships.ITEMS_ID,
            Ships.HEALTH,
            Ships.SPEED,
            Ships.CARGO,
            Ships.BATTERIES,
            Ships.ROCKETS,
            Ships.LASERS,
            Ships.HELLSTORMS,
            Ships.GENERATORS,
            Ships.EXTRAS,
            Ships.GFX
    ));

    @Override
    default Class<Ships> getEntityClass() {
        return Ships.class;
    }
}