package com.projectService.demo.Models;

import lombok.Getter;
import lombok.Setter;

public class ProjectVO {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String summary;

    @Getter
    @Setter
    private String details;

    @Getter
    @Setter
    private EventVO[] events;


}
