package com.kalaazu.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Accounts banks log entity.
 * ==========================
 *
 * Entity for the `accounts_banks_logs` table.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Table(name = "accounts_banks_logs", schema = "kalaazu")
@Data
public class AccountsBanksLogsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "date", nullable = false)
    private Timestamp date;

    @Basic
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private BanksLogType type = BanksLogType.WITHDRAW;

    @Basic
    @Column(name = "amount", nullable = false)
    private int amount = 0;

    @Basic
    @Column(name = "currency", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private CurrencyType currency = CurrencyType.CREDITS;

    @ManyToOne
    @JoinColumn(name = "from_accounts_id", referencedColumnName = "id", nullable = false)
    private AccountsEntity accountsByFromAccountsId;

    @ManyToOne
    @JoinColumn(name = "to_accounts_id", referencedColumnName = "id", nullable = false)
    private AccountsEntity accountsByToAccountsId;

    @ManyToOne
    @JoinColumn(name = "accounts_banks_id", referencedColumnName = "id")
    private AccountsBanksEntity accountsBanksByAccountsBanksId;
}
