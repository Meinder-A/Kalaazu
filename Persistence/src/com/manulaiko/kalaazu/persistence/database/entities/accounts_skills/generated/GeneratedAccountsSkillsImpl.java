package com.manulaiko.kalaazu.persistence.database.entities.accounts_skills.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_skills.AccountsSkills;
import com.manulaiko.kalaazu.persistence.database.entities.skilltree_levels.SkilltreeLevels;
import com.manulaiko.kalaazu.persistence.database.entities.skilltree_skills.SkilltreeSkills;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_skills.AccountsSkills}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsSkillsImpl implements AccountsSkills {
    
    private int id;
    private int accountsId;
    private int skilltreeSkillsId;
    private int skilltreeLevelsId;
    
    protected GeneratedAccountsSkillsImpl() {
        
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
    public int getSkilltreeSkillsId() {
        return skilltreeSkillsId;
    }
    
    @Override
    public int getSkilltreeLevelsId() {
        return skilltreeLevelsId;
    }
    
    @Override
    public AccountsSkills setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public AccountsSkills setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }
    
    @Override
    public AccountsSkills setSkilltreeSkillsId(int skilltreeSkillsId) {
        this.skilltreeSkillsId = skilltreeSkillsId;
        return this;
    }
    
    @Override
    public AccountsSkills setSkilltreeLevelsId(int skilltreeLevelsId) {
        this.skilltreeLevelsId = skilltreeLevelsId;
        return this;
    }
    
    @Override
    public Accounts findAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream().filter(Accounts.ID.equal(getAccountsId())).findAny().orElse(null);
    }
    
    @Override
    public SkilltreeSkills findSkilltreeSkillsId(Manager<SkilltreeSkills> foreignManager) {
        return foreignManager.stream().filter(SkilltreeSkills.ID.equal(getSkilltreeSkillsId())).findAny().orElse(null);
    }
    
    @Override
    public SkilltreeLevels findSkilltreeLevelsId(Manager<SkilltreeLevels> foreignManager) {
        return foreignManager.stream().filter(SkilltreeLevels.ID.equal(getSkilltreeLevelsId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "                + Objects.toString(getId()));
        sj.add("accountsId = "        + Objects.toString(getAccountsId()));
        sj.add("skilltreeSkillsId = " + Objects.toString(getSkilltreeSkillsId()));
        sj.add("skilltreeLevelsId = " + Objects.toString(getSkilltreeLevelsId()));
        return "AccountsSkillsImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof AccountsSkills)) { return false; }
        final AccountsSkills thatAccountsSkills = (AccountsSkills)that;
        if (this.getId() != thatAccountsSkills.getId()) {return false; }
        if (this.getAccountsId() != thatAccountsSkills.getAccountsId()) {return false; }
        if (this.getSkilltreeSkillsId() != thatAccountsSkills.getSkilltreeSkillsId()) {return false; }
        if (this.getSkilltreeLevelsId() != thatAccountsSkills.getSkilltreeLevelsId()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Integer.hashCode(getSkilltreeSkillsId());
        hash = 31 * hash + Integer.hashCode(getSkilltreeLevelsId());
        return hash;
    }
}