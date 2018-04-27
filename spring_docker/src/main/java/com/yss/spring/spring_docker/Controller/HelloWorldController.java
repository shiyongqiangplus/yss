/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloWorldController
 * Author:   lenovo
 * Date:     2018-04-09 9:54
 * Description: helloworld
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yss.spring.spring_docker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈helloworld〉
 *
 * @author lenovo
 * @create 2018-04-09
 * @since 1.0.0
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloworld(){
        return "hello";
    }

}
