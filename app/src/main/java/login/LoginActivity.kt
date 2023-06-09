package login

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.thesocialnetwork.R
import com.google.android.material.textfield.TextInputEditText

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login = findViewById<Button>(R.id.login)



        login.setOnClickListener{

          handleLogin()
        }

        Toast.makeText(this,"This is onCreate",Toast.LENGTH_SHORT).show()
    }

    private fun handleLogin(){
        val email = findViewById<TextInputEditText>(R.id.email)
        val password = findViewById<TextInputEditText>(R.id.password)
        val isValidEmail= isValidEmail(email.text.toString())
        val isValidPassword = isValidPassword(password.text.toString())

        if(isValidEmail && isValidPassword ){
            Toast.makeText(this,"credential correct",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"credential incorrect",Toast.LENGTH_SHORT).show()
        }
    }

private fun isValidEmail(email:String ):Boolean{
val cleanEmail=email.trim().lowercase()
    return  Patterns.EMAIL_ADDRESS.matcher(cleanEmail).matches()&& cleanEmail=="rojase7244@gmail.com"
}
private  fun isValidPassword(password:String):Boolean{
    val cleanPassword=password.trim().lowercase()
return cleanPassword =="12345"
}
    override fun onResume(){
        super.onResume()
        Toast.makeText(this ,"this is  onResume",Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this,"this is onResume",Toast.LENGTH_SHORT).show()
    }

    override  fun onDestroy(){
        super.onDestroy()
        Toast.makeText(this,"this is onDestroy",Toast.LENGTH_SHORT).show()
    }
}