package com.atrasvida.advida_project

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.atrasvida.admobvida.AdVida
import com.atrasvida.admobvida.AdVidaInitializer
import com.atrasvida.admobvida.interstitial.AdListener
import com.atrasvida.admobvida.interstitial.AdVidaListener
import com.atrasvida.admobvida.interstitial.AdVidaListenerBuilder
import com.atrasvida.admobvida.rewarded.AdVidaRewardedListener
import com.atrasvida.admobvida.rewarded.RewardedListenerBuilder
import com.atrasvida.admobvida.rewarded.RewardedVideoAdVida
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AdVidaInitializer(
            "ca-app-pub-3940256099942544~3347511713",
            "ca-app-pub-3940256099942544/6300978111",
            "ca-app-pub-3940256099942544/1033173712",
            "ca-app-pub-3940256099942544/5224354917"
        )


        rewarded.setOnClickListener {
            AdVida(this).loadVideo { rev -> getRewardedListener(rev) }
        }

        interstitial.setOnClickListener {
            AdVida(this).loadInterstitial { ad -> getInterstitialListener(ad) }
        }


        AdVida(this).loadBannerTo(findViewById(R.id.fl_add)) {
            AdVidaListenerBuilder()
                .onAdLoaded {
                    Toast.makeText(
                        this, "onAdClicked", Toast.LENGTH_SHORT
                    ).show()
                }
                .onAdClicked {
                    Toast.makeText(
                        this, "onAdClicked", Toast.LENGTH_SHORT
                    ).show()
                }
                .onAdFailedToLoad {
                    Toast.makeText(
                        this, "onAdClicked", Toast.LENGTH_SHORT
                    ).show()
                }
                .onAdOpened {
                    Toast.makeText(
                        this, "onAdOpened2", Toast.LENGTH_SHORT
                    ).show()
                }
                .onAdLeftApplication {
                    Toast.makeText(
                        this, "onAdClicked", Toast.LENGTH_SHORT
                    ).show()
                }
        }

        /*   AdVida(this).loadBannerTo(findViewById(R.id.fl_add)) {
                AdVidaListenerBuilder(
                   *//*onAdLoaded = *//*{},
                *//*onAdFailedToLoad = *//*{ e -> },
                *//*onAdOpened = *//*{},
                *//*onAdClicked = *//*{},
                *//*onAdLeftApplication = *//*{},
                *//*onAdClosed = *//*{}
            )
        }*/

    }

    private fun getInterstitialListener(ad: AdListener): AdVidaListener {

        return AdVidaListenerBuilder()
            .onAdLoaded {
                if (ad.isLoaded())
                    ad.show()
            }
            .onAdClicked { }
            .onAdFailedToLoad {
                Toast.makeText(this, "onAdFailedToLoad", Toast.LENGTH_SHORT).show()
            }
            .onAdOpened { }
            .onAdLeftApplication { }
    }

    private fun getRewardedListener(rev: RewardedVideoAdVida): AdVidaRewardedListener {

        return RewardedListenerBuilder()
            .onRewardedVideoAdLoaded {

                if (rev.isLoaded())
                    rev.show()

            }.onRewardedVideoAdClosed {

            }.onRewarded { rewardedItem ->

                Toast.makeText(
                    this,
                    "onRewarded! currency: ${rewardedItem!!.type} amount: ${rewardedItem.amount}",
                    Toast.LENGTH_SHORT
                ).show()

            }.onRewardedVideoAdFailedToLoad {

            }.onRewardedVideoAdOpened {

            }.onRewardedVideoAdLeftApplication {

            }.onRewardedVideoStarted {

            }.onRewardedVideoCompleted { }
    }
}