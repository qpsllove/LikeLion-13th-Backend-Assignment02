USE library_;

CREATE TABLE students (
	id INTEGER PRIMARY KEY,		-- 학생 고유 id, 기본값, 정수값 / 테이블에 저장된 id 데이터를 식별해 기본키로 사용하기 위해 PRIMARY KEY 사용
    name VARCHAR(30) NOT NULL,	-- 학생 이름, 최대 30자, null값 안됨 / 이름을 반드시 입력해야하기 때문에 NOT NULL 사용
    number INTEGER(20) NOT NULL	-- 학생 학번, 최대 20자, null값 안됨 / 학번을 반드시 입력해야하기 때문에 NOT NULL 사용
);
    
CREATE TABLE books (
	id INTEGER AUTO_INCREMENT PRIMARY KEY,	-- 책 고유 id, 자동으로 1씩 증가, 기본키
    title VARCHAR(80) NOT NULL,		-- 책 제목, 최대 80자, null값 안됨 / 책 제목을 반드시 입력해야하기 때문에 NOT NULL 사용
    writer VARCHAR(20) NOT NULL,		-- 책 장르, 최대 20자, null값 안됨 / 작가 이름을 반드시 입력해야하기 때문에 NOT NULL 사용
    part_id INTEGER,	-- 소속된 파트 ID students 테이블의 id 참조, 정수값...
    FOREIGN KEY (part_id) REFERENCES students(id)	-- 외래키 : part_id는 students 테이블의 id와 연결
													-- books 테이블에서 students 테이블의 기본키를 참조하기 위해 외래키 FOREIGN KEY 사용
);

-- 외래키를 통해 books.part_id(자식)는 반드시 students.id(부모)에 존재하는 값만 가질 수 있다...