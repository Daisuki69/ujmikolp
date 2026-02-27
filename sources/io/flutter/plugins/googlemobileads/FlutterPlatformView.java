package io.flutter.plugins.googlemobileads;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.platform.k;

/* JADX INFO: loaded from: classes4.dex */
class FlutterPlatformView implements k {

    @Nullable
    private View view;

    public FlutterPlatformView(@NonNull View view) {
        this.view = view;
    }

    @Override // io.flutter.plugin.platform.k
    public void dispose() {
        this.view = null;
    }

    @Override // io.flutter.plugin.platform.k
    public View getView() {
        return this.view;
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
