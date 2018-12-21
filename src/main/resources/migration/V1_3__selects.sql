select *
from student
where student_group = 1;

select sg.*, avg(s.age) as average_age
from student_group sg
inner join student s
       on sg.id = s.student_group
group by sg.id
order by sg.title;


select student_group.*, s.name as student
from student_group
left outer join student s
  on student_group.id = s.student_group