/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.ServerLogs;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Server fired events.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ServerLogsRecord extends UpdatableRecordImpl<ServerLogsRecord> implements Record5<Integer, Timestamp, String, String, String> {

    private static final long serialVersionUID = 56098854;

    /**
     * Create a detached ServerLogsRecord
     */
    public ServerLogsRecord() {
        super(ServerLogs.SERVER_LOGS);
    }

    /**
     * Create a detached, initialised ServerLogsRecord
     */
    public ServerLogsRecord(Integer id, Timestamp date, String level, String type, String context) {
        super(ServerLogs.SERVER_LOGS);

        set(0, id);
        set(1, date);
        set(2, level);
        set(3, type);
        set(4, context);
    }

    /**
     * Getter for <code>kalaazu.server_logs.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.server_logs.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.server_logs.date</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>kalaazu.server_logs.date</code>.
     */
    public void setDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.server_logs.level</code>. Log level (emergency, alert, critical, error, warning, notice, info, debug)
     */
    public String getLevel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>kalaazu.server_logs.level</code>. Log level (emergency, alert, critical, error, warning, notice, info, debug)
     */
    public void setLevel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.server_logs.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kalaazu.server_logs.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.server_logs.context</code>.
     */
    public String getContext() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.server_logs.context</code>.
     */
    public void setContext(String value) {
        set(4, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Integer, Timestamp, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Timestamp, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ServerLogs.SERVER_LOGS.ID;
    }

    @Override
    public Field<Timestamp> field2() {
        return ServerLogs.SERVER_LOGS.DATE;
    }

    @Override
    public Field<String> field3() {
        return ServerLogs.SERVER_LOGS.LEVEL;
    }

    @Override
    public Field<String> field4() {
        return ServerLogs.SERVER_LOGS.TYPE;
    }

    @Override
    public Field<String> field5() {
        return ServerLogs.SERVER_LOGS.CONTEXT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Timestamp component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getLevel();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getContext();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Timestamp value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getLevel();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getContext();
    }

    @Override
    public ServerLogsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ServerLogsRecord value2(Timestamp value) {
        setDate(value);
        return this;
    }

    @Override
    public ServerLogsRecord value3(String value) {
        setLevel(value);
        return this;
    }

    @Override
    public ServerLogsRecord value4(String value) {
        setType(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public ServerLogsRecord value5(String value) {
        setContext(value);
        return this;
    }

    @Override
    public ServerLogsRecord values(Integer value1, Timestamp value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}