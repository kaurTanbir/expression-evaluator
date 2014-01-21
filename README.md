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

#### VERSION 0.1 [ADDITION ONLY]

    Product takes two operands and an operation in between.

        operator can be only ‘+’
        operand can only be +ve integers.
        values should be space separated.

    SAMPLE: "2 + 3"

#### VERSION 0.2 [SINGLE OPERATOR]

    Product takes two operands and an operation in between.

        operator can be any of ‘+ , - , *’
        operand can only be +ve integers.
        values should be space separated.

    SAMPLE: "2 + 3" , "3 - 2" , "3 * 2" , "4 / 2" , "2 ^ 2"

##### KNOWN BUG

given expression "1" i.e single value throws exception
