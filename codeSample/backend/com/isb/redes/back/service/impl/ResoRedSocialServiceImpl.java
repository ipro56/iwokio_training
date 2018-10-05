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

import com.isb.redes.back.service.ResoRedSocialService;
import com.isb.redes.back.dto.ResoRedSocialDto;
import com.isb.redes.back.persistence.entity.ResoRedSocialEntity;
import com.isb.redes.back.dto.parser.ResoRedSocialDtoToEntity;
import com.isb.redes.back.persistence.entity.parser.ResoRedSocialEntityToDto;
import com.isb.redes.back.persistence.repository.ResoRedSocialJpaRepository;

@Component("resoRedSocialService")
public class ResoRedSocialServiceImpl implements ResoRedSocialService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	@Qualifier("resoRedSocialRepo")
	private ResoRedSocialJpaRepository resoRedSocialRepo;

	/**
     * Método que obtiene todas las ResoRedSocial existentes en BBDD
     * 
     * @return List<ResoRedSocialDto>
     */
	@Override
    public List<ResoRedSocialDto> findAll() {

		LOGGER.debug("### INI RESO_RED_SOCIALServiceImpl.findAll ###");

		List<ResoRedSocialEntity> listEnt = resoRedSocialRepo.findAll();
		List<ResoRedSocialDto> list = new ArrayList<>();

		if (listEnt != null && listEnt.size() > 0) {

			list = listEnt.stream().map(ResoRedSocialEntityToDto.INSTANCE).collect(Collectors.toCollection(ArrayList::new));
		}

		LOGGER.debug("### FIN RESO_RED_SOCIALServiceImpl.findAll ###");

		return list;
	}

	/**
	 * Obtiene un ResoRedSocial
	 * 
	 * @param idRedSocial
	 */
	@Override
	public ResoRedSocialDto findById(Long idRedSocial) {

		LOGGER.debug("### INI RESO_RED_SOCIALServiceImpl.findById ###");

		try {

			Optional<ResoRedSocialEntity> findById = resoRedSocialRepo.findById(idRedSocial);
			return findById.isPresent () ? ResoRedSocialEntityToDto.INSTANCE.apply(findById.get()) : new ResoRedSocialDto();

		} catch (EntityNotFoundException e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		} finally {
			LOGGER.debug("### FIN RESO_RED_SOCIALServiceImpl.findById ###");
		}
	}

	/**
	 * Inserta un ResoRedSocial
	 * 
	 * @param ResoRedSocialDto dto
	 *
	 * @return void
	 */
	@Override
	public void insertOrUpdate(ResoRedSocialDto dto) {

		LOGGER.debug("### FIN RESO_RED_SOCIALServiceImpl.insertOrUpdate ###");

		resoRedSocialRepo.save(ResoRedSocialDtoToEntity.INSTANCE.apply(dto));

		LOGGER.debug("### FIN RESO_RED_SOCIALServiceImpl.insertOrUpdate ###");
	}

	/**
	 * Elimina un ResoRedSocial
	 * 
	 * @param idRedSocial
	 *
	 * @return void
	 */
	@Override
	public void deleteById(Long idRedSocial) {

		LOGGER.debug("### FIN RESO_RED_SOCIALServiceImpl.deleteById ###");

		resoRedSocialRepo.deleteById(idRedSocial);

		LOGGER.debug("### FIN RESO_RED_SOCIALServiceImpl.deleteById ###");
	}
}