<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항 리스트 관리자</title>    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        th, td {
            text-align: center;
            vertical-align: middle;
        }
        .table th:nth-child(2), .table td:nth-child(2) {
            width: 65%; 
        }
        .btn-section {
            margin-bottom: 20px;
            text-align: end; 
        }       
        .table-responsive {
            width: 90%;
            margin: 0 auto;
        }
        .pagination {
            justify-content: center;
        }
    </style>
</head>
<body>

<div class="container mt-5">
    <h1 class="text-center">공지사항</h1>
    <div class="table-responsive">
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <div class="text-end mt-4 btn-section">
                    <a href="notice_write_admin.html" class="btn btn-primary">글쓰기</a>
                </div> 
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성날짜</th>                   
                </tr>
            </thead>
            <tbody>                
                <!-- 공지사항 데이터는 JavaScript에서 동적으로 추가됩니다. -->              
            </tbody>
        </table>
    </div> 

    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item"><a class="page-link" href="#" data-page="previous">&laquo;</a></li>
            <!-- 페이지 번호가 JavaScript에서 동적으로 추가됩니다. -->
            <li class="page-item"><a class="page-link" href="#" data-page="next">&raquo;</a></li>
        </ul>
    </nav>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script>
    document.addEventListener("DOMContentLoaded", function() {
        const notices = [
            {id: 1, title: "정기 점검 안내", author: "관리자", date: "2024-07-08"},
            {id: 2, title: "사이트 리뉴얼 안내", author: "관리자", date: "2024-07-10"},
            {id: 3, title: "신규 기능 추가 안내", author: "관리자", date: "2024-07-11"},
            {id: 4, title: "서비스 이용약관 변경", author: "관리자", date: "2024-07-12"},
            {id: 5, title: "회원 등급제도 도입", author: "관리자", date: "2024-07-13"},
            {id: 6, title: "고객센터 운영시간 변경", author: "관리자", date: "2024-07-14"},
            {id: 7, title: "보안 업데이트 공지", author: "관리자", date: "2024-07-15"},
            {id: 8, title: "서비스 점검 안내", author: "관리자", date: "2024-07-16"},
            {id: 9, title: "이벤트 안내", author: "관리자", date: "2024-07-17"},
            {id: 10, title: "공지사항 제목 예시", author: "관리자", date: "2024-07-18"},
            {id: 11, title: "추가 공지사항 1", author: "관리자", date: "2024-07-19"},
            {id: 12, title: "추가 공지사항 2", author: "관리자", date: "2024-07-20"},
            {id: 13, title: "추가 공지사항 3", author: "관리자", date: "2024-07-21"},
            {id: 14, title: "추가 공지사항 4", author: "관리자", date: "2024-07-22"},
            {id: 15, title: "추가 공지사항 5", author: "관리자", date: "2024-07-23"},
            {id: 16, title: "추가 공지사항 6", author: "관리자", date: "2024-07-24"}
        ];

        const itemsPerPage = 7;
        const totalPages = Math.ceil(notices.length / itemsPerPage);
        const pagination = document.querySelector(".pagination");
        const tbody = document.querySelector("tbody");

        function renderPage(page) {
            tbody.innerHTML = "";
            const start = (page - 1) * itemsPerPage;
            const end = start + itemsPerPage;
            const pageNotices = notices.slice(start, end);

            pageNotices.forEach((notice, index) => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${start + index + 1}</td>
                    <td><a class="text-decoration-none text-black" href="notice_detail.html?id=${notice.id}">${notice.title}</a></td>
                    <td>${notice.author}</td>
                    <td>${notice.date}</td>
                `;
                tbody.appendChild(row);
            });
        }

        function renderPagination(currentPage) {
            pagination.innerHTML = `
                <li class="page-item ${currentPage === 1 ? 'disabled' : ''}">
                    <a class="page-link" href="#" data-page="previous">&laquo;</a>
                </li>
            `;

            let startPage = Math.max(1, currentPage - 1);
            let endPage = Math.min(totalPages, currentPage + 1);
            
            if (currentPage === 1) {
                endPage = Math.min(3, totalPages);
            } else if (currentPage === totalPages) {
                startPage = Math.max(1, totalPages - 2);
            }

            for (let i = startPage; i <= endPage; i++) {
                const pageItem = document.createElement("li");
                pageItem.className = `page-item ${i === currentPage ? 'active' : ''}`;
                pageItem.innerHTML = `<a class="page-link" href="#" data-page="${i}">${i}</a>`;
                pagination.insertBefore(pageItem, pagination.querySelector("[data-page='next']"));
            }

            pagination.innerHTML += `
                <li class="page-item ${currentPage === totalPages ? 'disabled' : ''}">
                    <a class="page-link" href="#" data-page="next">&raquo;</a>
                </li>
            `;
        }

        pagination.addEventListener("click", function(event) {
            event.preventDefault();
            const target = event.target;
            if (target.tagName.toLowerCase() === "a") {
                const currentPage = parseInt(document.querySelector(".pagination .active a").getAttribute("data-page"));
                let newPage = currentPage;

                if (target.getAttribute("data-page") === "previous") {
                    newPage = currentPage - 1;
                } else if (target.getAttribute("data-page") === "next") {
                    newPage = currentPage + 1;
                } else {
                    newPage = parseInt(target.getAttribute("data-page"));
                }

                renderPage(newPage);
                renderPagination(newPage);
            }
        });

        renderPagination(1);
        renderPage(1);
    });
</script>
</body>
</html>
