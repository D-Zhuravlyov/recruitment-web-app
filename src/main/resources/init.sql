DROP DATABASE IF EXISTS recruitmentAppZhuravlyov;
CREATE DATABASE recruitmentAppZhuravlyov;

use recruitmentAppZhuravlyov;

DROP TABLE IF EXISTS CANDIDATE;

CREATE TABLE CANDIDATE (
  `candidate_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL DEFAULT '',
  `last_name` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `date_added` datetime DEFAULT NULL,
  `interview_date` datetime DEFAULT NULL,
  PRIMARY KEY (`candidate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=348 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS SKILL;

CREATE TABLE SKILL (
  `skill_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `skill_name` varchar(35) DEFAULT NULL,
  `skill_rate` smallint(2) DEFAULT NULL,
  `candidate_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`skill_id`),
  KEY `candidate_skill` (`candidate_id`),
  CONSTRAINT `candidate_skill` FOREIGN KEY (`candidate_id`) REFERENCES CANDIDATE (`candidate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS ADDRESS;

CREATE TABLE ADDRESS (
  `address_id` int(11) unsigned NOT NULL,
  `country` varchar(15) DEFAULT NULL,
  `city` varchar(25) DEFAULT NULL,
  `street` varchar(25) DEFAULT NULL,
  `post_index` varchar(15) DEFAULT NULL,
  `candidate_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`address_id`),
  KEY `candidate_address` (`candidate_id`),
  CONSTRAINT `candidate_address` FOREIGN KEY (`candidate_id`) REFERENCES CANDIDATE (`candidate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS EMAIL;

CREATE TABLE EMAIL (
`email_id` int(11) unsigned NOT NULL,
`email` varchar(25) NOT NULL DEFAULT '',
`alt_email` varchar(25) DEFAULT NULL,
`candidate_id` int(11) unsigned NOT NULL,
PRIMARY KEY (`email_id`),
KEY `candidate_email` (`candidate_id`),
CONSTRAINT `candidate_email` FOREIGN KEY (`candidate_id`) REFERENCES CANDIDATE (`candidate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS PHONE;

CREATE TABLE PHONE (
  `phone_id` int(11) unsigned NOT NULL,
  `phone_number` int(15) DEFAULT NULL,
  `alt_phone_number` int(15) DEFAULT NULL,
  `candidate_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`phone_id`),
  KEY `candidate_phone` (`candidate_id`),
  CONSTRAINT `candidate_phone` FOREIGN KEY (`candidate_id`) REFERENCES CANDIDATE (`candidate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS IMS;

CREATE TABLE `IMS` (
  `IMS_id` int(11) unsigned NOT NULL,
  `icq` int(11) DEFAULT NULL,
  `jabber` varchar(20) DEFAULT NULL,
  `aim` varchar(20) DEFAULT NULL,
  `msn` varchar(20) DEFAULT NULL,
  `candidate_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`IMS_id`),
  KEY `candidate_IMS` (`candidate_id`),
  CONSTRAINT `candidate_IMS` FOREIGN KEY (`candidate_id`) REFERENCES CANDIDATE (`candidate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


