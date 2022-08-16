# mybatis-sample

### Create
`curl -XPOST -H "Content-Type: application/json" -d '{ "userName":"TaroYamada", "password":"zaq12wsx", "email":"taroy@example.com", "firstName":"太郎", "lastName":"山田" }' http://localhost:8080/api/user`

### Read
`curl http://localhost:8080/api/user/1`

### Update
`curl -XPUT -H "Content-Type: application/json" -d '{ "id":"1", "password":"abc1234" }' http://localhost:8080/api/user/change`

### Delete
`curl -XDELETE  http://localhost:8080/api/user/delete/1`
