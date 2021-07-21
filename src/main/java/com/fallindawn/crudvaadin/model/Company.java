package com.fallindawn.crudvaadin.model;

import javax.persistence.*;

@Entity
@Table(name = "db_company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String website;

    public Company() {
    }

    public Company(Long id, String name, String website) {
        this.id = id;
        this.name = name;
        this.website = website;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }
}
