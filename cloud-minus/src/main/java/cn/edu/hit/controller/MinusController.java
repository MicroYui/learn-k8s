package cn.edu.hit.controller;

import cn.edu.hit.service.CloudMinusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MinusController {
    @Resource
    CloudMinusService cloudMinusService;

    @GetMapping("/minus/{minusA}/{minusB}")
    public String returnMinusResult(@PathVariable("minusA") int minusA, @PathVariable("minusB") int minusB) {
        int minusResult = cloudMinusService.getMinusResult(minusA, minusB);
        return " - " + minusB + " = " + minusResult;
    }
}
