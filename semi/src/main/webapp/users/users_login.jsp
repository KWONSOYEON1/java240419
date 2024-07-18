<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>로그인</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <style>
        .custom-container {        	
            display: flex;
            width: 100%;
            justify-content: center;
            align-items: center;
            height: auto;
            margin: 0 auto;
        }

        .form-container {
            width: 100%;
            max-width: 600px;
            padding: 20px;           
            border: 1px solid #dee2e6;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .form-signin h1 {
            text-align: center;
            font-size: 2.5rem;
            font-weight: bold;
        }

        .invalid-feedback {
            display: none;
        }

        .is-invalid ~ .invalid-feedback {
            display: block;
        }
    </style>
  </head>
  <body>
    <div class="custom-container">
        <div class="form-container">
            <h1 class="my-4 text-center">로그인</h1>
            <form onsubmit="return validateLoginForm()">
                <div class="mb-3">
                    <label for="id" class="form-label">아이디</label>
                    <input type="text" class="form-control" id="id" placeholder="아이디를 입력하세요" autofocus>
                    <div class="invalid-feedback">아이디를 입력하세요.(영문소문자/숫자, 4~16자)</div>
                </div>
                <div class="mb-3">
                    <label for="passwd" class="form-label">비밀번호</label>
                    <input type="password" class="form-control" id="passwd" placeholder="비밀번호를 입력하세요">
                    <div class="invalid-feedback">비밀번호를 입력하세요.(영문 대소문자/숫자/특수문자 중 2가지 이상 조합, 10~16자)</div>
                </div>
                <button class="btn btn-primary w-100 py-2" type="submit">로그인</button>                
                <a href="agreement.html" class="btn btn-secondary w-100 py-2 mt-2">회원가입</a>
                <div class="d-flex justify-content-center mt-2">
                    <a href="id_find.html" class="text-decoration-none text-muted mx-2">아이디 찾기</a>
                    <span class="text-muted">|</span>
                    <a href="pw_find.html" class="text-decoration-none text-muted mx-2">비밀번호 찾기</a>
                </div>
            </form>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script type="text/javascript">
        function validateLoginForm() {
            var idInput = document.getElementById('id');
            var passwdInput = document.getElementById('passwd');

            var idValue = idInput.value.trim(); 
            var passwdValue = passwdInput.value;

            var isValid = true;

            if (idValue === "") {
                idInput.classList.add("is-invalid");
                isValid = false; 
            } else {
                var idPattern = /^[a-z0-9]{4,16}$/;
                if (!idPattern.test(idValue)) {
                    idInput.classList.add("is-invalid");
                    isValid = false;
                } else {
                    idInput.classList.remove("is-invalid");
                }
            }

            if (passwdValue === "") {
                passwdInput.classList.add("is-invalid");
                isValid = false; 
            } else {
                var passwordPattern = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*\W).{10,16}$/;
                if (!passwordPattern.test(passwdValue)) {
                    passwdInput.classList.add("is-invalid");
                    isValid = false;
                } else {
                    passwdInput.classList.remove("is-invalid");
                }
            }

            return isValid;
        }
    </script>
  </body>
</html>
