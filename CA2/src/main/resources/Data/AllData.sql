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

INSERT INTO ADDRESS (STREET, ADDITIONALINFO) VALUES ('Nørgaardsvej', 'x');
INSERT INTO ADDRESS (STREET, ADDITIONALINFO) VALUES ('Retskafsvej', 'x');
INSERT INTO ADDRESS (STREET, ADDITIONALINFO) VALUES ('Engbovej', 'x');

INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'VISMA', 'Penge', 2700, 1000, 100000000);
INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'Indeni', 'Arketekture', 2700, 1800, 100000000);
INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'Griffen people', 'Mellemmand', 2700, 500, 10054400000);
INSERT INTO INFOENTITY (DTYPE, `NAME`, DESCRIPTION, CVR, NUMEMPLOYEES, MARKETVALUE) VALUES ("Company", 'Louise', 'Medio', 1700, 50, 1005);

INSERT INTO HOBBY (`NAME`, DESCRIPTION) VALUES ('Løb', 'At løbe hurtigt');
INSERT INTO HOBBY (`NAME`, DESCRIPTION) VALUES ('Ridning', 'Gallop');
INSERT INTO HOBBY (`NAME`, DESCRIPTION) VALUES ('Løb', 'At løbe langsomt');

INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL) VALUES ("Person", 'Louise', 'Nielsen', 'louise@gmail.dk');
INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL) VALUES ("Person", 'Emilie', 'Nielsen', 'lou@mail.dk');
INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL) VALUES ("Person", 'Peter', 'Leo', 'louise@mail.dk');
INSERT INTO INFOENTITY (DTYPE, FIRSTNAME, LASTNAME, EMAIL) VALUES ("Person", 'Emil', 'Ulrik', 'l@gmail.dk');

INSERT INTO PHONE (`NUMBER`, DESCRIPTION) VALUES (41100532, "+45");
INSERT INTO PHONE (`NUMBER`, DESCRIPTION) VALUES (45879323, "+45");
INSERT INTO PHONE (`NUMBER`, DESCRIPTION) VALUES (12584975, "+45");
