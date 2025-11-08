package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import dev.nextftc.ftc.NextFTCOpMode
import com.bylazar.telemetry.PanelsTelemetry

@Autonomous
class TelemetryTest : NextFTCOpMode() {
    override fun onStartButtonPressed() {
        PanelsTelemetry.telemetry.addLine("Telemetry Test")
        PanelsTelemetry.telemetry.update()

    }

}