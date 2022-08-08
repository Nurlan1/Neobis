package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="user_table")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String login;
    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name="role_id", referencedColumnName = "id")
    private RoleEntity roleEntity;

}
