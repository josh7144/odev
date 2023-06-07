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
        val mText = findViewById<TextView>(R.id.terms_and_privacy)
<<<<<<< HEAD
        val mText1 = " vienvenido a thesocialnetwork. aceptas nuestro terminos y condiciones?"
=======
        val mText1 = "vienvenido a thesocialnetwork. aceptas nuestro terminos y condiciones?"
>>>>>>> iamjosh7144--login-mockup
        val mSpannableString = SpannableString(mText1)

// color styles to apply on substring
        val mRed = ForegroundColorSpan(Color.BLUE)

// appliying color styles to substrings

<<<<<<< HEAD
        mSpannableString.setSpan(mRed,42,63,Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
=======
        mSpannableString.setSpan(mRed,49,73,Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
>>>>>>> iamjosh7144--login-mockup

//setting text to the textview

        mText.text=mSpannableString
          }




}