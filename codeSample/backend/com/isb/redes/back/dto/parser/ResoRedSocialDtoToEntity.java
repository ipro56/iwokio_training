package com.isb.redes.back.dto.parser;

import java.util.function.Function;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.isb.redes.back.dto.ResoRedSocialDto;
import com.isb.redes.back.persistence.entity.ResoRedSocialEntity;

/**
 * Parser DTO to Entity for ResoRedSocial
 *
 * 
 */
public enum ResoRedSocialDtoToEntity 
		implements Function<ResoRedSocialDto, ResoRedSocialEntity> {

    INSTANCE;

    @Override
    public ResoRedSocialEntity apply(ResoRedSocialDto dto) {

		ResoRedSocialEntity entity = null;

        if (dto != null) {

            entity = new ResoRedSocialEntity();


            entity.setIdRedSocial(dto.getIdRedSocial());
            entity.setRedSocial(dto.getRedSocial());
            entity.setFechaAlta(dto.getFechaAlta());
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (dto.getListResoCuentaRedSocial() != null) {
                entity.setListResoCuentaRedSocial(dto.getListResoCuentaRedSocial().stream()
                        .map(ResoCuentaRedSocialDtoToEntity.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(dto.getResoRssTipoRss() != null){
                entity.setResoRssTipoRss(ResoRssTipoRssDtoToEntity.INSTANCE.apply(dto.getResoRssTipoRss()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (dto.getListResoReclamacion() != null) {
                entity.setListResoReclamacion(dto.getListResoReclamacion().stream()
                        .map(ResoReclamacionDtoToEntity.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/

        }

        return entity;    
    }
} 

