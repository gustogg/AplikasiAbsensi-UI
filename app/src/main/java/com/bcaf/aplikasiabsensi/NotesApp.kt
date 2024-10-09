package com.bcaf.aplikasiabsensi

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import com.bcaf.aplikasiabsensi.fragment.ListFragment
import com.bcaf.aplikasiabsensi.fragment.NotesFragment
import com.bcaf.aplikasiabsensi.model.Notes

class NotesApp : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notes_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if(resources.configuration.orientation==Configuration.ORIENTATION_PORTRAIT) {
            supportFragmentManager.beginTransaction().setReorderingAllowed(true)
            supportFragmentManager.beginTransaction().replace(R.id.frameListNotes, ListFragment()).commit()

            if(supportFragmentManager.findFragmentById(R.id.frameNotes)!=null){
                supportFragmentManager.beginTransaction().remove(supportFragmentManager.findFragmentById(R.id.frameNotes)!!).commit()
            }







        }else{

            supportFragmentManager.beginTransaction().apply {
                setReorderingAllowed(true)

                replace(R.id.frameListNotes, ListFragment())
                replace(R.id.frameNotes, NotesFragment())
            }.commit()



        }

    }
}