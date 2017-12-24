---
layout: post
title: "【SpringBoot】HelloWord与SpringBoot的三种启动方式"
date: 2017-12-24 13:38:54 +0800
comments: true
categories: SpringBoot
tags: [SpringBoot]
keyword: 陈浩翔, 谙忆, SpringBoot
description:  
---

#第一个SpringBoot应用

在这里我选择的开发工具是IntelliJ IDEA。

在开发前，你需要把环境都装好，Maven，JDK。

按照下面的图片步骤，即可建好一个helloword项目了。

![](https://i.imgur.com/ybHYp2K.png) 

![](https://i.imgur.com/OTqXNOK.png)  

![](https://i.imgur.com/WI8X2gz.png)  
勾选中web选项的web

![](https://i.imgur.com/gTm8fhw.png)  
这三个目录和文件没什么用，你可以删除。  
第一次建springBoot项目可能需要时间有点久，别急，在下载jar包呢。  

新建一个类：  
![](https://i.imgur.com/ek1qdRq.png)  
```java
package cn.chenhaoxiang;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 陈浩翔.
 * Date: 2017/12/24.
 * Time: 下午 10:44.
 * Explain:
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot!";
    }
}
```

#第一种运行方式
也是最常用的，最简单的方式。  
![](https://i.imgur.com/Tn13rey.png)  

运行后打开地址访问:  
![](https://i.imgur.com/CxtHCbr.png)  

#第二种运行方式

命令行下cd 到项目目录。

![](https://i.imgur.com/e2GHtbT.png)  
运行:mvn pring-boot:run  
如无法执行，请先把maven添加到环境变量中  

即可启动成功：  
![](https://i.imgur.com/V4qM5op.png)  

#第三种启动方式 

也是命令行方式，cd到项目根目录  

首先执行：  
mvn install
编译后再执行：  
![](https://i.imgur.com/fbzdaVw.png)  
cd target  

然后找到该文件名:  
![](https://i.imgur.com/U3zs5t5.png)  

执行：
java -jar hello-0.0.1-SNAPSHOT.jar

# 源代码下载地址：
<blockquote cite='陈浩翔'>
GITHUB源码下载地址:<strong>【<a href='chenhaoxiang' target='_blank'>点我进行下载</a>】</strong>
</blockquote>

# 源代码下载地址：
GITHUB源码下载地址:【**[点我进行下载](http://chenhaoxiang.cn "点我进行下载")**】


本文章由<a href="chenhaoxiang" target='_blank'>[谙忆]</a>编写， 所有权利保留。 
欢迎转载，分享是进步的源泉。
<blockquote cite='陈浩翔'>
<p background-color='#D3D3D3'>转载请注明出处：<a href='http://chenhaoxiang.cn'><font color="green">http://chenhaoxiang.cn</font></a><br><br>
本文源自<strong>【<a href='http://chenhaoxiang.cn' target='_blank'>人生之旅_谙忆的博客</a>】</strong></p>
</blockquote>

<a href="chenhaoxiang" target='_blank'>谙忆</a>

http://chenhaoxiang.cn/2017/03/27/0738/ 有个链接没改！！！！！！！csdn的
