package com.kalaazu.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

/**
 * Ships entity.
 * =============
 *
 * Entity for the `ships` table.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Table(name = "ships", schema = "kalaazu")
@Data
public class ShipsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private byte id;

    @Basic
    @Column(name = "health", nullable = false)
    private int health = 0;

    @Basic
    @Column(name = "speed", nullable = false)
    private short speed = 0;

    @Basic
    @Column(name = "cargo", nullable = false)
    private short cargo = 100;

    @Basic
    @Column(name = "batteries", nullable = false)
    private short batteries = 1000;

    @Basic
    @Column(name = "rockets", nullable = false)
    private short rockets = 100;

    @Basic
    @Column(name = "lasers", nullable = false)
    private byte lasers = 1;

    @Basic
    @Column(name = "hellstorms", nullable = false)
    private byte hellstorms = 1;

    @Basic
    @Column(name = "generators", nullable = false)
    private byte generators = 1;

    @Basic
    @Column(name = "extras", nullable = false)
    private byte extras = 1;

    @Basic
    @Column(name = "gfx", nullable = false)
    private byte gfx = 0;

    @ManyToOne
    @JoinColumn(name = "items_id", referencedColumnName = "id", nullable = false)
    private ItemsEntity itemsByItemsId;

    @ManyToMany
    @JoinTable(
            name = "rewards_ships",
            joinColumns = @JoinColumn(name = "ships_id"),
            inverseJoinColumns = @JoinColumn(name = "rewards_id")
    )
    private Collection<RewardsEntity> rewards;
}
