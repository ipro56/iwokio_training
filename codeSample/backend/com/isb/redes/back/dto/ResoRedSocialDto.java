package com.isb.redes.back.dto;

import java.io.Serializable;

import java.util.Set;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 *
 * 
 */
@ApiModel
public class ResoRedSocialDto implements Serializable {

	/**
     * serial version UID	 
     */
     public static final long serialVersionUID = 1538723968259L;


	/**
	 * 
	 */
	private Long idRedSocial;

	/**
	 * 
	 */
	private String redSocial;

	/**
	 * 
	 */
	private Date fechaAlta;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private Set<ResoCuentaRedSocialDto> listResoCuentaRedSocial;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoRssTipoRssDto resoRssTipoRss;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private Set<ResoReclamacionDto> listResoReclamacion;

	public Long getIdRedSocial() {
		return idRedSocial;
	}

	public void setIdRedSocial(Long idRedSocial) {
		this.idRedSocial = idRedSocial;
	}

	public String getRedSocial() {
		return redSocial;
	}

	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Set<ResoCuentaRedSocialDto> getListResoCuentaRedSocial() {
		return listResoCuentaRedSocial;
	}

	public void setListResoCuentaRedSocial(Set<ResoCuentaRedSocialDto> listResoCuentaRedSocial) {
		this.listResoCuentaRedSocial = listResoCuentaRedSocial;
	}

	public ResoRssTipoRssDto getResoRssTipoRss() {
		return resoRssTipoRss;
	}

	public void setResoRssTipoRss(ResoRssTipoRssDto resoRssTipoRss) {
		this.resoRssTipoRss = resoRssTipoRss;
	}

	public Set<ResoReclamacionDto> getListResoReclamacion() {
		return listResoReclamacion;
	}

	public void setListResoReclamacion(Set<ResoReclamacionDto> listResoReclamacion) {
		this.listResoReclamacion = listResoReclamacion;
	}
} 

