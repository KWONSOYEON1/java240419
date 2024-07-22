<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아이디 찾기</title>
   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
   
    <style>
       a {text-decoration: none !important}
        .custom-container {
            display: flex;
            width: 100%;
            justify-content: center;
            align-items: center;
            height: auto;
            margin: 100px; 
        }

        .form-container {
            max-width: 390px; 
            width: 100%;
            padding: 20px;            
            border: 1px solid #dee2e6;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .error-message {
            color: red;
            font-size: 0.875em;
            margin-top: 0.5em;
        }
             
    </style>
</head>
<body>
    <div class="custom-container">
        <div class="form-container">
            <h1 class="my-4 text-center">아이디 찾기</h1>
            <form onsubmit="return validateForm()">
                <div class="mb-3">
                    <label for="userName" class="form-label">이름</label>
                    <input type="text" class="form-control" id="userName" placeholder="이름을 입력하세요" autofocus>               
                    <div class="error-message" id="nameError"></div>
                </div>
                <div class="mb-3">
                    <label for="userEmail" class="form-label">이메일</label>
                    <input type="email" class="form-control" id="userEmail" placeholder="example@example.com">                    
                    <div class="error-message" id="emailError"></div>
                </div>
                
                <button type="submit" class="btn btn-warning w-100">확인</button>
            </form>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    
    <script>
        function validateForm() {
            var userName = document.getElementById('userName');
            var userEmail = document.getElementById('userEmail');
            var nameError = document.getElementById('nameError');
            var emailError = document.getElementById('emailError');
            var isValid = true;
            
            nameError.textContent = '';
            emailError.textContent = '';
            userName.classList.remove('is-invalid');
            userEmail.classList.remove('is-invalid');
            
            if (userName.value.trim() === "") {
                userName.classList.add('is-invalid');
                nameError.textContent = '이름을 입력해주세요.';
                isValid = false;
            }
            
            if (userEmail.value.trim() === "" || !isValidEmail(userEmail.value.trim())) {
                userEmail.classList.add('is-invalid');
                emailError.textContent = '유효한 이메일을 입력해주세요.';
                isValid = false;
            }
            
            return isValid;
        }
        
        function isValidEmail(email) {
            var emailPattern = /^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+(\.[-a-zA-Z0-9]+)+)*$/g;
            return emailPattern.test(email);
        }
    </script>
</body>
</html>
