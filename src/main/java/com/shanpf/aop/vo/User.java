package com.shanpf.aop.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private static final long serialVersionUID = 5423250528202430257L;
	private String id;
	private String user_Name;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;
	private String birthday;
	private String created;
	private String updated;
}