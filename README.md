# BankingApplication
A generic banking backend, REST interfaces for Fuse

#DB Schema (See sql folder)
Table: Customer 
Columns: Id, FirstName, Surname, Address, Email, Username

Table: Account 
Columns: Id, CustomerId, Balance

Table: Transactions 
Columns: Id, FromId, ToId, Amount, Details

#REST
* createCustomer
** POST: http://localhost:9001/fuse/techstock/createcustomer / { "firstname":"joe", "surname":"bloggs", "address":"2 some road" }

* getCustomer
** GET: http://localhost:9001/fuse/techstock/getcustomer?username=joe

* getCustomers
** GET: http://localhost:9001/fuse/techstock/getcustomers

* depositBalance
** POST: http://localhost:9001/fuse/techstock/depositbalance / { "id":10, "amount":50, "operation": "-" }

* getBalance
** GET: http://localhost:9001/fuse/techstock/getbalance?id=1

* transferMoney
** POST: http://localhost:9001/fuse/techstock/transfermoney / { "fromId":1, "toId":2, amount:100 }

* getTransactions
** GET: http://localhost:9001/fuse/techstock/gettransactions?id=10

#Install into Fuse
* mvn clean install
* features:addurl mvn:com.redhat/techstock-features/1.0.0-SNAPSHOT/xml/features
* features:install com.redhat-customer-services
* route-list


