package com.source.project.decompiler.DTO;

import com.source.project.decompiler.util.Status;

public class BaseDTO {
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private Status status = Status.SUCCESS;
}
