package com.jane.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import com.jane.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        val Contacts1 = Contact("Jane Ndung'u","nyamburaajanee@gmail.com","0113544192","616,Korongo rd","https://media.istockphoto.com/photos/portrait-of-young-afro-woman-with-bright-makeup-picture-id1331637318?k=20&m=1331637318&s=612x612&w=0&h=qTy5ve7wRVy9Gh_AnjvuLtpneyrQ2csBQugYEaXzrPU=")
        val Contacts2 = Contact("Faith Mutua","muthioofaith@gmail.com","0699273884","Nairobi Lane","https://media.istockphoto.com/photos/beautiful-black-woman-picture-id960212544?k=20&m=960212544&s=612x612&w=0&h=BUqg0GwHW9PKxabHfLRcWWFsbFWjUnFRK0AWg9uQyNU=")
        val Contacts3= Contact("Gumato Roba","gumatorobba@gmail.com","0713544192","Mwiki, kasarani rd","https://media.istockphoto.com/photos/beautiful-girl-with-curly-hairstyle-picture-id1306514019?k=20&m=1306514019&s=612x612&w=0&h=xMYZ9peR9S_f-iMhY8DhPqZ-PhNVLMAAIzpDSBLjHnw=")
        val Contacts4 = Contact("Stanley Gitungo","gitungostan@gmail.com","0813544192","Kiambu rd","https://media.istockphoto.com/photos/emotional-african-american-man-with-african-hairstyle-picture-id1319662868?k=20&m=1319662868&s=612x612&w=0&h=kJGhd54o_bsRDTQHrerOrdbF_sLAav-MkFBHcvrso5w=")
        val Contacts5 =Contact("Davie Mwangi","mwangidavid@gmail.com","098848282","Ngong rd","https://media.istockphoto.com/photos/african-student-sitting-in-classroom-picture-id1351445530?k=20&m=1351445530&s=612x612&w=0&h=VmJb2kB-kX-m9vg_Ei6HEcmvz0PvTMb7d-DM_bP79vg=")
        val Contacts6 = Contact("ZIppy shiru","wangariwanjiru@gmail.com","0775299764","Kiambu","https://media.istockphoto.com/photos/beautiful-portrait-of-an-african-girl-in-sunglasses-in-the-shape-of-picture-id1366224227?k=20&m=1366224227&s=612x612&w=0&h=-jJtVd7Xqh3PHYYDXcn7Si0mC9CiEzvu41DsLrEPBLM=")
        val Contacts7 = Contact("Abigail Kiaro","abbykiaro@gmail.com","029487569293","Ndumberi","https://media.istockphoto.com/photos/black-woman-with-red-lips-looking-at-camera-picture-id1145918848?k=20&m=1145918848&s=612x612&w=0&h=TOBgonxccKr9O_JMksr9-91cxdKt-Q7TzBTfXxb__8c=")
        val Contacts8 = Contact("Winnie Mwangi","winniemwangi@gmail.com","07998422844","Landless","https://media.istockphoto.com/photos/beauty-portrait-of-african-american-girl-in-sunglasses-picture-id1350600402?k=20&m=1350600402&s=612x612&w=0&h=M03X5Sr3Ix0DVXxUky5aRy-zKbNBpmXOSp-jqxVzxlo=")
        val Contacts9 = Contact("Natasha Wainaina","wainainanjeri@gmail.com","07665429445","Nyeri","https://images.unsplash.com/photo-1518632263555-a442f0d25bb0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwbW9kZWxzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val Contacts10 = Contact("Antony Kibe","kibeantony@gmail.com","0114398532","Kiambu","https://media.istockphoto.com/photos/male-vlogger-or-social-influencer-in-city-using-mobile-phone-on-to-picture-id1356527683?k=20&m=1356527683&s=612x612&w=0&h=P5GZ7PcnMkq1urxilMQBAo_0lRnxhCB6awZAsEZGXU8=")
        val Contacts11 = Contact("Precious Mwangi","wanjirumwangi@gmailcom","0726353826","Githiga","https://media.istockphoto.com/photos/cute-african-toddler-girl-shouting-hooray-on-orange-background-picture-id1175424262?k=20&m=1175424262&s=612x612&w=0&h=cPtqIPEpNaWXCWm1rQ8tp9heyly5HlMjUs9t_tIwzDc=")
        val Contacts12 = Contact("Joy Mwangi","joymwangi@gmail.com","0725654754","Ikinu","https://media.istockphoto.com/photos/portrait-of-girl-holding-skateboard-picture-id505872666?k=20&m=505872666&s=612x612&w=0&h=aMo3EoSN0h807vk_eOZL7spxnTC3dv2CBc8rQDfgIYA=")
        val Contacts13 = Contact("Rachael Mwihaki","mwihakindung'u@gmail.com","0790500842","Muranga","https://media.istockphoto.com/photos/black-woman-with-red-lips-looking-at-camera-picture-id1145918848?k=20&m=1145918848&s=612x612&w=0&h=TOBgonxccKr9O_JMksr9-91cxdKt-Q7TzBTfXxb__8c=")
        val Contacts14 = Contact("Alice Ndung'u","wambuindung'u@gmail.com","0759466583","Kirigiti","https://media.istockphoto.com/photos/cheeky-confidence-picture-id482987497?k=20&m=482987497&s=612x612&w=0&h=WzSgOLDGNdnFMlgtIjkI2Y3dajSXUtaGi41vPzz_RdM=")
        val Contacts15 = Contact("Maryann Njoki","nyamburanjoki@gmail.com","0744771838","Nyandarua","https://media.istockphoto.com/photos/beauty-portrait-of-young-beautiful-african-american-woman-with-posing-picture-id1327838583?k=20&m=1327838583&s=612x612&w=0&h=ddO9yPIM2xtjfuqRLzlUZ8ZjHo5AUcSJXjHlTiPqDFk=")
  var contact = listOf(Contacts1,Contacts2,Contacts3,Contacts4,Contacts5,Contacts6,Contacts7,Contacts8,Contacts9,Contacts10,Contacts11,Contacts12,Contacts13,Contacts14,Contacts15)

        var contactAdapter = ContactRecyclerViewAdapter(contact)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }
}