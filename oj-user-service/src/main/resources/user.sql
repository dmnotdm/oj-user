CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(40) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(60) NOT NULL DEFAULT '' COMMENT '密码',
  `access_key` varchar(45) NOT NULL DEFAULT '' COMMENT '验证秘钥',
  `secret_key` varchar(45) NOT NULL DEFAULT '' COMMENT '签名秘钥',
  `status` varchar(20) NOT NULL DEFAULT '' COMMENT '状态',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `create_time` bigint(20) NOT NULL COMMENT '创建时间戳',
  `update_time` bigint(20) NOT NULL COMMENT '更新时间戳',
  PRIMARY KEY (`id`),
  KEY `username_index` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;