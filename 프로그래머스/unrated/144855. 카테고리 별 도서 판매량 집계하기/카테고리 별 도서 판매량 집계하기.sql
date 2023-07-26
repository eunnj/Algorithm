-- 코드를 입력하세요
select b.category, sum(s.sales) as total_sales 
    from book b, book_sales s
    where 1=1
    and b.book_id = s.book_id
    and to_char(s.sales_date,'YYYYMM') like '%202201%'
    group by b.category
    order by b.category;