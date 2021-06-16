# 基于SSM框架的网上购物送货系统
系统开发平台：Tomcat8.0 + JDK1.8 + Windows10

开发语言：JavaEE

JAR包管理：Maven3.6.1

前端：jQuery html5/css3

后台

核心架构：SpringBoot

Web框架：SpringMVC

持久层框架：Mybatis

模板引擎：Thymeleaf

数据库：Mysql
# 1.系统参与角色：管理者、购物者、送货员。

 1. 管理者：负责管理商品，提供商品信息，处理订单事务，系统的日常维护，控制超市状态。   
 2. 购物者：在线注册账户，更新个人信息，管理账户，搜索浏览商品，管理购物车，支付订单，申请退款，留言以及售后评价。
 3. 送货员：注册成为送货员，更新个人信息，查看订单信息。

# 2.系统应用场景

 1. 活动泳道图之管理者
在现实应用中，管理员可以通过管理员界面进行登录，然后管理商品，账号等信息。也可以设置超市公告，查看销售情况和订单信息等
![在这里插入图片描述](https://img-blog.csdnimg.cn/2021060818403134.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
2.活动泳道图之购物者
在现实应用中，购物者可以通过顾客界面进行登录，然后查看商品并对其进行各项操作，包括加入购物车和购买支付等，也可以管理自身信息，留言
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184128986.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
3.活动泳道图之送货员
在现实应用中，送货员可以通过送货员界面进行登录，然后管理自身信息，也可以查看订单信息并操作
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184148729.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

# 3.1需求模型

1.购物者业务流程图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184235672.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
2.管理员业务流程图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184255367.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
3.送货员业务流程图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184319379.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
4.订单管理业务流程图![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184331814.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

# 3.2功能模型

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184355428.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

# 3.3用例模型

![管理员用例图](https://img-blog.csdnimg.cn/20210608184415142.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![用户用例图](https://img-blog.csdnimg.cn/20210608184428959.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

# 4.系统截图

## 用户页面

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184503797.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184510432.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)


![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184524871.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184536654.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184547955.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

## 送货员页面

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184554927.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

## 管理员页面

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184602245.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184655151.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184703440.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184707731.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184713690.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2021060818471891.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)


# 5.难点实现
## 2.支付宝支付实现
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184909336.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184919841.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
!![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184954909.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608184959606.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2021060818500414.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608185009984.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
## 2.服务器的搭建
服务器搭建教程：
[https://blog.csdn.net/qq_35206244/article/details/83184173](https://blog.csdn.net/qq_35206244/article/details/83184173)
[https://blog.csdn.net/Aidiying/article/details/84442638](https://blog.csdn.net/Aidiying/article/details/84442638)
为了实现用户的远程操作，我们把项目部署到了云服务器上，云服务器可以节省经济成本，又节约了大量时间。我们项目用的是腾讯云服务器。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608185540462.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608185544291.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608185559940.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

## 3.销量图表
为了方便管理员进货，我们利用图表来帮助管理员了解商城销售商品的数量以及占比，利用ECharts来将后台的销量数据可视化，以便于直观显示销量占比
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608185345574.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)
## 4.订单号设置随机数保证一定的并发性
在购物时，会根据购物时间来生成订单号，为了避免多人同时购买商品时订单号重复使系统出现问题，我们利用ordernum++来生成不重复的订单号，保证一定程度的并发性。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210608185451284.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)

## 5.定时调用轮转实现图片轮换
![1.在jsp中创建容器用来存放图片
2.在css中设置相关的样式
3.js中的相关代码
 1）从后台获取图片的地址
 2）设置图片的轮转
 3）轮转的具体实现
4.定时调用轮转方法
](https://img-blog.csdnimg.cn/20210608185210643.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)


## 6.按序排列
![定义一个对象数组
定义一个比较器--降序排列
对象数组 按照某个属性 降序排列
](https://img-blog.csdnimg.cn/20210608185314220.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQ1ODA4NzAw,size_16,color_FFFFFF,t_70)



