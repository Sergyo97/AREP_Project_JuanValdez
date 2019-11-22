package edu.escuelaing.arep.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arep.Model.Employeer;

@Service
public interface IEmployeerService{
    List<Employeer> getEmployeerList() throws Exception;
    void saveEmployeer(Employeer employeer) throws Exception;
    Employeer getEmployeerById(int id) throws Exception;
    void deleteEmployeer(int id)throws Exception;
    
}