/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.AccountsQuests;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Quest status of the account.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountsQuestsRecord extends UpdatableRecordImpl<AccountsQuestsRecord> implements Record5<Integer, Short, Integer, Byte, Timestamp> {

    private static final long serialVersionUID = 409951383;

    /**
     * Create a detached AccountsQuestsRecord
     */
    public AccountsQuestsRecord() {
        super(AccountsQuests.ACCOUNTS_QUESTS);
    }

    /**
     * Create a detached, initialised AccountsQuestsRecord
     */
    public AccountsQuestsRecord(Integer id, Short questsId, Integer accountsId, Byte isCompleted, Timestamp date) {
        super(AccountsQuests.ACCOUNTS_QUESTS);

        set(0, id);
        set(1, questsId);
        set(2, accountsId);
        set(3, isCompleted);
        set(4, date);
    }

    /**
     * Getter for <code>kalaazu.accounts_quests.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.accounts_quests.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_quests.quests_id</code>.
     */
    public Short getQuestsId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>kalaazu.accounts_quests.quests_id</code>.
     */
    public void setQuestsId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_quests.accounts_id</code>.
     */
    public Integer getAccountsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kalaazu.accounts_quests.accounts_id</code>.
     */
    public void setAccountsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_quests.is_completed</code>. Whether the quest has been completed or not.
     */
    public Byte getIsCompleted() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>kalaazu.accounts_quests.is_completed</code>. Whether the quest has been completed or not.
     */
    public void setIsCompleted(Byte value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.accounts_quests.date</code>. Date when the quest was accepted/completed.
     */
    public Timestamp getDate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.accounts_quests.date</code>. Date when the quest was accepted/completed.
     */
    public void setDate(Timestamp value) {
        set(4, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Integer, Short, Integer, Byte, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Short, Integer, Byte, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AccountsQuests.ACCOUNTS_QUESTS.ID;
    }

    @Override
    public Field<Short> field2() {
        return AccountsQuests.ACCOUNTS_QUESTS.QUESTS_ID;
    }

    @Override
    public Field<Integer> field3() {
        return AccountsQuests.ACCOUNTS_QUESTS.ACCOUNTS_ID;
    }

    @Override
    public Field<Byte> field4() {
        return AccountsQuests.ACCOUNTS_QUESTS.IS_COMPLETED;
    }

    @Override
    public Field<Timestamp> field5() {
        return AccountsQuests.ACCOUNTS_QUESTS.DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Short component2() {
        return getQuestsId();
    }

    @Override
    public Integer component3() {
        return getAccountsId();
    }

    @Override
    public Byte component4() {
        return getIsCompleted();
    }

    @Override
    public Timestamp component5() {
        return getDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Short value2() {
        return getQuestsId();
    }

    @Override
    public Integer value3() {
        return getAccountsId();
    }

    @Override
    public Byte value4() {
        return getIsCompleted();
    }

    @Override
    public Timestamp value5() {
        return getDate();
    }

    @Override
    public AccountsQuestsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsQuestsRecord value2(Short value) {
        setQuestsId(value);
        return this;
    }

    @Override
    public AccountsQuestsRecord value3(Integer value) {
        setAccountsId(value);
        return this;
    }

    @Override
    public AccountsQuestsRecord value4(Byte value) {
        setIsCompleted(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AccountsQuestsRecord value5(Timestamp value) {
        setDate(value);
        return this;
    }

    @Override
    public AccountsQuestsRecord values(Integer value1, Short value2, Integer value3, Byte value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}