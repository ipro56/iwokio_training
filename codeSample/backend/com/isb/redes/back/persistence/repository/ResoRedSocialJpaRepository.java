package com.isb.redes.back.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.isb.redes.back.persistence.entity.ResoRedSocialEntity;
/**
 *
 * Interfaz para la gestión en la BBDD de la entidad ResoRedSocial
 *
 */
@Repository("resoRedSocialRepo")
public interface ResoRedSocialJpaRepository extends 
		JpaRepository<ResoRedSocialEntity, Long>,
        JpaSpecificationExecutor<ResoRedSocialEntity> {

}