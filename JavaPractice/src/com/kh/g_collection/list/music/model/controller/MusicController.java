package com.kh.g_collection.list.music.model.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.g_collection.list.music.model.vo.Music;

public class MusicController {

	private final List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
}
