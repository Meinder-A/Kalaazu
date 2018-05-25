package com.kalaazu.persistence.database.entities.events.generated;

import com.kalaazu.persistence.database.entities.Events;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.events.Events} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedEventsManager extends Manager<Events> {

    TableIdentifier<Events> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "events"
    );

    List<Field<Events>>     FIELDS     = unmodifiableList(asList(
            Events.ID,
            Events.NAME,
            Events.DESCRIPTION,
            Events.START_DATE,
            Events.END_DATE
    ));

    @Override
    default Class<Events> getEntityClass() {
        return Events.class;
    }
}