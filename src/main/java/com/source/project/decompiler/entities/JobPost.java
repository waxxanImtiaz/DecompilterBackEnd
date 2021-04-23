package com.source.project.decompiler.entities;

import javax.persistence.*;

@Entity(name="jf_job_post")
public class JobPost {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long jobPostId;
    private String jobName;
    private String bps;
    private String ageLimit;
    private String description;
    private String totalPosts;
    public Long getJobPostId() {
        return jobPostId;
    }

    public void setJobPostId(Long jobId) {
        this.jobPostId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getBps() {
        return bps;
    }

    public void setBps(String bps) {
        this.bps = bps;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(String totalPosts) {
        this.totalPosts = totalPosts;
    }
}
