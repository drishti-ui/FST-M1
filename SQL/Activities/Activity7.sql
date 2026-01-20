select * from orders;

select sum(purchase_amount) as "Total_Sum" from orders ;

select avg(purchase_amount) as "Average" from orders ;

select max(purchase_amount) as "Maximum" from orders ;

select min(purchase_amount) as "Minimum" from orders ;

select count(distinct salesman_id) "Total count" from orders ;