package com.atrasvida.admobvida.interstitial

import android.util.Log
import com.atrasvida.admobvida.rewarded.ListenerBuider

open class AdVidaListenerBuilder : ListenerBuider,
    AdVidaListener {

    internal lateinit var mOnAdLoaded: () -> Unit
    internal lateinit var mOnAdFailedToLoad: (Int) -> Unit
    internal lateinit var mOnAdOpened: () -> Unit
    internal lateinit var mOnAdClicked: () -> Unit
    internal lateinit var mOnAdLeftApplication: () -> Unit
    internal lateinit var mOnAdClosed: () -> Unit

    constructor()

    constructor(
        onAdLoaded: () -> Unit,
        onAdOpened: () -> Unit,
        onAdClicked: () -> Unit
    ) {

        mOnAdLoaded = onAdLoaded
        mOnAdOpened = onAdOpened
        mOnAdClicked = onAdClicked

    }

    constructor(
        onAdLoaded: () -> Unit,
        onAdFailedToLoad: (Int) -> Unit,
        onAdOpened: () -> Unit,
        onAdClicked: () -> Unit,
        onAdLeftApplication: () -> Unit,
        onAdClosed: () -> Unit
    ) {

        mOnAdLoaded = onAdLoaded
        mOnAdFailedToLoad = onAdFailedToLoad
        mOnAdOpened = onAdOpened
        mOnAdClicked = onAdClicked
        mOnAdLeftApplication = onAdLeftApplication
        mOnAdClosed = onAdClosed
    }

    constructor(interfaceListener: AdVidaListenerInterface) {
        mOnAdLoaded = { interfaceListener.onAdLoaded() }
        mOnAdFailedToLoad = { interfaceListener.onAdFailedToLoad(it) }
        mOnAdOpened = { interfaceListener.onAdOpened() }
        mOnAdClicked = { interfaceListener.onAdClicked() }
        mOnAdLeftApplication = { interfaceListener.onAdLeftApplication() }
        mOnAdClosed = { interfaceListener.onAdClosed() }
    }

    internal fun onAdLoaded() {
        if (::mOnAdLoaded.isInitialized && mOnAdLoaded != null)
            mOnAdLoaded()
    }

    override fun onAdLoaded(onAdLoaded: () -> Unit): AdVidaListenerBuilder {
        mOnAdLoaded = onAdLoaded
        return this
    }

    internal fun onAdFailedToLoad(arg: Int) {
        if (::mOnAdFailedToLoad.isInitialized && mOnAdFailedToLoad != null)
            mOnAdFailedToLoad(arg)
    }

    override fun onAdFailedToLoad(onAdFailedToLoad: (Int) -> Unit): AdVidaListenerBuilder {
        mOnAdFailedToLoad = onAdFailedToLoad
        return this
    }

    internal fun onAdOpened() {
        if (::mOnAdOpened.isInitialized && mOnAdOpened != null)
            mOnAdOpened()
    }

    override fun onAdOpened(onAdOpened: () -> Unit): AdVidaListenerBuilder {
        mOnAdOpened = onAdOpened
        return this
    }

    internal fun onAdClicked() {
        if (::mOnAdClicked.isInitialized && mOnAdClicked != null)
            mOnAdClicked()
    }

    override fun onAdClicked(onAdClicked: () -> Unit): AdVidaListenerBuilder {
        mOnAdClicked = onAdClicked
        return this
    }

    internal fun onAdLeftApplication() {
        if (::mOnAdLeftApplication.isInitialized && mOnAdLeftApplication != null)
            mOnAdLeftApplication()
    }

    override fun onAdLeftApplication(onAdLeftApplication: () -> Unit): AdVidaListenerBuilder {
        mOnAdLeftApplication = onAdLeftApplication
        return this
    }

    internal fun onAdClosed() {
        if (::mOnAdClosed.isInitialized && mOnAdClosed != null)
            mOnAdClosed()
    }

    override fun onAdClosed(onAdClosed: () -> Unit): AdVidaListenerBuilder {
        mOnAdClosed = onAdClosed
        return this
    }


}