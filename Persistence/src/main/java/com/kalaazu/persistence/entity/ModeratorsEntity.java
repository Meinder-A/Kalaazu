package com.kalaazu.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Moderators entity.
 * ==================
 *
 * Entity for the `moderators` table.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Table(name = "moderators", schema = "kalaazu")
@Data
public class ModeratorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private byte id;

    @Basic
    @Column(name = "date", nullable = false)
    private Timestamp date;

    @ManyToOne
    @JoinColumn(name = "accounts_id", referencedColumnName = "id", nullable = false)
    private AccountsEntity accountsByAccountsId;

    @ManyToOne
    @JoinColumn(name = "moderators_roles_id", referencedColumnName = "id", nullable = false)
    private ModeratorsRolesEntity moderatorsRoles;

    @OneToMany(mappedBy = "moderatorsByModeratorsId")
    private Collection<ModeratorsLogsEntity> moderatorsLogs;
}
