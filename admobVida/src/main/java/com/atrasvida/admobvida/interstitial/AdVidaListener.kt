package com.atrasvida.admobvida.interstitial


interface AdVidaListener {

     fun onAdLoaded(onAdLoaded: () -> Unit): AdVidaListenerBuilder

     fun onAdFailedToLoad(onAdFailedToLoad: (Int) -> Unit): AdVidaListenerBuilder

     fun onAdOpened(onAdOpened: () -> Unit): AdVidaListenerBuilder

     fun onAdClicked(onAdClicked: () -> Unit): AdVidaListenerBuilder

     fun onAdLeftApplication(onAdLeftApplication: () -> Unit): AdVidaListenerBuilder

     fun onAdClosed(onAdClosed: () -> Unit): AdVidaListenerBuilder
}