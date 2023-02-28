package com.example.demo.Service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Boutique;
import com.example.demo.Repository.BoutiqueRepo;


@Service
public class BoutiqueService {
	@Autowired   
	private BoutiqueRepo btRepo;
	
	//TO POST - INSERT
	public Boutique saveBoutique(Boutique r) {
		return btRepo.save(r);
	}
	
	//TO GET - READ
	public List<Boutique> findall(int pgno,int pgsize){
		PageRequest pg=PageRequest.of(pgno, pgsize);
		Page<Boutique> pageresult=btRepo.findAll(pg);
		return pageresult.toList();
	}
	
	public Boutique getBoutiqueById(int id){
		return btRepo.findById(id).orElse(null);
	}

	public Boutique updateBoutiqueById(int id, Boutique r) {
		Boutique existingBoutique = btRepo.findById(id).orElse(null);
		existingBoutique.setName(r.getName());
		existingBoutique.setPrice(r.getPrice());
		existingBoutique.setColor(r.getColor());;
        return btRepo.save(existingBoutique);
    }
	public Boutique updateBoutiqueById1(int id,Boutique r) {
		r.setId(id);
		return btRepo.saveAndFlush(r);
		
	}

    public boolean deleteBoutiqueById(int id) {
        try {
            btRepo.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}