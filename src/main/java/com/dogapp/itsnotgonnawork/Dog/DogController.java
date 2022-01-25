package com.dogapp.itsnotgonnawork.Dog;

import com.dogapp.itsnotgonnawork.ResponseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/api/dogs")
@RequiredArgsConstructor
public class DogController {
    private final DogService dogService;
    
    @PostMapping("/addDog")
    public ResponseEntity addDog(@RequestBody Dog dog) {
        dogService.addDog(dog);
        return new ResponseEntity(
                new ResponseMessage("Dog successfully added!"), HttpStatus.OK
        );
    }
    
    
    @GetMapping(value = "/getAllDogs")
    public ResponseEntity<List<Dog>> getAllDogs(Model model) { 
        List<Dog> allDogs = dogService.getAllDogs();
        model.addAttribute("allDogs", allDogs);
        return ResponseEntity.ok(allDogs);
    }
}
