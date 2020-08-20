package com.atrasvida.admobvida.rewarded


interface AdVidaRewardedInterface {

    fun onRewardedVideoAdLoaded()

    fun onRewardedVideoAdOpened()

    fun onRewardedVideoStarted()

    fun onRewardedVideoAdClosed()

    fun onRewarded(rewardItemAdVida: RewardItemAdVida?)

    fun onRewardedVideoAdLeftApplication()

    fun onRewardedVideoAdFailedToLoad(error: Int)

    fun onRewardedVideoCompleted()


}