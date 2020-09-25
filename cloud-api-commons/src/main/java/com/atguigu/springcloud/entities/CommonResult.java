package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：zhanghao
 * @date ：Created in 2020/7/12 18:37
 * @description：返回前端接收的Json{code：，message：，data}
 * @modified By：json封装体 前后端分离
 * @version: $
 */
@Data //使用这个注解，就不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了，注解后在编译时会自动加进去。
@AllArgsConstructor  //使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor  //使用后创建一个无参构造函数
public class CommonResult<T> {
    private Integer code;
    private String message;
    //传的类型
    private T data;

    public CommonResult(Integer code,String message){
            this(code,message,null);
    }

}
