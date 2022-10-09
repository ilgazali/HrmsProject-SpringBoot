# Human Resource Management System Project 
![hrms-human-resource-management-system](https://user-images.githubusercontent.com/73468385/122237775-44eb8980-cec8-11eb-85d1-20f05f6dc14b.jpg)
# BACKEND REQUIREMENTS
## Our system has three basic types of users. System staff, Job Seekers and Employers.
# :star2: ***Req 1 : Job Seekers should be able to register in the system.***
## Accept Conditions:
### :milky_way: During registration, the user is asked for name, surname, tc no, year of birth, e-mail, password, password repeat information.
### :milky_way: All fields are required. The user is informed.
### :milky_way: Registration to the system is performed by verifying Mernis.
### :milky_way: The user is notified if the validation is not valid.
### :milky_way: If there is a previously registered e-mail or tcno, the registration will not take place. The user is informed.
### :milky_way: Email verification is required for registration to occur.
# :star2: ***Req 2 : Employers should be able to register in the system.***
## Accept conditions:
### :milky_way: During registration, the user is asked for company name, website, e-mail with the same domain as the website, phone, password, password repeat information. The purpose here is to prevent non-companies from joining the system.
### :milky_way: All fields are required. The user is informed.
### :milky_way: Company records are verified in two ways. Email verification is required for registration to occur. Approval from HRMS staff (our :)) is required.
### :milky_way: If there is a previously registered e-mail, the registration will not occur. The user is informed.
# :star2: ***Req 3 : General job position names should be added to the system. (For example Software Developer, Software Architect.)***
### :milky_way: These positions cannot be repeated. The user is warned.
# :star2: ***Req 4 : Employers should be able to be listed. (Whole list only)***
# :star2: ***Req 5 : Job seekers should be listed. (Whole list only)***
# :star2: ***Req 6 : Job positions must be listed. (Whole list only)***
# :star2: ***Req 7 : Employers should be able to add job postings to the system.***
### In the job posting form;
### :milky_way: General job position can be selected from dropdown list. (For example Java Developer)(Required)
### :milky_way: Job description entry must be possible. (For example; For our company, he is proficient in languages ​​such as JAVA, C # etc....)(Required)
### :milky_way: City information should be able to be selected from the drop-down list. (Compulsory)
### :milky_way: It should be possible to enter min-max for the salary scale. (Optional)
### :milky_way: The number of open positions must be entered. (Compulsory)
### :milky_way: It should be possible to enter the application deadline.
# :star2: ***Req 8 : All active job postings in the system should be listed.***
### :milky_way: The list must come in tabular form.
### :milky_way: Company name, general job position name, number of open positions, publication date, deadline should be in the list.
# :star2: ***Req 9 : All active job postings in the system should be listed by date.***
### :milky_way: The list must come in tabular form.
### :milky_way: Company name, general job position name, number of open positions, publication date, deadline should be in the list.
# :star2: ***Req 10 : All active job postings of a company should be listed in the system.***
### :milky_way: The list must come in tabular form.
### :milky_way: Company name, general job position name, number of open positions, publication date, deadline should be in the list.
# :star2: ***Req 11 : Employers should be able to close a posting in the system. (Passive posting)***
# :star2: ***Req 12: Candidates should be able to enter their CV into the system.***
### :milky_way: Candidates should be able to add their schools to the system. (School name, department)
### :milky_way: These schools should be able to enter the years they studied in the system.
### :milky_way: If not graduated, graduation year should be blank.
### :milky_way: Candidates' schools should be in reverse order according to graduation year. If not graduated, this school should be displayed at the top and as "in progress".
### :milky_way: Candidates should be able to enter their work experience. (Business name, position)
### :milky_way: They should be able to enter the years of their experience into the system.
### :milky_way: If still working, leave year should be blank.
### :milky_way: Candidates' experience should be in reverse order by year. If it is still running, this experience should still be displayed at the top and as "in progress".
### :milky_way: Candidates should be able to enter the foreign languages they know into the system. ( Language, Level -> 1-5)
### :milky_way: Candidates must be able to enter photos into the system. The photo of the candidate will be kept in the [cloudinary](https://cloudinary.com/pricing) system.
### :milky_way: Candidates should be able to enter their github addresses into the system.
### :milky_way: Candidates should be able to enter their linkedin addresses into the system.
### :milky_way: Candidates should be able to enter the programming languages or technologies they know into the system. (Programming/Technology name) For example; React
### :milky_way: Candidates must be able to add a cover letter to the system. (For example: I like working very much....)
# :star2: ***Req 13 : All CV information of a candidate should be displayed.***
## **PostgreSQL was used as the database. The current database model of the project is as follows:**
![Untitled (2)](https://user-images.githubusercontent.com/73468385/122258454-b8e25d80-ced9-11eb-85f8-5c7d0f85d9b2.png)



