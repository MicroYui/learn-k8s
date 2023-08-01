package cn.edu.hit.service.impl;

import cn.edu.hit.service.CloudPlusService;
import org.springframework.stereotype.Service;

@Service("CloudPlusServiceImpl")
public class CloudPlusServiceImpl implements CloudPlusService {
    @Override
    public int getPlusResult(int plusA, int plusB) {
        return plusA + plusB;
    }
}
