package com.kalaazu.persistence.database.entities.clans_battlestations_logs.generated;

import com.kalaazu.persistence.database.entities.Clans;
import com.kalaazu.persistence.database.entities.ClansBattlestations;
import com.kalaazu.persistence.database.entities.ClansBattlestationsLogs;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * ClansBattlestationsLogs}-interface
 * representing entities of the {@code clans_battlestations_logs}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansBattlestationsLogs {

    /**
     * This Field corresponds to the {@link ClansBattlestationsLogs} field that
     * can be obtained using the {@link ClansBattlestationsLogs#getId()} method.
     */
    IntField<ClansBattlestationsLogs, Integer> ID = IntField.create(
            Identifier.ID,
            ClansBattlestationsLogs::getId,
            ClansBattlestationsLogs::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsLogs} field that
     * can be obtained using the {@link ClansBattlestationsLogs#getClansId()}
     * method.
     */
    IntForeignKeyField<ClansBattlestationsLogs, Integer, Clans> CLANS_ID = IntForeignKeyField.create(
            Identifier.CLANS_ID,
            ClansBattlestationsLogs::getClansId,
            ClansBattlestationsLogs::setClansId,
            Clans.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsLogs} field that
     * can be obtained using the {@link
     * ClansBattlestationsLogs#getClansBattlestationsId()} method.
     */
    ByteForeignKeyField<ClansBattlestationsLogs, Byte, ClansBattlestations> CLANS_BATTLESTATIONS_ID = ByteForeignKeyField.create(
            Identifier.CLANS_BATTLESTATIONS_ID,
            ClansBattlestationsLogs::getClansBattlestationsId,
            ClansBattlestationsLogs::setClansBattlestationsId,
            ClansBattlestations.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsLogs} field that
     * can be obtained using the {@link ClansBattlestationsLogs#getMessage()}
     * method.
     */
    StringField<ClansBattlestationsLogs, String> MESSAGE = StringField.create(
            Identifier.MESSAGE,
            ClansBattlestationsLogs::getMessage,
            ClansBattlestationsLogs::setMessage,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsLogs} field that
     * can be obtained using the {@link ClansBattlestationsLogs#getDate()}
     * method.
     */
    ComparableField<ClansBattlestationsLogs, Timestamp, Timestamp> DATE = ComparableField.create(
            Identifier.DATE,
            ClansBattlestationsLogs::getDate,
            ClansBattlestationsLogs::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this ClansBattlestationsLogs. The id field corresponds
     * to the database column kalaazu.kalaazu.clans_battlestations_logs.id.
     *
     * @return the id of this ClansBattlestationsLogs
     */
    Integer getId();

    /**
     * Returns the clansId of this ClansBattlestationsLogs. The clansId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.clans_id.
     *
     * @return the clansId of this ClansBattlestationsLogs
     */
    int getClansId();

    /**
     * Returns the clansBattlestationsId of this ClansBattlestationsLogs. The
     * clansBattlestationsId field corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.clans_battlestations_id.
     *
     * @return the clansBattlestationsId of this ClansBattlestationsLogs
     */
    byte getClansBattlestationsId();

    /**
     * Returns the message of this ClansBattlestationsLogs. The message field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.message.
     *
     * @return the message of this ClansBattlestationsLogs
     */
    String getMessage();

    /**
     * Returns the date of this ClansBattlestationsLogs. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.date.
     *
     * @return the date of this ClansBattlestationsLogs
     */
    Timestamp getDate();

    /**
     * Sets the id of this ClansBattlestationsLogs. The id field corresponds to
     * the database column kalaazu.kalaazu.clans_battlestations_logs.id.
     *
     * @param id to set of this ClansBattlestationsLogs
     *
     * @return this ClansBattlestationsLogs instance
     */
    ClansBattlestationsLogs setId(int id);

    /**
     * Sets the clansId of this ClansBattlestationsLogs. The clansId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.clans_id.
     *
     * @param clansId to set of this ClansBattlestationsLogs
     *
     * @return this ClansBattlestationsLogs instance
     */
    ClansBattlestationsLogs setClansId(int clansId);

    /**
     * Sets the clansBattlestationsId of this ClansBattlestationsLogs. The
     * clansBattlestationsId field corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.clans_battlestations_id.
     *
     * @param clansBattlestationsId to set of this ClansBattlestationsLogs
     *
     * @return this ClansBattlestationsLogs instance
     */
    ClansBattlestationsLogs setClansBattlestationsId(byte clansBattlestationsId);

    /**
     * Sets the message of this ClansBattlestationsLogs. The message field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_logs.message.
     *
     * @param message to set of this ClansBattlestationsLogs
     *
     * @return this ClansBattlestationsLogs instance
     */
    ClansBattlestationsLogs setMessage(String message);

    /**
     * Sets the date of this ClansBattlestationsLogs. The date field corresponds
     * to the database column kalaazu.kalaazu.clans_battlestations_logs.date.
     *
     * @param date to set of this ClansBattlestationsLogs
     *
     * @return this ClansBattlestationsLogs instance
     */
    ClansBattlestationsLogs setDate(Timestamp date);

    /**
     * Queries the specified manager for the referenced Clans. If no such Clans
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Clans findClansId(Manager<Clans> foreignManager);

    /**
     * Queries the specified manager for the referenced ClansBattlestations. If
     * no such ClansBattlestations exists, an {@code NullPointerException} will
     * be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    ClansBattlestations findClansBattlestationsId(Manager<ClansBattlestations> foreignManager);

    enum Identifier implements ColumnIdentifier<ClansBattlestationsLogs> {

        ID("id"),
        CLANS_ID("clans_id"),
        CLANS_BATTLESTATIONS_ID("clans_battlestations_id"),
        MESSAGE("message"),
        DATE("date");

        private final String columnName;

        private final TableIdentifier<ClansBattlestationsLogs> tableIdentifier;

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
            return "clans_battlestations_logs";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<ClansBattlestationsLogs> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}