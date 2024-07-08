INSERT INTO member(user_id, user_pw) VALUES('usopp', '1234');
INSERT INTO member(user_id, user_pw) VALUES('sim', '1234');
INSERT INTO member(user_id, user_pw) VALUES('ryu', '1234');
INSERT INTO member(user_id, user_pw) VALUES('tae', '1234');

INSERT INTO emotion(id, name) VALUES('HAPPY', '행복');
INSERT INTO emotion(id, name) VALUES('SMILE', '기쁨');
INSERT INTO emotion(id, name) VALUES('SOSO', '그럭저럭');
INSERT INTO emotion(id, name) VALUES('SAD', '슬픔');
INSERT INTO emotion(id, name) VALUES('BAD', '나쁨');

INSERT INTO weather(id, name) VALUES('SUNNY', '맑음');
INSERT INTO weather(id, name) VALUES('CLOUD', '흐림');
INSERT INTO weather(id, name) VALUES('WIND', '바람');
INSERT INTO weather(id, name) VALUES('RAIN', '비');
INSERT INTO weather(id, name) VALUES('SNOW', '눈');

INSERT INTO withs(id, name) VALUES('FRIEND', '친구');
INSERT INTO withs(id, name) VALUES('FAMILY', '가족');
INSERT INTO withs(id, name) VALUES('COUPLE', '애인');
INSERT INTO withs(id, name) VALUES('KNOWN', '지인');
INSERT INTO withs(id, name) VALUES('SOLO', '혼자');

INSERT INTO contents(title, content, writer, emotion_id, weather_id, withs_id, yyyymmdd) VALUES('제목1', '내용', 1, 'HAPPY', 'RAIN', 'COUPLE', '20240705');
INSERT INTO contents(title, content, writer, emotion_id, weather_id, withs_id, yyyymmdd) VALUES('제목2', '내용', 1, 'SMILE', 'RAIN', 'SOLO', '20240704');
INSERT INTO contents(title, content, writer, emotion_id, weather_id, withs_id, yyyymmdd) VALUES('제목3', '내용', 1, 'SAD', 'WIND', 'FAMILY', '20240703');
INSERT INTO contents(title, content, writer, emotion_id, weather_id, withs_id, yyyymmdd) VALUES('제목4', '내용', 1, 'SOSO', 'SUNNY', 'COUPLE', '20240702');
