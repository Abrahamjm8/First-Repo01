# What is HTTP?
Hyper Test Transfer Protocal is th emost popular way of transferring info across the web in modern times. it is a request/reponse system that guarantees a response for every request made. there are a few standard compenents of an HTTP request:

- uri 
  - this is the part of the request that tells the web server what information you want

- body 
  - many http requests are going to contain a body: this is the info that is needed to complete whatever request you are making. 

be familiar with components of the Http reponse: 
- body 
  - this contains whatever info you requested (or it could be an error message)

- status code 
    - this is a number that gives an immediate indiciation of how your request was handled
    - there are multiple httple status levels possible
      - 100 is informational
      - 200 is success
      - 300 is redirect
      - 400 is user error (client side error)
      - 500 is a server error (developer messed up)
        - 500 is bad: dont want these to be returned to your users
  HTTP status codes
  - https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
