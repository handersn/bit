
"use strict"; 

//목표: UI 컴포넌트에게 이벤트 전달
// dispatchEvent() 소개 

// 게시글을 저장하는 객체 생성자 함수
function Board(name, id, password) {
	this.name = name;
	this.id = id;
	this.password = password;
}

function resetForm() {
	// reset 버튼에게 click 이벤트를 전달 
	//1) MouseEvent 객체 생성
	var event = new MouseEvent('click', {
    'view': window,
    'bubbles': true,
    'cancelable': true
  }); 
	
	//2) reset  버튼에게 이벤트 전달
	document.getElementById('btnCancel').dispatchEvent(event);
}

var boardList = [];

document.getElementById('btnAdd').onclick = function(event) {
	var board = new Board(
			document.getElementById('name').value,
			document.getElementById('id').value,
			document.getElementById('password').value
			);
	
	boardList.push(board);
	
	resetForm();
	
	outputBoardList();
};

function outputBoardList() {
	console.log('------------------------');
	for (var i in boardList) {
		console.log(boardList[i].name, 
				boardList[i].id, 
				boardList[i].password); 
	}
}

