---
layout: post
title: "【MySQL】SpringBoot数据库操作乱码问题"
date: 2017-12-29 20:22:54 +0800
comments: true
categories: SpringBoot
tags: [SpringBoot]
keyword: 陈浩翔, 谙忆, SpringBoot, 数据库操作
description:  SpringBoot的数据库操作,乱码解决
---

今天在Spring-Boot进行数据库插入操作时，遇到了中文乱码插入。    
![](https://i.imgur.com/FgEyjqk.png)  

首先肯定是检查在哪里出了问题，先是IDEA，没毛病，utf8的  
![](https://i.imgur.com/2cdHV8K.png)  

然后检查springboot的编码，其实默认就是utf8的，为了保险，我自己把配置写好  

![](https://i.imgur.com/PvM5AdF.png)  

然后我怀疑在post方式时不是utf8，结果是utf8  
![](https://i.imgur.com/SCZKlpn.png)  
软件名为:Postman,模拟访问超级方便，强烈推荐  

为了更保险，我直接在测试类中写插入  
![](https://i.imgur.com/CGIvmNx.png)  

可是无一例外，中文全部是乱码。  

然后检查数据库，其实数据库我建的时候是utf8mb4的，不用检查，为了保险，检查了一遍，没问题(提示：utf8mb4编码完全兼容utf8编码)  
建议使用utf8mb4编码  

最后没办法，还是依靠万能的搜索，需要检查mysql的参数，发现character_set_server的编码为latin1。  

运行:
```
show VARIABLES like 'char%'
```
即可查询出  

![](https://i.imgur.com/Qo557ME.png)  

修改character_set_server编码为utf8mb4或者utf8  

找到mysql安装目录，修改配置文件，我这里是my.ini  
增加:
```
# 设置mysql客户端默认字符
character-set-server=utf8
```
  
![](https://i.imgur.com/lq9BdfX.png)  

重启mysql服务即可  
