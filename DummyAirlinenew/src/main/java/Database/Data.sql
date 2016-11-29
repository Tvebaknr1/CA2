USE Airline;

insert into `AIRLINE` (`name`) values("TestLine1");
insert into `AIRLINE` (`name`) values("TestLine2");
insert into `AIRLINE` (`name`) values("TestLine3");

insert into `AIRPORT` (`IATACode`,`timeZone`,`name`,`country`,`city`) values("TestCode1", "CET","Copenhagen Airport","Denmark","Copenhagen");
insert into `AIRPORT` (`IATACode`,`timeZone`,`name`,`country`,`city`) values("TestCode2", "EST","john f kennedy international airport","USA","New York");
insert into `AIRPORT` (`IATACode`,`timeZone`,`name`,`country`,`city`) values("TestCode3", "UCT","TestPort","TestCountry","TestCity");

insert into `FLIGHT` (`Airline`, `fromAirport`, `tooAirport`, `flightNumber`, `seats`,`flightTimeAirline`) values (1, 1,2,"newy001", 200, 5);
insert into `FLIGHT` (`Airline`, `fromAirport`, `tooAirport`, `flightNumber`, `seats`,`flightTimeAirline`) values (2, 1,2,"newy031", 200, 5);
insert into `FLIGHT` (`Airline`, `fromAirport`, `tooAirport`, `flightNumber`, `seats`,`flightTimeAirline`) values (3, 3,2,"newy051", 200, 5);

insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('28-01-2012', '%d-%m-%Y'),234,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(2,STR_TO_DATE('7-01-2016', '%d-%m-%Y'),4567,34);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('17-02-2016', '%d-%m-%Y'),23,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('1-03-2016', '%d-%m-%Y'),78,5);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(2,STR_TO_DATE('11-04-2016', '%d-%m-%Y'),89,67);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('1-05-2016', '%d-%m-%Y'),25,19);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('8-06-2016', '%d-%m-%Y'),58,38);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(2,STR_TO_DATE('20-10-2016', '%d-%m-%Y'),28,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('1-01-2017', '%d-%m-%Y'),59,10);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('21-02-2017', '%d-%m-%Y'),59,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(2,STR_TO_DATE('1-10-2016', '%d-%m-%Y'),19,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('4-01-2017', '%d-%m-%Y'),81,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('11-11-2016', '%d-%m-%Y'),39,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(2,STR_TO_DATE('17-12-2016', '%d-%m-%Y'),29,374);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('24-12-2016', '%d-%m-%Y'),19,39);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('31-12-2016', '%d-%m-%Y'),0,1);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('11-11-2016', '%d-%m-%Y'),0,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(2,STR_TO_DATE('11-01-2016', '%d-%m-%Y'),217,19);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('11-04-2016', '%d-%m-%Y'),145,28);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('12-01-2016', '%d-%m-%Y'),39,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(1,STR_TO_DATE('9-05-2016', '%d-%m-%Y'),39,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('11-01-2017', '%d-%m-%Y'),10,19);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('11-02-2017', '%d-%m-%Y'),637,58);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('11-03-2017', '%d-%m-%Y'),39,23);
insert into `FLIGHTINSTANCE` ( `flight`,`dateAndTime`,`availableSeats` ,`price`) values(3,STR_TO_DATE('11-05-2017', '%d-%m-%Y'),39,23);

insert into `RESERVATION` (`flightInstance`,`totalPrice`) values(1,46);
insert into PASSENGER (`reservation`,`firstname`,`lastname`) values(1,"Hans", "Erick");