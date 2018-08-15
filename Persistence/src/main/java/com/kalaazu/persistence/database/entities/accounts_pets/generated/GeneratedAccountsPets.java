package com.kalaazu.persistence.database.entities.accounts_pets.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsPets;
import com.kalaazu.persistence.database.entities.Levels;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * AccountsPets}-interface
 * representing entities of the {@code accounts_pets}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsPets {

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#id()} method.
     */
    IntField<AccountsPets, Integer> ID = IntField.create(
            Identifier.ID,
            AccountsPets::id,
            AccountsPets::id,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#accountsId()} method.
     */
    IntForeignKeyField<AccountsPets, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsPets::accountsId,
            AccountsPets::accountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#levelsId()} method.
     */
    ByteForeignKeyField<AccountsPets, Byte, Levels> LEVELS_ID = ByteForeignKeyField.create(
            Identifier.LEVELS_ID,
            AccountsPets::levelsId,
            AccountsPets::levelsId,
            Levels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#name()} method.
     */
    StringField<AccountsPets, String> NAME = StringField.create(
            Identifier.NAME,
            AccountsPets::name,
            AccountsPets::name,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#experience()} method.
     */
    IntField<AccountsPets, Integer> EXPERIENCE = IntField.create(
            Identifier.EXPERIENCE,
            AccountsPets::experience,
            AccountsPets::experience,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#fuel()} method.
     */
    IntField<AccountsPets, Integer> FUEL = IntField.create(
            Identifier.FUEL,
            AccountsPets::fuel,
            AccountsPets::fuel,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#health()} method.
     */
    IntField<AccountsPets, Integer> HEALTH = IntField.create(
            Identifier.HEALTH,
            AccountsPets::health,
            AccountsPets::health,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsLasersTotal()} method.
     */
    ByteField<AccountsPets, Byte> SLOTS_LASERS_TOTAL = ByteField.create(
            Identifier.SLOTS_LASERS_TOTAL,
            AccountsPets::slotsLasersTotal,
            AccountsPets::slotsLasersTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsLasersAvailable()} method.
     */
    ByteField<AccountsPets, Byte> SLOTS_LASERS_AVAILABLE = ByteField.create(
            Identifier.SLOTS_LASERS_AVAILABLE,
            AccountsPets::slotsLasersAvailable,
            AccountsPets::slotsLasersAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsGeneratorsTotal()} method.
     */
    ByteField<AccountsPets, Byte> SLOTS_GENERATORS_TOTAL = ByteField.create(
            Identifier.SLOTS_GENERATORS_TOTAL,
            AccountsPets::slotsGeneratorsTotal,
            AccountsPets::slotsGeneratorsTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsGeneratorsAvailable()}
     * method.
     */
    ByteField<AccountsPets, Byte> SLOTS_GENERATORS_AVAILABLE = ByteField.create(
            Identifier.SLOTS_GENERATORS_AVAILABLE,
            AccountsPets::slotsGeneratorsAvailable,
            AccountsPets::slotsGeneratorsAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsProtocolsTotal()} method.
     */
    ByteField<AccountsPets, Byte> SLOTS_PROTOCOLS_TOTAL = ByteField.create(
            Identifier.SLOTS_PROTOCOLS_TOTAL,
            AccountsPets::slotsProtocolsTotal,
            AccountsPets::slotsProtocolsTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsProtocolsAvailable()}
     * method.
     */
    ByteField<AccountsPets, Byte> SLOTS_PROTOCOLS_AVAILABLE = ByteField.create(
            Identifier.SLOTS_PROTOCOLS_AVAILABLE,
            AccountsPets::slotsProtocolsAvailable,
            AccountsPets::slotsProtocolsAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsGearsTotal()} method.
     */
    ByteField<AccountsPets, Byte> SLOTS_GEARS_TOTAL = ByteField.create(
            Identifier.SLOTS_GEARS_TOTAL,
            AccountsPets::slotsGearsTotal,
            AccountsPets::slotsGearsTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#slotsGearsAvailable()} method.
     */
    ByteField<AccountsPets, Byte> SLOTS_GEARS_AVAILABLE = ByteField.create(
            Identifier.SLOTS_GEARS_AVAILABLE,
            AccountsPets::slotsGearsAvailable,
            AccountsPets::slotsGearsAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this AccountsPets. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.id.
     *
     * @return the id of this AccountsPets
     */
    Integer id();

    /**
     * Returns the accountsId of this AccountsPets. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.accounts_id.
     *
     * @return the accountsId of this AccountsPets
     */
    int accountsId();

    /**
     * Returns the levelsId of this AccountsPets. The levelsId field corresponds
     * to the database column kalaazu.kalaazu.accounts_pets.levels_id.
     *
     * @return the levelsId of this AccountsPets
     */
    byte levelsId();

    /**
     * Returns the name of this AccountsPets. The name field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.name.
     *
     * @return the name of this AccountsPets
     */
    String name();

    /**
     * Returns the experience of this AccountsPets. The experience field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.experience.
     *
     * @return the experience of this AccountsPets
     */
    int experience();

    /**
     * Returns the fuel of this AccountsPets. The fuel field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.fuel.
     *
     * @return the fuel of this AccountsPets
     */
    int fuel();

    /**
     * Returns the health of this AccountsPets. The health field corresponds to
     * the database column kalaazu.kalaazu.accounts_pets.health.
     *
     * @return the health of this AccountsPets
     */
    int health();

    /**
     * Returns the slotsLasersTotal of this AccountsPets. The slotsLasersTotal
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_total.
     *
     * @return the slotsLasersTotal of this AccountsPets
     */
    byte slotsLasersTotal();

    /**
     * Returns the slotsLasersAvailable of this AccountsPets. The
     * slotsLasersAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_available.
     *
     * @return the slotsLasersAvailable of this AccountsPets
     */
    byte slotsLasersAvailable();

    /**
     * Returns the slotsGeneratorsTotal of this AccountsPets. The
     * slotsGeneratorsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_total.
     *
     * @return the slotsGeneratorsTotal of this AccountsPets
     */
    byte slotsGeneratorsTotal();

    /**
     * Returns the slotsGeneratorsAvailable of this AccountsPets. The
     * slotsGeneratorsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_available.
     *
     * @return the slotsGeneratorsAvailable of this AccountsPets
     */
    byte slotsGeneratorsAvailable();

    /**
     * Returns the slotsProtocolsTotal of this AccountsPets. The
     * slotsProtocolsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_total.
     *
     * @return the slotsProtocolsTotal of this AccountsPets
     */
    byte slotsProtocolsTotal();

    /**
     * Returns the slotsProtocolsAvailable of this AccountsPets. The
     * slotsProtocolsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_available.
     *
     * @return the slotsProtocolsAvailable of this AccountsPets
     */
    byte slotsProtocolsAvailable();

    /**
     * Returns the slotsGearsTotal of this AccountsPets. The slotsGearsTotal
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_total.
     *
     * @return the slotsGearsTotal of this AccountsPets
     */
    byte slotsGearsTotal();

    /**
     * Returns the slotsGearsAvailable of this AccountsPets. The
     * slotsGearsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_available.
     *
     * @return the slotsGearsAvailable of this AccountsPets
     */
    byte slotsGearsAvailable();

    /**
     * Sets the id of this AccountsPets. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.id.
     *
     * @param id to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets id(Integer id);

    /**
     * Sets the accountsId of this AccountsPets. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.accounts_id.
     *
     * @param accountsId to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets accountsId(int accountsId);

    /**
     * Sets the levelsId of this AccountsPets. The levelsId field corresponds to
     * the database column kalaazu.kalaazu.accounts_pets.levels_id.
     *
     * @param levelsId to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets levelsId(byte levelsId);

    /**
     * Sets the name of this AccountsPets. The name field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.name.
     *
     * @param name to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets name(String name);

    /**
     * Sets the experience of this AccountsPets. The experience field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.experience.
     *
     * @param experience to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets experience(int experience);

    /**
     * Sets the fuel of this AccountsPets. The fuel field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.fuel.
     *
     * @param fuel to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets fuel(int fuel);

    /**
     * Sets the health of this AccountsPets. The health field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.health.
     *
     * @param health to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets health(int health);

    /**
     * Sets the slotsLasersTotal of this AccountsPets. The slotsLasersTotal
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_total.
     *
     * @param slotsLasersTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsLasersTotal(byte slotsLasersTotal);

    /**
     * Sets the slotsLasersAvailable of this AccountsPets. The
     * slotsLasersAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_available.
     *
     * @param slotsLasersAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsLasersAvailable(byte slotsLasersAvailable);

    /**
     * Sets the slotsGeneratorsTotal of this AccountsPets. The
     * slotsGeneratorsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_total.
     *
     * @param slotsGeneratorsTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsGeneratorsTotal(byte slotsGeneratorsTotal);

    /**
     * Sets the slotsGeneratorsAvailable of this AccountsPets. The
     * slotsGeneratorsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_available.
     *
     * @param slotsGeneratorsAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsGeneratorsAvailable(byte slotsGeneratorsAvailable);

    /**
     * Sets the slotsProtocolsTotal of this AccountsPets. The
     * slotsProtocolsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_total.
     *
     * @param slotsProtocolsTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsProtocolsTotal(byte slotsProtocolsTotal);

    /**
     * Sets the slotsProtocolsAvailable of this AccountsPets. The
     * slotsProtocolsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_available.
     *
     * @param slotsProtocolsAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsProtocolsAvailable(byte slotsProtocolsAvailable);

    /**
     * Sets the slotsGearsTotal of this AccountsPets. The slotsGearsTotal field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_total.
     *
     * @param slotsGearsTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsGearsTotal(byte slotsGearsTotal);

    /**
     * Sets the slotsGearsAvailable of this AccountsPets. The
     * slotsGearsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_available.
     *
     * @param slotsGearsAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets slotsGearsAvailable(byte slotsGearsAvailable);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

    /**
     * Queries the specified manager for the referenced Levels. If no such
     * Levels exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Levels findLevelsId(Manager<Levels> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsPets> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        LEVELS_ID("levels_id"),
        NAME("name"),
        EXPERIENCE("experience"),
        FUEL("fuel"),
        HEALTH("health"),
        SLOTS_LASERS_TOTAL("slots_lasers_total"),
        SLOTS_LASERS_AVAILABLE("slots_lasers_available"),
        SLOTS_GENERATORS_TOTAL("slots_generators_total"),
        SLOTS_GENERATORS_AVAILABLE("slots_generators_available"),
        SLOTS_PROTOCOLS_TOTAL("slots_protocols_total"),
        SLOTS_PROTOCOLS_AVAILABLE("slots_protocols_available"),
        SLOTS_GEARS_TOTAL("slots_gears_total"),
        SLOTS_GEARS_AVAILABLE("slots_gears_available");

        private final String columnName;

        private final TableIdentifier<AccountsPets> tableIdentifier;

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
            return "accounts_pets";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsPets> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}