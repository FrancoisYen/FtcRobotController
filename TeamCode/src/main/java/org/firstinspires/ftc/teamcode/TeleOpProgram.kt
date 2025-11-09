package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import dev.nextftc.core.components.BindingsComponent
import dev.nextftc.ftc.Gamepads
import dev.nextftc.ftc.NextFTCOpMode
import dev.nextftc.ftc.components.BulkReadComponent
import dev.nextftc.hardware.driving.MecanumDriverControlled
import dev.nextftc.hardware.impl.MotorEx

@TeleOp
class TeleOpProgram : NextFTCOpMode() {
    init {
        addComponents(
            BulkReadComponent, BindingsComponent
        )
    }

    // change the names and directions to suit your robot
    private val frontLeftMotor = MotorEx("front_left")
    private val frontRightMotor = MotorEx("front_right").reversed()
    private val backLeftMotor = MotorEx("back_left").reversed()
    private val backRightMotor = MotorEx("back_right")

    override fun onStartButtonPressed() {
        val driverControlled = MecanumDriverControlled(
            frontLeftMotor,
            frontRightMotor,
            backLeftMotor,
            backRightMotor,
            -Gamepads.gamepad1.leftStickY,
            Gamepads.gamepad1.leftStickX,
            Gamepads.gamepad1.rightStickX
        )
        driverControlled()
    }
}