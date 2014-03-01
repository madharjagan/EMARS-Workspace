CREATE TABLE `doctor_visit` (
  `VisitDate` varchar(200) NOT NULL,
  `Symptoms` varchar(500) DEFAULT NULL,
  `Medication` varchar(500) DEFAULT NULL,
  `Report` varchar(500) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

