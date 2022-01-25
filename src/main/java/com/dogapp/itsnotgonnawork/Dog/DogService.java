package com.dogapp.itsnotgonnawork.Dog;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class DogService {
    private final DogRepository dogRepository;

    public void addDog(Dog dog) {
        dogRepository.addDog(dog);
    }
    
    public List<Dog> getAllDogs() {
        return dogRepository.getAllDogs();
    }
    
}
