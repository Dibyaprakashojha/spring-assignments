package com.importcsvfiles.repository;

import com.importcsvfiles.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITutorialRepository extends JpaRepository<Tutorial,Integer> {
}
