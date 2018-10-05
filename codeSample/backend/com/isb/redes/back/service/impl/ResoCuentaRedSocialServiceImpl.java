package com.isb.redes.back.service.impl;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

import com.isb.redes.back.service.ResoCuentaRedSocialService;
import com.isb.redes.back.dto.ResoCuentaRedSocialDto;
import com.isb.redes.back.persistence.entity.ResoCuentaRedSocialEntity;
import com.isb.redes.back.dto.parser.ResoCuentaRedSocialDtoToEntity;
import com.isb.redes.back.persistence.entity.parser.ResoCuentaRedSocialEntityToDto;
import com.isb.redes.back.persistence.repository.ResoCuentaRedSocialJpaRepository;

@Component("resoCuentaRedSocialService")
public class ResoCuentaRedSocialServiceImpl implements ResoCuentaRedSocialService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	@Qualifier("resoCuentaRedSocialRepo")
	private ResoCuentaRedSocialJpaRepository resoCuentaRedSocialRepo;

	/**
     * Método que obtiene todas las ResoCuentaRedSocial existentes en BBDD
     * 
     * @return List<ResoCuentaRedSocialDto>
     */
	@Override
    public List<ResoCuentaRedSocialDto> findAll() {

		LOGGER.debug("### INI RESO_CUENTA_RED_SOCIALServiceImpl.findAll ###");

		List<ResoCuentaRedSocialEntity> listEnt = resoCuentaRedSocialRepo.findAll();
		List<ResoCuentaRedSocialDto> list = new ArrayList<>();

		if (listEnt != null && listEnt.size() > 0) {

			list = listEnt.stream().map(ResoCuentaRedSocialEntityToDto.INSTANCE).collect(Collectors.toCollection(ArrayList::new));
		}

		LOGGER.debug("### FIN RESO_CUENTA_RED_SOCIALServiceImpl.findAll ###");

		return list;
	}

	/**
	 * Obtiene un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 */
	@Override
	public ResoCuentaRedSocialDto findById(Long idCuentaRedSocial) {

		LOGGER.debug("### INI RESO_CUENTA_RED_SOCIALServiceImpl.findById ###");

		try {

			Optional<ResoCuentaRedSocialEntity> findById = resoCuentaRedSocialRepo.findById(idCuentaRedSocial);
			return findById.isPresent () ? ResoCuentaRedSocialEntityToDto.INSTANCE.apply(findById.get()) : new ResoCuentaRedSocialDto();

		} catch (EntityNotFoundException e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		} finally {
			LOGGER.debug("### FIN RESO_CUENTA_RED_SOCIALServiceImpl.findById ###");
		}
	}

	/**
	 * Inserta un ResoCuentaRedSocial
	 * 
	 * @param ResoCuentaRedSocialDto dto
	 *
	 * @return void
	 */
	@Override
	public void insertOrUpdate(ResoCuentaRedSocialDto dto) {

		LOGGER.debug("### FIN RESO_CUENTA_RED_SOCIALServiceImpl.insertOrUpdate ###");

		resoCuentaRedSocialRepo.save(ResoCuentaRedSocialDtoToEntity.INSTANCE.apply(dto));

		LOGGER.debug("### FIN RESO_CUENTA_RED_SOCIALServiceImpl.insertOrUpdate ###");
	}

	/**
	 * Elimina un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 *
	 * @return void
	 */
	@Override
	public void deleteById(Long idCuentaRedSocial) {

		LOGGER.debug("### FIN RESO_CUENTA_RED_SOCIALServiceImpl.deleteById ###");

		resoCuentaRedSocialRepo.deleteById(idCuentaRedSocial);

		LOGGER.debug("### FIN RESO_CUENTA_RED_SOCIALServiceImpl.deleteById ###");
	}
}