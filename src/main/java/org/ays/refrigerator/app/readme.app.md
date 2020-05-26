# API
## apppliance : 가전제품(냉장고)
```
GET    : /appliances
GET    : /appliance/:id
POST   : /appliance
POST   : /appliances
PUT    : /appliance
PUT    : /appliances
DELETE : /appliance
DELETE : /appliances
```
## apppliance/space : 가전제품 수납공간(냉장고)
```
GET    : /appliance/spaces
GET    : /appliance/space/:id
POST   : /appliance/space
POST   : /appliance/spaces
PUT    : /appliance/space
DELETE : /appliance/space
DELETE : /appliance/spaces
```
## cooking : 요리(추천 요리)
```
GET    : /cooking
GET    : /cooking/:id
POST   : /cooking
POST   : /cooking/bulk
PUT    : /cooking/:id
PUT    : /cooking/bulk
DELETE : /cooking/:id
DELETE : /cooking/bulk
```
## food : 음식(남은 음식)
```
GET    : /foods
GET    : /food/:id
POST   : /food
POST   : /food/bulk
PUT    : /food/:id
PUT    : /food/bulk
DELETE : /food/:id
DELETE : /food/bulk
```
## ingredient : 식재료(음식 만들 식재료)
```
GET    : /ingredients
GET    : /ingredient/:id
POST   : /ingredient
POST   : /ingredient/bulk
PUT    : /ingredient/:id
PUT    : /ingredient/bulk
DELETE : /ingredient/:id
DELETE : /ingredient/bulk
```
## role : 권한
```
GET    : /codes
GET    : /code/:id
POST   : /code
POST   : /code/bulk
PUT    : /code/:id
DELETE : /code/:id
DELETE : /code/bulk
```
## user : 사용자
```
GET    : /users
GET    : /user/:id
POST   : /user
POST   : /user/bulk
PUT    : /user/:id
DELETE : /user/:id
DELETE : /user/bulk
```