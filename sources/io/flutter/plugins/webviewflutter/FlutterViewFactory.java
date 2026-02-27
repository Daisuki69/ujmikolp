package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
class FlutterViewFactory extends io.flutter.plugin.platform.l {
    private final AndroidWebkitLibraryPigeonInstanceManager instanceManager;

    public FlutterViewFactory(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
        super(C2037D.INSTANCE);
        this.instanceManager = androidWebkitLibraryPigeonInstanceManager;
    }

    @Override // io.flutter.plugin.platform.l
    @NonNull
    public io.flutter.plugin.platform.k create(Context context, int i, @Nullable Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        final Object androidWebkitLibraryPigeonInstanceManager = this.instanceManager.getInstance(r3.intValue());
        if (androidWebkitLibraryPigeonInstanceManager instanceof io.flutter.plugin.platform.k) {
            return (io.flutter.plugin.platform.k) androidWebkitLibraryPigeonInstanceManager;
        }
        if (androidWebkitLibraryPigeonInstanceManager instanceof View) {
            return new io.flutter.plugin.platform.k() { // from class: io.flutter.plugins.webviewflutter.FlutterViewFactory.1
                @Override // io.flutter.plugin.platform.k
                public void dispose() {
                }

                @Override // io.flutter.plugin.platform.k
                public View getView() {
                    return (View) androidWebkitLibraryPigeonInstanceManager;
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
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + androidWebkitLibraryPigeonInstanceManager);
    }
}
