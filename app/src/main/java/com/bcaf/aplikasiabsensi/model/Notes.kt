package com.bcaf.aplikasiabsensi.model

import android.graphics.Bitmap
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Notes(
    val judul: String,
    val isi: String,
): Parcelable
