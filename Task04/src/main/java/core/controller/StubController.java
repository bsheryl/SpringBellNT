package core.controller;

import core.generators.AnimalsGenerator;
import core.models.Animal;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stubs")
public class StubController {
    @Autowired
    AnimalsGenerator animalsGenerator;

    @GetMapping("/animals")
    public List<Animal> getAnimals(@RequestParam Long length) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < length; ++i) {
            animals.add(
                    (Animal) animalsGenerator.generate()
            );
        }
        return animals;
    }

    @PutMapping("/animal/new")
    public String newAnimal(@RequestParam String type, @RequestParam String name, @RequestParam Integer age) {
        JSONObject jsonObject = new JSONObject(new Animal());
        jsonObject.put("type", type);
        jsonObject.put("name", name);
        jsonObject.put("age", age);
        return jsonObject.toString();
    }
}
