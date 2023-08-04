package com.openheng.utils;

import org.springframework.stereotype.Component;

/**
 * Created by openheng on 2023-08-04.
 */
@Component
public class SnowFlakeIdGenerator {


    private static final long TIMESTAMP_2023 = 1672502400000L;

    private static final int NUM_BIT = 12;

    private static final int MACHINE_ID_BIT = 10;

    private static final int TIMESTAMP_BIT = NUM_BIT + MACHINE_ID_BIT;

    private long lastTimeStamp;

    private int currentNum;

    /**
     * 获取到雪花id
     */
    public synchronized long nextId() {
        // 获取到时间戳，即当前时间 - 时间戳(2023)
        long currentTimeStamp = System.currentTimeMillis() - TIMESTAMP_2023;

        // 如果当前的时间戳比 lastTimeStamp 小，要报错
        if (currentTimeStamp < lastTimeStamp) {
            throw new RuntimeException("SnowFlakeId Time Error");
        }

        long id = 0;
        // 增加时间
        id = id + (currentTimeStamp << TIMESTAMP_BIT);

        // 获取到当前机器id
        int machineId = 1;
        id = id + (machineId << NUM_BIT);

        // 获取数字
        if (currentTimeStamp != lastTimeStamp) {
            currentNum = 0;
        } else {
            currentNum = currentNum + 1;
        }
        lastTimeStamp = currentTimeStamp;
        return id + currentNum;
    }

}
