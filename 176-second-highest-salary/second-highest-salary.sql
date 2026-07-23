# Write your MySQL query statement below
select (select distinct e1.salary
from employee e1
where (select count(distinct e2.salary)
       from employee e2
       where e2.salary>e1.salary) = 1)as SecondHighestSalary;