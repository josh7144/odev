package singUp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import com.example.thesocialnetwork.R
import examples.Color

class singUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
//creating spannable string from normal string
        val mText = "terminos y condiciones:RED color ,GREEN color ,and BLUE color"
        val mSpannableString = SpannableString(mText)

// color styles to apply on substring
        val mRed = ForegroundColorSpan(Color.RED)
// apliying color styles to substrings

        mSpannableString.setSpan(mRed,29,32,Spanned.SPAN_INCLUSIVE_EXCLUSIVE)

//seting text to the textview

        terms_and_privacy.text=mSpannableString
          }




}