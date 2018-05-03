package com.manulaiko.kalaazu.persistence.database.entities.items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.items.Items;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.items.Items} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedItemsManager extends Manager<Items> {

    List<Field<Items>> FIELDS = unmodifiableList(asList(
            Items.ID,
            Items.NAME,
            Items.CATEGORY,
            Items.DESCRIPTION,
            Items.PRICE,
            Items.TYPE,
            Items.IS_ELITE,
            Items.IS_EVENT,
            Items.IS_BUYABLE
    ));

    @Override
    default Class<Items> getEntityClass() {
        return Items.class;
    }
}