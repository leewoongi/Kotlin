package com.kotlin.myapplication

class ResponseDao {
    var total_count : Int = 0
    var incomplete_results : Boolean = false
    lateinit var items : List<UserVo>
}