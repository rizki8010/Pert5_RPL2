package com.mycompany.pert5_51422467.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.pert5_51422467.model.ModelMahasiswa;

@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {
}
