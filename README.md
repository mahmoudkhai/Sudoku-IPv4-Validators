# Sudoku Validator & IPv4 Checker

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

![Flow chart for sudoko](https://github.com/user-attachments/assets/3a6f6fe2-58a6-4204-9c04-16eff8dc972e)

## 2. IPv4 Address Validator

###  Goal:
Check if a string is a valid IPv4 address. A valid IPv4 address should :

- Has exactly **4 octets** separated by dots (`.`).
- Each octet is a number between **0 and 255**.
- Leading zeros are not allowed (e.g., `01.1.1.1` is invalid).
- Contains **only digits and dots**.
- 
### Flow Chart For IPv4 Validation Function:

![flow chart for IpV4 checker](https://github.com/user-attachments/assets/fca55771-8bf7-47be-9100-b5cd9ec6a666)
