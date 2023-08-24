package com.openheng.service;

import com.openheng.dao.TaskFlow;
import com.openheng.dao.TaskFlowMapper;
import com.openheng.domain.TaskFlowDTO;
import com.openheng.utils.SnowFlakeIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by openheng on 2023-08-24.
 */
@Service
public class TaskFlowService {

    @Autowired
    private TaskFlowMapper flowMapper;
    @Autowired
    private SnowFlakeIdGenerator idGenerator;


    /**
     * 写入任务流程
     */
    public Long insert(TaskFlowDTO taskFlowDTO) {
        Long id = idGenerator.nextId();
        TaskFlow taskFlow = new TaskFlow();
        taskFlow.setId(idGenerator.nextId());
        taskFlow.setBizCode(taskFlowDTO.getBizCode());
        taskFlow.setName(taskFlowDTO.getName());
        int result = flowMapper.insertSelective(taskFlow);
        if (result <= 0) {
            throw new RuntimeException("TaskFlow insert error");
        }
        return id;
    }

}
