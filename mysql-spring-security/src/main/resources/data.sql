-- User user/pass
                                  INSERT INTO users (username, password, enabled)
                                    values ('radha',
                                      'pass',
                                      1);
                                  INSERT INTO users (username, password, enabled)
                                    values ('adarsh',
                                      'pass',
                                      1);

                                  INSERT INTO authorities (username, authority)
                                    values ('radha', 'ROLE_USER');

                                  INSERT INTO authorities (username, authority)
                                    values ('adarsh', 'ROLE_ADMIN');