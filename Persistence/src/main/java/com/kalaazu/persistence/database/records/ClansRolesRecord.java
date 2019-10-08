/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.ClansRoles;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Clan's roles.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ClansRolesRecord extends UpdatableRecordImpl<ClansRolesRecord> implements Record5<Integer, String, Integer, Integer, Byte> {

    private static final long serialVersionUID = -251456222;

    /**
     * Create a detached ClansRolesRecord
     */
    public ClansRolesRecord() {
        super(ClansRoles.CLANS_ROLES);
    }

    /**
     * Create a detached, initialised ClansRolesRecord
     */
    public ClansRolesRecord(Integer id, String name, Integer clansId, Integer clansRolesId, Byte priority) {
        super(ClansRoles.CLANS_ROLES);

        set(0, id);
        set(1, name);
        set(2, clansId);
        set(3, clansRolesId);
        set(4, priority);
    }

    /**
     * Getter for <code>kalaazu.clans_roles.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.clans_roles.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.clans_roles.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kalaazu.clans_roles.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.clans_roles.clans_id</code>.
     */
    public Integer getClansId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kalaazu.clans_roles.clans_id</code>.
     */
    public void setClansId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.clans_roles.clans_roles_id</code>. Parent role.
     */
    public Integer getClansRolesId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>kalaazu.clans_roles.clans_roles_id</code>. Parent role.
     */
    public void setClansRolesId(Integer value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.clans_roles.priority</code>.
     */
    public Byte getPriority() {
        return (Byte) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.clans_roles.priority</code>.
     */
    public void setPriority(Byte value) {
        set(4, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Integer, String, Integer, Integer, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Integer, Integer, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ClansRoles.CLANS_ROLES.ID;
    }

    @Override
    public Field<String> field2() {
        return ClansRoles.CLANS_ROLES.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return ClansRoles.CLANS_ROLES.CLANS_ID;
    }

    @Override
    public Field<Integer> field4() {
        return ClansRoles.CLANS_ROLES.CLANS_ROLES_ID;
    }

    @Override
    public Field<Byte> field5() {
        return ClansRoles.CLANS_ROLES.PRIORITY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getClansId();
    }

    @Override
    public Integer component4() {
        return getClansRolesId();
    }

    @Override
    public Byte component5() {
        return getPriority();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getClansId();
    }

    @Override
    public Integer value4() {
        return getClansRolesId();
    }

    @Override
    public Byte value5() {
        return getPriority();
    }

    @Override
    public ClansRolesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ClansRolesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ClansRolesRecord value3(Integer value) {
        setClansId(value);
        return this;
    }

    @Override
    public ClansRolesRecord value4(Integer value) {
        setClansRolesId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public ClansRolesRecord value5(Byte value) {
        setPriority(value);
        return this;
    }

    @Override
    public ClansRolesRecord values(Integer value1, String value2, Integer value3, Integer value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}