# oAuth2.0YmlFileBased
Simple oAuth2 example by yml file configuration. No extra java code

## Run this code as below
### 1. Authorization Server
`
Http method: POST
Path: http://localhost:9002/poc/oauth/token /n
Authorization: Basic cG9jLWlkOnBvYy1zZWNyZXQ= /n
Content-Type: application/x-www-form-urlencoded /n
grant_type=password&username=poc&password=poc123 /n
`
### ![Postman](https://github.com/sarthya/oAuth2.0YmlFileBased/blob/master/AuthorizationServerPostmanSS.JPG)


### 1. Resource Server
`
Http method: GET
Path: http://localhost:8080/api
Authorization: Bearer 9f2015fd-b5ca-4a92-8a03-460247049288
`
### ![Postman](https://github.com/sarthya/oAuth2.0YmlFileBased/blob/master/ResourceServerPostmanSS.JPG)
