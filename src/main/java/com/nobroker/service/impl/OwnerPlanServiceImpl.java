package com.nobroker.service.impl;

import com.nobroker.entity.OwnerPlan;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.repository.OwnerPlanRepository;
import com.nobroker.service.OwnerPlanService;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {

    private OwnerPlanRepository ownerPlanRepository;
    private ModelMapper modelMapper;

    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository, ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);
        OwnerPlan save = ownerPlanRepository.save(ownerPlan);
        return mapToDto(save);
    }

    OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto){
        OwnerPlan ownerplan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerplan;
    }
    OwnerPlanDto mapToDto(OwnerPlan ownerPlan){
        OwnerPlanDto ownerPlanDto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return ownerPlanDto;
}

}