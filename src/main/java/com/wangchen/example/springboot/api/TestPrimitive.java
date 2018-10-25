package com.wangchen.example.springboot.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import static java.lang.System.out;

@RestController
@RequestMapping("testPrimitive")
@Api(description = "testPrimitive",tags = "/primitive")
public class TestPrimitive {

    /**
     * 基础类型测试
     * ApiParam测试 int
     * @param num
     */
    @GetMapping(value = "/testGetPrimitiveInt")
    @ApiOperation(value = "testGetPrimitiveInt" ,  notes="测试基类int")
    public void forSomething(@ApiParam("num") float num) throws NoSuchMethodException {
        out.printf("%s的参数：{num: %d}%n", this.getClass().getMethod("num", int.class).getName(), num);
    }

    /**
     * 基础类型测试
     * ApiParam测试 基础类型float
     * @param num
     */
    @PutMapping(value = "/testGetPrimitiveFloat")
    public void testGetPrimitiveFloat(@ApiParam("num") float num) {
        Throwable t = new Throwable();
        StackTraceElement[] stes = t.getStackTrace();
        out.printf("%s的参数：{num: %s}%n", stes[0].getMethodName(), num);
    }

    /**
     * 基础类型测试
     * ApiParam测试 基础类型double
     * @param num
     */
    @RequestMapping(value = "/testGetPrimitiveDouble", method = RequestMethod.POST)
    public void testGetPrimitiveDouble(@ApiParam("num") double num) {
        Throwable t = new Throwable();
        StackTraceElement[] stes = t.getStackTrace();
        out.printf("%s的参数：{num: %s}%n", stes[0].getMethodName(), num);
    }


    /**
     * 快捷键psvm
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("快捷键sout");
        for (int i = 0; i < 1; i++) {
            System.out.println("快捷键fori");
        }
    }

}

