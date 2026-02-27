package N;

import D.C0182o;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.camera.video.AudioStats;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3456b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3457d;
    public final int e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Point f3458g;
    public boolean h;

    public d(Context context, int i, int i4, int i6, int i10, double d10) {
        super(context);
        this.f3455a = context;
        this.f3456b = i;
        this.c = i4;
        this.f3457d = i6;
        this.e = i10;
        this.f = d10;
        this.f3458g = new Point();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        getSettings().setTextZoom(100);
        setId(188293);
    }

    public final void a() {
        int iWidth;
        float fApplyDimension;
        int iHeight;
        float fApplyDimension2;
        int i;
        String strTnTj78 = numX49.tnTj78("PJ2r");
        String strTnTj782 = numX49.tnTj78("PJ2Z");
        Context context = this.f3455a;
        int i4 = this.f3456b;
        if (i4 > 0) {
            fApplyDimension = TypedValue.applyDimension(1, i4, getResources().getDisplayMetrics());
        } else {
            int i6 = Build.VERSION.SDK_INT;
            int i10 = this.f3457d;
            if (i6 >= 30) {
                Object systemService = context.getSystemService("window");
                WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                if (windowManager == null) {
                    iWidth = getResources().getDisplayMetrics().widthPixels;
                } else {
                    WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    kotlin.jvm.internal.j.f(currentWindowMetrics, strTnTj782);
                    if (this.h) {
                        iWidth = currentWindowMetrics.getBounds().width();
                    } else {
                        Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
                        kotlin.jvm.internal.j.f(insetsIgnoringVisibility, strTnTj78);
                        iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
                    }
                }
            } else {
                iWidth = getResources().getDisplayMetrics().widthPixels;
            }
            fApplyDimension = (iWidth * i10) / 100.0f;
        }
        int i11 = (int) fApplyDimension;
        int i12 = this.c;
        if (i12 > 0) {
            fApplyDimension2 = TypedValue.applyDimension(1, i12, getResources().getDisplayMetrics());
        } else {
            double d10 = this.f;
            if (d10 != -1.0d && d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                i = (int) (((double) i11) / d10);
                Point point = this.f3458g;
                point.x = i11;
                point.y = i;
            }
            int i13 = Build.VERSION.SDK_INT;
            int i14 = this.e;
            if (i13 >= 30) {
                Object systemService2 = context.getSystemService("window");
                WindowManager windowManager2 = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
                if (windowManager2 == null) {
                    iHeight = getResources().getDisplayMetrics().heightPixels;
                } else {
                    WindowMetrics currentWindowMetrics2 = windowManager2.getCurrentWindowMetrics();
                    kotlin.jvm.internal.j.f(currentWindowMetrics2, strTnTj782);
                    if (this.h) {
                        iHeight = currentWindowMetrics2.getBounds().height();
                    } else {
                        Insets insetsIgnoringVisibility2 = currentWindowMetrics2.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
                        kotlin.jvm.internal.j.f(insetsIgnoringVisibility2, strTnTj78);
                        iHeight = (currentWindowMetrics2.getBounds().height() - insetsIgnoringVisibility2.top) - insetsIgnoringVisibility2.bottom;
                    }
                }
            } else {
                iHeight = getResources().getDisplayMetrics().heightPixels;
            }
            fApplyDimension2 = (iHeight * i14) / 100.0f;
        }
        i = (int) fApplyDimension2;
        Point point2 = this.f3458g;
        point2.x = i11;
        point2.y = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        a();
        Point point = this.f3458g;
        setMeasuredDimension(point.x, point.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onTouchEvent(motionEvent);
    }

    public final void setFullscreen(boolean z4) {
        this.h = z4;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void setJavaScriptInterface(C0182o webInterface) {
        kotlin.jvm.internal.j.g(webInterface, "webInterface");
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        addJavascriptInterface(webInterface, numX49.tnTj78("PJ2k"));
    }
}
