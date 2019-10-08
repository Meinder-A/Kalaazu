/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.Events;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Contains server's events.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EventsRecord extends UpdatableRecordImpl<EventsRecord> implements Record5<Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1588638393;

    /**
     * Create a detached EventsRecord
     */
    public EventsRecord() {
        super(Events.EVENTS);
    }

    /**
     * Create a detached, initialised EventsRecord
     */
    public EventsRecord(Integer id, String name, String description, Timestamp startDate, Timestamp endDate) {
        super(Events.EVENTS);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, startDate);
        set(4, endDate);
    }

    /**
     * Getter for <code>kalaazu.events.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.events.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.events.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kalaazu.events.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.events.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>kalaazu.events.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.events.start_date</code>. Event start date.
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>kalaazu.events.start_date</code>. Event start date.
     */
    public void setStartDate(Timestamp value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.events.end_date</code>. Event end date.
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.events.end_date</code>. Event end date.
     */
    public void setEndDate(Timestamp value) {
        set(4, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Events.EVENTS.ID;
    }

    @Override
    public Field<String> field2() {
        return Events.EVENTS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Events.EVENTS.DESCRIPTION;
    }

    @Override
    public Field<Timestamp> field4() {
        return Events.EVENTS.START_DATE;
    }

    @Override
    public Field<Timestamp> field5() {
        return Events.EVENTS.END_DATE;
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
    public String component3() {
        return getDescription();
    }

    @Override
    public Timestamp component4() {
        return getStartDate();
    }

    @Override
    public Timestamp component5() {
        return getEndDate();
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
    public String value3() {
        return getDescription();
    }

    @Override
    public Timestamp value4() {
        return getStartDate();
    }

    @Override
    public Timestamp value5() {
        return getEndDate();
    }

    @Override
    public EventsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public EventsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public EventsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public EventsRecord value4(Timestamp value) {
        setStartDate(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public EventsRecord value5(Timestamp value) {
        setEndDate(value);
        return this;
    }

    @Override
    public EventsRecord values(Integer value1, String value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}