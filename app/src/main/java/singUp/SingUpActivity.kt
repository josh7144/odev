package singUp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.graphics.Color

import android.widget.TextView
import com.example.thesocialnetwork.R


class SingUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
//creating spannable string from normal string
        var mText = findViewById<TextView>(R.id.terms_and_privacy)
        //mText.text="hola probando"

        var mText1 = "Welcome to Thesocialnetwork.you accepts our terms and conditions?"
        var mSpannableString = SpannableString(mText1)

// color styles to apply on substring
        var mBlue = ForegroundColorSpan(Color.BLUE)

// appliying color styles to substrings

        mSpannableString.setSpan(mBlue,28,65,Spanned.SPAN_INCLUSIVE_EXCLUSIVE)

//setting text to the textview

        mText.text=mSpannableString
          }




}