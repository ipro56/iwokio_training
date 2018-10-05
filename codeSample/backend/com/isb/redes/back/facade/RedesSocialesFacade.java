package com.isb.redes.back.facade;

import java.util.List;

import com.isb.redes.back.dto.ResoCuentaRedSocialDto;

import com.isb.redes.back.dto.ResoRedSocialDto;

public interface RedesSocialesFacade {

	/**
     * Método que obtiene todas las ResoCuentaRedSocial existentes en BBDD
     * 
     * @return List<ResoCuentaRedSocialDto>
     */
	List<ResoCuentaRedSocialDto> findAllResoCuentaRedSocial();

	/**
	 * Obtiene un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 */
	ResoCuentaRedSocialDto findResoCuentaRedSocialById(Long idCuentaRedSocial);

	/**
	 * Inserta un ResoCuentaRedSocial
	 * 
	 * @param ResoCuentaRedSocialDto dto
	 *
	 * @return void
	 */
	void insertOrUpdateResoCuentaRedSocial(ResoCuentaRedSocialDto dto);

	/**
	 * Elimina un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 *
	 * @return void
	 */
	void deleteResoCuentaRedSocialById(Long idCuentaRedSocial);

	/**
     * Método que obtiene todas las ResoRedSocial existentes en BBDD
     * 
     * @return List<ResoRedSocialDto>
     */
	List<ResoRedSocialDto> findAllResoRedSocial();

	/**
	 * Obtiene un ResoRedSocial
	 * 
	 * @param idRedSocial
	 */
	ResoRedSocialDto findResoRedSocialById(Long idRedSocial);

	/**
	 * Inserta un ResoRedSocial
	 * 
	 * @param ResoRedSocialDto dto
	 *
	 * @return void
	 */
	void insertOrUpdateResoRedSocial(ResoRedSocialDto dto);

	/**
	 * Elimina un ResoRedSocial
	 * 
	 * @param idRedSocial
	 *
	 * @return void
	 */
	void deleteResoRedSocialById(Long idRedSocial);
}