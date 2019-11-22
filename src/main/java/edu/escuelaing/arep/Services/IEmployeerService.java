package edu.escuelaing.arep.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arep.Model.Employeer;

@Service
public interface IEmployeerService{
    List<Employeer> getEmployeerList();
    Employeer saveEmployeer(Employeer employeer);
    Employeer getEmployeerByEmail(String email);
    void deleteEmployeer(int id);
    
}