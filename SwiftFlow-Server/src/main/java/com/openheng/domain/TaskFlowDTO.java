package com.openheng.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by openheng on 2023-08-24.
 */
@Data
public class TaskFlowDTO {


    private Long id;

    private Byte bizCode;

    private String name;

    private Date gmtCreate;

    private Date gmtModified;


}
