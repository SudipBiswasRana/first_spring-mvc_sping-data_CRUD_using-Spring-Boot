package com.rana.mvc.base.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rana.mvc.base.entities.Donor;

@Repository
public interface DonorRepository extends JpaRepository<Donor,Long>
{
           
           
          
}
