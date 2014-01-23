expression-evaluator
====================

This repository has implementation of a tool which evaluates expression in left to right procession.

#### Tool Usage


To run from command line :-
```java
java -cp <path>expression-evaluator.jar  toolName   arguments
```

####SHELL FILES
You Can Also Use These Commands same as Your Shell Commands

just run the build file and download zip folder

unzip the zip folder and set the path as

    *EVALUATOR_HOME

####HOW TO RUN?
in the PATH set path as given below to run shell scripts
    *%EVALUATOR_HOME%/bin

That's it, Now you are ready to run these commands
####RUN COMMANDS

`$sh tk_eval.sh "2 + 3"`

#### VERSION 0.6 [NESTED PARENTHESIS]

    Product takes multiple operands and  operations. there should be an operator in between two operands.
    Supports the use of parenthesis around multiple single set of values.Parenthesis enclosed in other pair
    is also supported.

        operator can be any of ‘+ , - , * , / , ^’
        operand can only be +ve integers.
        values should be space separated.
        can have multiple pairs as well as nested brackets .

    SAMPLE: "2 + ( 3 - ( 3 ^ 1 ) * ( 20 / 2 )"

#### VERSION 0.5 [MULTIPLE PAIR OF PARENTHESIS]

    Product takes multiple operands and  operations. there should be an operator in between two operands.
    Supports the use of parenthesis around multiple single set of values.

        operator can be any of ‘+ , - , * , / , ^’
        operand can only be +ve integers.
        values should be space separated.
        can have multiple pairs of parenthesis but should not be nested (i.e one under another).

    SAMPLE: "2 + ( 3 - 3  ) * ( 20 / 2 )"


#### VERSION 0.4 [SINGLE PAIR OF PARENTHESIS]

    Product takes multiple operands and  operations. there should be an operator in between two operands.
    Supports the use of parenthesis around a single set of values.

        operator can be any of ‘+ , - , * , / , ^’
        operand can only be +ve integers.
        values should be space separated.
        can have parenthesis but only a single pair.

    SAMPLE: "2 + ( 3 - 3  ) * 2"


#### VERSION 0.3 [MULTIPLE OPERATOR]

    Product takes multiple operands and  operations. there should be an operator in between two operands.

        operator can be any of ‘+ , - , * , / , ^’
        operand can only be +ve integers.
        values should be space separated.

    SAMPLE: "2 + 3 - 3 * 2"

    BUGS FIXED:
    given expression "1" i.e single value throws exception.

##### KNOWN BUG

given expression to find quotient gives a rounded result.
given expression to find the power of the number gives a rounded result.

#### VERSION 0.2 [SINGLE OPERATOR]

    Product takes two operands and an operation in between.

        operator can be any of ‘+ , - , * , / , ^’
        operand can only be +ve integers.
        values should be space separated.

    SAMPLE: "2 + 3" , "3 - 2" , "3 * 2" , "4 / 2" , "2 ^ 2"

#### VERSION 0.1 [ADDITION ONLY]

    Product takes two operands and an operation in between.

        operator can be only ‘+’
        operand can only be +ve integers.
        values should be space separated.

    SAMPLE: "2 + 3"




