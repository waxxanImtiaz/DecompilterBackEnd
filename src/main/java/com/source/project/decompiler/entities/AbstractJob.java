package com.source.project.decompiler.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "jf_abstract_job")
public class AbstractJob {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long abstractJobId;
    private byte[] image;
    private Date publishDate;

}
