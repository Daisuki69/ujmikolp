package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(27)
public class ApiHelperForOMR1 {
    private ApiHelperForOMR1() {
    }

    public static void backToSafety(SafeBrowsingResponse safeBrowsingResponse, boolean z4) {
        safeBrowsingResponse.backToSafety(z4);
    }

    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static void proceed(SafeBrowsingResponse safeBrowsingResponse, boolean z4) {
        safeBrowsingResponse.proceed(z4);
    }

    public static void setSafeBrowsingWhitelist(List<String> list, ValueCallback<Boolean> valueCallback) {
        WebView.setSafeBrowsingWhitelist(list, valueCallback);
    }

    public static void showInterstitial(SafeBrowsingResponse safeBrowsingResponse, boolean z4) {
        safeBrowsingResponse.showInterstitial(z4);
    }

    public static void startSafeBrowsing(Context context, ValueCallback<Boolean> valueCallback) {
        WebView.startSafeBrowsing(context, valueCallback);
    }
}
