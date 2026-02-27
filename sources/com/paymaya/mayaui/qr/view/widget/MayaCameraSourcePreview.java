package com.paymaya.mayaui.qr.view.widget;

import Oa.a;
import Oa.d;
import Oa.f;
import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.google.android.gms.common.images.Size;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCameraSourcePreview extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceView f13654b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13655d;
    public d e;

    public MayaCameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13653a = context;
        this.c = false;
        this.f13655d = false;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f13654b = surfaceView;
        surfaceView.getHolder().addCallback(new f(this, 0));
        addView(surfaceView);
    }

    public final void a() {
        if (this.c && this.f13655d) {
            d dVar = this.e;
            SurfaceHolder holder = this.f13654b.getHolder();
            synchronized (dVar) {
                if (((Camera) dVar.c) == null) {
                    Camera cameraA = dVar.a();
                    dVar.c = cameraA;
                    cameraA.setPreviewDisplay(holder);
                    ((Camera) dVar.c).startPreview();
                    dVar.f = new Thread((a) dVar.i);
                    ((a) dVar.i).b(true);
                    ((Thread) dVar.f).start();
                }
            }
            requestLayout();
            this.c = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        int width;
        int height;
        int i11;
        int i12;
        Size size;
        d dVar = this.e;
        if (dVar == null || (size = (Size) dVar.e) == null) {
            width = 1280;
            height = 720;
        } else {
            width = size.getWidth();
            height = size.getHeight();
        }
        int i13 = this.f13653a.getResources().getConfiguration().orientation;
        if (i13 == 2) {
            int i14 = width;
            width = height;
            height = i14;
        } else if (i13 != 1) {
            Log.d("MIDemoApp:Preview", "isPortraitMode returning false by default");
            int i142 = width;
            width = height;
            height = i142;
        }
        int i15 = i6 - i;
        int i16 = i10 - i4;
        double d10 = height;
        double d11 = ((double) i15) / d10;
        double d12 = width;
        double d13 = ((double) i16) / d12;
        if (d11 > d13) {
            int i17 = (int) (d12 * d11);
            int i18 = (i17 - i16) / 2;
            i16 = i17;
            i12 = i18;
            i11 = 0;
        } else {
            int i19 = (int) (d10 * d13);
            i11 = (i19 - i15) / 2;
            i15 = i19;
            i12 = 0;
        }
        for (int i20 = 0; i20 < getChildCount(); i20++) {
            getChildAt(i20).layout(i11 * (-1), i12 * (-1), i15 - i11, i16 - i12);
        }
        try {
            a();
        } catch (IOException e) {
            Log.e("MIDemoApp:Preview", "Could not start camera source.", e);
        }
    }
}
