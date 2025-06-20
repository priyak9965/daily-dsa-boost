/* Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

Ensure only the 1st letter of the answer is capitalised.

For printing use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log() */

class Solution {
    public void whichWeekDay(int day) {
        switch(day){
            case(1) :
             System.out.print("Monday");
             break;
             case(2):
             System.out.print("Tuesday");
             break;
             case(3):
             System.out.print("Wednesday");
             break;
             case(4):
             System.out.print("Thursday");
             break;
             case(5):
             System.out.print("Friday");
             break;
             default:
             System.out.print("Invalid");
             break;
        }

    }
}
