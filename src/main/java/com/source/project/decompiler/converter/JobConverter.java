package com.source.project.decompiler.converter;

import com.source.project.decompiler.DTO.JobDTO;
import com.source.project.decompiler.entities.JobPost;

public class JobConverter {
    private JobPost entity;
    private JobDTO jobDTO;
    public JobConverter(JobPost entity, JobDTO dto){
        this.entity = entity;
        this.jobDTO = dto;
    }

    public JobPost dtoToEntity(){
        if (entity == null)
            entity = new JobPost();

        entity.setAgeLimit(jobDTO.getAgeLimit());
        entity.setBps(jobDTO.getBps());
        entity.setDescription(jobDTO.getDescription());
        entity.setJobPostId(jobDTO.getJobId());
        entity.setJobName(jobDTO.getJobName());
        entity.setTotalPosts(jobDTO.getTotalPosts());
        return entity;
    }
    public JobDTO entityToDTO(){
        if (jobDTO == null)
            jobDTO = new JobDTO();

        jobDTO.setAgeLimit(entity.getAgeLimit());
        jobDTO.setBps(entity.getBps());
        jobDTO.setDescription(entity.getDescription());
        jobDTO.setJobId(entity.getJobPostId());
        jobDTO.setJobName(entity.getJobName());
        jobDTO.setTotalPosts(entity.getTotalPosts());
        return jobDTO;
    }
}
