package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.StatutVehicule;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule create(Vehicule vehicule);

    Vehicule getById(Long id);

    List<Vehicule> getAll();

    List<Vehicule> getByStatut(StatutVehicule statut);

    Vehicule update(Long id, Vehicule vehicule);

    void delete(Long id);
}