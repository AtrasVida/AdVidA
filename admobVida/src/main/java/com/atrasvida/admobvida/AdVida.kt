package com.atrasvida.admobvida

import android.content.Context
import android.widget.FrameLayout
import com.google.android.gms.ads.*
import com.google.android.gms.ads.reward.RewardedVideoAd
import com.atrasvida.admobvida.interstitial.AdHandler
import com.atrasvida.admobvida.interstitial.AdListener
import com.atrasvida.admobvida.interstitial.AdVidaListener
import com.atrasvida.admobvida.interstitial.AdVidaListenerBuilder
import com.atrasvida.admobvida.rewarded.AdVidaRewardedListener
import com.atrasvida.admobvida.rewarded.RewardedHandler
import com.atrasvida.admobvida.rewarded.RewardedListenerBuilder
import com.atrasvida.admobvida.rewarded.RewardedVideoAdVida

class AdVida(mContext: Context) : AdVidaBase(mContext) {
    var mRemoveInHouseAd: Boolean = false

    constructor(context: Context, removeInHouseAd: Boolean) : this(context) {
        mRemoveInHouseAd = removeInHouseAd
    }


    fun loadVideo(listenerBuilder: RewardedListenerBuilder): RewardedVideoAdVida {
        lateinit var mRewardedVideoAd: RewardedVideoAd

        Ooo0.oooo.ooOo {
            mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(context)

            mRewardedVideoAd.rewardedVideoAdListener = RewardedHandler( listenerBuilder)

            mRewardedVideoAd.loadAd(
                Ooo0.oOoo, AdRequest.Builder().build()
            )
        }
        return object :
            RewardedVideoAdVida {
            override fun isLoaded(): Boolean {
                return mRewardedVideoAd.isLoaded
            }

            override fun show() {
                mRewardedVideoAd.show()
            }
        }
    }

    fun loadVideo(listenerBuilder: (RewardedVideoAdVida) -> AdVidaRewardedListener) {
        Ooo0.oooo.ooOo {
            val mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(context)

            mRewardedVideoAd.rewardedVideoAdListener =
                RewardedHandler(
                    listenerBuilder(object :
                        RewardedVideoAdVida {
                        override fun isLoaded(): Boolean {
                            return mRewardedVideoAd.isLoaded
                        }
                        override fun show() {
                            mRewardedVideoAd.show()
                        }
                    }) as RewardedListenerBuilder
                )

            mRewardedVideoAd.loadAd(
                Ooo0.oOoo, AdRequest.Builder().build()
            )
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    fun loadInterstitial(listener: AdVidaListenerBuilder): AdListener {
        lateinit var mInterstitialAd: InterstitialAd

        Ooo0.oooo.ooOo {
            mInterstitialAd = InterstitialAd(context)

            mInterstitialAd.adUnitId = Ooo0.ooOO


            listener.mOnAdClicked
            mInterstitialAd.adListener = AdHandler(listener)

            mInterstitialAd.loadAd(AdRequest.Builder().build())
        }
        return object : AdListener {
            override fun isLoaded(): Boolean {
                return mInterstitialAd.isLoaded
            }

            override fun show() {
                mInterstitialAd.show()
            }
        }
    }

    fun loadInterstitial(listenerBuilder: (AdListener) -> AdVidaListener) {
        Ooo0.oooo.ooOo {
            val mInterstitialAd = InterstitialAd(context)

            mInterstitialAd.adUnitId = Ooo0.ooOO

            mInterstitialAd.adListener =
                AdHandler(listenerBuilder(object : AdListener {
                        override fun isLoaded(): Boolean {
                            return mInterstitialAd.isLoaded
                        }

                        override fun show() {
                            mInterstitialAd.show()
                        }
                    }) as AdVidaListenerBuilder
                )

            mInterstitialAd.loadAd(AdRequest.Builder().build())
        }
    }

    fun loadBannerTo(frameLayout: FrameLayout, listener: AdVidaListenerBuilder) {
        Ooo0.oooo.ooOo {
            val mAdView = AdView(frameLayout.context)
            frameLayout.removeAllViews()

            frameLayout.addView(mAdView/*,ViewGroup.LayoutParams()*/)
            mAdView.adSize = AdSize.BANNER
            mAdView.adUnitId = Ooo0.ooOo

            mAdView.adListener = AdHandler(listener)

            mAdView.loadAd(AdRequest.Builder().build())
        }
    }

    fun loadBannerTo(frameLayout: FrameLayout, listenerBuilder: () -> AdVidaListener) {
        Ooo0.oooo.ooOo {
            val mAdView = AdView(frameLayout.context)
            frameLayout.removeAllViews()

            frameLayout.addView(mAdView/*,ViewGroup.LayoutParams()*/)
            mAdView.adSize = AdSize.BANNER
            mAdView.adUnitId = Ooo0.ooOo

            mAdView.adListener = AdHandler(listenerBuilder() as AdVidaListenerBuilder)

            mAdView.loadAd(AdRequest.Builder().build())
        }
    }
}