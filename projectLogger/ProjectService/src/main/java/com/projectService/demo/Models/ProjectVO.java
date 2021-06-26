package com.projectService.demo.Models;

import lombok.Getter;
import lombok.Setter;

public class ProjectVO {
    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String summary;
    @Getter @Setter
    private String details;
    @Getter @Setter
    private String projStatus;
}
