package com.atrasvida.admobvida.rewarded

import com.google.android.gms.ads.reward.RewardItem
import com.google.android.gms.ads.reward.RewardedVideoAdListener
import com.atrasvida.admobvida.AdHandlerBase

class RewardedHandler(
    var rewardedListenerBuilder: RewardedListenerBuilder
) :
    RewardedVideoAdListener,
    AdHandlerBase() {


    override fun onRewarded(reward: RewardItem) {
        rewardedListenerBuilder.mOnRewarded(object :
            RewardItemAdVida {
            override val type: String?
                get() = reward.type
            override val amount: Int
                get() = reward.amount
        })
    }

    override fun onRewardedVideoAdLeftApplication() {
        rewardedListenerBuilder.onRewardedVideoAdLeftApplication()
    }

    override fun onRewardedVideoAdClosed() {
        rewardedListenerBuilder.onRewardedVideoAdClosed()
    }

    override fun onRewardedVideoAdFailedToLoad(errorCode: Int) {
        rewardedListenerBuilder.onRewardedVideoAdFailedToLoad(errorCode)
    }

    override fun onRewardedVideoAdLoaded() {
        rewardedListenerBuilder.onRewardedVideoAdLoaded()
    }

    override fun onRewardedVideoAdOpened() {
        rewardedListenerBuilder.onRewardedVideoAdOpened()
    }

    override fun onRewardedVideoStarted() {
        rewardedListenerBuilder.onRewardedVideoStarted()
    }

    override fun onRewardedVideoCompleted() {
        rewardedListenerBuilder.onRewardedVideoCompleted()
    }


}
