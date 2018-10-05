package com.isb.redes.back.persistence.entity.parser;

import java.util.function.Function;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.isb.redes.back.dto.ResoRedSocialDto;
import com.isb.redes.back.persistence.entity.ResoRedSocialEntity;

/**
 * Parser Entity to DTO for ResoRedSocial
 *
 * 
 */
public enum ResoRedSocialEntityToDto 
		implements Function<ResoRedSocialEntity, ResoRedSocialDto> {

    INSTANCE;

    @Override
    public ResoRedSocialDto apply(ResoRedSocialEntity entity) {

		ResoRedSocialDto dto = null;

        if (entity != null) {

            dto = new ResoRedSocialDto();


            dto.setIdRedSocial(entity.getIdRedSocial());
            dto.setRedSocial(entity.getRedSocial());
            dto.setFechaAlta(entity.getFechaAlta());
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (entity.getListResoCuentaRedSocial() != null) {
                dto.setListResoCuentaRedSocial(entity.getListResoCuentaRedSocial().stream()
                        .map(ResoCuentaRedSocialEntityToDto.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if(entity.getResoRssTipoRss() != null){
                dto.setResoRssTipoRss(ResoRssTipoRssEntityToDto.INSTANCE.apply(entity.getResoRssTipoRss()));
            }*/
            // The relationships are commented in order to avoid query database to get the data, uncomment the desired ones.
            /*if (entity.getListResoReclamacion() != null) {
                dto.setListResoReclamacion(entity.getListResoReclamacion().stream()
                        .map(ResoReclamacionEntityToDto.INSTANCE).collect(Collectors.toCollection(HashSet::new)));
            }*/

        }

        return dto;    
    }
} 