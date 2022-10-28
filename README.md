# SimplyDB

Simple and fast in-memory OLTP database.

## Architecture

* Database functionality is called via an IPC.
* The database is implemented as an in-memory B-tree.
* A binary log file is used for logging all changes to the database.

The complete architecture can be found in the [Architecture diagram](./meta/Architecture.png).

## Author

[**Andreja Nesic RN31/19**](https://www.linkedin.com/in/andreja-nesic/) | _Comp Sci Undergrad_ <br>
[School of Computing, Belgrade](https://www.linkedin.com/school/racunarski-fakultet/) <br>
office@andrejanesic.com <br>
anesic3119rn@raf.rs