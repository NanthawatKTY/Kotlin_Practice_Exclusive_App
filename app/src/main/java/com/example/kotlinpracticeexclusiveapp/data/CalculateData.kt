package com.example.kotlinpracticeexclusiveapp.data

val BreakerSizeList = arrayListOf("10","16","20","32","40","50","63","80",
    "100","125","150","160","200","225","250","300")
val BreakerSizeList2 = arrayListOf(
    "1เฟส+นิวทรัล",
    "1เฟส+นิวทรัล+กราวด์",
    "3เฟส",
    "3เฟส+นิวทรัล",
    "3เฟส+นิวทรัล+กราวด์"
)
val SetupList = arrayListOf(
    "ติดตั้งในช่องเดินสายภายในฝ้า",
    "ติดตั้งในช่องเดินเกาะผนัง/ฝังคอนกรีต",
    "ติดตั้งเกาะผนัง/เพดาน",
    "ติดตั้งบนลูกถ้วยในอากาศ",
    "ติดตั้งในท่อฝังดิน",
    "ติดตั้งฝังดินโดยตรง"
)

val CableTypeList = arrayListOf(
    "IEC01", "VAF", "VCT" ,"NYY"
)

val CableSizeList = arrayListOf(
    2.5,4,6,10,16,25,35,50,70,95,120,150,240,300
)

class Calculate {
    fun cableSize(bkSize:Int):String{
        val size: String

        when (bkSize){
            10 -> size = 2.5.toString()
            16 -> size = 2.8.toString()
            20 -> size = 4.toString()
            32 -> size = 6.toString()
            40 -> size = 10.toString()
            50 -> size = 16.toString()
            63 -> size = 25.toString()
            80 -> size = 35.toString()
            100 -> size = 50.toString()
            125 -> size = 70.toString()
            150 -> size = 95.toString()
            160 -> size = 120.toString()
            200 -> size = 150.toString()
            225 -> size = 240.toString()
            250 -> size = 240.toString()
            300 -> size = 300.toString()
            else -> size = ""
        }

        return size
    }

    fun cableTypes(cableType: String):String{
        val cableTypeResult: String

        when (cableType){
            "ติดตั้งในช่องเดินสายภายในฝ้า" -> cableTypeResult = "IEC01 / VAF / VCT / NYY"
            "ติดตั้งในช่องเดินเกาะผนัง/ฝังคอนกรีต" -> cableTypeResult = "IEC01 / VAF / VCT / NYY"
            "ติดตั้งเกาะผนัง/เพดาน" -> cableTypeResult = "VAF / VCT / NYY"
            "ติดตั้งบนลูกถ้วยในอากาศ" -> cableTypeResult = "IEC01 / VCT / NYY"
            "ติดตั้งในท่อฝังดิน" -> cableTypeResult = "NYY / VCT"
            "ติดตั้งฝังดินโดยตรง" -> cableTypeResult = "NYY"
            else -> cableTypeResult = ""
        }
        return cableTypeResult
    }

}
