package io.flutter.plugin.platform;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public interface n {
    void a(int i, int i4);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    void release();

    void scheduleFrame();
}
