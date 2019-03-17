package com.dongnaoedu.dnffmpegplayer;

import android.view.Surface;

/**
 * 视频播放的控制器
 * @author Jason
 * QQ: 1476949583
 * @date 2016年9月19日
 * @version 1.0
 */
public class JasonPlayer {

	public native void render(String input,Surface surface);
	
	
	static{
		System.loadLibrary("avutil-54");
		System.loadLibrary("swresample-1");
		System.loadLibrary("avcodec-56");
		System.loadLibrary("avformat-56");
		System.loadLibrary("swscale-3");
		System.loadLibrary("postproc-53");
		System.loadLibrary("avfilter-5");
		System.loadLibrary("avdevice-56");
		System.loadLibrary("myffmpeg");
	}
}
