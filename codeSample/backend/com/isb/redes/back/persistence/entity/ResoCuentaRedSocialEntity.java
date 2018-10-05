package com.isb.redes.back.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Set;
import java.util.Date;

/**
 * 
 *
 * 
 */
@Entity
@Table(name = "RESO_CUENTA_RED_SOCIAL") 
public class ResoCuentaRedSocialEntity implements Serializable {

	/**
     * serial version UID	 
     */
    public static final long serialVersionUID = 1538724024164L;


	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RESO_CUENTA_RED_SOCIAL")
	@SequenceGenerator(name = "SEQ_RESO_CUENTA_RED_SOCIAL", sequenceName = "SEQ_RESO_CUENTA_RED_SOCIAL", allocationSize = 1)
	@Column(name = "ID_CUENTA_RED_SOCIAL", nullable = false)
	private Long idCuentaRedSocial;

	/**
	 * 
	 */
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	/**
	 * 
	 */
	@Column(name = "URL", nullable = false)
	private String url;

	/**
	 * 
	 */
	@Column(name = "OFICIAL", nullable = false)
	private String oficial;

	/**
	 * 
	 */
	@Column(name = "FECHA_CREACION", nullable = false)
	private Date fechaCreacion;

	/**
	 * 
	 */
	@Column(name = "FECHA_ABANDONO", nullable = true)
	private Date fechaAbandono;

	/**
	 * 
	 */
	@Column(name = "OBSERVACIONES", nullable = true)
	private String observaciones;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IDENTIFICADOR", nullable = true)
	private ResoIdentificadorEntity resoIdentificador;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO", nullable = false)
	private ResoUsuarioEntity resoUsuario;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PAIS", nullable = true)
	private ResoPaisEntity resoPais;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_OTRAS_REFERENCIAS", nullable = false)
	private ResoOtrasReferenciasEntity resoOtrasReferencias;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_REF_CLIENTE_SOCIEDAD", nullable = false)
	private ResoRefClienteSociedadEntity resoRefClienteSociedad;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ACTIVIDAD", nullable = true)
	private ResoActividadEntity resoActividad;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_RED_SOCIAL", nullable = false)
	private ResoRedSocialEntity resoRedSocial;

	/**
	 * 
	 */
	@OneToOne(mappedBy = "resoCuentaRedSocial", fetch = FetchType.LAZY)
	private ResoRefClienteCuentaRssEntity resoRefClienteCuentaRss;

	/**
	 * 
	 */
	@OneToMany(mappedBy = "resoCuentaRedSocial", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<ResoAlertaEntity> listResoAlerta;

	/**
	 * 
	 */
	@OneToMany(mappedBy = "resoCuentaRedSocial", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<ResoDocCuentaRssEntity> listResoDocCuentaRss;

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

	public ResoIdentificadorEntity getResoIdentificador() {
		return resoIdentificador;
	}

	public void setResoIdentificador(ResoIdentificadorEntity resoIdentificador) {
		this.resoIdentificador = resoIdentificador;
	}

	public ResoUsuarioEntity getResoUsuario() {
		return resoUsuario;
	}

	public void setResoUsuario(ResoUsuarioEntity resoUsuario) {
		this.resoUsuario = resoUsuario;
	}

	public ResoPaisEntity getResoPais() {
		return resoPais;
	}

	public void setResoPais(ResoPaisEntity resoPais) {
		this.resoPais = resoPais;
	}

	public ResoOtrasReferenciasEntity getResoOtrasReferencias() {
		return resoOtrasReferencias;
	}

	public void setResoOtrasReferencias(ResoOtrasReferenciasEntity resoOtrasReferencias) {
		this.resoOtrasReferencias = resoOtrasReferencias;
	}

	public ResoRefClienteSociedadEntity getResoRefClienteSociedad() {
		return resoRefClienteSociedad;
	}

	public void setResoRefClienteSociedad(ResoRefClienteSociedadEntity resoRefClienteSociedad) {
		this.resoRefClienteSociedad = resoRefClienteSociedad;
	}

	public ResoActividadEntity getResoActividad() {
		return resoActividad;
	}

	public void setResoActividad(ResoActividadEntity resoActividad) {
		this.resoActividad = resoActividad;
	}

	public ResoRedSocialEntity getResoRedSocial() {
		return resoRedSocial;
	}

	public void setResoRedSocial(ResoRedSocialEntity resoRedSocial) {
		this.resoRedSocial = resoRedSocial;
	}

	public ResoRefClienteCuentaRssEntity getResoRefClienteCuentaRss() {
		return resoRefClienteCuentaRss;
	}

	public void setResoRefClienteCuentaRss(ResoRefClienteCuentaRssEntity resoRefClienteCuentaRss) {
		this.resoRefClienteCuentaRss = resoRefClienteCuentaRss;
	}

	public Set<ResoAlertaEntity> getListResoAlerta() {
		return listResoAlerta;
	}

	public void setListResoAlerta(Set<ResoAlertaEntity> listResoAlerta) {
		this.listResoAlerta = listResoAlerta;
	}

	public Set<ResoDocCuentaRssEntity> getListResoDocCuentaRss() {
		return listResoDocCuentaRss;
	}

	public void setListResoDocCuentaRss(Set<ResoDocCuentaRssEntity> listResoDocCuentaRss) {
		this.listResoDocCuentaRss = listResoDocCuentaRss;
	}
} 

