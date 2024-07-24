<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            font-size: small;
            margin-top: 0.5em;
        }
        .is-invalid {
            border-color: red !important;
        }
        .form-label {   			
    		font-size: medium;
		}
		.my-4 {    	
   			font-size: xx-large;
		}
		.btn-warning {
			 font-size: 14.5px;
		}
		.form-control {
			font-size: small;
		}
		.uni-btn {
        width: 100px;
        height: 40px;
        color: #fff;
        border-radius: 5px;
        padding: 0;
        font-family: 'Do Hyeon', sans-serif;
        font-weight: 500;
        background: transparent;
        cursor: pointer;
        transition: all 0.3s ease;
        position: relative;
        display: inline-block; 
        outline: none;
        border: none;
        font-size: 14px; 
        line-height: 40px; 
        text-align: center; 
    }

    .btn {
        background: linear-gradient(0deg, #f6d365 0%, #fda085 100%);
        line-height: 40px;
        padding: 0;
        border: none;
    }
    .btn span {
        position: relative;
        display: block;
        width: 100%;
        height: 100%;
        text-align: center;
        line-height: 40px; 
    }
    .btn:before,
    .btn:after {
        position: absolute;
        content: "";
        right: 0;
        bottom: 0;
        background:  #fda085;
        box-shadow:
        -7px -7px 20px 0px rgba(255,255,255,.9),
        -4px -4px 5px 0px rgba(255,255,255,.9),
        7px 7px 20px 0px rgba(0,0,0,.2),
        4px 4px 5px 0px rgba(0,0,0,.3);
        transition: all 0.3s ease;
    }
    .btn:before {
        height: 0%;
        width: 2px;
    }
    .btn:after {
        width: 0%;
        height: 2px;
    }
    .btn:hover {
        color: #fda085;
        background: transparent;
    }
    .btn:hover:before {
        height: 100%;
    }
    .btn:hover:after {
        width: 100%;
    }
    .btn span:before,
    .btn span:after {
        position: absolute;
        content: "";
        left: 0;
        top: 0;
        background: #fda085;
        box-shadow:
        -7px -7px 20px 0px rgba(255,255,255,.9),
        -4px -4px 5px 0px rgba(255,255,255,.9),
        7px 7px 20px 0px rgba(0,0,0,.2),
        4px 4px 5px 0px rgba(0,0,0,.3);
        transition: all 0.3s ease;
    }
    .btn span:before {
        width: 2px;
        height: 0%;
    }
    .btn span:after {
        height: 2px;
        width: 0%;
    }
    .btn span:hover:before {
        height: 100%;
    }
    .btn span:hover:after {
        width: 100%;
    }
   
    </style>
</head>
<body>
    <div class="custom-container">
        <div class="form-container">
            <h1 class="my-4 text-center">아이디 찾기</h1>
            <form id="searchForm">
                <div class="mb-3">
                    <label for="name" class="form-label">이름</label>
                    <input type="text" class="form-control" id="name" placeholder="이름을 입력하세요" autofocus>      
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">이메일</label>
                    <input type="email" class="form-control" id="email" placeholder="example@example.com">                  
                </div>
                <button type="submit" class="uni-btn btn w-100" id="btn"><span>확인</span></button>         
                <div id="result" class="error-message"></div>
            </form>
        </div>
    </div>  
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript">
        $("#name").focus();    

        $("#searchForm").submit(function(event) {
            event.preventDefault();
            handleFormSubmit();
        });

        function handleFormSubmit() {
            var name = $("#name").val();
            var email = $("#email").val();
            
            $("#name").removeClass("is-invalid");
            $("#email").removeClass("is-invalid");
            $("#result").html("");
            
            if (name === "") {
                $("#result").html("이름을 입력해 주세요.");
                $("#name").addClass("is-invalid");
                $("#name").focus();
                return;
            }
            if (email === "") {
                $("#result").html("이메일을 입력해 주세요.");
                $("#email").addClass("is-invalid");
                $("#email").focus();
                return;
            }
            if (!isValidEmail(email)) {
                $("#result").html("유효한 이메일 주소를 입력해 주세요.");
                $("#email").addClass("is-invalid");
                $("#email").focus();
                return;
            }
            
            $.ajax({
                type: "post",
                url: "<%=request.getContextPath()%>/users/search_id_two.jsp",
                data: {"name": name, "email": email},
                dataType: "xml",
                success: function(xmlDoc) {
                    var code = $(xmlDoc).find("code").text();
                    if (code === "success") {
                        var id = $(xmlDoc).find("id").text();
                        $("#result").html(name + "님의 아이디는 [" + id + "]입니다.");
                    } else {
                        $("#result").html(name + "님의 아이디를 찾을 수 없습니다.");
                        $("#name").addClass("is-invalid");
                        $("#email").addClass("is-invalid");
                    }
                },
                error: function(xhr) {
                    alert("에러코드 = " + xhr.status);
                }
            });
        }
      
        function isValidEmail(email) {
            var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/g;
            return emailPattern.test(email);
        }
    </script>
</body>
</html>
