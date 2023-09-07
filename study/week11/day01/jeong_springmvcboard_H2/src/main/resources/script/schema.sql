CREATE TABLE IF NOT EXISTS `users` (
    `user_id` VARCHAR(255) NOT NULL COMMENT '사용자 아이디' primary key,
    `user_password` VARCHAR(255) NOT NULL COMMENT '사용자 비밀번호',
    `user_name` VARCHAR(255) NOT NULL COMMENT '사용자 이름',
    `profile_file_name` VARCHAR(255) NOT NULL COMMENT '사용자 프로필',
    `created_at` datetime NOT NULL default current_timestamp COMMENT '등록 날짜'
);


CREATE TABLE IF NOT EXISTS `posts` (
    `post_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'ai' primary key,
    `title` VARCHAR(255) NOT NULL COMMENT '제목',
    `content` text NOT NULL COMMENT '내용',
    `writer_user_id` VARCHAR(255) NOT NULL COMMENT '사용자 아이디',
    `write_time` datetime NOT NULL default current_timestamp COMMENT '작성 시간',
    `view_count` INT NOT NULL COMMENT '조회 수'
);


