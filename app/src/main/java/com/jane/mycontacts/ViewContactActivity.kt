package com.jane.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jane.mycontacts.databinding.ActivityMainBinding
import com.jane.mycontacts.databinding.ActivityViewContactBinding
import com.jane.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var email = intent.extras?.getString("EMAIL")
        var phonenumber = intent.extras?.getString("PHONENUMBER")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        binding.tvname.text=name
        binding.tvphone.text=phonenumber
        binding.tvemail.text=email
        binding.tvaddress.text = address


        Picasso.get().load(intent.getStringExtra("IMAGE")).resize(200,200).centerCrop().into(binding.imgPerson)



    }
}