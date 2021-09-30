package com.EventService.demo.Model;

import lombok.Getter;
import lombok.Setter;

public class EventVO {
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String topic;

    @Getter
    @Setter
    private String eventDesc;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private Integer projId;


}
