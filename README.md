WebGoat Version: v8.0.0-SNAPSHOT Insecure Deserialization WriteUp
8.00 版本和最新的不一样，没有现成的工具类，必须自己上传工具类。因为反序列化的是对象，不是整个类。
这个工具类也是通过最新的WebGoat 8.2.2 2023.9里面获取到的。链接如下：
https://github.com/WebGoat/WebGoat
我放的目录是这里,其他地方只要能保证找到，理论上都可以，不要放到 webwolf，这里是无法成功的。
![img.png](Downloads/framework11/img.png)
Å
#注意事项
反序列化必须满足 2 个点，这也是我弄了好久没有成功的原因。
1、必须 package一致，程序才能找到反序列化对象调用的类。
2、必须serialVersionUID一致

#运行程序
运行 aaa里面的代码，输出的 base64编码的字符串就是

成功的截图：
![img_1.png](Downloads/framework11/img_1.png)¸¸¸
