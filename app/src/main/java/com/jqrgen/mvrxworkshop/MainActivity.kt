package com.jqrgen.mvrxworkshop

import android.os.Bundle
import com.airbnb.mvrx.BaseMvRxActivity

class MainActivity : BaseMvRxActivity() { // DevFest: Replaces AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

//    override fun onSupportNavigateUp() =
//        findNavController(R.id.my_nav_host_fragment).navigateUp()
}
