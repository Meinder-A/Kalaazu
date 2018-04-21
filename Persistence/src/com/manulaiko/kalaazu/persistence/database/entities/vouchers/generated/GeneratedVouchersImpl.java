package com.manulaiko.kalaazu.persistence.database.entities.vouchers.generated;

import com.manulaiko.kalaazu.persistence.database.entities.vouchers.Vouchers;
import com.speedment.common.annotation.GeneratedCode;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.vouchers.Vouchers}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedVouchersImpl implements Vouchers {
    
    private int id;
    private String code;
    private int limit;
    
    protected GeneratedVouchersImpl() {
        
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getCode() {
        return code;
    }
    
    @Override
    public int getLimit() {
        return limit;
    }
    
    @Override
    public Vouchers setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Vouchers setCode(String code) {
        this.code = code;
        return this;
    }
    
    @Override
    public Vouchers setLimit(int limit) {
        this.limit = limit;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "    + Objects.toString(getId()));
        sj.add("code = "  + Objects.toString(getCode()));
        sj.add("limit = " + Objects.toString(getLimit()));
        return "VouchersImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Vouchers)) { return false; }
        final Vouchers thatVouchers = (Vouchers)that;
        if (this.getId() != thatVouchers.getId()) {return false; }
        if (!Objects.equals(this.getCode(), thatVouchers.getCode())) {return false; }
        if (this.getLimit() != thatVouchers.getLimit()) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getCode());
        hash = 31 * hash + Integer.hashCode(getLimit());
        return hash;
    }
}