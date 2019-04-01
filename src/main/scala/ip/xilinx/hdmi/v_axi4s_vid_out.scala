ckage sifive.fpgashells.ip.xilinx.hdmi

import chisel3._
import chisel3.util._
import freechips.rocketchip.config._
import freechips.rocketchip.diplomacy._

class v_axi4s_vid_out extends BlackBox {
  val io = IO(new Bundle {
  // Video In
  val s_axis_video_tdata  = Input(UInt(48.W))
  val s_axis_video_tlast  = Input(Bool())
  val s_axis_video_tready = Output(Bool())
  val s_axis_video_tuser  = Input(Bool())
  val s_axis_video_tvalid = Input(Bool())

 // VTiming In			          
 val vtg_active_video    = Input(Bool())
 val vtg_field_id        = Input(Bool())
 val vtg_hblank          = Input(Bool())
 val vtg_hsync           = Input(Bool())
 val vtg_vblank          = Input(Bool())
 val vtg_vsync           = Input(Bool())
						          
 val aclk            = Input(Clock())
 val aclken          = Input(Bool())
 val aresetn         = Input(Bool())
 val fid             = Input(Bool())
 val vid_io_out_ce   = Input(Bool())
 
 // Vid Io Out
 val vid_active_video    = Output(Bool())
 val vid_data            = Output(UInt(36.W))
 val vid_field_id        = Output(Bool())
 val vid_hblank          = Output(Bool())
 val vid_hsync           = Output(Bool())
 val vid_vblank          = Output(Bool())
 val vid_vsync           = Output(Bool())
 
 val vtg_ce              = Output(Bool())
 val locked              = Output(Bool())
 val overflow            = Output(Bool())
 val underflow           = Output(Bool())
 val status              = Output(UInt(32.W))					 })									   
}
