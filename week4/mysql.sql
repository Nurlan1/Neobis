create table type(
    id INT NOT NULL,
    name varchar(100) not null,
    primary key(id));
create table status(
    id INT NOT NULL,
    name varchar(100) not null,
    primary key(id));
create table make(
  id int not null,
  primary key(id),
  name varchar(30)
);
create table model(
  id int not null,
  name varchar(50) not null,
  primary key(id),
  makeId int not null,
  foreign key(makeId)
    references make(id)
);
create table car(
  id int not null,
  primary key(id),
  modelId INT not null,
    foreign key (modelId)
      references model(id),
  vin varchar(20) not null,
  color varchar(30) not null,
  statusId INT not null,
    foreign key (statusId)
      references status(id),
  price float,
  description varchar(250),
  typeId INT not null,
  foreign key(typeId)
    references type(id)
);
create table customer(
  id INT not null,
  firstName varchar(50) not null,
  lastName varchar(50),
  phoneNumber varchar(15),
  address varchar(100),
  primary key(id)
);
create table purchase(
    id INT NOT NULL,
    customerId INT not null,
    foreign key (customerId)
      references customer(id),
    name varchar(100) not null,
    carId INT not null,
    datte date not null,
    statusId INT,
    foreign key (statusId)
      references status(id),
    foreign key(carId)
      references car(id),
    primary key(id));
