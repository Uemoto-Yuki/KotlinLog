package jp.techacademy.yuki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // ここを追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("ウィル・スミス", 53, "アカデミー賞")
        human.say()
        human.think()
        //Humanのインスタンスを作成
        val human2 = Human("植本", 24, "猫ちゃん")
        //Human2のインスタンスを作成
        human2.say()
        human2.think()


    }
}