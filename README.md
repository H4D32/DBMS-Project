# DBMS Course Project

## Project Overall Description

This is our implementation for the course project of CSC3170, 2022 Fall, CUHK(SZ). For details of the project, you can refer to [project-description.md](project-description.md). In this project, we will utilize what we learned in the lectures and tutorials in the course, and implement either one of the following major jobs:

<!-- Please fill in "x" to replace the blank space between "[]" to tick the todo item; it's ticked on the first one by default. -->

- [ ] **Application with Database System(s)**
- [x] **Implementation of a Database System**

# Please refer to the [report](REPORT.md) !!!

- Our project report could be found here: [REPORT.md](REPORT.md).

- How to run with VSCode configuration to test could be found here: [RunTest.md](DB61B/testing/RunTest.md).

- Our main java codes could be found here: [Source code](DB61B/db61b/src/main/java/t3/db61b).


## Team Members

Our team consists of the following members, listed in the table below:

<!-- change the info below to be the real case -->

| Student ID | Student Name | GitHub Account (in Email) | GitHub Username |
| ---------- | ------------ | ------------------------- | ------------------------- |
| 120090336   | 陈德坤   | 1143863630@qq.com<br>120090336@link.cuhk.edu.cn | @[salixc](https://github.com/salixc) |
| 120090747   | 陈清源    | christoph.chen@foxmail.com<br>120090747@link.cuhk.edu.cn   |@[Christoph-UGameGerm](https://github.com/Christoph-UGameGerm)|
| 120090675   | 黎鸣     | 120090675@link.cuhk.edu.cn     | @[Mo9L1](https://github.com/Mo9L1) |
| 119010531 |Nasr Alae-eddine| alaeeddinenasr@gmail.com<br>119010531@link.cuhk.edu.cn| @[H4D32](https://github.com/H4D32) |
| 120010027  | 张家宇    | 120010027@link.cuhk.edu.cn     | @[JJY-jy233](https://github.com/JJY-jy233) |
| 118010408   | 张昊旻  | 118010408@link.cuhk.edu.cn     | @[118010408](https://github.com/118010408) |

## Project Abstract

This project involves writing a miniature relational database management system (DBMS) that stores tables of data, where a table consists of some number of labeled columns of information. Our system will include a very simple query language for extracting information from these tables. For the purposes of this project, we will deal only with very small databases, and therefore will not consider speed and efficiency at all.

Basically, we will use the provided template implemented by Java. The overall implementation order is from part to whole, from simple to difficult, such as Row -> Table -> Database. The detailed implementation order is shown below as a checklist.

## Project Checklist

- [x] 1. Complete the printing of prompts

- [x] 2. Ran first Test 

- [x] 3. Implement the Row class (except for the Row(List<Column> columns, Row... rows) constructor)

- [x] 4. Implement the parts of the Table class: Create a new Table, Add a Row to it, and Print an entire Table.

- [x] 5. Implement the Database class.
  
- [x] 6. Implement the Condition class.

- [x] 7. Implement insert and load.

- [x] 8. Implement the kind of select that takes a single table and has no conditions.

- [x] 9. Implement the Row(List<Column> columns, Row... rows) constructor.

- [x] 10. Get single-table select with conditions to work.

- [x] 11. Work on the two-table variety of select.

- [x] 12. Work on the multi table selection w/wo conditions.(optional)

