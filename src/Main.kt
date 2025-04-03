fun main() {


    //------------------------ROW------------------------
    testCase(
        name = "Given a board with duplicates in row, when validating, then return false",
        actualResult = isValidSudoku(
            listOf(
                listOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),
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
        expectedResult = true
    )
    testCase(
        name = "Given a board with a row that contains less than 9 elements, when validating, then return false",
        actualResult = isValidSudoku(
            listOf(
                listOf('5', '3'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = true
    )
    testCase(
        name = "Given a board with a row contains more than 9 elements, when validating , then return false",
        actualResult = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '2', '1'),
                listOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = true
    )
    // ------------------------Column------------------------
    testCase(
        name = "Given a board with duplicate in column, when validating, then return false",
        actualResult = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                listOf('6', '3', '-', '1', '9', '5', '-', '-', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = true
    )
    // ------------------------SubGrid------------------------
    testCase(
        name = "Given a board with duplicates in subgrid, when validating, then return false",
        actualResult = isValidSudoku(
            listOf(
                listOf('5', '3', '-', '-', '7', '-', '-', '-', '1'),
                listOf('6', '3', '-', '1', '9', '5', '-', '1', '-'),
                listOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                listOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                listOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                listOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                listOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                listOf('-', '-', '-', '4', '1', '9', '5', '7', '5'),
                listOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ), expectedResult = true
    )
    // ------------------------Valid Boards------------------------
    testCase(
        name = "Given a valid board, when validating, then return true",
        actualResult = isValidSudoku(
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
        actualResult = isValidSudoku(
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


    //region IP V4
//    testCase(
//        name = "Given an empty string, when validating, then return failed",
//        actualResult = isValidIpV4(""),
//        expectedResult = true
//    )
//    testCase(
//        name = "Given a string that doesn't contain only numbers and dots, when validating, then return failed",
//        actualResult = isValidIpV4("1.3.x"),
//        expectedResult = true
//    )
//    testCase(
//        name = "Given a string with length less than 7, when validating, then return failed",
//        actualResult = isValidIpV4("1.1.1"),
//        expectedResult = true
//    )
//    testCase(
//        name = "Given an ip with octets that are less than 4 chars, when validating, then return failed",
//        actualResult = isValidIpV4("251.30.12."),
//        expectedResult = true
//    )
//    testCase(
//        name = "Given an ip with octet length more than 1 and starts with 0, when validating, then return failed",
//        actualResult = isValidIpV4("123.01.1.5"),
//        expectedResult = true
//    )
//    testCase(
//        name = "Given an ip with octet number that isn't between 0 and 255, when validating, then return failed",
//        actualResult = isValidIpV4("-1.299.1.3"),
//        expectedResult = true
//    )
}


fun testCase(name: String, actualResult: Boolean, expectedResult: Boolean) {
    return if (expectedResult == actualResult)
        println("Success -> $name")
    else println("Failed -> $name")
}

fun isValidIpV4(ipAddress: String): Boolean {
    return false
}

fun isValidSudoku(board: List<List<Char>>): Boolean {
    return false
}


