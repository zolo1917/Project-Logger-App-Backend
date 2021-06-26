package com.projectService.demo.Enum;

public enum ProjectStatuses {
    OPEN(1, "OPEN"),
    IN_PROGRESS(2, "IN_PROGRESS"),
    BLOCKED(3, "BLOCKED"),
    TESTING(4, "TESTING"),
    REVIEW(5, "REVIEW"),
    DONE(6, "DONE");

    private Integer id;
    private String name;

    ProjectStatuses(Integer id, String name){
        this.id= id;
        this.name = name;
    }

    public Integer getId(){
        return id;
    }
}
