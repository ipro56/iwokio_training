package com.isb.redes.back.service;

import java.util.List;

import com.isb.redes.back.dto.ResoRedSocialDto;

public interface ResoRedSocialService {

	/**
     * Método que obtiene todas las ResoRedSocial existentes en BBDD
     * 
     * @return List<ResoRedSocialDto>
     */
	List<ResoRedSocialDto> findAll();

	/**
	 * Obtiene un ResoRedSocial
	 * 
	 * @param idRedSocial
	 */
	ResoRedSocialDto findById(Long idRedSocial);

	/**
	 * Inserta un ResoRedSocial
	 * 
	 * @param ResoRedSocialDto dto
	 *
	 * @return void
	 */
	void insertOrUpdate(ResoRedSocialDto dto);

	/**
	 * Elimina un ResoRedSocial
	 * 
	 * @param idRedSocial
	 *
	 * @return void
	 */
	void deleteById(Long idRedSocial);
}