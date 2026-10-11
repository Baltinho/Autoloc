package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.autoloc.autolocapi.domain.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
