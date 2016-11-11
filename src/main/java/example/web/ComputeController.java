package example.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhezhiyong@163.com on 2016/10/12.
 */
@Api(value = "计算服务", description = "简单的计算服务，提供加减乘除运算API")
@RestController
@RequestMapping("/compute")
public class ComputeController {
    @ApiOperation("加法运算")
    @PostMapping("/add")
    public Double add(@RequestParam Double a, @RequestParam Double b) {
        return a + b;
    }

    @ApiOperation("减法运算")
    @PostMapping("/sub")
    public Double sub(@RequestParam Double a, @RequestParam Double b) {
        return a - b;
    }

    @ApiOperation("乘法运算")
    @PostMapping("/mul")
    public Double mul(@RequestParam Double a, @RequestParam Double b) {
        return a * b;
    }

    @ApiOperation("除法运算")
    @PostMapping("/div")
    public Double div(@ApiParam("被除数") @RequestParam Double a, @ApiParam("除数") @RequestParam Double b) {
        return a / b;
    }
}
