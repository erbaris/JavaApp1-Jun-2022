package org.csystem.app.service.animalhospital.animal.controller;

import org.csystem.app.service.animalhospital.animal.dto.AnimalsDTO;
import org.csystem.app.service.animalhospital.animal.service.AnimalAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/animals")
public class AnimalController {
    private final AnimalAppService m_animalAppService;

    public AnimalController(AnimalAppService animalAppService)
    {
        m_animalAppService = animalAppService;
    }

    @GetMapping("contains/sterile/name")
    public AnimalsDTO findByNameContainsAndSterile(@RequestParam("n") String name)
    {
        return m_animalAppService.findAnimalsByNamContainsAndSterile(name);
    }
}
