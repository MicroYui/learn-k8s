package cn.edu.hit.service.impl;

import cn.edu.hit.service.CloudMultipleService;
import org.springframework.stereotype.Service;

@Service("CloudMultipleServiceImpl")
public class CloudMultipleServiceImpl implements CloudMultipleService {
    @Override
    public int getMultipleResult(int multipleA, int multipleB) {
        return multipleA * multipleB;
    }
}
