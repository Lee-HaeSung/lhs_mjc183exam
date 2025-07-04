SELECT
	st.id,
	st.product,
	st.price,
	st.qty,
	st.discount,
	st.price * st.qty - st.discount AS prc,
	ct.name,
	IFNULL(lt.location,'')loca
FROM saled_tbl st
INNER JOIN contact_tbl AS ct
	ON st.contact_id = ct.id
LEFT JOIN location_tbl AS lt
	ON st.location_id = lt.id
WHERE 1=1
;

SELECT 
	ct.name,
	ct.email,
	lt.score,
	lt.id,
	lt2.subject,
	lt2.teacher,
	lt2.room_num ,
	lt2.start_dt,
	lt2.end_dt
FROM learn_tbl lt 
INNER JOIN lecture_tbl lt2 
	ON lt.lecture_id = lt2.id
INNER JOIN contact_tbl ct
	ON ct.id = lt.contact_id 
WHERE lt2.start_dt <= '2025-06-01'
ORDER BY start_dt
;
	