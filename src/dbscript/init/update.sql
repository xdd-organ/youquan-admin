alter table `user` add `score` int(11) DEFAULT 0 COMMENT '分';
alter table `user` add `type` int(11) DEFAULT 0 COMMENT '0:普通用户，1：后台管理员，2：经销商管理员';