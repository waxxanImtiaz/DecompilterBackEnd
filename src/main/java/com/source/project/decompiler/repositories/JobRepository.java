package com.source.project.decompiler.repositories;

import com.source.project.decompiler.entities.JobPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<JobPost,Long> {
}
