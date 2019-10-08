/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.tables;


import com.kalaazu.persistence.database.Indexes;
import com.kalaazu.persistence.database.Kalaazu;
import com.kalaazu.persistence.database.Keys;
import com.kalaazu.persistence.database.records.AccountsSkylabsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * Skylab for the accounts.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountsSkylabs extends TableImpl<AccountsSkylabsRecord> {

    /**
     * The reference instance of <code>kalaazu.accounts_skylabs</code>
     */
    public static final AccountsSkylabs ACCOUNTS_SKYLABS = new AccountsSkylabs();
    private static final long serialVersionUID = -316408269;
    /**
     * The column <code>kalaazu.accounts_skylabs.id</code>. Primary Key.
     */
    public final TableField<AccountsSkylabsRecord, Integer> ID = createField(
            DSL.name("id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true),
            this,
            "Primary Key."
    );
    /**
     * The column <code>kalaazu.accounts_skylabs.accounts_id</code>. Account ID.
     */
    public final TableField<AccountsSkylabsRecord, Integer> ACCOUNTS_ID = createField(
            DSL.name("accounts_id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false),
            this,
            "Account ID."
    );
    /**
     * The column <code>kalaazu.accounts_skylabs.skylab_modules_id</code>. Module ID.
     */
    public final TableField<AccountsSkylabsRecord, Byte> SKYLAB_MODULES_ID = createField(
            DSL.name("skylab_modules_id"),
            org.jooq.impl.SQLDataType.TINYINT.nullable(false),
            this,
            "Module ID."
    );
    /**
     * The column <code>kalaazu.accounts_skylabs.levels_id</code>. Module level.
     */
    public final TableField<AccountsSkylabsRecord, Byte> LEVELS_ID = createField(
            DSL.name("levels_id"),
            org.jooq.impl.SQLDataType.TINYINT.nullable(false)
                                             .defaultValue(org.jooq.impl.DSL.field(
                                                     "1",
                                                     org.jooq.impl.SQLDataType.TINYINT
                                             )),
            this,
            "Module level."
    );
    /**
     * The column <code>kalaazu.accounts_skylabs.space</code>. Used space.
     */
    public final TableField<AccountsSkylabsRecord, Integer> SPACE = createField(
            DSL.name("space"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false)
                                             .defaultValue(org.jooq.impl.DSL.field(
                                                     "0",
                                                     org.jooq.impl.SQLDataType.INTEGER
                                             )),
            this,
            "Used space."
    );
    /**
     * The column <code>kalaazu.accounts_skylabs.upgrade</code>. Date when this module started upgrading.
     */
    public final TableField<AccountsSkylabsRecord, Timestamp> UPGRADE = createField(
            DSL.name("upgrade"),
            org.jooq.impl.SQLDataType.TIMESTAMP,
            this,
            "Date when this module started upgrading."
    );

    /**
     * Create a <code>kalaazu.accounts_skylabs</code> table reference
     */
    public AccountsSkylabs() {
        this(DSL.name("accounts_skylabs"), null);
    }

    /**
     * Create an aliased <code>kalaazu.accounts_skylabs</code> table reference
     */
    public AccountsSkylabs(String alias) {
        this(DSL.name(alias), ACCOUNTS_SKYLABS);
    }

    /**
     * Create an aliased <code>kalaazu.accounts_skylabs</code> table reference
     */
    public AccountsSkylabs(Name alias) {
        this(alias, ACCOUNTS_SKYLABS);
    }

    private AccountsSkylabs(Name alias, Table<AccountsSkylabsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountsSkylabs(Name alias, Table<AccountsSkylabsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Skylab for the accounts."));
    }

    public <O extends Record> AccountsSkylabs(Table<O> child, ForeignKey<O, AccountsSkylabsRecord> key) {
        super(child, key, ACCOUNTS_SKYLABS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountsSkylabsRecord> getRecordType() {
        return AccountsSkylabsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(
                Indexes.ACCOUNTS_SKYLABS_ACCOUNTS_SKYLABS_ACCOUNTS_ID_IDX,
                Indexes.ACCOUNTS_SKYLABS_ACCOUNTS_SKYLABS_LEVELS,
                Indexes.ACCOUNTS_SKYLABS_ACCOUNTS_SKYLABS_SKYLAB_MODULES_ID_IDX,
                Indexes.ACCOUNTS_SKYLABS_PRIMARY
        );
    }

    @Override
    public Identity<AccountsSkylabsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCOUNTS_SKYLABS;
    }

    @Override
    public UniqueKey<AccountsSkylabsRecord> getPrimaryKey() {
        return Keys.KEY_ACCOUNTS_SKYLABS_PRIMARY;
    }

    @Override
    public List<UniqueKey<AccountsSkylabsRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountsSkylabsRecord>>asList(Keys.KEY_ACCOUNTS_SKYLABS_PRIMARY);
    }

    @Override
    public List<ForeignKey<AccountsSkylabsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountsSkylabsRecord, ?>>asList(
                Keys.ACCOUNTS_SKYLABS_ACCOUNTS,
                Keys.ACCOUNTS_SKYLABS_SKYLAB_MODULES,
                Keys.ACCOUNTS_SKYLABS_LEVELS
        );
    }

    public Accounts accounts() {
        return new Accounts(this, Keys.ACCOUNTS_SKYLABS_ACCOUNTS);
    }

    public SkylabModules skylabModules() {
        return new SkylabModules(this, Keys.ACCOUNTS_SKYLABS_SKYLAB_MODULES);
    }

    public Levels levels() {
        return new Levels(this, Keys.ACCOUNTS_SKYLABS_LEVELS);
    }

    @Override
    public AccountsSkylabs as(String alias) {
        return new AccountsSkylabs(DSL.name(alias), this);
    }

    @Override
    public AccountsSkylabs as(Name alias) {
        return new AccountsSkylabs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountsSkylabs rename(String name) {
        return new AccountsSkylabs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountsSkylabs rename(Name name) {
        return new AccountsSkylabs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Byte, Byte, Integer, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}