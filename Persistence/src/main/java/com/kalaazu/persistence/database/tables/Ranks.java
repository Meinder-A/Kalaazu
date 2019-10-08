/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.tables;


import com.kalaazu.persistence.database.Indexes;
import com.kalaazu.persistence.database.Kalaazu;
import com.kalaazu.persistence.database.Keys;
import com.kalaazu.persistence.database.records.RanksRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * Contains the rank system.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Ranks extends TableImpl<RanksRecord> {

    /**
     * The reference instance of <code>kalaazu.ranks</code>
     */
    public static final Ranks RANKS = new Ranks();
    private static final long serialVersionUID = 2102971843;
    /**
     * The column <code>kalaazu.ranks.id</code>. Primary Key.
     */
    public final TableField<RanksRecord, Byte> ID = createField(
            DSL.name("id"),
            org.jooq.impl.SQLDataType.TINYINT.nullable(false)
                                             .identity(true),
            this,
            "Primary Key."
    );
    /**
     * The column <code>kalaazu.ranks.name</code>.
     */
    public final TableField<RanksRecord, String> NAME = createField(
            DSL.name("name"),
            org.jooq.impl.SQLDataType.VARCHAR(255)
                                     .nullable(false)
                                     .defaultValue(org.jooq.impl.DSL.field(
                                             "",
                                             org.jooq.impl.SQLDataType.VARCHAR
                                     )),
            this,
            ""
    );
    /**
     * The column <code>kalaazu.ranks.percentaje</code>.
     */
    public final TableField<RanksRecord, Double> PERCENTAJE = createField(
            DSL.name("percentaje"),
            org.jooq.impl.SQLDataType.FLOAT.nullable(false)
                                           .defaultValue(org.jooq.impl.DSL.field(
                                                   "0",
                                                   org.jooq.impl.SQLDataType.FLOAT
                                           )),
            this,
            ""
    );
    /**
     * The column <code>kalaazu.ranks.is_public</code>.
     */
    public final TableField<RanksRecord, Byte> IS_PUBLIC = createField(
            DSL.name("is_public"),
            org.jooq.impl.SQLDataType.TINYINT.nullable(false)
                                             .defaultValue(org.jooq.impl.DSL.field(
                                                     "1",
                                                     org.jooq.impl.SQLDataType.TINYINT
                                             )),
            this,
            ""
    );

    /**
     * Create a <code>kalaazu.ranks</code> table reference
     */
    public Ranks() {
        this(DSL.name("ranks"), null);
    }

    /**
     * Create an aliased <code>kalaazu.ranks</code> table reference
     */
    public Ranks(String alias) {
        this(DSL.name(alias), RANKS);
    }

    /**
     * Create an aliased <code>kalaazu.ranks</code> table reference
     */
    public Ranks(Name alias) {
        this(alias, RANKS);
    }

    private Ranks(Name alias, Table<RanksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ranks(Name alias, Table<RanksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains the rank system."));
    }

    public <O extends Record> Ranks(Table<O> child, ForeignKey<O, RanksRecord> key) {
        super(child, key, RANKS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RanksRecord> getRecordType() {
        return RanksRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RANKS_PRIMARY);
    }

    @Override
    public Identity<RanksRecord, Byte> getIdentity() {
        return Keys.IDENTITY_RANKS;
    }

    @Override
    public UniqueKey<RanksRecord> getPrimaryKey() {
        return Keys.KEY_RANKS_PRIMARY;
    }

    @Override
    public List<UniqueKey<RanksRecord>> getKeys() {
        return Arrays.<UniqueKey<RanksRecord>>asList(Keys.KEY_RANKS_PRIMARY);
    }

    @Override
    public Ranks as(String alias) {
        return new Ranks(DSL.name(alias), this);
    }

    @Override
    public Ranks as(Name alias) {
        return new Ranks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ranks rename(String name) {
        return new Ranks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ranks rename(Name name) {
        return new Ranks(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Byte, String, Double, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}