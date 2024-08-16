package com.dorin.dorin.service;

import com.dorin.dorin.entities.UtilajDTO;
import com.dorin.dorin.model.Utilaj;
import com.dorin.dorin.repository.UtilajRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilajServiceImpl implements UtilajService{

    @Autowired
    private UtilajRepository utilajRepository;

    @Override
    public Utilaj saveUtilaj(Utilaj utilaj) {
        return utilajRepository.save(utilaj);
    }

    @Override
    public List<Utilaj> getAllUtilaje() {
        return utilajRepository.findAll();
    }

    @Override
    public Utilaj getUtilajById(int id) {
        return utilajRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUtilaj(int id) {
        utilajRepository.deleteById(id);
    }

    @Override
    public Utilaj updateUtilaj(Utilaj utilaj) {
        return utilajRepository.save(utilaj);
    }
    @Override
    public List<UtilajDTO> getUtilajForTable() {
        return utilajRepository.getUtilajForTable();
    }


}
