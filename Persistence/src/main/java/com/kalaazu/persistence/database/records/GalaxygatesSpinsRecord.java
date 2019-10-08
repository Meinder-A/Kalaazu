/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.GalaxygatesSpins;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Spins from the galaxy gate.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GalaxygatesSpinsRecord extends UpdatableRecordImpl<GalaxygatesSpinsRecord> implements Record5<Byte, Byte, Double, Short, Short> {

    private static final long serialVersionUID = 1541891525;

    /**
     * Create a detached GalaxygatesSpinsRecord
     */
    public GalaxygatesSpinsRecord() {
        super(GalaxygatesSpins.GALAXYGATES_SPINS);
    }

    /**
     * Create a detached, initialised GalaxygatesSpinsRecord
     */
    public GalaxygatesSpinsRecord(Byte id, Byte type, Double probability, Short itemsId, Short amount) {
        super(GalaxygatesSpins.GALAXYGATES_SPINS);

        set(0, id);
        set(1, type);
        set(2, probability);
        set(3, itemsId);
        set(4, amount);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_spins.id</code>. Primary Key.
     */
    public Byte getId() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_spins.id</code>. Primary Key.
     */
    public void setId(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_spins.type</code>. Type from `galaxygates_probabilities`
     */
    public Byte getType() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_spins.type</code>. Type from `galaxygates_probabilities`
     */
    public void setType(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_spins.probability</code>.
     */
    public Double getProbability() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_spins.probability</code>.
     */
    public void setProbability(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_spins.items_id</code>.
     */
    public Short getItemsId() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_spins.items_id</code>.
     */
    public void setItemsId(Short value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.galaxygates_spins.amount</code>.
     */
    public Short getAmount() {
        return (Short) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.galaxygates_spins.amount</code>.
     */
    public void setAmount(Short value) {
        set(4, value);
    }

    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Byte, Byte, Double, Short, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Byte, Byte, Double, Short, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Byte> field1() {
        return GalaxygatesSpins.GALAXYGATES_SPINS.ID;
    }

    @Override
    public Field<Byte> field2() {
        return GalaxygatesSpins.GALAXYGATES_SPINS.TYPE;
    }

    @Override
    public Field<Double> field3() {
        return GalaxygatesSpins.GALAXYGATES_SPINS.PROBABILITY;
    }

    @Override
    public Field<Short> field4() {
        return GalaxygatesSpins.GALAXYGATES_SPINS.ITEMS_ID;
    }

    @Override
    public Field<Short> field5() {
        return GalaxygatesSpins.GALAXYGATES_SPINS.AMOUNT;
    }

    @Override
    public Byte component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getType();
    }

    @Override
    public Double component3() {
        return getProbability();
    }

    @Override
    public Short component4() {
        return getItemsId();
    }

    @Override
    public Short component5() {
        return getAmount();
    }

    @Override
    public Byte value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getType();
    }

    @Override
    public Double value3() {
        return getProbability();
    }

    @Override
    public Short value4() {
        return getItemsId();
    }

    @Override
    public Short value5() {
        return getAmount();
    }

    @Override
    public GalaxygatesSpinsRecord value1(Byte value) {
        setId(value);
        return this;
    }

    @Override
    public GalaxygatesSpinsRecord value2(Byte value) {
        setType(value);
        return this;
    }

    @Override
    public GalaxygatesSpinsRecord value3(Double value) {
        setProbability(value);
        return this;
    }

    @Override
    public GalaxygatesSpinsRecord value4(Short value) {
        setItemsId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public GalaxygatesSpinsRecord value5(Short value) {
        setAmount(value);
        return this;
    }

    @Override
    public GalaxygatesSpinsRecord values(Byte value1, Byte value2, Double value3, Short value4, Short value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}