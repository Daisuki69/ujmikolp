package io.flutter.plugins.googlemobileads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.flutter.plugin.platform.k;
import io.flutter.plugin.platform.l;
import java.util.Locale;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
final class GoogleMobileAdsViewFactory extends l {

    @NonNull
    private final AdInstanceManager manager;

    public static class ErrorTextView implements k {
        private final TextView textView;

        private ErrorTextView(Context context, String str) {
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setText(str);
            textView.setBackgroundColor(-65536);
            textView.setTextColor(-256);
        }

        @Override // io.flutter.plugin.platform.k
        public void dispose() {
        }

        @Override // io.flutter.plugin.platform.k
        public View getView() {
            return this.textView;
        }

        @Override // io.flutter.plugin.platform.k
        @SuppressLint({"NewApi"})
        public /* bridge */ /* synthetic */ void onFlutterViewAttached(@NonNull View view) {
        }

        @Override // io.flutter.plugin.platform.k
        @SuppressLint({"NewApi"})
        public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
        }

        @Override // io.flutter.plugin.platform.k
        @SuppressLint({"NewApi"})
        public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        }

        @Override // io.flutter.plugin.platform.k
        @SuppressLint({"NewApi"})
        public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        }
    }

    public GoogleMobileAdsViewFactory(@NonNull AdInstanceManager adInstanceManager) {
        super(C2037D.INSTANCE);
        this.manager = adInstanceManager;
    }

    private static k getErrorView(@NonNull final Context context, int i) {
        Log.e("GoogleMobileAdsViewFactory", String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", Integer.valueOf(i)));
        return new k() { // from class: io.flutter.plugins.googlemobileads.GoogleMobileAdsViewFactory.1
            @Override // io.flutter.plugin.platform.k
            public void dispose() {
            }

            @Override // io.flutter.plugin.platform.k
            public View getView() {
                return new View(context);
            }

            @Override // io.flutter.plugin.platform.k
            @SuppressLint({"NewApi"})
            public /* bridge */ /* synthetic */ void onFlutterViewAttached(@NonNull View view) {
            }

            @Override // io.flutter.plugin.platform.k
            @SuppressLint({"NewApi"})
            public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
            }

            @Override // io.flutter.plugin.platform.k
            @SuppressLint({"NewApi"})
            public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
            }

            @Override // io.flutter.plugin.platform.k
            @SuppressLint({"NewApi"})
            public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
            }
        };
    }

    @Override // io.flutter.plugin.platform.l
    public k create(Context context, int i, Object obj) {
        if (obj == null) {
            return getErrorView(context, 0);
        }
        Integer num = (Integer) obj;
        FlutterAd flutterAdAdForId = this.manager.adForId(num.intValue());
        return (flutterAdAdForId == null || flutterAdAdForId.getPlatformView() == null) ? getErrorView(context, num.intValue()) : flutterAdAdForId.getPlatformView();
    }
}
