# Write your MySQL query statement below
select firstName, lastName, city, state 
from Person a 
left outer join Address b
on a.personId = b.personId;