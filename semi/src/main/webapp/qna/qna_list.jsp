<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/q&a.css">
    <title>Q&A 게시판</title>
   	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<style type="text/css">
	body {
    font-family: 'Arial', sans-serif;
    background-color: #f8f9fa;
    margin: 0;
    padding: 0;
    display: flex;
    flex-direction: column;
    align-items: center;
}
.container {
    width: 80%;
    max-width: 1200px;
    margin-top: 50px;
}
h1 {
    text-align: center;
    color: #343a40;
}
.board {
    width: 100%;
    border-collapse: collapse;
    margin: 20px 0;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}
.board th, .board td {
    border: 1px solid #dee2e6;
    padding: 12px;
    text-align: center;
}
.board th {
    background-color: #ffc107;
    color: white;
    font-weight: bold;
}
.board tr:nth-child(even) {
    background-color: #f2f2f2;
}
.board tr:hover {
    background-color: #e9ecef;
}
.write-btn {
    display: inline-block;
    margin-top: 20px;
    padding: 10px 20px;
    background-color: #ffc107;
    color: white;
    text-align: center;
    text-decoration: none;
    border-radius: 5px;
    font-weight: bold;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    transition: background-color 0.3s ease;
}
.write-btn:hover {
    background-color: #ffc107;
}
.delete-btn {
    background-color: #dc3545;
    color: white;
    border: none;
    padding: 5px 10px;
    border-radius: 5px;
    cursor: pointer;
    font-weight: bold;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    transition: background-color 0.3s ease;
}
.delete-btn:hover {
    background-color: #c82333;
}

.pagination {
    margin-top: 20px;
    display: flex;
    justify-content: center;
}

.page-link {
    display: inline-block;
    padding: 10px;
    margin: 0 5px;
    background-color: #007bff;
    color: white;
    text-decoration: none;
    border-radius: 5px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    transition: background-color 0.3s ease;
}

.page-link:hover {
    background-color: #0056b3;
}

</style>
</head>
<body>
    <div class="container">
        <h1>Q&A 게시판</h1>
        <table class="board">
            <thead>
            <a href="q&awrite.html" class="write-btn">글쓰기</a>
                <tr>
                    <th>글번호</th>
                    <th>제목</th>                    
                    <th>작성자</th>
                    <th>작성일</th>                   
                </tr>
            </thead>
            <tbody id="board-contents">
                <!-- JavaScript를 사용하여 Q&A 항목을 추가할 수 있습니다 -->
            </tbody>
        </table>
        
        <div class="pagination">
            <a href="#" class="page-link">1</a>
            <a href="#" class="page-link">2</a>
            <a href="#" class="page-link">3</a>
            <!-- 필요에 따라 추가 페이지를 추가하세요 -->
        </div>
    </div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script>
        let qaCount = 0;

        function addQA(id, title, content, userid, date, answer, productid) {
            qaCount++;

            const qaRow = `
                <tr data-id="${id}">
                    <td>${qaCount}</td>
                    <td>${title}</td>
                    <td>${content}</td>
                    <td>${userid}</td>
                    <td>${date}</td>
                    <td>${answer}</td>
                    <td>${productid}</td>
                    <td><button class="delete-btn" onclick="confirmDelete(${id})">삭제</button></td>
                </tr>
            `;

            document.getElementById('board-contents').insertAdjacentHTML('beforeend', qaRow);
        }

        function confirmDelete(id) {
            const confirmAction = confirm("진짜 삭제하시겠습니까?");
            if (confirmAction) {
                deleteQA(id);
            }
        }

        function deleteQA(id) {
            let qas = JSON.parse(localStorage.getItem('qas') || '[]');
            qas = qas.filter(qa => qa.id !== id);
            localStorage.setItem('qas', JSON.stringify(qas));

            document.querySelector(`tr[data-id="${id}"]`).remove();
        }

        // 로컬 스토리지에서 Q&A 데이터를 가져와서 표시
        document.addEventListener('DOMContentLoaded', () => {
            const qas = JSON.parse(localStorage.getItem('qas') || '[]');
            qas.forEach(qa => {
                addQA(qa.id, qa.title, qa.content, qa.userid, qa.date, qa.answer, qa.productid);
            });
        });
    </script>
</body>
</html>