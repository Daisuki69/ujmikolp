package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface TextureRegistry$SurfaceProducer {
    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(r rVar);

    void setSize(int i, int i4);
}
