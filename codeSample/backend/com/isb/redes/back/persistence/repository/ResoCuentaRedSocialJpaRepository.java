package com.isb.redes.back.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.isb.redes.back.persistence.entity.ResoCuentaRedSocialEntity;
/**
 *
 * Interfaz para la gestión en la BBDD de la entidad ResoCuentaRedSocial
 *
 */
@Repository("resoCuentaRedSocialRepo")
public interface ResoCuentaRedSocialJpaRepository extends 
		JpaRepository<ResoCuentaRedSocialEntity, Long>,
        JpaSpecificationExecutor<ResoCuentaRedSocialEntity> {

}