package com.example.AdminPage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "concerts")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String date;
    private String location;
    private String imageUrl;

    public Concert() {}

    public Concert(Long id, String name, String date, String location, String imageUrl) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.imageUrl = imageUrl;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
