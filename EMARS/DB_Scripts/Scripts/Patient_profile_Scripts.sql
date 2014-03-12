CREATE TABLE `patient_profile` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `DOB` varchar(50) DEFAULT NULL,
  `Email` varchar(80) NOT NULL DEFAULT '',
  `Contact` varchar(20) DEFAULT NULL,
  `Photo` mediumblob,
  `Address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=latin1;

