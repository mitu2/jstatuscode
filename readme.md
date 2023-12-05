# jstatuscode

简单的封装了一下阿里嵩山版的错误码列表定义，如有需要自行查看或者参考一下

* `StatusCode#success()` 为成功调用
* `UserStatusCode` 为用户错误异常的一个枚举（A0112 - A1005）
* `SystemStatusCode` 为系统错误异常的一个枚举（B0001 - B0321）
* `ServiceStatusCode` 为服务错误异常的一个枚举（C0001 - C0503）