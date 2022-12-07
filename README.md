[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=9434409&assignment_repo_type=AssignmentRepo)
# CSC3170 Course Project

## Project Overall Description

This is our implementation for the course project of CSC3170, 2022 Fall, CUHK(SZ). For details of the project, you can refer to [project-description.md](project-description.md). In this project, we will utilize what we learned in the lectures and tutorials in the course, and implement either one of the following major jobs:

<!-- Please fill in "x" to replace the blank space between "[]" to tick the todo item; it's ticked on the first one by default. -->

- [ ] **Application with Database System(s)**
- [x] **Implementation of a Database System**

## Team Members

Our team consists of the following members, listed in the table below (the team leader is shown in the first row, and is marked with 🚩 behind his/her name):

<!-- change the info below to be the real case -->

| Student ID | Student Name | GitHub Account (in Email) |
| ---------- | ------------ | ------------------------- |
| 120090336   | 陈德坤🚩    | 120090336@link.cuhk.edu.cn |
| 120090747   | 陈清源    | 120090747@link.cuhk.edu.cn   |
| 120090675   | 黎鸣     | 120090675@link.cuhk.edu.cn     |
| 119010531 |Nasr Alae-eddine| 119010531@link.cuhk.edu.cn|
| 120010027  | 张家宇    | 120010027@link.cuhk.edu.cn     |
| 118010408   | 张昊旻  | 118010408@link.cuhk.edu.cn     |

## Project Specification

<!-- You should remove the terms/sentence that is not necessary considering your option/branch/difficulty choice -->

After thorough discussion, our team made the choice and the specification information is listed below:

- Our option choice is: **Option 3**


<!-- As for Option 2, our topic background specification can be found in [background-specification.md](background-specification.md). -->

## Project Abstract

This project involves writing a miniature relational database management system (DBMS) that stores tables of data, where a table consists of some number of labeled columns of information. Our system will include a very simple query language for extracting information from these tables. For the purposes of this project, we will deal only with very small databases, and therefore will not consider speed and efficiency at all.

Basically, we will use the provided template implemented by Java. The overall implementation order is from part to whole, from simple to difficult, such as Row -> Table -> Database. The detailed implementation order is shown below as a checklist.

## Project Checklist

- [x] Complete the printing of prompts

- [x] Ran first Test 

- [x] Implement the Row class (except for the Row(List<Column> columns, Row... rows) constructor)

- [x] Implement the parts of the Table class: Create a new Table, Add a Row to it, and Print an entire Table.

- [ ] Implement the Database class.

- [x] Implement insert and load.

- [ ] Implement the kind of select that takes a single table and has no conditions.

- [ ] Implement the Row(List<Column> columns, Row... rows) constructor.

- [ ] Get single-table select with conditions to work.

- [ ] Work on the two-table variety of select.

<!-- TODO -->
