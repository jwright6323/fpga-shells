// See LICENSE for license details.
package sifive.fpgashells.ip.xilinx.hdmi

import chisel3._
import chisel3.util._
import freechips.rocketchip.config._
import freechips.rocketchip.diplomacy._

class v_vid_in_axi4s() extends BlackBox {
  val io = IO(new Bundle {
    // Video Io In
    val vid_active_video    = Input(Bool())
    val vid_data            = Input(UInt(48.W))
    val vid_field_id        = Input(Bool())
    val vid_hblank          = Input(Bool())
    val vid_hsync           = Input(Bool())
    val vid_vblank          = Input(Bool())
    val vid_vsync           = Input(Bool())

    val vid_io_in_ce        = Input(Bool())
    val aclk                = Input(Bool())
    val aclken              = Input(Bool())
    val aresetn             = Input(Bool())
    val axis_enable         = Input(Bool())
						        
    // Video Out
    val m_axis_video_tdata  = Output(UInt(48.W))
    val m_axis_video_tlast  = Output(Bool())
    val m_axis_video_tready = Input(Bool())
    val m_axis_video_tuser  = Output(Bool())
    val m_axis_video_tvalid = Output(Bool())

    // VTiming Out
    val vtg_active_video    = Output(Bool())
    val vtg_field_id        = Output(Bool())
    val vtg_hblank          = Output(Bool())
    val vtg_hsync           = Output(Bool())
    val vtg_vblank          = Output(Bool())
    val vtg_vsync           = Output(Bool())

    val fid                 = Output(Bool())
    val overflow            = Output(Bool())
    val underflow           = Output(Bool())
  })
}
