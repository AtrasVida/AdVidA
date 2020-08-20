package com.atrasvida.admobvida

import android.content.Context
import com.google.android.gms.ads.MobileAds

abstract class AdVidaBase(var context: Context) {
    init {
        MobileAds.initialize(context, Ooo0.oooO)
    }
}