package com.isb.redes.back.dto.parser;

import java.util.function.Function;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.isb.redes.back.dto.ResoCuentaRedSocialDto;
import com.isb.redes.back.persistence.entity.ResoCuentaRedSocialEntity;

/**
 * Parser DTO to Entity for ResoCuentaRedSocial
 *
 * 
 */
public enum ResoCuentaRedSocialDtoToEntity 
		implements Function<ResoCuentaRedSocialDto, ResoCuentaRedSocialEntity> {

    INSTANCE;

    @Override
    public ResoCuentaRedSocialEntity apply(ResoCuentaRedSocialDto dto) {

		ResoCuentaRedSocialEntity entity = null;

        if (dto != null) {

            entity = new ResoCuentaRedSocialEntity();


            entity.setIdCuentaRedSocial(dto.getIdCuentaRedSocial());
            entity.setNombre(dto.getNombre());
            entity.setUrl(dto.getUrl());
            entity.setOficial(dto.getOficial());
            entity.setFechaCreacion(dto.getFechaCreacion());
            entity.setFechaAbandono(dto.getFechaAbandono());
            entity.setObservaciones(dto.getObservaciones());
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoIdentificador() != null){
                entity.setResoIdentificador(ResoIdentificadorDtoToEntity.INSTANCE.apply(dto.getResoIdentificador()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoUsuario() != null){
                entity.setResoUsuario(ResoUsuarioDtoToEntity.INSTANCE.apply(dto.getResoUsuario()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoPais() != null){
                entity.setResoPais(ResoPaisDtoToEntity.INSTANCE.apply(dto.getResoPais()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoOtrasReferencias() != null){
                entity.setResoOtrasReferencias(ResoOtrasReferenciasDtoToEntity.INSTANCE.apply(dto.getResoOtrasReferencias()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoRefClienteSociedad() != null){
                entity.setResoRefClienteSociedad(ResoRefClienteSociedadDtoToEntity.INSTANCE.apply(dto.getResoRefClienteSociedad()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoActividad() != null){
                entity.setResoActividad(ResoActividadDtoToEntity.INSTANCE.apply(dto.getResoActividad()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoRedSocial() != null){
                entity.setResoRedSocial(ResoRedSocialDtoToEntity.INSTANCE.apply(dto.getResoRedSocial()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoRefClienteCuentaRss() != null){
                entity.setResoRefClienteCuentaRss(ResoRefClienteCuentaRssDtoToEntity.INSTANCE.apply(dto.getResoRefClienteCuentaRss()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (dto.getListResoAlerta() != null) {
                entity.setListResoAlerta(dto.getListResoAlerta().stream()
                        .map(ResoAlertaDtoToEntity.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (dto.getListResoDocCuentaRss() != null) {
                entity.setListResoDocCuentaRss(dto.getListResoDocCuentaRss().stream()
                        .map(ResoDocCuentaRssDtoToEntity.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/

        }

        return entity;    
    }
} 

