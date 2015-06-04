# BankingApplication
Used for the RBS Techstock demo, if once complete is still totally generic, will be converted to public


REST
- getCustomers
- getBalance
- transferMoney

GET: http://localhost:9001/fuse/techstock/getcustomers
GET: http://localhost:9001/fuse/techstock/getbalance?id=1
POST: http://localhost:9001/fuse/techstock/transfermoney
    { "fromId":1, "toId":2, amount:100 }
    
=========

DB Schema
- Customer
-- Id, FirstName, Surname, Address

- Account
-- Id, CustomerId, Balance

- Transactions
-- Id, FromId, ToId, Amount

=========

features:addurl mvn:com.redhat/techstock-features/1.0.0-SNAPSHOT/xml/features
features:install com.redhat-customer-services


