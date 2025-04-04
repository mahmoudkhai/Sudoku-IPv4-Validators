# Sudoku & IPv4 Validators

This project contains two simple Kotlin functions:

1.  **Sudoku Board Validator.**
2.  **IPv4 Address Validator.**

Both implementations focus on clean code, and test coverage.

---

## 1. Sudoku Board Validator

###  Goal:
Validate whether a given 9x9 Sudoku board is valid according to standard Sudoku rules:

- Each **row** must contain unique digits from 1 to 9.
- Each **column** must contain unique digits from 1 to 9.
- Each of the **9 subgrids (3x3)** must contain unique digits from 1 to 9.

Empty cells are represented with the character `'-'`.

### Flow Chart For Sudoku Board Validation Function:

![Sudoko_FlowChart](https://github.com/user-attachments/assets/8b63ffe5-8e24-48cb-8c50-a81b5538c070)


## 2. IPv4 Address Validator

###  Goal:
Check if a string is a valid IPv4 address. A valid IPv4 address should :

- Has exactly **4 octets** separated by dots (`.`).
- Each octet is a number between **0 and 255**.
- Leading zeros are not allowed (e.g., `01.1.1.1` is invalid).
- Contains **only digits and dots**.
- 
### Flow Chart For IPv4 Validation Function:

![IpV4Checker](https://github.com/user-attachments/assets/a9dcfc81-f55b-4e76-845c-56e063f43c49)

