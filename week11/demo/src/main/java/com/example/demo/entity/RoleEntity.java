package com.example.demo.entity;

import javax.persistence.*;
import lombok.Data;
@Entity
@Table(name="role_table")
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String  name;

}
