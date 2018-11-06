drop table if exists Measures;
drop table if exists Weighters;

create table Weighters (
  weighterId int not null auto_increment,
  firstName varchar(255) not null,
  lastName varchar(255) not null,
  username varchar(255) not null,
  password varchar(25) not null,
  sex varchar(10) not null,
  wrist double,
  height double,
  sportFactor double not null,
  primary key (weighterId)
);


 create table Measures (
   measureId int not null auto_increment,
   weighterId int not null,
   weight double not null,
   waist double not null,
   hips double,
   date datetime not null,
   primary key (measureId),
   foreign key (weighterId) references Weighters(weighterId)
 );
 