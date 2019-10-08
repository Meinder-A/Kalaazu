/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.SkilltreeUnlocks;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Requisites needed to unlock a skill upgrade.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SkilltreeUnlocksRecord extends UpdatableRecordImpl<SkilltreeUnlocksRecord> implements Record3<Short, Short, Short> {

    private static final long serialVersionUID = 1821106024;

    /**
     * Create a detached SkilltreeUnlocksRecord
     */
    public SkilltreeUnlocksRecord() {
        super(SkilltreeUnlocks.SKILLTREE_UNLOCKS);
    }

    /**
     * Create a detached, initialised SkilltreeUnlocksRecord
     */
    public SkilltreeUnlocksRecord(Short id, Short upgradeSkilltreeLevelsId, Short requiredSkilltreeLevelsId) {
        super(SkilltreeUnlocks.SKILLTREE_UNLOCKS);

        set(0, id);
        set(1, upgradeSkilltreeLevelsId);
        set(2, requiredSkilltreeLevelsId);
    }

    /**
     * Getter for <code>kalaazu.skilltree_unlocks.id</code>. Primary Key.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>kalaazu.skilltree_unlocks.id</code>. Primary Key.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.skilltree_unlocks.upgrade_skilltree_levels_id</code>. Skill to upgrade.
     */
    public Short getUpgradeSkilltreeLevelsId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>kalaazu.skilltree_unlocks.upgrade_skilltree_levels_id</code>. Skill to upgrade.
     */
    public void setUpgradeSkilltreeLevelsId(Short value) {
        set(1, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.skilltree_unlocks.required_skilltree_levels_id</code>. Required skill level to upgrade.
     */
    public Short getRequiredSkilltreeLevelsId() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.skilltree_unlocks.required_skilltree_levels_id</code>. Required skill level to upgrade.
     */
    public void setRequiredSkilltreeLevelsId(Short value) {
        set(2, value);
    }

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    @Override
    public Row3<Short, Short, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Short, Short, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return SkilltreeUnlocks.SKILLTREE_UNLOCKS.ID;
    }

    @Override
    public Field<Short> field2() {
        return SkilltreeUnlocks.SKILLTREE_UNLOCKS.UPGRADE_SKILLTREE_LEVELS_ID;
    }

    @Override
    public Field<Short> field3() {
        return SkilltreeUnlocks.SKILLTREE_UNLOCKS.REQUIRED_SKILLTREE_LEVELS_ID;
    }

    @Override
    public Short component1() {
        return getId();
    }

    @Override
    public Short component2() {
        return getUpgradeSkilltreeLevelsId();
    }

    @Override
    public Short component3() {
        return getRequiredSkilltreeLevelsId();
    }

    @Override
    public Short value1() {
        return getId();
    }

    @Override
    public Short value2() {
        return getUpgradeSkilltreeLevelsId();
    }

    @Override
    public Short value3() {
        return getRequiredSkilltreeLevelsId();
    }

    @Override
    public SkilltreeUnlocksRecord value1(Short value) {
        setId(value);
        return this;
    }

    @Override
    public SkilltreeUnlocksRecord value2(Short value) {
        setUpgradeSkilltreeLevelsId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public SkilltreeUnlocksRecord value3(Short value) {
        setRequiredSkilltreeLevelsId(value);
        return this;
    }

    @Override
    public SkilltreeUnlocksRecord values(Short value1, Short value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }
}