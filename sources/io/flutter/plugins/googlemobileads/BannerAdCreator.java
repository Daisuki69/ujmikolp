package io.flutter.plugins.googlemobileads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: loaded from: classes4.dex */
public class BannerAdCreator {

    @NonNull
    private final Context context;

    public BannerAdCreator(@NonNull Context context) {
        this.context = context;
    }

    public AdManagerAdView createAdManagerAdView() {
        return new AdManagerAdView(this.context);
    }

    public AdView createAdView() {
        return new AdView(this.context);
    }
}
