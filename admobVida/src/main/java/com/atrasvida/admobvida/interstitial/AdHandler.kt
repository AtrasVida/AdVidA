package com.atrasvida.admobvida.interstitial
import com.atrasvida.admobvida.AdHandlerBase


class AdHandler(
    var adVidaLHandlerListenerBuilder: AdVidaListenerBuilder
) : AdHandlerBase() {

    override fun onAdLoaded() {
        adVidaLHandlerListenerBuilder.mOnAdLoaded()
    }

    override fun onAdFailedToLoad(errorCode: Int) {
        adVidaLHandlerListenerBuilder.onAdFailedToLoad(errorCode)
    }

    override fun onAdOpened() {
        adVidaLHandlerListenerBuilder.onAdOpened()
    }

    override fun onAdClicked() {
        adVidaLHandlerListenerBuilder.onAdClicked()
    }

    override fun onAdLeftApplication() {
        adVidaLHandlerListenerBuilder.onAdLeftApplication()
    }

    override fun onAdClosed() {
        adVidaLHandlerListenerBuilder.onAdClosed()
    }
}
