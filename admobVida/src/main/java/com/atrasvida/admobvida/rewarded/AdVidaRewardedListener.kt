package com.atrasvida.admobvida.rewarded


interface AdVidaRewardedListener {

    fun onRewardedVideoAdLoaded(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder

    fun onRewardedVideoAdOpened(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder

    fun onRewardedVideoStarted(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder

    fun onRewardedVideoAdClosed(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder

    fun onRewarded(onRewardedVideoAdLoaded: (RewardItemAdVida?) -> Unit): RewardedListenerBuilder

    fun onRewardedVideoAdLeftApplication(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder

    fun onRewardedVideoAdFailedToLoad(onRewardedVideoAdLoaded: (Int) -> Unit): RewardedListenerBuilder

    fun onRewardedVideoCompleted(onRewardedVideoAdLoaded: () -> Unit): RewardedListenerBuilder


}