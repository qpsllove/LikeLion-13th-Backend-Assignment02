USE library_;

INSERT INTO students (id, name, number) VALUES
(1, '김수정', 202517102),
(2, '김베니', 202517123),
(3, '김멋사', 202517456);

INSERT INTO books (title, writer, part_id) VALUES
('28', '정유정', 1),
('브로콜리 펀치', '이유리', 1),
('테라리움', '이아람', 2),
('붐뱁, 잉글리시, 트랩', '김준녕', 2),
('드라큘라', '브람 스토커', 3),
('소년이 온다', '한강', 3);

USE library_;

SELECT * FROM students;
SELECT * FROM books;