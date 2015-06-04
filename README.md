# BankingApplication
Used for the RBS Techstock demo, if once complete is still totally generic, will be converted to public

#DB Schema (See sql folder)
Table: Customer 
Columns: Id, FirstName, Surname, Address

Table: Account 
Columns: Id, CustomerId, Balance

Table: Transactions 
Columns: Id, FromId, ToId, Amount

#REST
* getCustomers
** GET: http://localhost:9001/fuse/techstock/getcustomers

* getBalance
** GET: http://localhost:9001/fuse/techstock/getbalance?id=1
* transferMoney
** POST: http://localhost:9001/fuse/techstock/transfermoney / { "fromId":1, "toId":2, amount:100 }

#Install into Fuse
* features:addurl mvn:com.redhat/techstock-features/1.0.0-SNAPSHOT/xml/features
* features:install com.redhat-customer-services


