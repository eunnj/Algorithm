-- 코드를 입력하세요
SELECT a.APNT_NO, p.PT_NAME, p.PT_NO, d.MCDP_CD,d.DR_NAME,a.APNT_YMD
from PATIENT p, DOCTOR d, APPOINTMENT a
where 1=1
    and p.pt_no = a.pt_no
    and d.dr_id = a.mddr_id
    and a.APNT_CNCL_YN ='N'
    and to_char(a.APNT_YMD,'YYYYMMDD')='20220413'
    and a.MCDP_CD = 'CS'
order by 6 asc;