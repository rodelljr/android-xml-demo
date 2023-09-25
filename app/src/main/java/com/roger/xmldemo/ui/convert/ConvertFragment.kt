package com.roger.xmldemo.ui.convert

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import com.roger.xmldemo.R

class ConvertFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // val root = FragmentConvertBinding.inflate(inflater, container, false)
        val view: View = inflater.inflate(R.layout.fragment_convert, container, false)
        myConvert(view)
        myTemp(view)
        return view
    }

    private fun myConvert(view: View) {
        val conv = view.findViewById<View>(R.id.edit_convert) as TextInputEditText
        val answ1 = view.findViewById<View>(R.id.tv_length_ans) as TextView
        val inchCheck = view.findViewById<View>(R.id.rb_inches) as RadioButton
        conv.setOnEditorActionListener{ _, actionId, _ ->
            return@setOnEditorActionListener when (actionId) {
                EditorInfo.IME_ACTION_DONE -> {
                    val myInput = conv.text.toString().toDouble()
                    val result: String = if (inchCheck.isChecked) {
                        convertValue(true, myInput) + " centimeters"
                    } else {
                        convertValue(false, myInput) + " inches"
                    }
                    answ1.text = result
                    true
                }
                else -> false
            }
        }
    }

    private fun myTemp(view: View) {
        val temp = view.findViewById<View>(R.id.edit_temp) as TextInputEditText
        val answ2 = view.findViewById<View>(R.id.tv_temp_ans) as TextView
        val tempCheck = view.findViewById<View>(R.id.rb_fah) as RadioButton
        temp.setOnEditorActionListener{ _, actionId, _ ->
            return@setOnEditorActionListener when (actionId) {
                EditorInfo.IME_ACTION_DONE -> {
                    val myInput = temp.text.toString().toDouble()
                    val result: String = if (tempCheck.isChecked) {
                        convertTemp(true, myInput) + " \u2103"
                    } else {
                        convertTemp(false, myInput) + " \u2109"
                    }
                    answ2.text = result
                    true
                }
                else -> false
            }
        }
    }

}