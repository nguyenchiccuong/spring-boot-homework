# spring-boot-homework

To get all employee:
    method: get
    endpoint: localhost:9996/api/v1/employee
To get specific employee by id:
    method: get
    endpoint: localhost:9996/api/v1/employee/{id}
To add employee:
    method: post        
    endpoint: localhost:9996/api/v1/employee
    body: 
            { 
                "name": "Minh",
                "email": "asas3",
                "dob": "1999-12-28"
            }
To update employee:
    method: put        
    endpoint: localhost:9996/api/v1/employee
    body: 
            { 
                "name": "Minh",
                "email": "asas3",
                "dob": "1999-12-28"
            }
To delete specific employee by id:
    method: delete
    endpoint: localhost:9996/api/v1/employee/{id}