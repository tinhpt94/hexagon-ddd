package com.example.infra.adapter.outbound.integration.repository.jpa;

import com.example.infra.adapter.outbound.integration.repository.jpa.entities.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, String> {
}
