package com.manulaiko.kalaazu.persistence.database.entities.server_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.server_logs.ServerLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.server_logs.ServerLogs}-interface
 * representing entities of the {@code server_logs}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedServerLogs {

    /**
     * This Field corresponds to the {@link ServerLogs} field that can be
     * obtained using the {@link ServerLogs#getId()} method.
     */
    IntField<ServerLogs, Integer>                     ID      = IntField.create(
            Identifier.ID,
            ServerLogs::getId,
            ServerLogs::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ServerLogs} field that can be
     * obtained using the {@link ServerLogs#getDate()} method.
     */
    ComparableField<ServerLogs, Timestamp, Timestamp> DATE    = ComparableField.create(
            Identifier.DATE,
            ServerLogs::getDate,
            ServerLogs::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ServerLogs} field that can be
     * obtained using the {@link ServerLogs#getLevel()} method.
     */
    StringField<ServerLogs, String>                   LEVEL   = StringField.create(
            Identifier.LEVEL,
            ServerLogs::getLevel,
            ServerLogs::setLevel,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ServerLogs} field that can be
     * obtained using the {@link ServerLogs#getType()} method.
     */
    StringField<ServerLogs, String>                   TYPE    = StringField.create(
            Identifier.TYPE,
            ServerLogs::getType,
            ServerLogs::setType,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ServerLogs} field that can be
     * obtained using the {@link ServerLogs#getContext()} method.
     */
    StringField<ServerLogs, String>                   CONTEXT = StringField.create(
            Identifier.CONTEXT,
            ServerLogs::getContext,
            ServerLogs::setContext,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this ServerLogs. The id field corresponds to the
     * database column kalaazu.kalaazu.server_logs.id.
     *
     * @return the id of this ServerLogs
     */
    Integer getId();

    /**
     * Returns the date of this ServerLogs. The date field corresponds to the
     * database column kalaazu.kalaazu.server_logs.date.
     *
     * @return the date of this ServerLogs
     */
    Timestamp getDate();

    /**
     * Returns the level of this ServerLogs. The level field corresponds to the
     * database column kalaazu.kalaazu.server_logs.level.
     *
     * @return the level of this ServerLogs
     */
    String getLevel();

    /**
     * Returns the type of this ServerLogs. The type field corresponds to the
     * database column kalaazu.kalaazu.server_logs.type.
     *
     * @return the type of this ServerLogs
     */
    String getType();

    /**
     * Returns the context of this ServerLogs. The context field corresponds to
     * the database column kalaazu.kalaazu.server_logs.context.
     *
     * @return the context of this ServerLogs
     */
    String getContext();

    /**
     * Sets the id of this ServerLogs. The id field corresponds to the database
     * column kalaazu.kalaazu.server_logs.id.
     *
     * @param id to set of this ServerLogs
     *
     * @return this ServerLogs instance
     */
    ServerLogs setId(int id);

    /**
     * Sets the date of this ServerLogs. The date field corresponds to the
     * database column kalaazu.kalaazu.server_logs.date.
     *
     * @param date to set of this ServerLogs
     *
     * @return this ServerLogs instance
     */
    ServerLogs setDate(Timestamp date);

    /**
     * Sets the level of this ServerLogs. The level field corresponds to the
     * database column kalaazu.kalaazu.server_logs.level.
     *
     * @param level to set of this ServerLogs
     *
     * @return this ServerLogs instance
     */
    ServerLogs setLevel(String level);

    /**
     * Sets the type of this ServerLogs. The type field corresponds to the
     * database column kalaazu.kalaazu.server_logs.type.
     *
     * @param type to set of this ServerLogs
     *
     * @return this ServerLogs instance
     */
    ServerLogs setType(String type);

    /**
     * Sets the context of this ServerLogs. The context field corresponds to the
     * database column kalaazu.kalaazu.server_logs.context.
     *
     * @param context to set of this ServerLogs
     *
     * @return this ServerLogs instance
     */
    ServerLogs setContext(String context);

    enum Identifier implements ColumnIdentifier<ServerLogs> {

        ID("id"),
        DATE("date"),
        LEVEL("level"),
        TYPE("type"),
        CONTEXT("context");

        private final String                      columnName;

        private final TableIdentifier<ServerLogs> tableIdentifier;

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
            return "server_logs";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<ServerLogs> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}