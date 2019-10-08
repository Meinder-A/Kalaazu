/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.AccountsMessages;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Messaging system.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountsMessagesRecord extends UpdatableRecordImpl<AccountsMessagesRecord> implements Record8<Integer, Integer, Byte, Integer, Byte, Timestamp, String, String> {

    private static final long serialVersionUID = -1863473987;

    /**
     * Create a detached AccountsMessagesRecord
     */
    public AccountsMessagesRecord() {
        super(AccountsMessages.ACCOUNTS_MESSAGES);
    }

    /**
     * Create a detached, initialised AccountsMessagesRecord
     */
    public AccountsMessagesRecord(
            Integer id, Integer fromAccountsId, Byte fromStatus, Integer toAccountsId, Byte toStatus, Timestamp date,
            String title, String text
    ) {
        super(AccountsMessages.ACCOUNTS_MESSAGES);

        set(0, id);
        set(1, fromAccountsId);
        set(2, fromStatus);
        set(3, toAccountsId);
        set(4, toStatus);
        set(5, date);
        set(6, title);
        set(7, text);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.from_accounts_id</code>.
     */
    public Integer getFromAccountsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.from_accounts_id</code>.
     */
    public void setFromAccountsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.from_status</code>. 0 = unread, 1 = read, 2 = deleted.
     */
    public Byte getFromStatus() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.from_status</code>. 0 = unread, 1 = read, 2 = deleted.
     */
    public void setFromStatus(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.to_accounts_id</code>.
     */
    public Integer getToAccountsId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.to_accounts_id</code>.
     */
    public void setToAccountsId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.to_status</code>. 0 = unread, 1 = read, 2 = unread.
     */
    public Byte getToStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.to_status</code>. 0 = unread, 1 = read, 2 = unread.
     */
    public void setToStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.date</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.date</code>.
     */
    public void setDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_messages.title</code>.
     */
    public String getTitle() {
        return (String) get(6);
    }

    /**
     * Setter for <code>kalaazu.accounts_messages.title</code>.
     */
    public void setTitle(String value) {
        set(6, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.accounts_messages.text</code>.
     */
    public String getText() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.accounts_messages.text</code>.
     */
    public void setText(String value) {
        set(7, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row8<Integer, Integer, Byte, Integer, Byte, Timestamp, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Byte, Integer, Byte, Timestamp, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AccountsMessages.ACCOUNTS_MESSAGES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AccountsMessages.ACCOUNTS_MESSAGES.FROM_ACCOUNTS_ID;
    }

    @Override
    public Field<Byte> field3() {
        return AccountsMessages.ACCOUNTS_MESSAGES.FROM_STATUS;
    }

    @Override
    public Field<Integer> field4() {
        return AccountsMessages.ACCOUNTS_MESSAGES.TO_ACCOUNTS_ID;
    }

    @Override
    public Field<Byte> field5() {
        return AccountsMessages.ACCOUNTS_MESSAGES.TO_STATUS;
    }

    @Override
    public Field<Timestamp> field6() {
        return AccountsMessages.ACCOUNTS_MESSAGES.DATE;
    }

    @Override
    public Field<String> field7() {
        return AccountsMessages.ACCOUNTS_MESSAGES.TITLE;
    }

    @Override
    public Field<String> field8() {
        return AccountsMessages.ACCOUNTS_MESSAGES.TEXT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getFromAccountsId();
    }

    @Override
    public Byte component3() {
        return getFromStatus();
    }

    @Override
    public Integer component4() {
        return getToAccountsId();
    }

    @Override
    public Byte component5() {
        return getToStatus();
    }

    @Override
    public Timestamp component6() {
        return getDate();
    }

    @Override
    public String component7() {
        return getTitle();
    }

    @Override
    public String component8() {
        return getText();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getFromAccountsId();
    }

    @Override
    public Byte value3() {
        return getFromStatus();
    }

    @Override
    public Integer value4() {
        return getToAccountsId();
    }

    @Override
    public Byte value5() {
        return getToStatus();
    }

    @Override
    public Timestamp value6() {
        return getDate();
    }

    @Override
    public String value7() {
        return getTitle();
    }

    @Override
    public String value8() {
        return getText();
    }

    @Override
    public AccountsMessagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord value2(Integer value) {
        setFromAccountsId(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord value3(Byte value) {
        setFromStatus(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord value4(Integer value) {
        setToAccountsId(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord value5(Byte value) {
        setToStatus(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord value6(Timestamp value) {
        setDate(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord value7(String value) {
        setTitle(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AccountsMessagesRecord value8(String value) {
        setText(value);
        return this;
    }

    @Override
    public AccountsMessagesRecord values(
            Integer value1, Integer value2, Byte value3, Integer value4, Byte value5, Timestamp value6, String value7,
            String value8
    ) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }
}