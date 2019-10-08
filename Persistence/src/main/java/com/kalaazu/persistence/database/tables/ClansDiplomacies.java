/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.tables;


import com.kalaazu.persistence.database.Indexes;
import com.kalaazu.persistence.database.Kalaazu;
import com.kalaazu.persistence.database.Keys;
import com.kalaazu.persistence.database.records.ClansDiplomaciesRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * Diplomacy table for clans.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ClansDiplomacies extends TableImpl<ClansDiplomaciesRecord> {

    /**
     * The reference instance of <code>kalaazu.clans_diplomacies</code>
     */
    public static final ClansDiplomacies CLANS_DIPLOMACIES = new ClansDiplomacies();
    private static final long serialVersionUID = -1480046894;
    /**
     * The column <code>kalaazu.clans_diplomacies.id</code>. Primary Key.
     */
    public final TableField<ClansDiplomaciesRecord, Integer> ID = createField(
            DSL.name("id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true),
            this,
            "Primary Key."
    );
    /**
     * The column <code>kalaazu.clans_diplomacies.from_clans_id</code>. Clan that made the request.
     */
    public final TableField<ClansDiplomaciesRecord, Integer> FROM_CLANS_ID = createField(
            DSL.name("from_clans_id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false),
            this,
            "Clan that made the request."
    );
    /**
     * The column <code>kalaazu.clans_diplomacies.to_clans_id</code>. Clan that receives the request.
     */
    public final TableField<ClansDiplomaciesRecord, Integer> TO_CLANS_ID = createField(
            DSL.name("to_clans_id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false),
            this,
            "Clan that receives the request."
    );
    /**
     * The column <code>kalaazu.clans_diplomacies.date</code>. Diplomacy creation date.
     */
    public final TableField<ClansDiplomaciesRecord, Timestamp> DATE = createField(
            DSL.name("date"),
            org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
                                               .defaultValue(org.jooq.impl.DSL.field(
                                                       "CURRENT_TIMESTAMP",
                                                       org.jooq.impl.SQLDataType.TIMESTAMP
                                               )),
            this,
            "Diplomacy creation date."
    );
    /**
     * The column <code>kalaazu.clans_diplomacies.expires</code>. Date when the diplomacy expires.
     */
    public final TableField<ClansDiplomaciesRecord, Timestamp> EXPIRES = createField(
            DSL.name("expires"),
            org.jooq.impl.SQLDataType.TIMESTAMP,
            this,
            "Date when the diplomacy expires."
    );
    /**
     * The column <code>kalaazu.clans_diplomacies.status</code>. Status of the diplomacy. 0 = not accepted, 1 = accepted, 2 = rejected, 3 = over.
     */
    public final TableField<ClansDiplomaciesRecord, Byte> STATUS = createField(
            DSL.name("status"),
            org.jooq.impl.SQLDataType.TINYINT.nullable(false)
                                             .defaultValue(org.jooq.impl.DSL.field(
                                                     "0",
                                                     org.jooq.impl.SQLDataType.TINYINT
                                             )),
            this,
            "Status of the diplomacy. 0 = not accepted, 1 = accepted, 2 = rejected, 3 = over."
    );
    /**
     * The column <code>kalaazu.clans_diplomacies.type</code>. Diplomacy type. 1 = War, 2 = NAP, 3 = Alliance.
     */
    public final TableField<ClansDiplomaciesRecord, Byte> TYPE = createField(
            DSL.name("type"),
            org.jooq.impl.SQLDataType.TINYINT.nullable(false)
                                             .defaultValue(org.jooq.impl.DSL.field(
                                                     "1",
                                                     org.jooq.impl.SQLDataType.TINYINT
                                             )),
            this,
            "Diplomacy type. 1 = War, 2 = NAP, 3 = Alliance."
    );

    /**
     * Create a <code>kalaazu.clans_diplomacies</code> table reference
     */
    public ClansDiplomacies() {
        this(DSL.name("clans_diplomacies"), null);
    }

    /**
     * Create an aliased <code>kalaazu.clans_diplomacies</code> table reference
     */
    public ClansDiplomacies(String alias) {
        this(DSL.name(alias), CLANS_DIPLOMACIES);
    }

    /**
     * Create an aliased <code>kalaazu.clans_diplomacies</code> table reference
     */
    public ClansDiplomacies(Name alias) {
        this(alias, CLANS_DIPLOMACIES);
    }

    private ClansDiplomacies(Name alias, Table<ClansDiplomaciesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClansDiplomacies(Name alias, Table<ClansDiplomaciesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Diplomacy table for clans."));
    }

    public <O extends Record> ClansDiplomacies(Table<O> child, ForeignKey<O, ClansDiplomaciesRecord> key) {
        super(child, key, CLANS_DIPLOMACIES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClansDiplomaciesRecord> getRecordType() {
        return ClansDiplomaciesRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(
                Indexes.CLANS_DIPLOMACIES_CLANS_DIPLOMACIES_FROM_CLANS_ID_IDX,
                Indexes.CLANS_DIPLOMACIES_CLANS_DIPLOMACIES_TO_CLANS_ID_IDX,
                Indexes.CLANS_DIPLOMACIES_PRIMARY
        );
    }

    @Override
    public Identity<ClansDiplomaciesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLANS_DIPLOMACIES;
    }

    @Override
    public UniqueKey<ClansDiplomaciesRecord> getPrimaryKey() {
        return Keys.KEY_CLANS_DIPLOMACIES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ClansDiplomaciesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClansDiplomaciesRecord>>asList(Keys.KEY_CLANS_DIPLOMACIES_PRIMARY);
    }

    @Override
    public List<ForeignKey<ClansDiplomaciesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClansDiplomaciesRecord, ?>>asList(
                Keys.CLANS_DIPLOMACIES_FROM_CLANS,
                Keys.CLANS_DIPLOMACIES_TO_CLANS
        );
    }

    public Clans clansDiplomaciesFromClans() {
        return new Clans(this, Keys.CLANS_DIPLOMACIES_FROM_CLANS);
    }

    public Clans clansDiplomaciesToClans() {
        return new Clans(this, Keys.CLANS_DIPLOMACIES_TO_CLANS);
    }

    @Override
    public ClansDiplomacies as(String alias) {
        return new ClansDiplomacies(DSL.name(alias), this);
    }

    @Override
    public ClansDiplomacies as(Name alias) {
        return new ClansDiplomacies(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClansDiplomacies rename(String name) {
        return new ClansDiplomacies(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClansDiplomacies rename(Name name) {
        return new ClansDiplomacies(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, Timestamp, Timestamp, Byte, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}