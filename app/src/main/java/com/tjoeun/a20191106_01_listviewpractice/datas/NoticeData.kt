package com.tjoeun.a20191106_01_listviewpractice.datas

import java.io.Serializable

class NoticeData(inputTitle:String, inputContent:String, writeDate:String) : Serializable {

    var title = inputTitle
    var content = inputContent
    var date = writeDate

//    init {
//
//    }

}