package com.kalaazu.persistence.database.entities.accounts_skylabs.generated;

import com.kalaazu.persistence.database.entities.*;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.method.ReferenceSetter;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * AccountsSkylabs}-interface
 * representing entities of the {@code accounts_skylabs}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsSkylabs {

    /**
     * This Field corresponds to the {@link AccountsSkylabs} field that can be
     * obtained using the {@link AccountsSkylabs#id()} method.
     */
    IntField<AccountsSkylabs, Integer> ID = IntField.create(
            Identifier.ID,
            AccountsSkylabs::id,
            AccountsSkylabs::id,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsSkylabs} field that can be
     * obtained using the {@link AccountsSkylabs#accountsId()} method.
     */
    IntForeignKeyField<AccountsSkylabs, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsSkylabs::accountsId,
            AccountsSkylabs::accountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsSkylabs} field that can be
     * obtained using the {@link AccountsSkylabs#skylabModulesId()} method.
     */
    ByteForeignKeyField<AccountsSkylabs, Byte, SkylabModules> SKYLAB_MODULES_ID = ByteForeignKeyField.create(
            Identifier.SKYLAB_MODULES_ID,
            AccountsSkylabs::skylabModulesId,
            AccountsSkylabs::skylabModulesId,
            SkylabModules.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsSkylabs} field that can be
     * obtained using the {@link AccountsSkylabs#levelsId()} method.
     */
    ByteForeignKeyField<AccountsSkylabs, Byte, Levels> LEVELS_ID = ByteForeignKeyField.create(
            Identifier.LEVELS_ID,
            AccountsSkylabs::levelsId,
            AccountsSkylabs::levelsId,
            Levels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsSkylabs} field that can be
     * obtained using the {@link AccountsSkylabs#space()} method.
     */
    IntField<AccountsSkylabs, Integer> SPACE = IntField.create(
            Identifier.SPACE,
            AccountsSkylabs::space,
            AccountsSkylabs::space,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsSkylabs} field that can be
     * obtained using the {@link AccountsSkylabs#upgrade()} method.
     */
    ComparableField<AccountsSkylabs, Timestamp, Timestamp> UPGRADE = ComparableField.create(
            Identifier.UPGRADE,
            o -> OptionalUtil.unwrap(o.upgrade()),
            (ReferenceSetter<AccountsSkylabs, Timestamp>) AccountsSkylabs::upgrade,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this AccountsSkylabs. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_skylabs.id.
     *
     * @return the id of this AccountsSkylabs
     */
    Integer id();

    /**
     * Returns the accountsId of this AccountsSkylabs. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_skylabs.accounts_id.
     *
     * @return the accountsId of this AccountsSkylabs
     */
    int accountsId();

    /**
     * Returns the skylabModulesId of this AccountsSkylabs. The skylabModulesId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_skylabs.skylab_modules_id.
     *
     * @return the skylabModulesId of this AccountsSkylabs
     */
    byte skylabModulesId();

    /**
     * Returns the levelsId of this AccountsSkylabs. The levelsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_skylabs.levels_id.
     *
     * @return the levelsId of this AccountsSkylabs
     */
    byte levelsId();

    /**
     * Returns the space of this AccountsSkylabs. The space field corresponds to
     * the database column kalaazu.kalaazu.accounts_skylabs.space.
     *
     * @return the space of this AccountsSkylabs
     */
    int space();

    /**
     * Returns the upgrade of this AccountsSkylabs. The upgrade field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_skylabs.upgrade.
     *
     * @return the upgrade of this AccountsSkylabs
     */
    Optional<Timestamp> upgrade();

    /**
     * Sets the id of this AccountsSkylabs. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_skylabs.id.
     *
     * @param id to set of this AccountsSkylabs
     *
     * @return this AccountsSkylabs instance
     */
    AccountsSkylabs id(Integer id);

    /**
     * Sets the accountsId of this AccountsSkylabs. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_skylabs.accounts_id.
     *
     * @param accountsId to set of this AccountsSkylabs
     *
     * @return this AccountsSkylabs instance
     */
    AccountsSkylabs accountsId(int accountsId);

    /**
     * Sets the skylabModulesId of this AccountsSkylabs. The skylabModulesId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_skylabs.skylab_modules_id.
     *
     * @param skylabModulesId to set of this AccountsSkylabs
     *
     * @return this AccountsSkylabs instance
     */
    AccountsSkylabs skylabModulesId(byte skylabModulesId);

    /**
     * Sets the levelsId of this AccountsSkylabs. The levelsId field corresponds
     * to the database column kalaazu.kalaazu.accounts_skylabs.levels_id.
     *
     * @param levelsId to set of this AccountsSkylabs
     *
     * @return this AccountsSkylabs instance
     */
    AccountsSkylabs levelsId(byte levelsId);

    /**
     * Sets the space of this AccountsSkylabs. The space field corresponds to
     * the database column kalaazu.kalaazu.accounts_skylabs.space.
     *
     * @param space to set of this AccountsSkylabs
     *
     * @return this AccountsSkylabs instance
     */
    AccountsSkylabs space(int space);

    /**
     * Sets the upgrade of this AccountsSkylabs. The upgrade field corresponds
     * to the database column kalaazu.kalaazu.accounts_skylabs.upgrade.
     *
     * @param upgrade to set of this AccountsSkylabs
     *
     * @return this AccountsSkylabs instance
     */
    AccountsSkylabs upgrade(Timestamp upgrade);

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
     * Queries the specified manager for the referenced SkylabModules. If no
     * such SkylabModules exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    SkylabModules findSkylabModulesId(Manager<SkylabModules> foreignManager);

    /**
     * Queries the specified manager for the referenced Levels. If no such
     * Levels exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Levels findLevelsId(Manager<Levels> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsSkylabs> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        SKYLAB_MODULES_ID("skylab_modules_id"),
        LEVELS_ID("levels_id"),
        SPACE("space"),
        UPGRADE("upgrade");

        private final String columnName;

        private final TableIdentifier<AccountsSkylabs> tableIdentifier;

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
            return "accounts_skylabs";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsSkylabs> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}