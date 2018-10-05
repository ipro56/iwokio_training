package com.isb.redes.back.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isb.redes.back.facade.RedesSocialesFacade;
import com.isb.redes.back.dto.ResoCuentaRedSocialDto;

import com.isb.redes.back.dto.ResoRedSocialDto;

@CrossOrigin
@RestController
@RequestMapping("{spring.data.rest.base-path}" + "/redesSociales")
public class RedesSocialesRestController {

	@Autowired
	@Qualifier("redesSocialesFacade")
	private RedesSocialesFacade redesSocialesFacade;

	/**
     * Método que obtiene todas las ResoCuentaRedSocial
     * 
     * @return List<ResoCuentaRedSocialDto>
     */
	@RequestMapping(method = RequestMethod.GET, path = "/resoCuentaRedSocial")
    public List<ResoCuentaRedSocialDto> findAllResoCuentaRedSocial() {

		return redesSocialesFacade.findAllResoCuentaRedSocial();
	}

	/**
	 * Obtiene un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/resoCuentaRedSocial/{idCuentaRedSocial}")
	public ResoCuentaRedSocialDto findResoCuentaRedSocialById(@RequestParam(name = "idCuentaRedSocial", required = true) Long idCuentaRedSocial) {

		return redesSocialesFacade.findResoCuentaRedSocialById(idCuentaRedSocial);
	}

	/**
	 * Inserta un ResoCuentaRedSocial
	 * 
	 * @param ResoCuentaRedSocialDto dto
	 *
	 * @return void
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/resoCuentaRedSocial")
	public void insertOrUpdateResoCuentaRedSocial(@RequestBody ResoCuentaRedSocialDto dto) {

		redesSocialesFacade.insertOrUpdateResoCuentaRedSocial(dto);
	}

	/**
	 * Elimina un ResoCuentaRedSocial
	 * 
	 * @param idCuentaRedSocial
	 *
	 * @return void
	 */
	@RequestMapping(method = RequestMethod.DELETE, path = "/resoCuentaRedSocial/{idCuentaRedSocial}")
	public void deleteResoCuentaRedSocialById(@RequestParam(name = "idCuentaRedSocial", required = true) Long idCuentaRedSocial) {

		redesSocialesFacade.deleteResoCuentaRedSocialById(idCuentaRedSocial);
	}

	/**
     * Método que obtiene todas las ResoRedSocial
     * 
     * @return List<ResoRedSocialDto>
     */
	@RequestMapping(method = RequestMethod.GET, path = "/resoRedSocial")
    public List<ResoRedSocialDto> findAllResoRedSocial() {

		return redesSocialesFacade.findAllResoRedSocial();
	}

	/**
	 * Obtiene un ResoRedSocial
	 * 
	 * @param idRedSocial
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/resoRedSocial/{idRedSocial}")
	public ResoRedSocialDto findResoRedSocialById(@RequestParam(name = "idRedSocial", required = true) Long idRedSocial) {

		return redesSocialesFacade.findResoRedSocialById(idRedSocial);
	}

	/**
	 * Inserta un ResoRedSocial
	 * 
	 * @param ResoRedSocialDto dto
	 *
	 * @return void
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/resoRedSocial")
	public void insertOrUpdateResoRedSocial(@RequestBody ResoRedSocialDto dto) {

		redesSocialesFacade.insertOrUpdateResoRedSocial(dto);
	}

	/**
	 * Elimina un ResoRedSocial
	 * 
	 * @param idRedSocial
	 *
	 * @return void
	 */
	@RequestMapping(method = RequestMethod.DELETE, path = "/resoRedSocial/{idRedSocial}")
	public void deleteResoRedSocialById(@RequestParam(name = "idRedSocial", required = true) Long idRedSocial) {

		redesSocialesFacade.deleteResoRedSocialById(idRedSocial);
	}
}