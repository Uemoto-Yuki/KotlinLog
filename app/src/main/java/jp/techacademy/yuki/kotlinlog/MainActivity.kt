package jp.techacademy.yuki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log // ここを追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("ウィル・スミス", 53, "アカデミー賞")
        //Humanのインスタンスを作る

        human.say()
        human.think()


    }
}