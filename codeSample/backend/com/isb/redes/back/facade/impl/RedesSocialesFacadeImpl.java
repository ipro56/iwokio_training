package com.isb.redes.back.facade.impl;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.isb.redes.back.facade.RedesSocialesFacade;
import com.isb.redes.back.dto.ResoCuentaRedSocialDto;
import com.isb.redes.back.service.ResoCuentaRedSocialService;

import com.isb.redes.back.dto.ResoRedSocialDto;
import com.isb.redes.back.service.ResoRedSocialService;

@Component("redesSocialesFacade")
public class RedesSocialesFacadeImpl implements RedesSocialesFacade {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	@Qualifier("resoCuentaRedSocialService")
	private ResoCuentaRedSocialService resoCuentaRedSocialService;

	@Autowired
	@Qualifier("resoRedSocialService")
	private ResoRedSocialService resoRedSocialService;

	/**
     * Método que obtiene todas las ResoCuentaRedSocial existentes en BBDD
     * 
     * @return List<ResoCuentaRedSocialDto>
     */
	@Override
	@Transactional
    public List<ResoCuentaRedSocialDto> findAllResoCuentaRedSocial() {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.findAllResoCuentaRedSocial ###");

		List<ResoCuentaRedSocialDto> list = resoCuentaRedSocialService.findAll();

		LOGGER.debug("### FIN RedesSocialesFacadeImpl.findAllResoCuentaRedSocial ###");

		return list;
	}

	/**
	 * Obtiene un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 */
	@Override
	@Transactional
	public ResoCuentaRedSocialDto findResoCuentaRedSocialById(Long idCuentaRedSocial) {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.findResoCuentaRedSocialById ###");

		final ResoCuentaRedSocialDto dto = resoCuentaRedSocialService.findById(idCuentaRedSocial); 

		LOGGER.debug("### FIN RedesSocialesFacadeImpl.findResoCuentaRedSocialById ###");

		return dto;
	}

	/**
	 * Inserta un ResoCuentaRedSocial
	 * 
	 * @param ResoCuentaRedSocialDto dto
	 *
	 * @return void
	 */
	@Override
	@Transactional
	public void insertOrUpdateResoCuentaRedSocial(ResoCuentaRedSocialDto dto) {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.insertOrUpdateResoCuentaRedSocial ###");

		resoCuentaRedSocialService.insertOrUpdate(dto);

		LOGGER.debug("### FIN RedesSocialesFacadeImpl.insertOrUpdateResoCuentaRedSocial ###");
	}

	/**
	 * Elimina un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 *
	 * @return void
	 */
	@Override
	@Transactional
	public void deleteResoCuentaRedSocialById(Long idCuentaRedSocial) {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.deleteResoCuentaRedSocialById ###");

		resoCuentaRedSocialService.deleteById(idCuentaRedSocial);

		LOGGER.debug("### INI RedesSocialesFacadeImpl.deleteResoCuentaRedSocialById ###");
	}
	/**
     * Método que obtiene todas las ResoRedSocial existentes en BBDD
     * 
     * @return List<ResoRedSocialDto>
     */
	@Override
	@Transactional
    public List<ResoRedSocialDto> findAllResoRedSocial() {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.findAllResoRedSocial ###");

		List<ResoRedSocialDto> list = resoRedSocialService.findAll();

		LOGGER.debug("### FIN RedesSocialesFacadeImpl.findAllResoRedSocial ###");

		return list;
	}

	/**
	 * Obtiene un ResoRedSocial
	 * 
	 * @param idRedSocial
	 */
	@Override
	@Transactional
	public ResoRedSocialDto findResoRedSocialById(Long idRedSocial) {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.findResoRedSocialById ###");

		final ResoRedSocialDto dto = resoRedSocialService.findById(idRedSocial); 

		LOGGER.debug("### FIN RedesSocialesFacadeImpl.findResoRedSocialById ###");

		return dto;
	}

	/**
	 * Inserta un ResoRedSocial
	 * 
	 * @param ResoRedSocialDto dto
	 *
	 * @return void
	 */
	@Override
	@Transactional
	public void insertOrUpdateResoRedSocial(ResoRedSocialDto dto) {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.insertOrUpdateResoRedSocial ###");

		resoRedSocialService.insertOrUpdate(dto);

		LOGGER.debug("### FIN RedesSocialesFacadeImpl.insertOrUpdateResoRedSocial ###");
	}

	/**
	 * Elimina un ResoRedSocial
	 * 
	 * @param idRedSocial
	 *
	 * @return void
	 */
	@Override
	@Transactional
	public void deleteResoRedSocialById(Long idRedSocial) {

		LOGGER.debug("### INI RedesSocialesFacadeImpl.deleteResoRedSocialById ###");

		resoRedSocialService.deleteById(idRedSocial);

		LOGGER.debug("### INI RedesSocialesFacadeImpl.deleteResoRedSocialById ###");
	}
}