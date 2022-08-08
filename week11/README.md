# Docker file

Build an image  `docker build -t springboot-app .`</br>
Download MySql image `docker pull mysql:8.0 `</br>
Set data `docker run --name demo -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=bookdb1 -e MYSQL_ROOT_PASSWORD=1111 -e MYSQL_PASSWORD=1111 -d mysql:8.0`</br>
Verify the MySql start up logs `docker container logs demo`</br>
Run the project `docker run -d -p 8080:8080 --name springboot-app --link demo:mysql springboot-app`</br>
Verify the app start up logs `docker container logs springboot-app `</br>

# Docker-compose

Run `docker-compose -f docker-compose.yml up`
