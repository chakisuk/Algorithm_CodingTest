-- 코드를 입력하세요
-- 아이디순으로 조회 order by ANIMAL_ID
select animal_id, name
from animal_ins
where intake_condition = "Sick"
order by animal_id;