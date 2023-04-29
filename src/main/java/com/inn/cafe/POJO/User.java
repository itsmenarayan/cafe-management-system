package com.inn.cafe.POJO;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;

@Data
@DynamicInsert
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serializableID = 1L;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String contact;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String status;

    @Column
    private String role;

}
