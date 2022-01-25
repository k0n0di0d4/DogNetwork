package com.dogapp.itsnotgonnawork.Dog;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dog")
public class Dog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dog_id")
    private Long dogId;

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private String race;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;
    
    @Column(name = "age")
    private Long age;
    
    @Column(name = "dog_age")
    private Long dogAge;
    
    
    public Long getDogId() {
        return dogId;
    }
    public void setDogId(Long dogId) {
        this.dogId = dogId;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    
    
    public LocalDateTime getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
    
    
    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }
    
    
    public Long getDogAge() {
        return dogAge;
    }
    public void setDogAge(Long dogAge) {
        this.dogAge = dogAge;
    }
}
