package com.manulaiko.kalaazu.persistence.database.entities.events.generated;

import com.manulaiko.kalaazu.persistence.database.entities.events.Events;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.events.Events}-interface
 * representing entities of the {@code events}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedEvents {

    /**
     * This Field corresponds to the {@link Events} field that can be obtained
     * using the {@link Events#getId()} method.
     */
    IntField<Events, Integer>                     ID          = IntField.create(
            Identifier.ID,
            Events::getId,
            Events::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Events} field that can be obtained
     * using the {@link Events#getName()} method.
     */
    StringField<Events, String>                   NAME        = StringField.create(
            Identifier.NAME,
            Events::getName,
            Events::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Events} field that can be obtained
     * using the {@link Events#getDescription()} method.
     */
    StringField<Events, String>                   DESCRIPTION = StringField.create(
            Identifier.DESCRIPTION,
            Events::getDescription,
            Events::setDescription,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Events} field that can be obtained
     * using the {@link Events#getStartDate()} method.
     */
    ComparableField<Events, Timestamp, Timestamp> START_DATE  = ComparableField.create(
            Identifier.START_DATE,
            o -> OptionalUtil.unwrap(o.getStartDate()),
            Events::setStartDate,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Events} field that can be obtained
     * using the {@link Events#getEndDate()} method.
     */
    ComparableField<Events, Timestamp, Timestamp> END_DATE    = ComparableField.create(
            Identifier.END_DATE,
            o -> OptionalUtil.unwrap(o.getEndDate()),
            Events::setEndDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this Events. The id field corresponds to the database
     * column kalaazu.kalaazu.events.id.
     *
     * @return the id of this Events
     */
    Integer getId();

    /**
     * Returns the name of this Events. The name field corresponds to the
     * database column kalaazu.kalaazu.events.name.
     *
     * @return the name of this Events
     */
    String getName();

    /**
     * Returns the description of this Events. The description field corresponds
     * to the database column kalaazu.kalaazu.events.description.
     *
     * @return the description of this Events
     */
    String getDescription();

    /**
     * Returns the startDate of this Events. The startDate field corresponds to
     * the database column kalaazu.kalaazu.events.start_date.
     *
     * @return the startDate of this Events
     */
    Optional<Timestamp> getStartDate();

    /**
     * Returns the endDate of this Events. The endDate field corresponds to the
     * database column kalaazu.kalaazu.events.end_date.
     *
     * @return the endDate of this Events
     */
    Optional<Timestamp> getEndDate();

    /**
     * Sets the id of this Events. The id field corresponds to the database
     * column kalaazu.kalaazu.events.id.
     *
     * @param id to set of this Events
     *
     * @return this Events instance
     */
    Events setId(int id);

    /**
     * Sets the name of this Events. The name field corresponds to the database
     * column kalaazu.kalaazu.events.name.
     *
     * @param name to set of this Events
     *
     * @return this Events instance
     */
    Events setName(String name);

    /**
     * Sets the description of this Events. The description field corresponds to
     * the database column kalaazu.kalaazu.events.description.
     *
     * @param description to set of this Events
     *
     * @return this Events instance
     */
    Events setDescription(String description);

    /**
     * Sets the startDate of this Events. The startDate field corresponds to the
     * database column kalaazu.kalaazu.events.start_date.
     *
     * @param startDate to set of this Events
     *
     * @return this Events instance
     */
    Events setStartDate(Timestamp startDate);

    /**
     * Sets the endDate of this Events. The endDate field corresponds to the
     * database column kalaazu.kalaazu.events.end_date.
     *
     * @param endDate to set of this Events
     *
     * @return this Events instance
     */
    Events setEndDate(Timestamp endDate);

    enum Identifier implements ColumnIdentifier<Events> {

        ID("id"),
        NAME("name"),
        DESCRIPTION("description"),
        START_DATE("start_date"),
        END_DATE("end_date");

        private final String                  columnName;

        private final TableIdentifier<Events> tableIdentifier;

        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsName(),
                    getSchemaName(),
                    getTableName()
            );
        }

        @Override
        public String getDbmsName() {
            return "kalaazu";
        }

        @Override
        public String getSchemaName() {
            return "kalaazu";
        }

        @Override
        public String getTableName() {
            return "events";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<Events> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}