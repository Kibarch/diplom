package com.example.diplom

import android.content.Intent
import android.os.Bundle
import android.view.View
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
    }
    override fun onMapReady(googleMap: GoogleMap) {
        myMap = googleMap
        val rnd = LatLng(47.14, 39.42)
        myMap.addMarker(MarkerOptions()
            .position(rnd)
            .title("Marker in Rostov-on-Don"))
        myMap.moveCamera(CameraUpdateFactory.newLatLng(rnd))
    }
    fun catClicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun korClicked(view: View)
    {
        val intent = Intent(this, KorzinaActivity::class.java)
        startActivity(intent)
    }
    fun akClicked(view: View)
    {
        val intent = Intent(this, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun profClicked(view: View)
    {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(intent)
    }
    fun techClicked(view: View)
    {
        val intent = Intent(this, TechSupportActivity::class.java)
        startActivity(intent)
    }
}

