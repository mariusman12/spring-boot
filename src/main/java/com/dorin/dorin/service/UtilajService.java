package com.dorin.dorin.service;

import com.dorin.dorin.entities.UtilajDTO;
import com.dorin.dorin.model.Utilaj;
import java.util.List;

public interface UtilajService {
    public Utilaj saveUtilaj(Utilaj utilaj);
    public List<Utilaj> getAllUtilaje();
    public Utilaj getUtilajById(int id);
    public void deleteUtilaj(int id);
    public Utilaj updateUtilaj(Utilaj utilaj);
    public List<UtilajDTO> getUtilajForTable();


}
