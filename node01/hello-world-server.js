var http = require('http');
http.createServer(function handler(req, res) {
    res.writeHead(200,'ok', {'Content-Type': 'text/plain'});
    res.end('Hello World\n');
	console.log('okoko');
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');
