package edu.escuelaing.arep.Repositories;

import java.util.List;

import edu.escuelaing.arep.Model.Employeer;

public interface IEmployeerRepository {
    
    List<Employeer> getEmployeerList();
    Employeer saveEmployeer(Employeer employeer);
    Employeer getEmployeerByEmail(String email);
    void deleteEmployeer(int id);
    
}