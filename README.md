# BankingApplication
A generic banking backend, REST interfaces for Fuse

#DB Schema (See sql folder)
Table: Customer 
Columns: Id, FirstName, Surname, Address, Email, Username

Table: Account 
Columns: Id, CustomerId, Amount (Balance)

Table: Transactions 
Columns: Id, FromId, ToId, Amount, Payee, Details, TxDate

#REST
* createCustomer
** POST: http://localhost:9001/fuse/techstock/createcustomer / { "firstname":"joe", "surname":"bloggs", "address":"2 some road" }

* getCustomer
** GET: http://localhost:9001/fuse/techstock/getcustomer?username=joe

* getCustomers
** GET: http://localhost:9001/fuse/techstock/getcustomers

* depositMoney
** POST: http://localhost:9001/fuse/techstock/depositmoney / { fromId:1, payee:"10-223", "amount":50, "operation": "-" }
*** curl -H "Content-Type: application/json" -X POST -d '{"fromId":"-1", "toId":"2", "amount":"250", "payee":"Employer Cash Bonus"}' http://{your.ip}:9001/fuse/techstock/depositmoney

* withdrawMoney
** POST: http://localhost:9001/fuse/techstock/withdrawmoney / { fromId:1, toId=99, payee:"Pret a Manger", "amount":3.5,  }
*** curl -H "Content-Type: application/json" -X POST -d '{"fromId":"2", "toId":"-1", "amount":"50", "payee":"ATM, Regent Street"}' http://{your.ip}:9001/fuse/techstock/withdrawmoney

* getCurrentBalance
** GET: http://localhost:9001/fuse/techstock/getcurrentbalance?id=1

* transferMoney
** POST: http://localhost:9001/fuse/techstock/transfermoney / { "fromId":1, "toId":2, payee="Acct 10 20 30", amount:100 }

* getTransactions
** GET: http://localhost:9001/fuse/techstock/gettransactions?id=10


#Install into Fuse
* mvn clean install
* features:addurl mvn:com.redhat/techstock-features/1.0.0-SNAPSHOT/xml/features
* features:install com.redhat-customer-services
* route-list

When deploying to a remote instance using profiles:
- Go into customerservices module
- Run: mvn fabric8:deploy