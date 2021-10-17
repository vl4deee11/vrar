package com.s11.lab4.ar

import android.Manifest
import com.google.ar.sceneform.ux.ArFragment

class PlacesArFragment : ArFragment() {

    override fun getAdditionalPermissions(): Array<String> =
        listOf(Manifest.permission.ACCESS_FINE_LOCATION).toTypedArray()
}
