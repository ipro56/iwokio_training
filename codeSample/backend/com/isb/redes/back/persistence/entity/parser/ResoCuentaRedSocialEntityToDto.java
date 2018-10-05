package com.isb.redes.back.persistence.entity.parser;

import java.util.function.Function;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.isb.redes.back.dto.ResoCuentaRedSocialDto;
import com.isb.redes.back.persistence.entity.ResoCuentaRedSocialEntity;

/**
 * Parser Entity to DTO for ResoCuentaRedSocial
 *
 * 
 */
public enum ResoCuentaRedSocialEntityToDto 
		implements Function<ResoCuentaRedSocialEntity, ResoCuentaRedSocialDto> {

    INSTANCE;

    @Override
    public ResoCuentaRedSocialDto apply(ResoCuentaRedSocialEntity entity) {

		ResoCuentaRedSocialDto dto = null;

        if (entity != null) {

            dto = new ResoCuentaRedSocialDto();


            dto.setIdCuentaRedSocial(entity.getIdCuentaRedSocial());
            dto.setNombre(entity.getNombre());
            dto.setUrl(entity.getUrl());
            dto.setOficial(entity.getOficial());
            dto.setFechaCreacion(entity.getFechaCreacion());
            dto.setFechaAbandono(entity.getFechaAbandono());
            dto.setObservaciones(entity.getObservaciones());
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoIdentificador() != null){
                dto.setResoIdentificador(ResoIdentificadorEntityToDto.INSTANCE.apply(entity.getResoIdentificador()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoUsuario() != null){
                dto.setResoUsuario(ResoUsuarioEntityToDto.INSTANCE.apply(entity.getResoUsuario()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoPais() != null){
                dto.setResoPais(ResoPaisEntityToDto.INSTANCE.apply(entity.getResoPais()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoOtrasReferencias() != null){
                dto.setResoOtrasReferencias(ResoOtrasReferenciasEntityToDto.INSTANCE.apply(entity.getResoOtrasReferencias()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoRefClienteSociedad() != null){
                dto.setResoRefClienteSociedad(ResoRefClienteSociedadEntityToDto.INSTANCE.apply(entity.getResoRefClienteSociedad()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoActividad() != null){
                dto.setResoActividad(ResoActividadEntityToDto.INSTANCE.apply(entity.getResoActividad()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoRedSocial() != null){
                dto.setResoRedSocial(ResoRedSocialEntityToDto.INSTANCE.apply(entity.getResoRedSocial()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoRefClienteCuentaRss() != null){
                dto.setResoRefClienteCuentaRss(ResoRefClienteCuentaRssEntityToDto.INSTANCE.apply(entity.getResoRefClienteCuentaRss()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (entity.getListResoAlerta() != null) {
                dto.setListResoAlerta(entity.getListResoAlerta().stream()
                        .map(ResoAlertaEntityToDto.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (entity.getListResoDocCuentaRss() != null) {
                dto.setListResoDocCuentaRss(entity.getListResoDocCuentaRss().stream()
                        .map(ResoDocCuentaRssEntityToDto.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/

        }

        return dto;    
    }
} 