package com.example.kotlinpracticeexclusiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinpracticeexclusiveapp.adapter.ConduitAdapter
import com.example.kotlinpracticeexclusiveapp.data.CableSizeList
import com.example.kotlinpracticeexclusiveapp.data.CableTypeList
import com.example.kotlinpracticeexclusiveapp.data.ConduitInfo
import kotlinx.android.synthetic.main.card_conduit_item_lists.*
import kotlinx.android.synthetic.main.input_rv_lists.*

class MainActivity : AppCompatActivity() {

//    private var conduitTypeAdapter: ArrayAdapter<Any>? = null
//    private var conduitSizeAdapter: ArrayAdapter<Any>? = null
    var conduitLists = mutableListOf(
            ConduitInfo("IEE86", 2.5, 3 )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_rv_lists)

        val adapter = ConduitAdapter(conduitLists)
        rvConduitLists.adapter = adapter
        rvConduitLists.layoutManager = LinearLayoutManager(this)
//        conduitTypeAdapter = parent?.let {
//            ArrayAdapter(
//                    it,
//                    android.R.layout.simple_spinner_item,
//                    CableTypeList as List<Any>
//            )
//        }
//        conduitTypeAdapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinnerCableType!!.adapter = conduitTypeAdapter
//
//
//        conduitSizeAdapter = parent?.let {
//            ArrayAdapter(
//                    it,
//                    android.R.layout.simple_spinner_item,
//                    CableSizeList as List<Any>
//            )
//        }
//        conduitSizeAdapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinnerCableSize!!.adapter = conduitSizeAdapter
//
//
//
//        spinnerCableType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                //
//            }
//        }
//
//        spinnerCableSize.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                //
//            }
//        }




//        addConduitButton.setOnClickListener{
//            val spCableType = spinnerCableType.
//            val spCableSize = spinnerCableSize
//            val edtCableAmounts = cableAmount
//            val conduits = ConduitInfo(spCableType, spCableSize, edtCableAmounts)
//            conduitLists.add(conduits)
//           // adapter.notifyDataSetChanged()
//            adapter.notifyItemInserted(conduitLists.size-1)
//
//        }
    }


}