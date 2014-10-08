var http = require('http');
http.createServer(function handler(req, res) {
    res.writeHead(200,'ok', {'Content-Type': 'text/plain'});
    res.end('Hello World\n');
	console.log('okoko');
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');

/* 
    1.HTTP 프로토콜 - 요청
    1)형식
    --------------------------------------
    request-line(엔터)
    헤더:값(엔터)
    헤더:값(엔터)
    
    
    2) 예제
    ----------------
    GET http://www.telerik.com/UpdateCheck.aspx?isBeta=False HTTP/1.1
    User-Agent: Fiddler/4.4.8.4 (MONO.NET 4.0.30319.17020; Unix 3.13.0.36; ko-KR; 2x)
    Pragma: no-cache
    accept-language: ko-KR
    Referer: http://fiddler2.com/client/4.4.8.4
    Connection: close
    Host: www.telerik.com
    Accept-Encoding: gzip, deflate
-----------------------------------------------

    
    -참고-
    헤더의 종류: 일반헤더,요청헤더,응답헤더,본문헤더(entity header)

   2. HTTP 프로토콜 - 응답
   1)형식
   -------------------------------
   상태라인 (엔터)
   헤더:값(엔터)
   헤더:값(엔터)
   ....
   (엔터)
   브라우저가 출력할 본문 데이터
   --------------------------------------------

  2) 예제
  ------------------------------------
  HTTP/1.1 200 OK
  Cache-Control: private
  Content-Type: text/plain; charset=utf-8
  Content-Encoding: gzip
  Vary: Accept-Encoding
  Server: Microsoft-IIS/7.5
  Access-Control-Allow-Origin: http://converter.telerik.com
  Date: Wed, 08 Oct 2014 06:00:06 GMT
  Content-Length: 290
  Connection: close
  
  Helloworld
   ------------------------------------

*/