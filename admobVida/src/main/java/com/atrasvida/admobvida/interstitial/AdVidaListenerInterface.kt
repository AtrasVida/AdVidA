package com.atrasvida.admobvida.interstitial


interface AdVidaListenerInterface {

    fun onAdLoaded()

    fun onAdFailedToLoad(error: Int)

    fun onAdOpened()

    fun onAdClicked()

    fun onAdLeftApplication()

    fun onAdClosed()
}