# quarkus-graalvm-kafka
This project goal is to have a better understanding using Quarkus framework with GraalVM, kafka and reactive.

## Prerequisites

- Java 11
- [GraalVM](https://quarkus.io/guides/building-native-image#configuring-graalvm)
- [Docker](https://www.docker.com/products/docker-desktop)
- [Working C development environment](https://quarkus.io/guides/building-native-image#configuring-c-development)

### Kafka
To start up Kafka, navigate to root directory of the project and run:

```
docker-compose up
```

### Quarkus App on Docker
To build and run the application natively on docker, we can use the Dockerfile.multistage:

#### Docker Build

```
docker build -f ./docker/Dockerfile.multistage -t quarkus-app ./quarkus-api-server
```

<br>

##### Or

If not, we can use the Dockerfile.native file instead but we must first package our application:

```
mvn -f quarkus-api-server/pom.xml package -Pnative -Dquarkus.native.container-build=true
```

and then:

```
docker build -f ./docker/Dockerfile.native -t quarkus-app ./quarkus-api-server
```

#### Docker run
and finally, run it with:

```
docker run -i --rm -p 8081:8081 quarkus-app
```
