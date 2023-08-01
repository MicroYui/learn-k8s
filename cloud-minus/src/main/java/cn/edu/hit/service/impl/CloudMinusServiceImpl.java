package cn.edu.hit.service.impl;

import cn.edu.hit.service.CloudMinusService;
import org.springframework.stereotype.Service;

@Service("CloudMinusServiceImpl")
public class CloudMinusServiceImpl implements CloudMinusService {
    @Override
    public int getMinusResult(int minusA, int minusB) {
        return minusA - minusB;
    }
}
