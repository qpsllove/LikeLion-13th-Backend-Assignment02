-- 실습을 위해 어떤 학생과도 연결되지 않은 책을 추가

INSERT INTO books (title, writer, part_id)
VALUES ('명탐정 코난', '아오야마 고쇼', NULL);

-- INSERT JOIN으로 쿼리를 작성

USE library_;

SELECT
	books.title AS 책제목,		-- AS로 열 이름을 책제목으로 바꿔서 표시
    students.name AS 빌린학생
FROM	-- 기준이 되는 메인 테이블 지정
	books
JOIN	-- students 테이블과 연결
	students
ON		-- 어떤 열을 기준으로 연결할 지 설정, books의 part_id와 students의 is가 일치할 때만 데이터를 합침
	books.part_id = students.id;