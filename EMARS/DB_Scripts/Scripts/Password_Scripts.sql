CREATE TABLE `passwords` (
  `Email` varchar(50) NOT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Role` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

