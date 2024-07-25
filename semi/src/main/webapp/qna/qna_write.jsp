<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <title>Q&A 글쓰기</title>
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
        form {
            display: flex;
            flex-direction: column;
        }
        .title-row {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-top: 10px;
        }
        label {
            font-weight: bold;
        }
        .title-row input[type="text"] {
            flex-grow: 1;
            margin-left: 10px;
            padding: 10px;
            border: 1px solid #dee2e6;
            border-radius: 5px;
            font-size: 16px;
        }
        input, textarea, button {
        	font-family: 'Arial', sans-serif;
            margin-top: 5px;
            padding: 10px;
            border: 1px solid #dee2e6;
            border-radius: 5px;
            font-size: 16px;
        }
        button {
            margin-top: 20px;
            background-color: #ffc107;
            color: white;
            border: none;
            cursor: pointer;
            font-weight: bold;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #ffc107;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Q&A 글쓰기</h1>        
        <form id="qa-form" onsubmit="submitQA(event)">
            <div class="title-row">
                <label for="title">제목</label>
                <label>                    
                    <input type="checkbox" name="reviewStatus" value="2">비밀글
                </label>
            </div>
                <input type="text" id="title" name="title" placeholder="제목을 입력하세요">
            <label for="content">내용</label>
            <textarea rows="7" cols="60" id="content" name="content" placeholder="내용을 입력하세요"></textarea>            
            <button type="submit">등록</button>
        </form>
    </div>
    <script>
       
    </script>
</body>
</html>
