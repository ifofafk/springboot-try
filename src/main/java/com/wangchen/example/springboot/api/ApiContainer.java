package com.wangchen.example.springboot.api;

import com.wangchen.example.springboot.entity.Pager;
import com.wangchen.example.springboot.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

import static java.lang.System.out;
import static java.lang.System.setOut;

@Api(description = "apiContainer",tags = "apiContainer")
@RestController
@RequestMapping("/api/apiContainer")
public class ApiContainer {

    /**
     * 基础类型测试
     * ApiParam测试 int
     */
    @PostMapping(value = "/forSomething")
    @ApiOperation(value = "forSomething" ,  notes="等待测试具体业务")
    public void forSomething(@RequestBody @ApiParam(name="user", value = "入参为User对象", required = true) User user) throws NoSuchMethodException {
        out.println("1111");
    }

    /**
     * 3. 测试解析 java对象 User
     * @ApiOperation 加上tags属性，在线调试无法解析到参数
     * 加上@RequestBody 会有请求示例和 对象名称
     *
     */
    @PostMapping(value = "/testPostUser")
    @ApiOperation(value = "这是-testPostUser", httpMethod = "POST", notes = "testPost1", response = Object.class)
    public Object testPostUser(@RequestBody @ApiParam(name="user", value = "入参为User对象", required = true) User user) {
        System.out.println(user.toString());
        user.setName("yy");
        return user;
    }


    /**
     * 测试解析泛型1
     */
    @PostMapping(value = "testT1")
    @ApiOperation(value = "这是-testT1", httpMethod = "POST", notes = "testT1", response = Object.class)
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "data", value = "泛型数据", paramType = "body", dataType = "Pager«User»", required = true)
    })
    public Object testT1(@RequestBody Pager<User> data) throws UnsupportedEncodingException {
        System.out.println(new String("a".getBytes(),"utf-8"));
        System.out.println(new String("b-test charset".getBytes(),System.getProperty("sun.jnu.encoding")));
        return null;
    }

    /**
     * 测试解析泛型2
     *
     */
    @RequestMapping(value = "/testT2", method = RequestMethod.POST)
    @ApiOperation(value = "这是-testT2", httpMethod = "POST", notes = "testT2", response = Object.class)
    public Object testT2(@RequestBody @ApiParam(name="data", value = "入参为User对象", required = true) Pager<User> data) {
        System.out.println(data.toString());
        return data;
    }


    /**
     * 测试解析泛型2
     * 总结： 要么加@RequestBody括号里随便什么，要么@ApiImplicitParam的dataType写泛型
     */
    @RequestMapping(value = "/testT3", method = RequestMethod.POST)
    @ApiOperation(value = "这是-testT3", httpMethod = "POST", notes = "testT3", response = User.class)
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "data", value = "泛型数据", paramType = "body", dataType = "Pager«User»", required = true)
    })
    public Object testT3(String data) {
        System.out.println(data.toString());
        return data;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(new String("utf-8".getBytes(),"utf-8"));
        System.out.println(new String("gbk".getBytes(),"gbk"));
        System.out.println(new String("iso-8859-1".getBytes(),"iso-8859-1"));
        System.out.println(new String("b-test charset".getBytes(),System.getProperty("sun.jnu.encoding")));

    }
}
