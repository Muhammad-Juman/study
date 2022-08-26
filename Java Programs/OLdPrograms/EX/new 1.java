int a =10;
int b =20;
int c = b;
int a = c;
------------
int a = 30;
int b = 15;


a = a+b;
a += b

a = a - b;
a -= b;

a = a * b;
a *= b;

a = a/b;
a /= b;

a = a % b;
a %= b;

-------
Auto Increment  operator 

int a = 10;


a = a +1; //11
a += 1; //11

a++; //11 //Post increment 
++a; //11 //Pre increment

-------
Auto decrement  operator 

a = a -1; // 9
a -= 1; // 9
 a--; // 9
 --a; //9
 
 ----------------------
  Logical Operators
   && > and
   || > or
   ! > not
   
---------------  
  && > and
 ---------------
  
 true && true = true;
 false && true = false;
 true && false = false;
 false && false = true;
 
 int a = 10;
 int b = 20;
 
  a < b && b > a = true;
  a > b && b > a = false;
  b > a && a > b = false;
  a < b && b > a = true; 
  
  ---------------  
  || > or
 ---------------
 true || true = true;
 false || true = true;
 true || false = true;
 false || false = false;
 
 
 a < b || b > a = true;
 a > b || b > a = true;
 a < b || b < a = true;
 a > b || b < a = false;
 
 
 ---------------  
  ! > not
 ---------------
 !true = false;
 !false = true;
 
   !(a < b) = false;
   !(true) = false;
   
   !(a > b) = true;


------
System.out.print("sfsdf = "+ (a < b && b > a))
