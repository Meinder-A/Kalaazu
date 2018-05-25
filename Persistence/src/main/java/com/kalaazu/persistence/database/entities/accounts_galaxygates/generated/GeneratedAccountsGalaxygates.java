package com.kalaazu.persistence.database.entities.accounts_galaxygates.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsGalaxygates;
import com.kalaazu.persistence.database.entities.Galaxygates;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygates}-interface
 * representing entities of the {@code accounts_galaxygates}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsGalaxygates {

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getId()} method.
     */
    IntField<AccountsGalaxygates, Integer> ID = IntField.create(
            Identifier.ID,
            AccountsGalaxygates::getId,
            AccountsGalaxygates::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getGalaxygatesId()}
     * method.
     */
    ByteForeignKeyField<AccountsGalaxygates, Byte, Galaxygates> GALAXYGATES_ID = ByteForeignKeyField.create(
            Identifier.GALAXYGATES_ID,
            AccountsGalaxygates::getGalaxygatesId,
            AccountsGalaxygates::setGalaxygatesId,
            Galaxygates.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsGalaxygates, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsGalaxygates::getAccountsId,
            AccountsGalaxygates::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getParts()} method.
     */
    ByteField<AccountsGalaxygates, Byte> PARTS = ByteField.create(
            Identifier.PARTS,
            AccountsGalaxygates::getParts,
            AccountsGalaxygates::setParts,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getLifes()} method.
     */
    ByteField<AccountsGalaxygates, Byte> LIFES = ByteField.create(
            Identifier.LIFES,
            AccountsGalaxygates::getLifes,
            AccountsGalaxygates::setLifes,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getWave()} method.
     */
    ByteField<AccountsGalaxygates, Byte> WAVE = ByteField.create(
            Identifier.WAVE,
            AccountsGalaxygates::getWave,
            AccountsGalaxygates::setWave,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsGalaxygates} field that can
     * be obtained using the {@link AccountsGalaxygates#getTimes()} method.
     */
    ShortField<AccountsGalaxygates, Short> TIMES = ShortField.create(
            Identifier.TIMES,
            AccountsGalaxygates::getTimes,
            AccountsGalaxygates::setTimes,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this AccountsGalaxygates. The id field corresponds to
     * the database column kalaazu.kalaazu.accounts_galaxygates.id.
     *
     * @return the id of this AccountsGalaxygates
     */
    Integer getId();

    /**
     * Returns the galaxygatesId of this AccountsGalaxygates. The galaxygatesId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.galaxygates_id.
     *
     * @return the galaxygatesId of this AccountsGalaxygates
     */
    byte getGalaxygatesId();

    /**
     * Returns the accountsId of this AccountsGalaxygates. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.accounts_id.
     *
     * @return the accountsId of this AccountsGalaxygates
     */
    int getAccountsId();

    /**
     * Returns the parts of this AccountsGalaxygates. The parts field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.parts.
     *
     * @return the parts of this AccountsGalaxygates
     */
    byte getParts();

    /**
     * Returns the lifes of this AccountsGalaxygates. The lifes field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.lifes.
     *
     * @return the lifes of this AccountsGalaxygates
     */
    byte getLifes();

    /**
     * Returns the wave of this AccountsGalaxygates. The wave field corresponds
     * to the database column kalaazu.kalaazu.accounts_galaxygates.wave.
     *
     * @return the wave of this AccountsGalaxygates
     */
    byte getWave();

    /**
     * Returns the times of this AccountsGalaxygates. The times field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.times.
     *
     * @return the times of this AccountsGalaxygates
     */
    short getTimes();

    /**
     * Sets the id of this AccountsGalaxygates. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_galaxygates.id.
     *
     * @param id to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setId(int id);

    /**
     * Sets the galaxygatesId of this AccountsGalaxygates. The galaxygatesId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.galaxygates_id.
     *
     * @param galaxygatesId to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setGalaxygatesId(byte galaxygatesId);

    /**
     * Sets the accountsId of this AccountsGalaxygates. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_galaxygates.accounts_id.
     *
     * @param accountsId to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setAccountsId(int accountsId);

    /**
     * Sets the parts of this AccountsGalaxygates. The parts field corresponds
     * to the database column kalaazu.kalaazu.accounts_galaxygates.parts.
     *
     * @param parts to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setParts(byte parts);

    /**
     * Sets the lifes of this AccountsGalaxygates. The lifes field corresponds
     * to the database column kalaazu.kalaazu.accounts_galaxygates.lifes.
     *
     * @param lifes to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setLifes(byte lifes);

    /**
     * Sets the wave of this AccountsGalaxygates. The wave field corresponds to
     * the database column kalaazu.kalaazu.accounts_galaxygates.wave.
     *
     * @param wave to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setWave(byte wave);

    /**
     * Sets the times of this AccountsGalaxygates. The times field corresponds
     * to the database column kalaazu.kalaazu.accounts_galaxygates.times.
     *
     * @param times to set of this AccountsGalaxygates
     *
     * @return this AccountsGalaxygates instance
     */
    AccountsGalaxygates setTimes(short times);

    /**
     * Queries the specified manager for the referenced Galaxygates. If no such
     * Galaxygates exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Galaxygates findGalaxygatesId(Manager<Galaxygates> foreignManager);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsGalaxygates> {

        ID("id"),
        GALAXYGATES_ID("galaxygates_id"),
        ACCOUNTS_ID("accounts_id"),
        PARTS("parts"),
        LIFES("lifes"),
        WAVE("wave"),
        TIMES("times");

        private final String columnName;

        private final TableIdentifier<AccountsGalaxygates> tableIdentifier;

        Identifier(String columnId) {
            this.columnId = columnId;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsId(),
                    getSchemaId(),
                    getTableId()
            );
        }

        @Override
        public String getDbmsId() {
            return "kalaazu";
        }

        @Override
        public String getSchemaId() {
            return "kalaazu";
        }

        @Override
        public String getTableId() {
            return "accounts_galaxygates";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<AccountsGalaxygates> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}