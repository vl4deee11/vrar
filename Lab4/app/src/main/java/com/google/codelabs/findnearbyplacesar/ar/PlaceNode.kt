package com.google.codelabs.findnearbyplacesar.ar

import android.content.Context
import com.google.ar.sceneform.Node
import com.google.ar.sceneform.math.Vector3
import com.google.ar.sceneform.rendering.DpToMetersViewSizer
import com.google.ar.sceneform.rendering.ViewRenderable
import com.google.codelabs.findnearbyplacesar.R
import com.google.codelabs.findnearbyplacesar.model.Place

class PlaceNode(
    val context: Context,
    val height: Int,
    val width: Int,
    val place: Place?
) : Node() {

    private var placeRenderable: ViewRenderable? = null

    override fun onActivate() {
        super.onActivate()

        if (scene == null) {
            return
        }

        if (placeRenderable != null) {
            return
        }

        val imageWidth = height / 100f
        val imageHeight = width / 100f
        this.localScale = Vector3(imageWidth, imageHeight, imageWidth)

        ViewRenderable.builder()
            .setView(context, R.layout.place_view)
            .setVerticalAlignment(ViewRenderable.VerticalAlignment.CENTER)
            .build()
            .thenAccept {
                renderable = it
                placeRenderable = it

            }
    }
}