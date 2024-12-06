package edu.pe.vallegrande.Reniec.repository;

import edu.pe.vallegrande.Reniec.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User,Long>{

}
