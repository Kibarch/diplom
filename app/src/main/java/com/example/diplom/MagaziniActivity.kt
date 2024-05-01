package com.example.diplom

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

internal class MagaziniActivity: FragmentActivity(), OnMapReadyCallback
{
    private lateinit var myMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magazini)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        val magBTN: ImageView = findViewById(R.id.mag)
        magBTN.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        val catBTN: ImageView = findViewById(R.id.cat)
        catBTN.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        val korBTN: ImageView = findViewById(R.id.kor)
        korBTN.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        val akBTN: ImageView = findViewById(R.id.ak)
        akBTN.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        val profBTN: ImageView = findViewById(R.id.prof)
        profBTN.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        val techBTN: ImageView = findViewById(R.id.tech)
        techBTN.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onMapReady(googleMap: GoogleMap) {
        myMap = googleMap
        val rnd = LatLng(47.14, 39.42)
        myMap.addMarker(MarkerOptions()
            .position(rnd)
            .title("Marker in Rostov-on-Don"))
        myMap.moveCamera(CameraUpdateFactory.newLatLng(rnd))
    }
}

