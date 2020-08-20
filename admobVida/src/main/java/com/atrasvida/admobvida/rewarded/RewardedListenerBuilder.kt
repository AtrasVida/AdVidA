package com.atrasvida.admobvida.rewarded

open class RewardedListenerBuilder : ListenerBuider,
    AdVidaRewardedListener {


    internal lateinit var mOnRewardedVideoAdLoaded: () -> Unit
    internal lateinit var mOnRewardedVideoAdOpened: () -> Unit
    internal lateinit var mOnRewardedVideoStarted: () -> Unit
    internal lateinit var mOnRewardedVideoAdClosed: () -> Unit
    internal lateinit var mOnRewarded: (RewardItemAdVida?) -> Unit
    internal lateinit var mOnRewardedVideoAdLeftApplication: () -> Unit
    internal lateinit var mOnRewardedVideoAdFailedToLoad: (Int) -> Unit
    internal lateinit var mOnRewardedVideoCompleted: () -> Unit


    constructor()

    constructor(onRewarded: (RewardItemAdVida?) -> Unit) {
        mOnRewarded = onRewarded
    }

    constructor(
        onRewardedVideoAdLoaded: () -> Unit,
        onRewardedVideoStarted: () -> Unit,
        onRewarded: (RewardItemAdVida?) -> Unit
    ) {
        mOnRewardedVideoAdLoaded = onRewardedVideoAdLoaded
        mOnRewardedVideoStarted = onRewardedVideoStarted
        mOnRewarded = onRewarded
    }

    constructor(listener: AdVidaRewardedInterface) {
        mOnRewardedVideoAdLoaded = { listener.onRewardedVideoAdLoaded() }
        mOnRewardedVideoStarted = { listener.onRewardedVideoStarted() }
        mOnRewardedVideoAdClosed = { listener.onRewardedVideoAdClosed() }
        mOnRewarded = { listener.onRewarded(it) }
        mOnRewardedVideoAdLeftApplication = { listener.onRewardedVideoAdLeftApplication() }
        mOnRewardedVideoAdFailedToLoad = { listener.onRewardedVideoAdFailedToLoad(it) }
        mOnRewardedVideoCompleted = { listener.onRewardedVideoCompleted() }


    }

    internal fun onRewardedVideoAdLoaded() {
        if (::mOnRewardedVideoAdLoaded.isInitialized && mOnRewardedVideoAdLoaded != null)
            mOnRewardedVideoAdLoaded()
    }

    override fun onRewardedVideoAdLoaded(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoAdLoaded = onRewardedVideoAdLoaded
        return this
    }

    internal fun onRewardedVideoAdOpened() {
        if (::mOnRewardedVideoAdOpened.isInitialized && mOnRewardedVideoAdOpened != null)
            mOnRewardedVideoAdOpened()
    }

    override fun onRewardedVideoAdOpened(onRewardedVideoAdOpened: () -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoAdOpened = onRewardedVideoAdOpened
        return this
    }

    internal fun onRewardedVideoStarted() {
        if (::mOnRewardedVideoStarted.isInitialized && mOnRewardedVideoStarted != null)
            mOnRewardedVideoStarted()
    }

    override fun onRewardedVideoStarted(onRewardedVideoStarted: () -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoStarted = onRewardedVideoStarted
        return this
    }

    internal fun onRewardedVideoAdClosed() {
        if (::mOnRewardedVideoAdClosed.isInitialized && mOnRewardedVideoAdClosed != null)
            mOnRewardedVideoAdClosed()
    }

    override fun onRewardedVideoAdClosed(onRewardedVideoAdClosed: () -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoAdClosed = onRewardedVideoAdClosed
        return this
    }

    internal fun onRewarded(arg: RewardItemAdVida?) {
        if (::mOnRewarded.isInitialized && mOnRewarded != null)
            mOnRewarded(arg)
    }

    override fun onRewarded(onRewarded: (RewardItemAdVida?) -> Unit): RewardedListenerBuilder {
        mOnRewarded = onRewarded
        return this
    }

    internal fun onRewardedVideoAdLeftApplication() {
        if (::mOnRewardedVideoAdLeftApplication.isInitialized && mOnRewardedVideoAdLeftApplication != null)
            mOnRewardedVideoAdLeftApplication()
    }

    override fun onRewardedVideoAdLeftApplication(onRewardedVideoAdLeftApplication: () -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoAdLeftApplication = onRewardedVideoAdLeftApplication
        return this
    }

    internal fun onRewardedVideoAdFailedToLoad(arg: Int) {
        if (::mOnRewardedVideoAdFailedToLoad.isInitialized && mOnRewardedVideoAdFailedToLoad != null)
            mOnRewardedVideoAdFailedToLoad(arg)
    }

    override fun onRewardedVideoAdFailedToLoad(onRewardedVideoAdFailedToLoad: (Int) -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoAdFailedToLoad = onRewardedVideoAdFailedToLoad
        return this
    }

    internal fun onRewardedVideoCompleted() {
        if (::mOnRewardedVideoCompleted.isInitialized && mOnRewardedVideoCompleted != null)
            mOnRewardedVideoCompleted()
    }

    override fun onRewardedVideoCompleted(onRewardedVideoCompleted: () -> Unit): RewardedListenerBuilder {
        mOnRewardedVideoCompleted = onRewardedVideoCompleted
        return this
    }


}