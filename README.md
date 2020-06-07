# JsonToString

It will convert Json content to one line String format (with escape).

That enable you to use this String in CLI (Cloud Foundry etc)  

Example: 

input: 

JSON: 

{
  "id": 1,
  "first_name": "Raj",
  "last_name": "Goud",
  "email": "email@test.com",
  "ip_address": "26.58.193.2"
}

OUTPUT: 

"{\"id\":1,\"first_name\":\"Raj\",\"last_name\":\"Goud\",\"email\":\"email@test.com\",\"ip_address\":\"26.58.193.2\"}"