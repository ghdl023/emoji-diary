DROP TABLE IF EXISTS Member;
DROP TABLE IF EXISTS Contents;

CREATE TABLE member
(
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    user_id VARCHAR(30) NOT NULL UNIQUE,
    user_pw VARCHAR(300) NOT NULL,
    create_date DATE DEFAULT CURRENT_TIMESTAMP,
    update_date DATE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE emotion
(
    id VARCHAR(30) PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);


CREATE TABLE weather
(
    id VARCHAR(30) PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);


CREATE TABLE withs
(
    id VARCHAR(30) PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE contents
(
    id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    content VARCHAR(1000) NOT NULL,
    writer INTEGER NOT NULL,
    emotion_id VARCHAR NOT NULL,
    weather_id VARCHAR NOT NULL,
    withs_id VARCHAR NOT NULL,
    yyyymmdd VARCHAR(8) NOT NULL
);
ALTER TABLE contents ADD CONSTRAINT fk_contents_writer FOREIGN KEY (writer) REFERENCES member(id);
ALTER TABLE contents ADD CONSTRAINT fk_contents_emotions FOREIGN KEY (emotion_id) REFERENCES emotion(id);
ALTER TABLE contents ADD CONSTRAINT fk_contents_weathers FOREIGN KEY (weather_id) REFERENCES weather(id);
ALTER TABLE contents ADD CONSTRAINT fk_contents_withs FOREIGN KEY (withs_id) REFERENCES withs(id);
ALTER TABLE contents ADD CONSTRAINT unique_contents_date UNIQUE (writer, yyyymmdd);
