package com.kalaazu.persistence.database.entities.accounts_rankings.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsRankings;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * AccountsRankings}-interface
 * representing entities of the {@code accounts_rankings}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsRankings {

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getId()} method.
     */
    IntField<AccountsRankings, Integer>                     ID                  = IntField.create(
            Identifier.ID,
            AccountsRankings::getId,
            AccountsRankings::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsRankings, Integer, Accounts> ACCOUNTS_ID         = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsRankings::getAccountsId,
            AccountsRankings::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getPoints()} method.
     */
    IntField<AccountsRankings, Integer>                     POINTS              = IntField.create(
            Identifier.POINTS,
            AccountsRankings::getPoints,
            AccountsRankings::setPoints,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getBestPoints()} method.
     */
    IntField<AccountsRankings, Integer>                     BEST_POINTS         = IntField.create(
            Identifier.BEST_POINTS,
            AccountsRankings::getBestPoints,
            AccountsRankings::setBestPoints,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getDestroyedAllies()} method.
     */
    ShortField<AccountsRankings, Short>                     DESTROYED_ALLIES    = ShortField.create(
            Identifier.DESTROYED_ALLIES,
            AccountsRankings::getDestroyedAllies,
            AccountsRankings::setDestroyedAllies,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getDestroyedPhoenix()} method.
     */
    ShortField<AccountsRankings, Short>                     DESTROYED_PHOENIX   = ShortField.create(
            Identifier.DESTROYED_PHOENIX,
            AccountsRankings::getDestroyedPhoenix,
            AccountsRankings::setDestroyedPhoenix,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getDestroyedTimes()} method.
     */
    ShortField<AccountsRankings, Short>                     DESTROYED_TIMES     = ShortField.create(
            Identifier.DESTROYED_TIMES,
            AccountsRankings::getDestroyedTimes,
            AccountsRankings::setDestroyedTimes,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsRankings} field that can be
     * obtained using the {@link AccountsRankings#getDestroyedRadiation()}
     * method.
     */
    ShortField<AccountsRankings, Short>                     DESTROYED_RADIATION = ShortField.create(
            Identifier.DESTROYED_RADIATION,
            AccountsRankings::getDestroyedRadiation,
            AccountsRankings::setDestroyedRadiation,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this AccountsRankings. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_rankings.id.
     *
     * @return the id of this AccountsRankings
     */
    Integer getId();

    /**
     * Returns the accountsId of this AccountsRankings. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.accounts_id.
     *
     * @return the accountsId of this AccountsRankings
     */
    int getAccountsId();

    /**
     * Returns the points of this AccountsRankings. The points field corresponds
     * to the database column kalaazu.kalaazu.accounts_rankings.points.
     *
     * @return the points of this AccountsRankings
     */
    int getPoints();

    /**
     * Returns the bestPoints of this AccountsRankings. The bestPoints field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.best_points.
     *
     * @return the bestPoints of this AccountsRankings
     */
    int getBestPoints();

    /**
     * Returns the destroyedAllies of this AccountsRankings. The destroyedAllies
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_allies.
     *
     * @return the destroyedAllies of this AccountsRankings
     */
    short getDestroyedAllies();

    /**
     * Returns the destroyedPhoenix of this AccountsRankings. The
     * destroyedPhoenix field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_phoenix.
     *
     * @return the destroyedPhoenix of this AccountsRankings
     */
    short getDestroyedPhoenix();

    /**
     * Returns the destroyedTimes of this AccountsRankings. The destroyedTimes
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_times.
     *
     * @return the destroyedTimes of this AccountsRankings
     */
    short getDestroyedTimes();

    /**
     * Returns the destroyedRadiation of this AccountsRankings. The
     * destroyedRadiation field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_radiation.
     *
     * @return the destroyedRadiation of this AccountsRankings
     */
    short getDestroyedRadiation();

    /**
     * Sets the id of this AccountsRankings. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_rankings.id.
     *
     * @param id to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setId(int id);

    /**
     * Sets the accountsId of this AccountsRankings. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.accounts_id.
     *
     * @param accountsId to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setAccountsId(int accountsId);

    /**
     * Sets the points of this AccountsRankings. The points field corresponds to
     * the database column kalaazu.kalaazu.accounts_rankings.points.
     *
     * @param points to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setPoints(int points);

    /**
     * Sets the bestPoints of this AccountsRankings. The bestPoints field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.best_points.
     *
     * @param bestPoints to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setBestPoints(int bestPoints);

    /**
     * Sets the destroyedAllies of this AccountsRankings. The destroyedAllies
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_allies.
     *
     * @param destroyedAllies to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setDestroyedAllies(short destroyedAllies);

    /**
     * Sets the destroyedPhoenix of this AccountsRankings. The destroyedPhoenix
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_phoenix.
     *
     * @param destroyedPhoenix to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setDestroyedPhoenix(short destroyedPhoenix);

    /**
     * Sets the destroyedTimes of this AccountsRankings. The destroyedTimes
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_times.
     *
     * @param destroyedTimes to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setDestroyedTimes(short destroyedTimes);

    /**
     * Sets the destroyedRadiation of this AccountsRankings. The
     * destroyedRadiation field corresponds to the database column
     * kalaazu.kalaazu.accounts_rankings.destroyed_radiation.
     *
     * @param destroyedRadiation to set of this AccountsRankings
     *
     * @return this AccountsRankings instance
     */
    AccountsRankings setDestroyedRadiation(short destroyedRadiation);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsRankings> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        POINTS("points"),
        BEST_POINTS("best_points"),
        DESTROYED_ALLIES("destroyed_allies"),
        DESTROYED_PHOENIX("destroyed_phoenix"),
        DESTROYED_TIMES("destroyed_times"),
        DESTROYED_RADIATION("destroyed_radiation");

        private final String                            columnName;

        private final TableIdentifier<AccountsRankings> tableIdentifier;

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
            return "accounts_rankings";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsRankings> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}