CREATE TABLE members (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE attendance (
    id SERIAL PRIMARY KEY,
    employeeId INT NOT NULL,
    attendance_date VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES members(id)
);
