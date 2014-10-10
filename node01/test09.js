/*
 * GET 요청과 POST 요청구분하기
 * -request.method 프로퍼티의 값을 확인하라!
 * 
 * */
var http = require('http');
var url=require('url');

http.createServer(function handler(req, res) {
	res.writeHead(200,'ok',
    		{'Content-Type': 'text/html;charset=UTF-8'});
    res.write('<html><head><title>test09</title></head>');
    res.write('<body>');
    res.write('<h1>'+v1+ op + v2+ '=' + v3 + '<h1>');
    res.write('</body></html>');
	if(req.method == 'GET'){res.writeHead(200,'ok',
			{'Content-Type': 'text/html;charset=UTF-8'});
	res.write('<html><head><title>test09</title></head>');
	res.write('<body>');
	res.write('<h1>'+v1+ op + v2+ '=' + v3 + '<h1>');
	res.write('</body>');
	var urlInfoMap = url.parse(req.url, true);
	
	//3. 쿼리 객체로부터 파라미터 값을 추출한다.
	var v1 = urlInfoMap.query.v1;   //문자열이다!
	var v2 = urlInfoMap.query.v2;
	var op = urlInfoMap.query.op;
	var v3 = 0;
	
	if(op=='plus'){
		op='+';
		 v3=Number(v1)+Number(v2);		
	}else if(op=='minus'){
		op='-';
		 v3=Number(v1)-Number(v2);
	}else if(op=='multiple'){
		op='*';
		 v3=Number(v1)*Number(v3);
	}else if(op == 'divide'){
		op='/';
		v3=Number(v1)/Number(v2);		
	}else{
		console.log('결과  오류입니다.');
	}	
	}else{
		res.write(req.method + ' 요청을 지원하지 않습니다.');
				
	}    
	
	res.end();
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');


 

