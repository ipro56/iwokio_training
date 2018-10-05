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
@Table(name = "RESO_RED_SOCIAL") 
public class ResoRedSocialEntity implements Serializable {

	/**
     * serial version UID	 
     */
    public static final long serialVersionUID = 1538723968259L;


	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_RESO_RED_SOCIAL")
	@SequenceGenerator(name = "SEQ_RESO_RED_SOCIAL", sequenceName = "SEQ_RESO_RED_SOCIAL", allocationSize = 1)
	@Column(name = "ID_RED_SOCIAL", nullable = false)
	private Long idRedSocial;

	/**
	 * 
	 */
	@Column(name = "RED_SOCIAL", nullable = false)
	private String redSocial;

	/**
	 * 
	 */
	@Column(name = "FECHA_ALTA", nullable = true)
	private Date fechaAlta;

	/**
	 * 
	 */
	@OneToMany(mappedBy = "resoRedSocial", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<ResoCuentaRedSocialEntity> listResoCuentaRedSocial;

	/**
	 * 
	 */
	@OneToOne(mappedBy = "resoRedSocial", fetch = FetchType.LAZY)
	private ResoRssTipoRssEntity resoRssTipoRss;

	/**
	 * 
	 */
	@OneToMany(mappedBy = "resoRedSocial", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private Set<ResoReclamacionEntity> listResoReclamacion;

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

	public Set<ResoCuentaRedSocialEntity> getListResoCuentaRedSocial() {
		return listResoCuentaRedSocial;
	}

	public void setListResoCuentaRedSocial(Set<ResoCuentaRedSocialEntity> listResoCuentaRedSocial) {
		this.listResoCuentaRedSocial = listResoCuentaRedSocial;
	}

	public ResoRssTipoRssEntity getResoRssTipoRss() {
		return resoRssTipoRss;
	}

	public void setResoRssTipoRss(ResoRssTipoRssEntity resoRssTipoRss) {
		this.resoRssTipoRss = resoRssTipoRss;
	}

	public Set<ResoReclamacionEntity> getListResoReclamacion() {
		return listResoReclamacion;
	}

	public void setListResoReclamacion(Set<ResoReclamacionEntity> listResoReclamacion) {
		this.listResoReclamacion = listResoReclamacion;
	}
} 

