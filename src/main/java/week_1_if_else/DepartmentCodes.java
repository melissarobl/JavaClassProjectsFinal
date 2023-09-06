package week_1_if_else;

import static input.InputUtils.stringInput;

public class DepartmentCodes {
    public static void main(String[] args) {
        String departmentCode = stringInput("Enter department code");
        //check for valid code ITEC, BTEC, ENGL, MATH

        if (departmentCode.length() == 4 ){
            System.out.println("The code is valid.");
            departmentCode = departmentCode.toUpperCase();
            System.out.println("The code is " + departmentCode);
        }else
            System.out.println("The code is invalid.");
    }
}
