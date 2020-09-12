-- User user/pass
INSERT INTO my_users (username, password, enabled)
  values ('radha',
    'pass',
    1);
INSERT INTO my_users (username, password, enabled)
  values ('adarsh',
    'pass',
    1);
INSERT INTO my_users (username, password, enabled)
  values ('test',
    'pass',
    0);

INSERT INTO my_authorities (username, authority)
  values ('radha', 'ROLE_USER');

INSERT INTO my_authorities (username, authority)
  values ('adarsh', 'ROLE_ADMIN');