package com.manulaiko.kalaazu.persistence.database.entities.clans_messages.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.clans.Clans;
import com.manulaiko.kalaazu.persistence.database.entities.clans_messages.ClansMessages;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.ComparableForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_messages.ClansMessages}-interface
 * representing entities of the {@code clans_messages}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansMessages {
    
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getId()} method.
     */
    IntField<ClansMessages, Integer> ID = IntField.create(
        Identifier.ID,
        ClansMessages::getId,
        ClansMessages::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getClansId()} method.
     */
    IntForeignKeyField<ClansMessages, Integer, Clans> CLANS_ID = IntForeignKeyField.create(
        Identifier.CLANS_ID,
        ClansMessages::getClansId,
        ClansMessages::setClansId,
        Clans.ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getFromAccountsId()} method.
     */
    IntForeignKeyField<ClansMessages, Integer, Accounts> FROM_ACCOUNTS_ID = IntForeignKeyField.create(
        Identifier.FROM_ACCOUNTS_ID,
        ClansMessages::getFromAccountsId,
        ClansMessages::setFromAccountsId,
        Accounts.ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getToAccountsId()} method.
     */
    ComparableForeignKeyField<ClansMessages, Integer, Integer, Accounts> TO_ACCOUNTS_ID = ComparableForeignKeyField.create(
        Identifier.TO_ACCOUNTS_ID,
        o -> OptionalUtil.unwrap(o.getToAccountsId()),
        ClansMessages::setToAccountsId,
        Accounts.ID,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getSubject()} method.
     */
    StringField<ClansMessages, String> SUBJECT = StringField.create(
        Identifier.SUBJECT,
        ClansMessages::getSubject,
        ClansMessages::setSubject,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getText()} method.
     */
    StringField<ClansMessages, String> TEXT = StringField.create(
        Identifier.TEXT,
        ClansMessages::getText,
        ClansMessages::setText,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link ClansMessages} field that can be
     * obtained using the {@link ClansMessages#getDate()} method.
     */
    ComparableField<ClansMessages, Timestamp, Timestamp> DATE = ComparableField.create(
        Identifier.DATE,
        ClansMessages::getDate,
        ClansMessages::setDate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this ClansMessages. The id field corresponds to the
     * database column kalaazu.kalaazu.clans_messages.id.
     * 
     * @return the id of this ClansMessages
     */
    int getId();
    
    /**
     * Returns the clansId of this ClansMessages. The clansId field corresponds
     * to the database column kalaazu.kalaazu.clans_messages.clans_id.
     * 
     * @return the clansId of this ClansMessages
     */
    int getClansId();
    
    /**
     * Returns the fromAccountsId of this ClansMessages. The fromAccountsId
     * field corresponds to the database column
     * kalaazu.kalaazu.clans_messages.from_accounts_id.
     * 
     * @return the fromAccountsId of this ClansMessages
     */
    int getFromAccountsId();
    
    /**
     * Returns the toAccountsId of this ClansMessages. The toAccountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_messages.to_accounts_id.
     * 
     * @return the toAccountsId of this ClansMessages
     */
    OptionalInt getToAccountsId();
    
    /**
     * Returns the subject of this ClansMessages. The subject field corresponds
     * to the database column kalaazu.kalaazu.clans_messages.subject.
     * 
     * @return the subject of this ClansMessages
     */
    String getSubject();
    
    /**
     * Returns the text of this ClansMessages. The text field corresponds to the
     * database column kalaazu.kalaazu.clans_messages.text.
     * 
     * @return the text of this ClansMessages
     */
    String getText();
    
    /**
     * Returns the date of this ClansMessages. The date field corresponds to the
     * database column kalaazu.kalaazu.clans_messages.date.
     * 
     * @return the date of this ClansMessages
     */
    Timestamp getDate();
    
    /**
     * Sets the id of this ClansMessages. The id field corresponds to the
     * database column kalaazu.kalaazu.clans_messages.id.
     * 
     * @param id to set of this ClansMessages
     * @return   this ClansMessages instance
     */
    ClansMessages setId(int id);
    
    /**
     * Sets the clansId of this ClansMessages. The clansId field corresponds to
     * the database column kalaazu.kalaazu.clans_messages.clans_id.
     * 
     * @param clansId to set of this ClansMessages
     * @return        this ClansMessages instance
     */
    ClansMessages setClansId(int clansId);
    
    /**
     * Sets the fromAccountsId of this ClansMessages. The fromAccountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_messages.from_accounts_id.
     * 
     * @param fromAccountsId to set of this ClansMessages
     * @return               this ClansMessages instance
     */
    ClansMessages setFromAccountsId(int fromAccountsId);
    
    /**
     * Sets the toAccountsId of this ClansMessages. The toAccountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_messages.to_accounts_id.
     * 
     * @param toAccountsId to set of this ClansMessages
     * @return             this ClansMessages instance
     */
    ClansMessages setToAccountsId(Integer toAccountsId);
    
    /**
     * Sets the subject of this ClansMessages. The subject field corresponds to
     * the database column kalaazu.kalaazu.clans_messages.subject.
     * 
     * @param subject to set of this ClansMessages
     * @return        this ClansMessages instance
     */
    ClansMessages setSubject(String subject);
    
    /**
     * Sets the text of this ClansMessages. The text field corresponds to the
     * database column kalaazu.kalaazu.clans_messages.text.
     * 
     * @param text to set of this ClansMessages
     * @return     this ClansMessages instance
     */
    ClansMessages setText(String text);
    
    /**
     * Sets the date of this ClansMessages. The date field corresponds to the
     * database column kalaazu.kalaazu.clans_messages.date.
     * 
     * @param date to set of this ClansMessages
     * @return     this ClansMessages instance
     */
    ClansMessages setDate(Timestamp date);
    
    /**
     * Queries the specified manager for the referenced Clans. If no such Clans
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Clans findClansId(Manager<Clans> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Accounts findFromAccountsId(Manager<Accounts> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Optional<Accounts> findToAccountsId(Manager<Accounts> foreignManager);
    
    enum Identifier implements ColumnIdentifier<ClansMessages> {
        
        ID               ("id"),
        CLANS_ID         ("clans_id"),
        FROM_ACCOUNTS_ID ("from_accounts_id"),
        TO_ACCOUNTS_ID   ("to_accounts_id"),
        SUBJECT          ("subject"),
        TEXT             ("text"),
        DATE             ("date");
        
        private final String columnName;
        private final TableIdentifier<ClansMessages> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "kalaazu";
        }
        
        @Override
        public String getSchemaName() {
            return "kalaazu";
        }
        
        @Override
        public String getTableName() {
            return "clans_messages";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<ClansMessages> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}