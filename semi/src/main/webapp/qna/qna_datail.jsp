<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Q&A 상세보기</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style type="text/css">
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        .container {
            width: 90%;
            max-width: 600px;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            text-align: center;
            color: #343a40;
        }
        .detail-row {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-top: 10px;
            padding: 10px;
            border: 1px solid #dee2e6;
            border-radius: 5px;
            font-size: 16px;
        }
        .detail-row .label {
            font-weight: bold;
            width: 30%;
        }
        .detail-row .value {
            width: 70%;
            text-align: left;
        }
        button {
            margin-top: 20px;
            padding: 10px;
            border-radius: 5px;
            font-size: 16px;
            background-color: #ffc107;
            color: white;
            border: none;
            cursor: pointer;
            font-weight: bold;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: background-color 0.3s ease;
            width: 100%;
        }
        button:hover {
            background-color: #e0a800;
        }        
    </style>
</head>
<body>
    <div class="container">
        <h1>Q&A</h1>           
        <div class="detail-row">        	
       		<div class="label">작성자</div>
            <div class="value"></div>
        </div>
        <div class="detail-row">
            <div class="label">작성일</div>
            <div class="value"></div>
        </div>
        <div class="detail-row">
            <div class="label">제목</div>
            <div class="value"></div>
        </div>
        <div class="detail-row">
    		<div class="label">내용</div>
   			<div class="value"></div>
		</div>
        <button type="submit">목록으로</button>
    </div>
    <script>
        
    </script>
</body>
</html>
