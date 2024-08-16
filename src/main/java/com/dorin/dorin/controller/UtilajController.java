package com.dorin.dorin.controller;

import com.dorin.dorin.entities.UtilajDTO;
import com.dorin.dorin.model.Utilaj;
import com.dorin.dorin.service.UtilajService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilaj")
@CrossOrigin
public class UtilajController {
    @Autowired
    private UtilajService utilajService;

    @PostMapping("/createUtilaj")
    public Utilaj createUtilaj(@RequestBody Utilaj utilaj) {
        return utilajService.saveUtilaj(utilaj);
    }

    @GetMapping("/getUtilaje")
    public List<Utilaj> getAllUtilaje() {
        return utilajService.getAllUtilaje();
    }

    @GetMapping("/getUtilajFromId/{id}")
    public Utilaj getUtilajFromId(@PathVariable int id){
        return utilajService.getUtilajById(id);
    }
    @GetMapping("/getUtilajForTable")
    public List<UtilajDTO> getUtilajForTable() {
        return utilajService.getUtilajForTable();
    }


    @PutMapping("/updateUtilaj")
    public Utilaj updateUtilaj(@RequestBody Utilaj utilaj){
        return utilajService.updateUtilaj(utilaj);
    }

    @DeleteMapping("/deleteUtilaj/{id}")
    public String deleteUtilaj(@PathVariable int id){
        utilajService.deleteUtilaj(id);
        return "Utilaj sters cu succes";
    }
}
