package com.computer.inu.readit_appjam.Network.Get

data class ContentsInfo(
    val category_idx: Int,
    val contents_idx: Int,
    val contents_url: String,
    val created_date: String,
    val delete_flag: Int,
    val estimate_time: String,
    val fixed_date: Any,
    val highlight_cnt: Int,
    val read_flag: Int,
    val recent_date: String,
    val site_url: String,
    val thumbnail: String,
    val title: String,
    val user_idx: Int
)