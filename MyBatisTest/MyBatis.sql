create database mybatis;

CREATE TABLE `sys_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `PASSWORD` varchar(255) DEFAULT NULL COMMENT '密码',
  `NICK_NAME` varchar(255) DEFAULT NULL COMMENT '昵称',
  `RIGHTS` varchar(255) DEFAULT NULL COMMENT '权限',
  `ROLE_ID` varchar(100) DEFAULT NULL COMMENT '角色',
  `LAST_LOGIN` varchar(255) DEFAULT NULL COMMENT '最后登录时间',
  `IP` varchar(100) DEFAULT NULL COMMENT 'IP地址',
  `STATUS` varchar(32) DEFAULT NULL COMMENT '状态',
  `SKIN` varchar(100) DEFAULT NULL COMMENT '皮肤',
  `EMAIL` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `NUMBER` varchar(100) DEFAULT NULL COMMENT '编号',
  `PHONE` varchar(32) DEFAULT NULL COMMENT '电话',
  `MAN_BUYER_ID` int(11) DEFAULT NULL COMMENT '产商,借卖方ID',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `sys_user` VALUES (1, 'zhangsan', '123456', '张三', '1', '1', '2017-08-17', '127.0.0.1', 'A', 'default', 'zhangsan@163.com', '201708170001', '13890876541', 1);


CREATE TABLE `pro_product` (
  `PRO_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `SKU_CD` varchar(8) NOT NULL COMMENT '商品sku编码',
  `BRD_ID` int(11) DEFAULT NULL COMMENT '外键，关联品牌id',
  `MAN_ID` int(11) NOT NULL COMMENT '外键关联man_id',
  `TITLE` varchar(255) DEFAULT NULL COMMENT '标题',
  `UPC` varchar(15) DEFAULT NULL COMMENT 'upc编码',
  `EAN` varchar(13) DEFAULT NULL COMMENT 'ena编码',
  `MODEL` varchar(45) DEFAULT NULL COMMENT '型号',
  `WARRANTY_DAY` varchar(45) DEFAULT NULL COMMENT '保修期（单位有年、月、日）',
  `RETAIL_PRICE` decimal(10,2) DEFAULT NULL COMMENT '建议零售价',
  `CREATED_BY` varchar(20) DEFAULT NULL,
  `CREATION_DATE` timestamp NULL DEFAULT NULL,
  `LAST_UPDATE_BY` varchar(20) DEFAULT NULL,
  `LAST_UPDATE_DATE` timestamp NULL DEFAULT NULL,
  `CALL_CNT` int(11) DEFAULT NULL,
  `REMARK` varchar(50) DEFAULT NULL,
  `STS_CD` char(1) NOT NULL DEFAULT 'A',
  `MININUM_RETAIL_PRICE` decimal(10,2) DEFAULT NULL COMMENT '最低零售价',
  `REPLENISHMENT_PERIOD` int(11) DEFAULT NULL COMMENT '补货期（天）',
  `KEY_WORDS` varchar(255) DEFAULT NULL COMMENT '关键字，预留后续搜索使用',
  `WARRANTY` text COMMENT '保修政策说明',
  `TIME_UNIT` varchar(10) DEFAULT NULL COMMENT '保修期单位 1、年 2、月 3、日',
  `STOCKSETING` int(11) DEFAULT NULL COMMENT '库存预警设置（当低于预警值时发出警告）',
  PRIMARY KEY (`PRO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `pck_package_info` (
  `PCK_ID` int(11) NOT NULL AUTO_INCREMENT,
  `WAR_ID` int(11) NOT NULL COMMENT '仓库ID',
  `PRO_ID` int(11) DEFAULT NULL COMMENT '绑定的 PRO_ID\n\n与 VAR_ID 只可能有一个',
  `TYPE_CD` char(1) DEFAULT NULL COMMENT '对应master 表PAC_REGISTER\nM - 厂家设定\nW - 仓库注册',
  `WIDTH` decimal(7,2) DEFAULT NULL COMMENT '宽 - cm',
  `HEIGHT` decimal(7,2) DEFAULT NULL COMMENT '高 - cm',
  `LENGTH` decimal(7,2) DEFAULT NULL COMMENT '长  - cm',
  `WEIGHT` decimal(5,2) DEFAULT NULL COMMENT '重 - kg',
  `CREATED_BY` varchar(20) DEFAULT NULL,
  `CREATION_DATE` timestamp NULL DEFAULT NULL,
  `LAST_UPDATE_BY` varchar(20) DEFAULT NULL,
  `LAST_UPDATE_DATE` timestamp NULL DEFAULT NULL,
  `CALL_CNT` int(11) DEFAULT NULL,
  `REMARK` varchar(50) DEFAULT NULL,
  `STS_CD` char(1) NOT NULL DEFAULT 'A',
  `HEAVY_CARGO` varchar(2) DEFAULT NULL COMMENT '0',
  `LOGISTICS_COMPANY` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PCK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ofp_offer_price` (
  `OFP_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `MAN_ID` int(11) DEFAULT NULL COMMENT '制造商ID',
  `EFFETIVE_START_DATE` timestamp NULL DEFAULT NULL COMMENT '价格有效期开始时间',
  `EFFECTIVE_END_DATE` timestamp NULL DEFAULT NULL COMMENT '价格有效期结束时间',
  `PRO_ID` int(11) DEFAULT NULL COMMENT '商品ID 外键关联pro表',
  `PRICE` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '单价',
  `TYPE_CD` varchar(3) DEFAULT NULL COMMENT '对应master表的PRICE_TYPE\nPUB - 公开借卖价\nPRO - 促销价\nVIP - 专享价',
  `DSR_ID` int(11) DEFAULT NULL COMMENT '借卖方id，关联专享价用，其他类型该字段为空',
  `CREATED_BY` varchar(20) DEFAULT NULL COMMENT '创建人',
  `CREATION_DATE` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `LAST_UPDATE_BY` varchar(200) DEFAULT NULL COMMENT '更新人',
  `LAST_UPDATE_DATE` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `CALL_CNT` int(11) DEFAULT NULL COMMENT '乐观锁',
  `REMARK` varchar(50) DEFAULT NULL COMMENT '备注',
  `STS_CD` char(1) NOT NULL DEFAULT 'A' COMMENT '有效性',
  `PERIOD` varchar(1) DEFAULT NULL COMMENT '是否自动设置价格（1为自动以相同价格进入下一个周期）',
  PRIMARY KEY (`OFP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sao_sales_order` (
  `SAO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATED_BY` varchar(50) DEFAULT NULL COMMENT '创建人',
  `CREATION_DATE` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `LAST_UPDATE_BY` varchar(20) DEFAULT NULL COMMENT '更新人',
  `LAST_UPDATE_DATE` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `CALL_CNT` int(11) DEFAULT NULL COMMENT '乐观锁',
  `REMARK` varchar(50) DEFAULT NULL COMMENT '备注',
  `STS_CD` char(1) NOT NULL DEFAULT 'A' COMMENT '数据有效性',
  `MAN_ID` int(11) DEFAULT NULL COMMENT '制造商ID',
  `WAR_ID` int(11) DEFAULT NULL COMMENT '仓库ID',
  `SYNC_DATE` timestamp NULL DEFAULT NULL COMMENT '第一次同步时间',
  `PAYMENT_DATE` timestamp NULL DEFAULT NULL COMMENT '支付时间',
  `PUSH_DATE` timestamp NULL DEFAULT NULL COMMENT '推送到仓库的时间',
  `TRACK_NO_DATE` timestamp NULL DEFAULT NULL COMMENT '取得物流跟踪号的时间',
  `FULFILLMENT_DATE` timestamp NULL DEFAULT NULL COMMENT '物流妥投时间',
  `SETTLEMENT_DATE` timestamp NULL DEFAULT NULL COMMENT '结款时间',
  `PRODUCT_AMOUNT` decimal(8,2) DEFAULT '0.00' COMMENT '订单价格',
  `FREIGHT_COST` decimal(8,2) DEFAULT '0.00' COMMENT '运费',
  `HANDLING_FEE` decimal(8,2) DEFAULT '0.00' COMMENT '订单处理费',
  `CUSTOMER_REMARK` varchar(300) DEFAULT NULL COMMENT '消费者备注',
  `ORDER_NO` varchar(45) NOT NULL COMMENT '订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z',
  `ORDER_STS` varchar(45) DEFAULT NULL COMMENT '订单状态:\n1. AwaitingPayment \n2. AwaitingShipment \n3. SHIPPED 已发货\n4. Complete 已完成5. Canceled已取消',
  `REFUND_STS` varchar(45) DEFAULT NULL COMMENT '退款状态\n\n1. OPEN - 开启\n2. CLOSE  - 已完结\n',
  `DELIVERY_STS` varchar(45) DEFAULT NULL COMMENT '发货状态\n\n1. SYNC - 已同步到仓库\n2. STOCK_OUT - 已出库\n3. SHIPPING - 发货中\n4. FULFILLED - 已妥投\n',
  `STO_ID` int(11) NOT NULL COMMENT 'GM 平台订单, 已拆单\n\n按 仓库 / 厂家 进行拆单',
  `LAST_FREIGHT_COST` decimal(8,2) DEFAULT NULL COMMENT '斑马返回物流费用',
  `CANCLE_TIME` timestamp NULL DEFAULT NULL COMMENT '取消时间',
  `AUTO_PAY_STATUS` char(2) DEFAULT NULL COMMENT '0自动，1非自动，2取消，3异常，4完成',
  `BUYER_CHECKOUT_MESSAGE` text,
  `AUTO_PAY_TIME` varchar(5) DEFAULT NULL COMMENT '订单自动支付时间',
  PRIMARY KEY (`SAO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `sal_sales_order_line_item` (
  `SAL_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `CREATED_BY` varchar(20) DEFAULT NULL COMMENT '创建人',
  `CREATION_DATE` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `LAST_UPDATE_BY` varchar(20) DEFAULT NULL COMMENT '更新人',
  `LAST_UPDATE_DATE` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  `CALL_CNT` int(11) DEFAULT NULL COMMENT '乐观锁',
  `REMARK` varchar(50) DEFAULT NULL COMMENT '备注',
  `STS_CD` char(1) NOT NULL DEFAULT 'A' COMMENT '数据有效性',
  `SAO_ID` int(11) NOT NULL COMMENT '销售订单主表ID',
  `PRO_ID` int(11) DEFAULT NULL COMMENT '商品ID',
  `QTY` int(11) DEFAULT NULL COMMENT '商品数量',
  `PRICE` decimal(8,2) DEFAULT NULL COMMENT '商品单价',
  `SOL_ID` int(11) NOT NULL COMMENT '同步数据ID',
  `TRACKING_NO` varchar(45) DEFAULT NULL COMMENT '物流跟踪号',
  `WSP_NAME` varchar(45) DEFAULT NULL COMMENT '快递公司',
  PRIMARY KEY (`SAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table users(
	id int,
    username varchar(10),
    password varchar(10)
);
select * from users;
insert into users values(1,'TOM','111');

-- -------------------------------------------------------------------------------------------
-- -------------------------------------------------------------------------------------------
-- -------------------------------------------------------------------------------------------
-- -------------------------------------------------------------------------------------------
-- -------------------------------------------------------------------------------------------

﻿-- 商品表
CREATE TABLE items (
  id INT NOT NULL  AUTO_INCREMENT,
  itemsname VARCHAR(32) NOT NULL COMMENT '商品名称',
  price FLOAT(10,1) NOT NULL COMMENT '商品定价',
  detail TEXT COMMENT '商品描述',
  pic VARCHAR(64) DEFAULT NULL COMMENT '商品图片',
  createtime DATETIME NOT NULL COMMENT '生产日期',
  PRIMARY KEY (id)
)  DEFAULT CHARSET=utf8;

CREATE TABLE t_user (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(32) NOT NULL COMMENT '用户名称',
  birthday DATE DEFAULT NULL COMMENT '生日',
  sex CHAR(1) DEFAULT NULL COMMENT '性别',
  address  VARCHAR(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;

CREATE TABLE orders (
  id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL COMMENT '下单用户id',
  number VARCHAR(30) NOT NULL COMMENT '订单号',
  createtime DATETIME NOT NULL COMMENT '创建订单时间',
  note VARCHAR(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)  DEFAULT CHARSET=utf8;


CREATE TABLE orderdetail (
  id INT NOT NULL AUTO_INCREMENT,
 orders_id INT NOT NULL COMMENT '订单id',
  items_id INT NOT NULL COMMENT '商品id',
  items_num INT  DEFAULT NULL COMMENT '商品购买数量',
  PRIMARY KEY (id),
  KEY `FK_orderdetail_1` (`orders_id`),
  KEY `FK_orderdetail_2` (`items_id`),
  CONSTRAINT `FK_orderdetail_1` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_orderdetail_2` FOREIGN KEY (`items_id`) REFERENCES `items` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
)  DEFAULT CHARSET=utf8;

/*Data for the table `items` */

INSERT  INTO items(itemsname,price,detail,pic,createtime) VALUES 
('台式机',3000.0,'该电脑质量非常好！',NULL,'2015-07-07 13:28:53'),
('笔记本',6000.0,'笔记本性能好，质量好！',NULL,'2015-07-08 13:22:57'),
('背包',200.0,'名牌背包，容量大质量好！',NULL,'2015-07-010 13:25:02');
select * from items;
truncate table items;
/*Data for the table `orderdetail` */

INSERT  INTO `orderdetail`(`orders_id`,`items_id`,`items_num`) VALUES
 (1,1,1),
 (1,2,3),
 (2,3,4),
 (3,2,3);
select * from orderdetail;
/*Data for the table `orders` */

INSERT  INTO `orders`(`user_id`,`number`,`createtime`,`note`) VALUES 
(1,'1000010','2015-06-04 13:22:35',NULL),
(1,'1000011','2015-07-08 13:22:41',NULL),
(2,'1000012','2015-07-17 14:13:23',NULL),
(3,'1000012','2015-07-16 18:13:23',NULL),
(4,'1000012','2015-07-15 19:13:23',NULL),
(5,'1000012','2015-07-14 17:13:23',NULL),
(6,'1000012','2015-07-13 16:13:23',NULL);
select * from orders;
/*Data for the table `user` */

INSERT  INTO `t_user`(`username`,`birthday`,`sex`,`address`) VALUES 
('王五',NULL,'2',NULL),
('张三','2014-07-10','1','北京市'),
('张小明',NULL,'1','河南郑州'),
('陈小明',NULL,'1','河南郑州'),
('张三丰',NULL,'1','河南郑州'),
('陈小明',NULL,'1','河南郑州'),
('王五',NULL,NULL,NULL),
 ('小A','2015-06-27','2','北京'),
('小B','2015-06-27','2','北京'),
('小C','2015-06-27','1','北京'),
('小D','2015-06-27','2','北京');


