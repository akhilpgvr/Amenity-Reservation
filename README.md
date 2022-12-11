﻿# Amenity-Reservation


This project is all about selection and reservation of amenities (Like Swimming Pool, Gym, Steam Bath, Yoga.
There are 2 microservices used in this project. One for Experience-MS another for Management-MS.
Time is allowed to select as 1 hour time frame.

Experience-MS powers:

1)User can enter his basic details like name, age, gender ...
2)User can choose the amenity for analysing the price, age constraints and current reservation status.
3)After the submission of analysing details user can see the fee details and reservation status.
4)If reservation is full, User is not allowed to make reservation.
5)User Cannot delete a reservation.

Admin(Management-MS) Side:

1)Age constraints:
a)min age for swimmingpool is 12 and max age is 60.
b)min age for gym is 18 and max age is 60.
c) min age and max age for both steam bath is 10 and 60.

2)Price constrains:
there are 2 shedules: SHEDULE_ONE->[9am to 5pm] and SHEDUE_TWO->[5pm to 9pm].
a)GYM -> SHEDULE_ONE = 30 AED, SHEDUE_TWO = 50 AED
b)SWIMMING POOL -> SHEDULE_ONE = 20 AED, SHEDUE_TWO = 10 AED
c)STEAM BATH -> SHEDULE_ONE = 25 AED, SHEDUE_TWO = 50 AED
d)YOGA -> SHEDULE_ONE = SHEDUE_TWO = 50 AED

3)Admin can create, view, update and delete reservation.

4)Reservation constraints:
a)Only 5 persons are allowed to enter Swimming Pool in a timeframe.
b)Only 10 persons are allowed to enter Steam Bath in a timeframe.
c)Only 5 persons are allowed to enter Gym in a timeframe.
d)Only 5 persons are allowed to enter Yoga at a time.


