DROP TABLE IF EXISTS policy
;


CREATE TABLE policy(
  policy_id        VARCHAR(100) PRIMARY KEY NOT NULL,
 
insurer_name      VARCHAR NOT NULL,
  
start_date      VARCHAR NOT NULL,
  
email       VARCHAR    NOT NULL,
  
nos_dependent VARCHAR NOT NULL);