-- 코드를 입력하세요
SELECT distinct cart_id
    from cart_products
    where cart_id in (SELECT cart_id
                        from cart_products
                        where name like 'Milk' or name like 'Yogurt'
                        group by cart_id
                        having count(distinct name)>1)
    order by 1;
            