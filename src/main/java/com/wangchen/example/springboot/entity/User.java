package com.wangchen.example.springboot.entity;


import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9194443460878449372L;

	@ApiModelProperty(value = "用户ID",required = true)
	private Long id;

    @ApiModelProperty(value = "用户名")
	private String name;

	@ApiModelProperty(value = "年龄")
	private Integer age;

	@ApiModelProperty(value = "部门ID")
    private Integer departmentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", departmentId=" + departmentId + "]";
	}
    
    
}
