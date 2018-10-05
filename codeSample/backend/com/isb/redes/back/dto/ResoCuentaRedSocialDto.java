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
public class ResoCuentaRedSocialDto implements Serializable {

	/**
     * serial version UID	 
     */
     public static final long serialVersionUID = 1538724024164L;


	/**
	 * 
	 */
	private Long idCuentaRedSocial;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	private String url;

	/**
	 * 
	 */
	private String oficial;

	/**
	 * 
	 */
	private Date fechaCreacion;

	/**
	 * 
	 */
	private Date fechaAbandono;

	/**
	 * 
	 */
	private String observaciones;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoIdentificadorDto resoIdentificador;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoUsuarioDto resoUsuario;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoPaisDto resoPais;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoOtrasReferenciasDto resoOtrasReferencias;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoRefClienteSociedadDto resoRefClienteSociedad;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoActividadDto resoActividad;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoRedSocialDto resoRedSocial;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private ResoRefClienteCuentaRssDto resoRefClienteCuentaRss;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private Set<ResoAlertaDto> listResoAlerta;

	/**
	 * 
	 */
	@ApiModelProperty(hidden=true)
	private Set<ResoDocCuentaRssDto> listResoDocCuentaRss;

	public Long getIdCuentaRedSocial() {
		return idCuentaRedSocial;
	}

	public void setIdCuentaRedSocial(Long idCuentaRedSocial) {
		this.idCuentaRedSocial = idCuentaRedSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOficial() {
		return oficial;
	}

	public void setOficial(String oficial) {
		this.oficial = oficial;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaAbandono() {
		return fechaAbandono;
	}

	public void setFechaAbandono(Date fechaAbandono) {
		this.fechaAbandono = fechaAbandono;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public ResoIdentificadorDto getResoIdentificador() {
		return resoIdentificador;
	}

	public void setResoIdentificador(ResoIdentificadorDto resoIdentificador) {
		this.resoIdentificador = resoIdentificador;
	}

	public ResoUsuarioDto getResoUsuario() {
		return resoUsuario;
	}

	public void setResoUsuario(ResoUsuarioDto resoUsuario) {
		this.resoUsuario = resoUsuario;
	}

	public ResoPaisDto getResoPais() {
		return resoPais;
	}

	public void setResoPais(ResoPaisDto resoPais) {
		this.resoPais = resoPais;
	}

	public ResoOtrasReferenciasDto getResoOtrasReferencias() {
		return resoOtrasReferencias;
	}

	public void setResoOtrasReferencias(ResoOtrasReferenciasDto resoOtrasReferencias) {
		this.resoOtrasReferencias = resoOtrasReferencias;
	}

	public ResoRefClienteSociedadDto getResoRefClienteSociedad() {
		return resoRefClienteSociedad;
	}

	public void setResoRefClienteSociedad(ResoRefClienteSociedadDto resoRefClienteSociedad) {
		this.resoRefClienteSociedad = resoRefClienteSociedad;
	}

	public ResoActividadDto getResoActividad() {
		return resoActividad;
	}

	public void setResoActividad(ResoActividadDto resoActividad) {
		this.resoActividad = resoActividad;
	}

	public ResoRedSocialDto getResoRedSocial() {
		return resoRedSocial;
	}

	public void setResoRedSocial(ResoRedSocialDto resoRedSocial) {
		this.resoRedSocial = resoRedSocial;
	}

	public ResoRefClienteCuentaRssDto getResoRefClienteCuentaRss() {
		return resoRefClienteCuentaRss;
	}

	public void setResoRefClienteCuentaRss(ResoRefClienteCuentaRssDto resoRefClienteCuentaRss) {
		this.resoRefClienteCuentaRss = resoRefClienteCuentaRss;
	}

	public Set<ResoAlertaDto> getListResoAlerta() {
		return listResoAlerta;
	}

	public void setListResoAlerta(Set<ResoAlertaDto> listResoAlerta) {
		this.listResoAlerta = listResoAlerta;
	}

	public Set<ResoDocCuentaRssDto> getListResoDocCuentaRss() {
		return listResoDocCuentaRss;
	}

	public void setListResoDocCuentaRss(Set<ResoDocCuentaRssDto> listResoDocCuentaRss) {
		this.listResoDocCuentaRss = listResoDocCuentaRss;
	}
} 

