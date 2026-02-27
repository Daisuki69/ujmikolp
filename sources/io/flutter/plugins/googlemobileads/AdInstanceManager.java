package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.util.HashMap;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
class AdInstanceManager {

    @Nullable
    private Activity activity;

    @NonNull
    private final Map<Integer, FlutterAd> ads = new HashMap();

    @NonNull
    private final u channel;

    public AdInstanceManager(@NonNull u uVar) {
        this.channel = uVar;
    }

    private void invokeOnAdEvent(final Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.googlemobileads.AdInstanceManager.1
            @Override // java.lang.Runnable
            public void run() {
                AdInstanceManager.this.channel.a("onAdEvent", map, null);
            }
        });
    }

    @Nullable
    public FlutterAd adForId(int i) {
        return this.ads.get(Integer.valueOf(i));
    }

    @Nullable
    public Integer adIdFor(@NonNull FlutterAd flutterAd) {
        for (Integer num : this.ads.keySet()) {
            if (this.ads.get(num) == flutterAd) {
                return num;
            }
        }
        return null;
    }

    public void disposeAd(int i) {
        if (this.ads.containsKey(Integer.valueOf(i))) {
            FlutterAd flutterAd = this.ads.get(Integer.valueOf(i));
            if (flutterAd != null) {
                flutterAd.dispose();
            }
            this.ads.remove(Integer.valueOf(i));
        }
    }

    public void disposeAllAds() {
        for (Map.Entry<Integer, FlutterAd> entry : this.ads.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().dispose();
            }
        }
        this.ads.clear();
    }

    @Nullable
    public Activity getActivity() {
        return this.activity;
    }

    public void onAdClicked(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdClicked");
        invokeOnAdEvent(map);
    }

    public void onAdClosed(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdClosed");
        invokeOnAdEvent(map);
    }

    public void onAdDismissedFullScreenContent(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdDismissedFullScreenContent");
        invokeOnAdEvent(map);
    }

    public void onAdFailedToLoad(int i, @NonNull FlutterAd.FlutterLoadAdError flutterLoadAdError) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdFailedToLoad");
        map.put("loadAdError", flutterLoadAdError);
        invokeOnAdEvent(map);
    }

    public void onAdImpression(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdImpression");
        invokeOnAdEvent(map);
    }

    public void onAdLoaded(int i, @Nullable ResponseInfo responseInfo) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdLoaded");
        map.put("responseInfo", responseInfo == null ? null : new FlutterAd.FlutterResponseInfo(responseInfo));
        invokeOnAdEvent(map);
    }

    public void onAdMetadataChanged(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdMetadataChanged");
        invokeOnAdEvent(map);
    }

    public void onAdOpened(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdOpened");
        invokeOnAdEvent(map);
    }

    public void onAdShowedFullScreenContent(int i) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAdShowedFullScreenContent");
        invokeOnAdEvent(map);
    }

    public void onAppEvent(int i, @NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onAppEvent");
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        map.put("data", str2);
        invokeOnAdEvent(map);
    }

    public void onFailedToShowFullScreenContent(int i, @NonNull AdError adError) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onFailedToShowFullScreenContent");
        map.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, new FlutterAd.FlutterAdError(adError));
        invokeOnAdEvent(map);
    }

    public void onFluidAdHeightChanged(int i, int i4) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onFluidAdHeightChanged");
        map.put("height", Integer.valueOf(i4));
        invokeOnAdEvent(map);
    }

    public void onPaidEvent(@NonNull FlutterAd flutterAd, @NonNull FlutterAdValue flutterAdValue) {
        HashMap map = new HashMap();
        map.put("adId", adIdFor(flutterAd));
        map.put("eventName", "onPaidEvent");
        map.put("valueMicros", Long.valueOf(flutterAdValue.valueMicros));
        map.put("precision", Integer.valueOf(flutterAdValue.precisionType));
        map.put(AppsFlyerProperties.CURRENCY_CODE, flutterAdValue.currencyCode);
        invokeOnAdEvent(map);
    }

    public void onRewardedAdUserEarnedReward(int i, @NonNull FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onRewardedAdUserEarnedReward");
        map.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(map);
    }

    public void onRewardedInterstitialAdUserEarnedReward(int i, @NonNull FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i));
        map.put("eventName", "onRewardedInterstitialAdUserEarnedReward");
        map.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(map);
    }

    public void setActivity(@Nullable Activity activity) {
        this.activity = activity;
    }

    public boolean showAdWithId(int i) {
        FlutterAd.FlutterOverlayAd flutterOverlayAd = (FlutterAd.FlutterOverlayAd) adForId(i);
        if (flutterOverlayAd == null) {
            return false;
        }
        flutterOverlayAd.show();
        return true;
    }

    public void trackAd(@NonNull FlutterAd flutterAd, int i) {
        if (this.ads.get(Integer.valueOf(i)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i)));
        }
        this.ads.put(Integer.valueOf(i), flutterAd);
    }
}
