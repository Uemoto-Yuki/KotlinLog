package jp.techacademy.yuki.kotlinlog

import android.util.Log

open class Human : Animal, Thinkable {

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {
    }

    override fun say() {
        Log.d("Kotlintest", "私の名前は" + this.name +"です。年は" + this.age + "歳です")
        //Animal クラスのメソッドをoverride

    }

    override fun think() {
        Log.d("kotlintest", this.hobby + "について考えています")
        //Thinkableインターフェイス のメソッドをoverride
    }

}
//抽象クラスAnimalを継承したHumanクラスを定義し
// 生成したインスタンスのsayメソッドで以下のようなLogを出力させてください（〜〜はメンバ変数から取得）。sayメソッドにはoverride修飾子を付けてください。
//私の名前は〜〜です。年は〜〜歳です。
//thinkメソッドを持つThinkableインターフェイスを作成し、Humanクラスに実装させてください。
//Humanクラスにはhobbyという文字列型のメンバ変数を用意し、thinkメソッドを呼び出すと「私は〜〜について考える。」（〜〜はhobbyから取得）というLogを出力させてください。
//Humanクラスの各メンバ変数の初期化はコンストラクタ内で行い、インスタンス毎に異なる値が設定できるようにしてください。
//MainActivityでHumanクラスのインスタンスを2つ作成し、それぞれのsayメソッドとthinkメソッドを呼び出してください。