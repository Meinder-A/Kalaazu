package com.manulaiko.kalaazu.persistence.database.entities.clans_news.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.clans.Clans;
import com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNews;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNews}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansNewsImpl implements ClansNews {
    
    private int id;
    private int accountsId;
    private int clansId;
    private Timestamp date;
    private String text;
    
    protected GeneratedClansNewsImpl() {
        
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public int getAccountsId() {
        return accountsId;
    }
    
    @Override
    public int getClansId() {
        return clansId;
    }
    
    @Override
    public Timestamp getDate() {
        return date;
    }
    
    @Override
    public String getText() {
        return text;
    }
    
    @Override
    public ClansNews setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public ClansNews setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }
    
    @Override
    public ClansNews setClansId(int clansId) {
        this.clansId = clansId;
        return this;
    }
    
    @Override
    public ClansNews setDate(Timestamp date) {
        this.date = date;
        return this;
    }
    
    @Override
    public ClansNews setText(String text) {
        this.text = text;
        return this;
    }
    
    @Override
    public Accounts findAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream().filter(Accounts.ID.equal(getAccountsId())).findAny().orElse(null);
    }
    
    @Override
    public Clans findClansId(Manager<Clans> foreignManager) {
        return foreignManager.stream().filter(Clans.ID.equal(getClansId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "         + Objects.toString(getId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("clansId = "    + Objects.toString(getClansId()));
        sj.add("date = "       + Objects.toString(getDate()));
        sj.add("text = "       + Objects.toString(getText()));
        return "ClansNewsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof ClansNews)) { return false; }
        final ClansNews thatClansNews = (ClansNews)that;
        if (this.getId() != thatClansNews.getId()) {return false; }
        if (this.getAccountsId() != thatClansNews.getAccountsId()) {return false; }
        if (this.getClansId() != thatClansNews.getClansId()) {return false; }
        if (!Objects.equals(this.getDate(), thatClansNews.getDate())) {return false; }
        if (!Objects.equals(this.getText(), thatClansNews.getText())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Integer.hashCode(getClansId());
        hash = 31 * hash + Objects.hashCode(getDate());
        hash = 31 * hash + Objects.hashCode(getText());
        return hash;
    }
}