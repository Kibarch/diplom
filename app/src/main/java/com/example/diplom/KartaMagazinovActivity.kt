package com.example.diplom

import android.content.Context
import android.content.Intent
import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.diplom.databinding.KartaMagazinovBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.io.IOException

internal class KartaMagazinovActivity: FragmentActivity(), OnMapReadyCallback
{
    private lateinit var myMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val kartMagaziniBinding : KartaMagazinovBinding = KartaMagazinovBinding.inflate(layoutInflater)
        setContentView(kartMagaziniBinding.root)
        val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
        var adress = sharedAdress.getString("adress", "")
        kartMagaziniBinding.adres.text = adress
        if (kartMagaziniBinding.adres.text == "")
            kartMagaziniBinding.adres.text = "Выбрать адрес доставки"
        val searchMag = kartMagaziniBinding.searchViewMagazini
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        searchMag.setOnQueryTextListener(
            object : android.widget.SearchView.OnQueryTextListener
            {
                override fun onQueryTextSubmit(query: String?): Boolean
                {
                    val location: String = searchMag.query.toString()
                    var adressList: List<Address>? = null
                    if (location != "" && location.isNotEmpty())
                    {
                        val geocoder = Geocoder(this@KartaMagazinovActivity)
                        try
                        {
                            adressList = geocoder.getFromLocationName(location, 1)
                        }
                        catch (e: IOException)
                        {
                            e.printStackTrace()
                        }
                        val address : Address = adressList!![0]
                        val latLng = LatLng(address.latitude, address.longitude)
                        myMap.addMarker(MarkerOptions().position(latLng).title(location))
                        myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15.0f))
                    }
                    return false
                }
                override fun onQueryTextChange(newText: String?): Boolean
                {
                    return false
                }
            }
        )
        mapFragment.getMapAsync(this)
        kartMagaziniBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        kartMagaziniBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        kartMagaziniBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        kartMagaziniBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        kartMagaziniBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        kartMagaziniBinding.adres.setOnClickListener {
            val intent = Intent(this, AdresaDostavokActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onMapReady(googleMap: GoogleMap) {
        myMap = googleMap
    }

}

