drop table if exists Measures;
drop table if exists Weighters;

create table Weighters (
  weighter_id int not null auto_increment,
  firstName varchar(255) not null,
  lastName varchar(255) not null,
  username varchar(255) not null,
  password varchar(25) not null,
  sex varchar(10) not null,
  wrist double,
  height double,
  sport_factor double not null,
  primary key (weighter_id)
);


 create table Measures (
   measure_id int not null auto_increment,
   weighter_id int not null,
   weight double not null,
   waist double not null,
   hips double,
   date datetime not null,
   primary key (measure_id),
   foreign key (weighter_id) references Weighters(weighter_id)
 );
 