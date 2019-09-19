# 认证中心Demo
 登陆功能
 >1. 密码可以考虑不明文传递，但是不要去服务器请求盐，使用如域名等用作盐，
 >2. 后端得到密码，使用盐加密之后和数据库进行对比。
 >3. 用户盐和密码最好不要存在一个数据库中。
 <br>具体请看：[Salted Password Hashing - Doing it Right](https://crackstation.net/hashing-security.htm)
 