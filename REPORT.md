# CSC3170 Course Project Report

## Historical Progress
This is a preliminary report, which includes Project Overall Description, Team Members, Project Specification and Project Checklist.  For details, you can refer to [README](README.md).


## Program Design
Since the template we used was written by Java, we have 7 important classes to together form our major function. The basic relationship amoung classes is shown below:

![image](graphs/relationship.png)

For each class:
+ **Tokenizer**: Parse user commands, and interacts with database or creates conditions.
+ **CommandInterpreter**: Receive semantic information extracted from Tokenizer, and assign tasks to corresponding functions for execution.
+ **Condition**: Deal with "where condition" in select command.
+ **Column**: An index of a column in a list of rows.
+ **Row**: A single row of data.
+ **Table**: Write/read from files, and maintain db operations.
+ **Database**: Formed by tables.

Based on the hierarchical class structure, we built a [Checklist](README.md) for progress management. Group members are able to focus on the implementation of different classes in parallel. For instance, the person who implement Row class do not need to pay much attention both on the detail implementation of Column and the calling method in Table.


## Functionality Implementation
In the [CommandInterpreter](DB61B/db61b/src/main/java/t3/db61b/CommandInterpreter.java) part, there are several command implementation including Create,Load,Print,Store,Insert,Select and Quit/Exit. We mainly focus on the Select command since others use similar structure thus are easy to implement. The Selection Clause is shown below:

![image](graphs/selection_clause.png)

It shows the basic implementation of the selection part. Its logic is: whether there is a condition or not, create a table first. If there is a condition, perform a single table condition query directly on the basis of the output table. But our task also includes the selection of two tables and the selection of conditions. Our idea is to merge the selected columns and create a new table, and then perform single table condition query on the basis of this new table.


## Difficulty & Solutions
### 1. Intermediate Test:
Based the original file structure, we have to finish everything and do the final test to debug. It was quite hard to find and correct mistakes from many functions.

So, we introduced Maven management method to realise intermediate test. Once a class with several functions is implemented, the programmer could write a small piece of code to verify the correctness of that class.

In this situation, the file structure seems a little bit different. If you are confused about that, the [structure description in README](README.md) may be helpful.

## Contribution
