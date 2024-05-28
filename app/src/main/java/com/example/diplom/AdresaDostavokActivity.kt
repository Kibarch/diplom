package com.example.diplom

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import android.widget.EditText
import android.graphics.Color
import com.example.diplom.databinding.AdresaDostavokBinding

class AdresaDostavokActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val adresaDostavokBinding: AdresaDostavokBinding =
            AdresaDostavokBinding.inflate(layoutInflater)
        setContentView(adresaDostavokBinding.root)
        adresaDostavokBinding.mag.setOnClickListener {
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        adresaDostavokBinding.cat.setOnClickListener {
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        adresaDostavokBinding.kor.setOnClickListener {
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        adresaDostavokBinding.ak.setOnClickListener {
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        adresaDostavokBinding.prof.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        adresaDostavokBinding.tech.setOnClickListener {
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        adresaDostavokBinding.arr.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        adresaDostavokBinding.buttonAddAddress.setOnClickListener {
            val dialogNewAdres = layoutInflater.inflate(R.layout.addaddress, null)
            val mydialogNewAdres = Dialog(this)
            mydialogNewAdres.setContentView(dialogNewAdres)
            mydialogNewAdres.setCancelable(true)
            mydialogNewAdres.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogNewAdres.show()
            val newadres1 = dialogNewAdres.findViewById<Button>(R.id.buttonAccept)
            newadres1.setOnClickListener {
                val nUll = ""
                when (nUll) {
                    adresaDostavokBinding.textAdres1.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN = dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres1.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres1.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres1.setOnClickListener {
                            val dialogGetAdres1 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres1 = Dialog(this)
                            mydialogGetAdres1.setContentView(dialogGetAdres1)
                            mydialogGetAdres1.setCancelable(true)
                            mydialogGetAdres1.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres1.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres1.text.toString())
                            editor.apply()
                        }
                    }

                    adresaDostavokBinding.textAdres2.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN = dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres2.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres2.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres2.setOnClickListener {
                            val dialogGetAdres2 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres2 = Dialog(this)
                            mydialogGetAdres2.setContentView(dialogGetAdres2)
                            mydialogGetAdres2.setCancelable(true)
                            mydialogGetAdres2.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres2.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres2.text.toString())
                            editor.apply()
                        }
                    }

                    adresaDostavokBinding.textAdres3.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN = dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres3.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres3.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres3.setOnClickListener {
                            val dialogGetAdres3 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres3 = Dialog(this)
                            mydialogGetAdres3.setContentView(dialogGetAdres3)
                            mydialogGetAdres3.setCancelable(true)
                            mydialogGetAdres3.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres3.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres3.text.toString())
                            editor.apply()
                        }
                    }

                    adresaDostavokBinding.textAdres4.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN =
                            dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres4.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres4.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres4.setOnClickListener {
                            val dialogGetAdres4 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres4 = Dialog(this)
                            mydialogGetAdres4.setContentView(dialogGetAdres4)
                            mydialogGetAdres4.setCancelable(true)
                            mydialogGetAdres4.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres4.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres4.text.toString())
                            editor.apply()
                        }

                    }

                    adresaDostavokBinding.textAdres5.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN =
                            dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres5.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres5.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres5.setOnClickListener {
                            val dialogGetAdres5 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres5 = Dialog(this)
                            mydialogGetAdres5.setContentView(dialogGetAdres5)
                            mydialogGetAdres5.setCancelable(true)
                            mydialogGetAdres5.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres5.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres5.text.toString())
                            editor.apply()
                        }
                    }

                    adresaDostavokBinding.textAdres6.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN =
                            dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres6.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres6.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres6.setOnClickListener {
                            val dialogGetAdres6 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres6 = Dialog(this)
                            mydialogGetAdres6.setContentView(dialogGetAdres6)
                            mydialogGetAdres6.setCancelable(true)
                            mydialogGetAdres6.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres6.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres6.text.toString())
                            editor.apply()
                        }
                    }

                    adresaDostavokBinding.textAdres7.text -> if (dialogNewAdres.findViewById<EditText>(
                            R.id.textAdress
                        ).text.toString() == ""
                    ) {
                        val dialogNullImaOrFam =
                            layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                        val myDialogNullImaFam = Dialog(this)
                        myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                        myDialogNullImaFam.setCancelable(true)
                        myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                        myDialogNullImaFam.show()
                        val okBTN =
                            dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                        okBTN.setOnClickListener {
                            myDialogNullImaFam.dismiss()
                        }
                    } else {
                        adresaDostavokBinding.textAdres7.setBackgroundResource(R.drawable.allcornerslightgrayroundedbackground)
                        adresaDostavokBinding.textAdres7.text =
                            dialogNewAdres.findViewById<EditText>(R.id.textAdress).text.toString()
                        adresaDostavokBinding.textAdres7.setOnClickListener {
                            val dialogGetAdres7 = layoutInflater.inflate(R.layout.changeadress, null)
                            val mydialogGetAdres7 = Dialog(this)
                            mydialogGetAdres7.setContentView(dialogGetAdres7)
                            mydialogGetAdres7.setCancelable(true)
                            mydialogGetAdres7.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                            mydialogGetAdres7.show()
                            val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
                            val editor = sharedAdress.edit()
                            editor.putString("adress", adresaDostavokBinding.textAdres7.text.toString())
                            editor.apply()
                        }
                    }
                }
            }
        }
    }
}