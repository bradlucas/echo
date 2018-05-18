# echo

A Ring application that returns the request to the caller.

## Usage

```
$ lein run
```

Then open a browser at the following url.

```
http://localhost:3000/
```

The result will look like:

```
{:ssl-client-cert nil,
 :protocol "HTTP/1.1",
 :remote-addr "0:0:0:0:0:0:0:1",
 :headers
 {"cache-control" "max-age=0",
  "accept"
  "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
  "upgrade-insecure-requests" "1",
  "connection" "keep-alive",
  "user-agent"
  "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36",
  "host" "localhost:3000",
  "accept-encoding" "gzip, deflate, br",
  "accept-language" "en-US,en;q=0.9"},
 :server-port 3000,
 :content-length nil,
 :content-type nil,
 :character-encoding nil,
 :uri "/",
 :server-name "localhost",
 :query-string nil,
 :body "",
 :scheme :http,
 :request-method :get}
 ```

Also, useful for testing command line access. For example:

```
$ curl --data 'firstname=Bob&lastname=Smith' http://localhost:3000/add/name?v=1
```

With a result of:

```
{:ssl-client-cert nil,
 :protocol "HTTP/1.1",
 :remote-addr "0:0:0:0:0:0:0:1",
 :headers
 {"user-agent" "curl/7.54.0",
  "host" "localhost:3000",
  "accept" "*/*",
  "content-length" "28",
  "content-type" "application/x-www-form-urlencoded"},
 :server-port 3000,
 :content-length 28,
 :content-type "application/x-www-form-urlencoded",
 :character-encoding nil,
 :uri "/add/name",
 :server-name "localhost",
 :query-string "v=1",
 :body "firstname=Bob&lastname=Smith",
 :scheme :http,
 :request-method :post}
 ```




## License

Copyright © 2018 Brad Lucas

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
