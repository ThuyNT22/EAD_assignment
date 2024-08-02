package org.example.salesmanagement_T2208e.service;

import org.example.salesmanagement_T2208e.entity.Manufacturer;
import org.example.salesmanagement_T2208e.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public List<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }

    public Manufacturer addManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    public Manufacturer updateManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    public void deleteManufacturer(Long id) {
        Manufacturer manufacturer = manufacturerRepository.findById(id).orElse(null);
        if (manufacturer != null && (manufacturer.getProducts() == null || manufacturer.getProducts().isEmpty())) {
            manufacturerRepository.delete(manufacturer);
        } else {
            throw new RuntimeException("Cannot delete manufacturer with existing products");
        }
    }
}
