# webfluxOAuth2 - An OAuth2 Resource Server with Webflux and R2DBC

Follow the tutorial based on [Part 1](https://sdoxsee.github.io/blog/2019/12/17/merry-microservices-part1-resource-server) of the blog series [Merry Microservices](https://sdoxsee.github.io/blog/2019/12/17/merry-microservices-an-introduction). It introduces a simple OAuth2 resource server with Spring Boot Webflux, and Spring Data R2DBC that stores notes. The following files and folders are:
* `docker-compose.yml` spins up a Keycloak instance on port 9080
* `keycloak.yml` and `realm-config` folder are from https://github.com/jhipster/jhipster-sample-app-oauth2/blob/master/src/main/docker
* `note` folder is a Spring Boot OAuth2 resource server app using Webflux and R2DBC that stores `Note` entities

# Quickstart

1. Start `keycloak` (port 9080)

```
docker-compose up
```

2. Start `note` on port 8081

```
(cd note && ./mvnw spring-boot:run)
```

3. Call endpoints with your favourite tool

For Postman, you can import `merry-microservices-part1.postman_collection.json` as it's setup to interact with Keycloak to get access tokens.
