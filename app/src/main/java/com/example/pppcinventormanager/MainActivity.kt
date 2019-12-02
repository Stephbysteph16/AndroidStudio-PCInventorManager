package com.example.pppcinventormanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    class Item() {
        var name = ""
        var color = ""
    }

    var itemList: ArrayList<Item>? = null

    var Black_checkbox = false
    var White_checkbox = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList = ArrayList() // no "new" needed for creating object


        add_button.setOnClickListener {
            addItem(name_text.text.toString())
            showItem()
        }

    }
    fun addItem(name: String) {
        val item = Item()
        item.name = name
        if (radioGroup.checkedRadioButtonId == radio_white.id)
            item.color = "White"
        else
            item.color = "Black"
        itemList?.add(item)
    }

    fun showItem() {

        var information = ""

        var sortedList = 
        itemList?.forEach {
            information += "name:${it.name}, color:${it.color}\n"
        }

        info_textView.text = information
    }

    

}
