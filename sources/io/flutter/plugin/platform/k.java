package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface k {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onInputConnectionLocked();

    void onInputConnectionUnlocked();
}
