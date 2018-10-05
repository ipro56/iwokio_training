package com.isb.redes.back.service;

import java.util.List;

import com.isb.redes.back.dto.ResoCuentaRedSocialDto;

public interface ResoCuentaRedSocialService {

	/**
     * Método que obtiene todas las ResoCuentaRedSocial existentes en BBDD
     * 
     * @return List<ResoCuentaRedSocialDto>
     */
	List<ResoCuentaRedSocialDto> findAll();

	/**
	 * Obtiene un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 */
	ResoCuentaRedSocialDto findById(Long idCuentaRedSocial);

	/**
	 * Inserta un ResoCuentaRedSocial
	 * 
	 * @param ResoCuentaRedSocialDto dto
	 *
	 * @return void
	 */
	void insertOrUpdate(ResoCuentaRedSocialDto dto);

	/**
	 * Elimina un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 *
	 * @return void
	 */
	void deleteById(Long idCuentaRedSocial);
}