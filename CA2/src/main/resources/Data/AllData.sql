/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  LouiseB
 * Created: 04-10-2016
 */
USE ca2pu;
INSERT INTO CITYINFO (ZIP, CITY) VALUES ('0555', 'Scanning');
INSERT INTO CITYINFO (ZIP, CITY) VALUES ('0800', 'Hoje Taastrup');
INSERT INTO CITYINFO (ZIP, CITY) VALUES ('0877', 'Kobenhavn C');
INSERT INTO CITYINFO (ZIP, CITY) VALUES ('0892', 'Sjalland USF P');

INSERT INTO ADDRESS (STREET, ADDITIONALINFO, `CITYINFO_ID`) VALUES ('Norgaardsvej', 'x', 1);
INSERT INTO ADDRESS (STREET, ADDITIONALINFO, `CITYINFO_ID`) VALUES ('Retskafsvej', 'x', 2);
INSERT INTO ADDRESS (STREET, ADDITIONALINFO, `CITYINFO_ID`) VALUES ('Engbovej', 'x', 3);

INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'VISMA', 'Penge', 2700, 1000, 100000000);
INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'Indeni', 'Arketekture', 2700, 1800, 100000000);
INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'Griffen people', 'Mellemmand', 2700, 500, 10054400000);
INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'Louise', 'Medio', 1700, 50, 1005);

INSERT INTO HOBBY (`NAME`, DESCRIPTION) VALUES ('Lob', 'At lobe hurtigt');
INSERT INTO HOBBY (`NAME`, DESCRIPTION) VALUES ('Ridning', 'Gallop');
INSERT INTO HOBBY (`NAME`, DESCRIPTION) VALUES ('LangsomLob', 'At lobe langsomt');

INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL, ADDRESS_ID) VALUES ("Person", 'Louise', 'Nielsen', 'louise@gmail.dk', 1);
INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL, ADDRESS_ID) VALUES ("Person", 'Emilie', 'Nielsen', 'lou@mail.dk', 2);
INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL, ADDRESS_ID) VALUES ("Person", 'Peter', 'Leo', 'louise@mail.dk', 3);
INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL, ADDRESS_ID) VALUES ("Person", 'Emil', 'Ulrik', 'l@gmail.dk', 3);

INSERT INTO infoentity_hobby(`persons_ID`, `hobbies_ID`) VALUES (5, 1);
INSERT INTO infoentity_hobby(`persons_ID`, `hobbies_ID`) VALUES (6, 2);
INSERT INTO infoentity_hobby(`persons_ID`, `hobbies_ID`) VALUES (6, 3);

INSERT INTO PHONE (`NUMBER`, DESCRIPTION, `INFOENTITY_ID`) VALUES (41100532, "+45", 5);
INSERT INTO PHONE (`NUMBER`, DESCRIPTION, `INFOENTITY_ID`) VALUES (45879323, "+45", 6);
INSERT INTO PHONE (`NUMBER`, DESCRIPTION, `INFOENTITY_ID`) VALUES (12584975, "+45", 7);
