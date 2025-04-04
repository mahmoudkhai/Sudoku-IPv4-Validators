fun main() {

    /***
     *                  Covered test Cases for Sudoku board.
     * 1-Given a board with duplicates in row, when validating, then return false.
     * 2-Given a board with a row that contains less than 9 elements, when validating, then return false.
     * 3-Given a board with a row contains more than 9 elements, when validating , then return false.
     * 4-Given a board with inValid elements, when validating, then return false.
     * 5-Given a board with duplicate in column, when validating, then return false.
     * 6-Given a board with duplicates in subgrid, when validating, then return false.
     * 7-Given a valid board, when validating, then return true.
     * 8-Given a board with empty elements, when validating, then return true
     */
    //------------------------ROW------------------------
    testCase(
        name = "Given a board with duplicates in row, when validating, then return false",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),// <--
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '9', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedResult = false
    )
    testCase(
        name = "Given a board with a row that contains less than 9 elements, when validating, then return false",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('5', '3'),// <--
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = false
    )
    testCase(
        name = "Given a board with a row contains more than 9 elements, when validating , then return false",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '2', '1'),// <--
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = false
    )
    testCase(
        name = "Given a board with inValid elements, when validating, then return false",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('A', '/', '3', '-', '7', '-', '-', '-', '-'),// <--
                listOf('B', '_', '-', '1', '9', '5', '-', '-', '-'),
                listOf('C', '?', '9', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedResult = false
    )
    // ------------------------Column------------------------
    testCase(
        name = "Given a board with duplicate in column, when validating, then return false",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('5', '3', '-', '-', '7', '5', '-', '-', '-'),// <--
                listOf('5', '3', '-', '1', '9', '5', '-', '-', '-'),// <--
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = false
    )
    // ------------------------SubGrid------------------------
    testCase(
        name = "Given a board with duplicates in subgrid, when validating, then return false",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '1'),// <--
                listOf('6', '3', '-', '1', '9', '5', '-', '1', '-'),// <--
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '5', '7', '5'),// <--
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')// <--
            )
        ), expectedResult = false
    )
    // ------------------------Valid Boards------------------------
    testCase(
        name = "Given a valid board, when validating, then return true",
        actualResult = checkSudokuBoardValidation(
            board = listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        expectedResult = true
    )
    testCase(
        name = "Given a board with empty elements, when validating, then return true",
        actualResult = checkSudokuBoardValidation(
            listOf(
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                listOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
            )
        ), expectedResult = true
    )


//    region IP V4
    testCase(
        name = "Given an empty string, when validating, then return failed",
        actualResult = checkIPV4Validation(""),
        expectedResult = false
    )
    testCase(
        name = "Given a string that doesn't contain only numbers and dots, when validating, then return failed",
        actualResult = checkIPV4Validation("1.3.x"),
        expectedResult = false
    )
    testCase(
        name = "Given a string with length less than 7, when validating, then return failed",
        actualResult = checkIPV4Validation("1.1.1"),
        expectedResult = false
    )
    testCase(
        name = "Given an ip with octets less than 4, when validating, then return failed",
        actualResult = checkIPV4Validation("251.30.12."),
        expectedResult = false
    )
    testCase(
        name = "Given an ip with octet length more than 1 and starts with 0, when validating, then return failed",
        actualResult = checkIPV4Validation("123.01.1.5"),
        expectedResult = false
    )
    testCase(
        name = "Given an ip with octet number that isn't between 0 and 255, when validating, then return failed",
        actualResult = checkIPV4Validation("-1.299.1.3"),
        expectedResult = false
    )
    testCase(
        name = "Given a valid ip address, when validating, then return true",
        actualResult = checkIPV4Validation("5.15.1.3"),
        expectedResult = true
    )
}


fun testCase(name: String, actualResult: Boolean, expectedResult: Boolean) {
    return if (expectedResult == actualResult)
        println("Success -> $name")
    else println("Failed -> $name")
}

fun checkIPV4Validation(ipAddress: String): Boolean {
    if (ipAddress.isEmpty()) return false

    val octets = ipAddress.split(".")
    if (octets.size != 4) return false

    for (octet in octets) {
        if (octet.isEmpty()) return false

        if (octet.any { !it.isDigit() }) return false

        val number = octet.toIntOrNull() ?: return false

        if (number !in 0..255) return false

        if (octet.length > 1 && octet[0] == '0') return false
    }

    return true
}


fun checkSudokuBoardValidation(board: List<List<Char>>): Boolean {
    if (board.size != 9 || board.any { it.size != 9 }) return false

    val rows = Array(9) { mutableSetOf<Char>() }
    val cols = Array(9) { mutableSetOf<Char>() }
    val subGrids = Array(9) { mutableSetOf<Char>() }

    for (row in 0..<9) {
        for (column in 0..<9) {
            val num = board[row][column]
            if (num == '-') continue
            if (!num.isDigit() || num !in '1'..'9') return false

            val subGridIndex = (row / 3) * 3 + (column / 3)

            if (num in rows[row] || num in cols[column] || num in subGrids[subGridIndex])
                return false


            rows[row].add(num)
            cols[column].add(num)
            subGrids[subGridIndex].add(num)
        }
    }

    return true
}



