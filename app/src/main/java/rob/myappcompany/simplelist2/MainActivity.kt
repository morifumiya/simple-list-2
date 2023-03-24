package rob.myappcompany.simplelist2

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv: ListView = findViewById(R.id.lv)

        // 1) データを用意(map で)
        val data = mutableListOf(
            mapOf("main" to "メイン1", "sub" to "サブ1"),
            mapOf("main" to "メイン2", "sub" to "サブ2"),
            mapOf("main" to "メイン3", "sub" to "サブ3"),
            mapOf("main" to "メイン4", "sub" to "サブ4"),
            mapOf("main" to "メイン5", "sub" to "サブ5"),
        )

        // 2) アダプターにセット
        val adapter = SimpleAdapter(
            this,
            data,
            android.R.layout.simple_list_item_2,
            arrayOf("main", "sub"), // 第二引数のmapのキー(配列)
            intArrayOf(android.R.id.text1, android.R.id.text2) // 第三引数のレイアウトビューのid(int配列)
        )

        // 3) リストにセットして表示
        lv.adapter = adapter
    }
}
