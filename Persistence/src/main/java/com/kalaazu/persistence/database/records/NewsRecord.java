/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.records;


import com.kalaazu.persistence.database.tables.News;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Server news.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class NewsRecord extends UpdatableRecordImpl<NewsRecord> implements Record6<Short, Timestamp, String, String, String, String> {

    private static final long serialVersionUID = -1399839664;

    /**
     * Create a detached NewsRecord
     */
    public NewsRecord() {
        super(News.NEWS);
    }

    /**
     * Create a detached, initialised NewsRecord
     */
    public NewsRecord(Short id, Timestamp date, String image, String title, String teaser, String text) {
        super(News.NEWS);

        set(0, id);
        set(1, date);
        set(2, image);
        set(3, title);
        set(4, teaser);
        set(5, text);
    }

    /**
     * Getter for <code>kalaazu.news.id</code>. Primary Key.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>kalaazu.news.id</code>. Primary Key.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.news.date</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>kalaazu.news.date</code>.
     */
    public void setDate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.news.image</code>.
     */
    public String getImage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>kalaazu.news.image</code>.
     */
    public void setImage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.news.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kalaazu.news.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.news.teaser</code>.
     */
    public String getTeaser() {
        return (String) get(4);
    }

    /**
     * Setter for <code>kalaazu.news.teaser</code>.
     */
    public void setTeaser(String value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.news.text</code>.
     */
    public String getText() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.news.text</code>.
     */
    public void setText(String value) {
        set(5, value);
    }

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    @Override
    public Row6<Short, Timestamp, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Short, Timestamp, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return News.NEWS.ID;
    }

    @Override
    public Field<Timestamp> field2() {
        return News.NEWS.DATE;
    }

    @Override
    public Field<String> field3() {
        return News.NEWS.IMAGE;
    }

    @Override
    public Field<String> field4() {
        return News.NEWS.TITLE;
    }

    @Override
    public Field<String> field5() {
        return News.NEWS.TEASER;
    }

    @Override
    public Field<String> field6() {
        return News.NEWS.TEXT;
    }

    @Override
    public Short component1() {
        return getId();
    }

    @Override
    public Timestamp component2() {
        return getDate();
    }

    @Override
    public String component3() {
        return getImage();
    }

    @Override
    public String component4() {
        return getTitle();
    }

    @Override
    public String component5() {
        return getTeaser();
    }

    @Override
    public String component6() {
        return getText();
    }

    @Override
    public Short value1() {
        return getId();
    }

    @Override
    public Timestamp value2() {
        return getDate();
    }

    @Override
    public String value3() {
        return getImage();
    }

    @Override
    public String value4() {
        return getTitle();
    }

    @Override
    public String value5() {
        return getTeaser();
    }

    @Override
    public String value6() {
        return getText();
    }

    @Override
    public NewsRecord value1(Short value) {
        setId(value);
        return this;
    }

    @Override
    public NewsRecord value2(Timestamp value) {
        setDate(value);
        return this;
    }

    @Override
    public NewsRecord value3(String value) {
        setImage(value);
        return this;
    }

    @Override
    public NewsRecord value4(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public NewsRecord value5(String value) {
        setTeaser(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public NewsRecord value6(String value) {
        setText(value);
        return this;
    }

    @Override
    public NewsRecord values(
            Short value1, Timestamp value2, String value3, String value4, String value5, String value6
    ) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}