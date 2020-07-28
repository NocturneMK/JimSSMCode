/*
SQLyog Ultimate v9.62 
MySQL - 8.0.13 : Database - db_net
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_net` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `db_net`;

/*Table structure for table `tb_company` */

DROP TABLE IF EXISTS `tb_company`;

CREATE TABLE `tb_company` (
  `id` int(34) NOT NULL AUTO_INCREMENT,
  `c_name` char(50) NOT NULL,
  `email` char(60) NOT NULL,
  `tel` char(55) NOT NULL,
  `internet` char(77) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk;

/*Data for the table `tb_company` */

insert  into `tb_company`(`id`,`c_name`,`email`,`tel`,`internet`) values (1,'北京Java群社区科技有限公司','javaqunshequ@163.com','010-88888888','www.javaqunshequ.com');

/*Table structure for table `tb_culture` */

DROP TABLE IF EXISTS `tb_culture`;

CREATE TABLE `tb_culture` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gbk;

/*Data for the table `tb_culture` */

insert  into `tb_culture`(`id`,`content`) values (3,'正直：\r\n\r\n    遵守国家法律与公司制度，绝不触犯企业高压线；\r\n    做人德为先，坚持公正、诚实、守信等为人处事的重要原则；\r\n    用正直的力量对周围产生积极的影响。<br><br>\r\n\r\n进取：\r\n\r\n    尽职尽责，高效执行；\r\n    勇于承担责任，主动迎接新的任务和挑战；\r\n    保持好奇心，不断学习，追求卓越。<br><br>\r\n\r\n合作：\r\n\r\n    具有开放共赢心态，与合作伙伴共享行业成长；\r\n    具备大局观，能够与其他团队相互配合，共同达成目标；\r\n    乐于分享专业知识与工作经验，与同事共同成长。<br><br>\r\n\r\n创新：\r\n\r\n    创新的目的是为用户创造价值；\r\n    人人皆可创新，事事皆可创新；\r\n    敢于突破，勇于尝试，不惧失败，善于总结。\r\n');

/*Table structure for table `tb_news` */

DROP TABLE IF EXISTS `tb_news`;

CREATE TABLE `tb_news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` char(255) NOT NULL,
  `author` char(10) NOT NULL,
  `content` mediumtext,
  `subtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=gbk;

/*Data for the table `tb_news` */

insert  into `tb_news`(`id`,`title`,`author`,`content`,`subtime`) values (11,'华力创通将于11月参加中国国际卫星应用展览','李青','中国网12月1日讯 据葡萄牙媒体报道，专家通过参会人员数字估算出了巴黎气候大会带来的碳排放量。现在正在法国巴黎召开的气候大会给当地带来了近5万的来自195个国家的外国人，其中主要参会官员和其他一些相关人员（例如企业家，环保积极分子，学生和记者等）。他们中的绝大部分是乘飞机来的巴黎。他们这趟旅程给大气增加了30万吨的二氧化碳排放。\r\n\r\n这个数字来源于美国Wired网的科学专栏记者Nick Stockton。但他也说：“这个计算是我坐在咖啡桌旁写一张餐巾纸上完成的，官方准确数据联合国晚些才会公布。”\r\n\r\n官方公布的信息里，有2万2千名官员及其助理参与此次巴黎气候大会。随之而来的还有各种以联合国、环保人士、公司企业、大学研究、社会组织名义前往巴黎的相关人员。据Nick Stockton估计，这些因气候大会来到巴黎的人差不多有5万。\r\n\r\n这些游客来自世界各地，较近的有非洲人和欧洲人，较远的有大洋洲人、亚洲人和美洲人。平均路程（包括往返）高达一万四千五百公里。\r\n\r\nStockton继续列出他的计算：这5万人中有很多来自欧洲国家的可以选择开车或坐火车来巴黎，但其他人只能乘飞机。那么，假设油箱是满的，而每班机都恰好耗尽它油箱里的油。而一架波音747飞机每消耗4升燃油（更确切来说是3.78升）能飞265.5公里。由此可算出，现在在巴黎的这五万人就消耗了1.02亿升燃油。\r\n\r\n每升燃油燃尽后给大气排放了9.5kg的二氧化碳。两个数字相乘可得出，因气候大会飞往巴黎的飞机排放了28.7万吨左右的二氧化碳。\r\n\r\n再加上他们在巴黎要住酒店，吃餐馆，去娱乐场所消遣，乘坐的士或专车，这些活动过程中带来的碳排放和飞机的排碳量加起来大约有30万吨。\r\n\r\n30万吨看起来是个天文数字，但放到全球来看，它在世界年度碳排放总量中只是九牛一毛。','2015-12-01 20:07:28'),(12,'集团技术专家当选国际钢协技术委员会主席','艾瑞莉娅','【环球网报道】据俄罗斯RT新闻网12月1日报道，俄罗斯驻北约代表亚历山大·格鲁什科日前表示，在俄战机被击落之后，北约方面不仅拒绝对土耳其的这一故意行为发表评论，还为土耳其方面提供政治上的庇护，做出如此举动的北约同样应当为事件本身负责。\r\n\r\n格鲁什科是在同北约副秘书长亚历山大?弗什博会面后在接受采访时发表上述言论的。他表示，在会面期间向弗什博提交了俄方对于事件的评估，以及能够揭示土耳其方面“故意行为”的有关证据，但弗什博并未就土耳其的这一侵略行为发表评论，只是呼吁土俄双方就该事件进行“直接和克制”的进一步沟通。\r\n\r\n格鲁什科指出，北约方面显然无意在这一问题上同俄方展开深入探讨。他强调称，即便退一万步以土方的所谓“入侵领空说”为基础进行讨论，土方的行为也显然是有悖北约惯例的，根据土耳其方面提供的信息，土方的飞行员在击落俄军的苏-24之前甚至“不知道对方军机所属的国家”。\r\n\r\n格鲁什科表示，鉴于此，北约在这一事件发生后默不作声的行为以及土耳其方面迅速得到北约支持的事实表明，北约同样应当为其成员国的行径承担责任。从本次事件可以看出，政治上的考量又一次战胜了客观事实与最简单不过的常识','2015-12-01 20:07:53'),(13,'集团客户服务中心正式成立','瑞文','俄罗斯军队中一名逃兵十年前擅自离队，躲在巴罗夫斯克市郊的丛林里。\r\n\r\n中国日报网12月1日电（信莲） 据英国《卫报》12月1日报道，俄罗斯军队中一名逃兵擅自离队，在丛林之中藏身十年。当局一度认为，这名逃兵已经死亡，近日却意外发现了他，随即将其逮捕。\r\n\r\n这名逃兵现年30岁，姓名没有对外公开。他于2003年应征入伍，被派驻在俄罗斯东部偏远的勘察加半岛。按规定，他需要服役至少满2年。不过，当地警方称，没想到仅仅1年之后，他就擅自离队，当了逃兵。\r\n\r\n当地官员11月30日发布声明说：“他（逃跑后）这段时间一直住在勘察加，主要藏身于丛林当中。他从事各种奇怪的工作以维持生计，而且没有试图联系他的家人。”\r\n\r\n据俄罗斯塔斯社报道，这名逃兵失踪几个月之后，他的家人曾经错误地将一具陌生遗体当成是他本人，并且认认真真的将其下葬。俄罗斯当局原本正努力搜索这名逃兵，见状也就终止了搜索行动。有官员称，这名逃兵可能存在“家庭问题”。\r\n\r\n有报道说，这名逃兵利用老旧的建筑材料在当地市郊盖了一座房子，就此安家。为了谋生，他从事过各种工作，包括在养猪场打工、收废品等。\r\n\r\n按照俄罗斯法律，这名逃兵可能面临最高7年的有期徒刑。不过，也有俄方人士称，这名逃兵不大可能遭受牢狱之灾。因为在那个年代，俄东地区的逃兵绝非少数。他们当中很多人可能会在一个地下室里藏身多年。当局找到他们之后，往往只是让他们接受一些心理测试，然后就把他们放走了。断剑','2015-12-01 20:08:12'),(14,'集团加入瑞典国家冶金研究院','菲奥娜','环球网报道 据俄罗斯“卫星”网12月1日报道，俄总理梅德韦杰夫表示，俄罗斯对土耳其的限制措施将在必要的情况下扩大。\r\n\r\n据报道，梅德韦杰夫在与副总理的会议上说：“目前将进入法案的那些措施，仅仅是第一步。我们还会观察事态的发展情况。我们在规定的授权范围内有可能会扩大禁止进口商品名单、以及禁止入境人员名单，并采取其他旨在限制或终止与土耳其合作的措施。”\r\n\r\n他强调：“这都将在必要时进行。”他呼吁尽可能仔细对待限制措施， 并在必要时进行修改。\r\n\r\n俄总统普京11月28日签署了关于确保国家安全和对土耳其采取专门经济措施的总统令。其中，普京已下令停飞两国间的包机，禁止雇主自2016年 1月1日起雇佣土耳其公民，并规定禁止和限制俄境内受土耳其司法管辖权保护的企业运作，并命令禁止或限制部分土耳其商品的进口。\r\n\r\n俄政府受命制定受限土耳其企业工作与服务种类名单，以及禁止从土耳其进口的商品名单。此外，根据法令，内阁应确定不受雇佣土耳其公民禁令制约的企业。','2015-12-01 20:08:36'),(18,'\"北斗耀全球 璀璨中国梦\"——华力创通亮相中国卫星导航与位置服务年会','金克斯','尖刺','2015-12-01 13:32:27'),(19,'远古巫灵','泽拉斯','能量球','2014-12-21 18:19:09'),(20,'武器大师','金克斯','一灯','2016-05-13 18:20:54'),(22,'光辉女郎','拉克丝','魔法棒','2014-10-20 18:24:15'),(23,'法外狂徒','雷克华','gun','2015-11-09 18:25:40'),(24,'机械公敌','兰博','喷火器','2016-05-13 18:26:37'),(26,'时间刺客','艾克','沙漏','2015-11-29 13:08:50'),(27,'齐天大圣','孙悟空','金箍棒','2015-11-29 13:09:12'),(29,'雪人骑士','努努','冰块','2015-11-29 13:09:35'),(30,'asdasdsd','asdsad','adsadsadsadsadsad','2015-12-02 10:29:55'),(32,'周一1111','张三','下雪了，但是现在停了','2017-02-15 17:50:32');

/*Table structure for table `tb_product` */

DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `id` int(55) NOT NULL AUTO_INCREMENT,
  `name` char(55) NOT NULL,
  `category` char(55) NOT NULL,
  `content` char(55) NOT NULL,
  `image` char(55) DEFAULT NULL,
  `subtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=gbk;

/*Data for the table `tb_product` */

insert  into `tb_product`(`id`,`name`,`category`,`content`,`image`,`subtime`) values (1,'盖伦','德玛西亚','我将带头冲锋','顺丰包邮','2015-11-24 20:39:47'),(2,'嘉文','德玛西亚','方法','','2015-11-24 20:46:49'),(3,'赵信','德玛西亚','一点寒芒先到,随后抢出如龙','','2015-11-26 09:27:11'),(4,'薇恩','德玛西亚','啊啊','','2015-11-26 09:34:24'),(5,'卡特琳娜','诺克萨斯','啊啊','顺丰包邮','2015-11-26 09:35:42'),(6,'乐芙兰','诺克萨斯','啊','中通包邮','2015-11-26 09:36:49'),(7,'艾瑞莉亚','艾欧尼亚','我的剑刃愿为您效劳','顺丰包邮','2015-11-26 09:37:08'),(8,'凯南','艾欧尼亚','是是是,疾如风','aaa','2015-11-26 09:39:31'),(9,'兰博1','班德尔城','饿222','','2015-11-26 09:39:48'),(10,'timo','班德尔城','是,队长','cccc','2015-11-26 09:40:53'),(11,'凯特琳','皮尔特沃夫','啊啊啊','ddd','2015-11-26 09:41:24'),(12,'伊泽瑞尔','皮尔特沃夫','有谁看见我的地图了吗？','dddd','2015-11-26 09:43:30'),(13,'杰斯','皮尔特沃夫','阿迪萨斯的','eee','2015-11-26 09:44:02'),(14,'奥利安娜','皮尔特沃夫','木偶','ffff','2015-11-26 09:46:18'),(15,'维克托','祖安','爱上大声地','hhhh','2015-11-26 09:46:37'),(16,'金克斯','祖安','爱上大声地','gggg','2015-11-26 09:46:59'),(17,'艾克','祖安','时间沙漏','llll','2015-11-26 09:48:11'),(21,'格雷福斯','诺克萨斯','我喜欢打移动的靶子','','2015-11-26 11:26:19');

/*Table structure for table `tb_sopport` */

DROP TABLE IF EXISTS `tb_sopport`;

CREATE TABLE `tb_sopport` (
  `id` int(55) NOT NULL AUTO_INCREMENT,
  `name` char(55) NOT NULL,
  `support` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk;

/*Data for the table `tb_sopport` */

insert  into `tb_sopport`(`id`,`name`,`support`) values (1,'support','在中国投资设立研发技术支持中心，体现了思杰对中国市场的长期承诺和投资的决心。我们将把\r\n更多的前沿科技带给中国用户，帮助他们在世界领先的技术平台上实现更多更大的创新，为中国\r\n的高速发展推波助澜。<br><br>” 思杰研发中心 全球副总裁Peter Marconi 表示。\r\n\r\n\r\n戴华杰常委表示：“思杰公司拥有全球先进的技术，具有十足的创新能力。思杰将中国研发技术\r\n支持中心设在南京，非常符合我市关注高科技创新技术的战略，希望我们能与思杰公司以此成功\r\n合作为起点，不断创造出辉煌的未来篇章。”<br><br>\r\n中国研发技术支持办公室建立于2011年，新成立的中心不仅将承担研发的重任，还将肩负技术\r\n支持的工作，Citrix中国研发技术支持中心是思杰全球软件开发和支持团队的重要组成部分。目\r\n前，南京团队拥有200多名员工，工作内容覆盖包括应用交付，云服务和XenServer等广泛的公司\r\n产品线的开发。在此之上，思杰全球化服务，产品洞察力与分析团队将给整个产品线和团队提供\r\n服务，思杰全球十个技术支持中心和1000多个支持专业人员将给予全球的客户服务支持。');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `username` char(50) NOT NULL,
  `password` char(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=gbk;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`password`) values (1,'xiaohongmao','10086'),(2,'admin','admin'),(3,'mike22222','a222222'),(4,'mike2222222','a22222222'),(6,'admin3','admin3'),(7,'admin','admin'),(8,'aaaa','a');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
