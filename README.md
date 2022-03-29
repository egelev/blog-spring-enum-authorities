# blog-spring-enum-authorities
Code samples related to a blog describing how to replace @PreAuthorize with custom spring method security annotation based on enums.

Before running `./gradlew clean build` the application.yaml needs to be edited.
In order to properly start an oauth2-resource-server the following property is requried.
[spring.security.oauth2.resourceserver.jwt.issuer-uri|https://docs.spring.io/spring-security/reference/6.0/servlet/oauth2/resource-server/jwt.html#_specifying_the_authorization_server]
