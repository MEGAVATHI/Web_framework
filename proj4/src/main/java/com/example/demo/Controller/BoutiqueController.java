package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Boutique;
import com.example.demo.Service.BoutiqueService;


@RestController
public class BoutiqueController {
	
	@Autowired
	private BoutiqueService btService;
	
	@PostMapping("/addBoutique")
	public String saveBoutique(@RequestBody Boutique r) {
	   btService.saveBoutique(r);
	   return "Value Added";
	}
	@GetMapping("/{pgno}/{pgsize}")
	   public List<Boutique> listing(@PathVariable("pgno")int pgno,@PathVariable("pgsize")int pgsize){
		   return btService.findall(pgno, pgsize);
	   }
	
	
	

	@GetMapping("/{id}")
	public Boutique getBoutiqueById(@PathVariable int id) {
		return btService.getBoutiqueById(id);
	}
	
	@PutMapping("/updateBoutique/{id}")
    public Boutique updateBoutiqueById(@PathVariable int id, @RequestBody Boutique r) {
        return btService.updateBoutiqueById(id, r);
    }

    @DeleteMapping("/deleteBoutique/{id}")
    public boolean deleteBoutiqueById(@PathVariable int id) {
        return btService.deleteBoutiqueById(id);
    }

}
