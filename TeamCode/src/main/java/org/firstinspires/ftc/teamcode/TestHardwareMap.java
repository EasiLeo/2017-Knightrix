package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by nicolas on 9/30/17.
 */

public abstract class TestHardwareMap extends OpMode {
// Remove Hardware Section
    DcMotor LeftFrontDrive;
    DcMotor LeftBackDrive;
    DcMotor RightFrontDrive;
    DcMotor RightBackDrive;

    //Variables
    float myangle = 0;
    float mypower = 0;

    @Override
    public void init(){

        LeftFrontDrive = hardwareMap.dcMotor.get("LF");
        LeftFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        LeftBackDrive = hardwareMap.dcMotor.get("LB");
        LeftBackDrive.setDirection(DcMotor.Direction.REVERSE);
        RightFrontDrive = hardwareMap.dcMotor.get("RF");
        RightFrontDrive.setDirection(DcMotor.Direction.FORWARD);
        RightBackDrive = hardwareMap.dcMotor.get("RB");
        RightBackDrive.setDirection(DcMotor.Direction.FORWARD);



    }
    void MoveRobot(double PowerLeft, double PowerRight) {
    /*    if (RightFrontDrive != null) {
            RightFrontDrive.setPower(PowerRight/3);
        }
        if (RightBackDrive != null) {
            RightBackDrive.setPower(PowerRight/3);
        }
        if (LeftFrontDrive != null) {
            LeftFrontDrive.setPower(PowerLeft/3);
        }
        if (LeftBackDrive != null) {
            LeftBackDrive.setPower(PowerLeft/3);
        }
    */
    }

    void mech_move (float myangle, float mypower){
        if (LeftFrontDrive !=null && LeftBackDrive != null && RightFrontDrive != null && RightBackDrive != null ) {
            LeftFrontDrive.setPower( mypower * -Math.sin((myangle + 45) / 180 * 3.141592));
            LeftBackDrive.setPower(  mypower * -Math.sin((myangle + 135) / 180 * 3.141592));
            RightFrontDrive.setPower(mypower * -Math.sin((myangle + 45) / 180 * 3.141592));
            RightBackDrive.setPower( mypower * -Math.sin((myangle + 135) / 180 * 3.141592));
        }

    }

    void move (float leftx, float lefty, float rightx) {
     /*   if (LeftFrontDrive != null && LeftBackDrive != null && RightFrontDrive != null && RightBackDrive != null) {
            if (leftx == 0 && lefty != 0 && rightx == 0) { //move
                LeftFrontDrive.setPower(lefty);
                LeftBackDrive.setPower(lefty);
                RightFrontDrive.setPower(lefty);
                RightBackDrive.setPower(lefty);
            }
            else if (leftx != 0 && lefty == 0 && rightx == 0) { //strafe
                LeftFrontDrive.setPower(-leftx);
                LeftBackDrive.setPower(leftx);
                RightFrontDrive.setPower(leftx);
                RightBackDrive.setPower(-leftx);
            }
            else if (leftx == 0 && lefty == 0 && rightx != 0) { //turn
                LeftFrontDrive.setPower(-rightx);
                LeftBackDrive.setPower(-rightx);
                RightFrontDrive.setPower(rightx);
                RightBackDrive.setPower(rightx);
            }
            else if (leftx != 0 && lefty != 0) { //diagonal

            }
            else {
                LeftFrontDrive.setPower(0);
                LeftBackDrive.setPower(0);
                RightFrontDrive.setPower(0);
                RightBackDrive.setPower(0);
            }
        }
    */
    }


    /*void turn (float power) {
        if (LeftFrontDrive != null && LeftBackDrive != null && RightFrontDrive != null && RightBackDrive != null) {
        LeftFrontDrive.setPower(-power);
        LeftBackDrive.setPower(-power);
        RightFrontDrive.setPower(power);
        RightBackDrive.setPower(power);
            telemetry.addLine("" + power);
        }
    }
    /*void strafe (float power) {
        if (LeftFrontDrive != null && LeftBackDrive != null && RightFrontDrive != null && RightBackDrive != null) {
        LeftFrontDrive.setPower(power);
        LeftBackDrive.setPower(-power);
        RightFrontDrive.setPower(-power);
        RightBackDrive.setPower(power);
        telemetry.addLine("" + power);
        }
    }*/
}