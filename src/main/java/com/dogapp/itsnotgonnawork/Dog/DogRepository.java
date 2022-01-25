package com.dogapp.itsnotgonnawork.Dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class DogRepository {
    private final EntityManager entityManager;
    
    public void addDog(Dog dog) {
        entityManager.persist(dog);
    }
    
    public void deleteDog(Dog dog) {
        entityManager.remove(dog);
    }
    
    public void updateDog(Dog dog) {
        entityManager.merge(dog);
    }
    
    public List<Dog> getAllDogs() {
        
        return entityManager.createQuery(
                "SELECT dog from Dog dog", Dog.class
        ).getResultList();
    }
}
