package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterViewDelegate {
    @RequiresApi(api = 35)
    public List<Rect> getCaptionBarInsets(Context context) {
        WindowInsets windowInsets = getWindowInsets(context);
        return windowInsets == null ? Collections.EMPTY_LIST : windowInsets.getBoundingRects(WindowInsets.Type.captionBar());
    }

    @RequiresApi(api = 23)
    @VisibleForTesting
    public WindowInsets getWindowInsets(Context context) {
        Window window;
        Activity activityH = E1.c.h(context);
        if (activityH == null || (window = activityH.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    @RequiresApi(api = 35)
    public void growViewportMetricsToCaptionBar(Context context, FlutterRenderer.ViewportMetrics viewportMetrics) {
        List<Rect> captionBarInsets = getCaptionBarInsets(context);
        int iMax = viewportMetrics.viewPaddingTop;
        Iterator<Rect> it = captionBarInsets.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().bottom);
        }
        viewportMetrics.viewPaddingTop = iMax;
    }
}
