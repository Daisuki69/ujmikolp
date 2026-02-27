package com.journeyapps.barcodescanner;

import C3.b;
import C3.f;
import Ej.Z;
import M8.T2;
import X2.c;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import com.paymaya.R;
import com.paymaya.domain.store.L;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import e2.C1421c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import m4.C1846b;
import m4.e;
import m4.i;
import m4.j;
import m4.k;
import m4.m;
import m4.n;
import m4.o;
import n4.C1920d;
import n4.RunnableC1918b;

/* JADX INFO: loaded from: classes3.dex */
public class BarcodeView extends e {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f10141K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C1421c f10142P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public c f10143Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public j f10144R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Handler f10145S;

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10141K = 1;
        this.f10142P = null;
        C1846b c1846b = new C1846b(this, 0);
        this.f10144R = new Z(5, false);
        this.f10145S = new Handler(c1846b);
    }

    public final i f() {
        i iVar;
        if (this.f10144R == null) {
            this.f10144R = new Z(5, false);
        }
        k kVar = new k();
        HashMap map = new HashMap();
        map.put(b.NEED_RESULT_POINT_CALLBACK, kVar);
        Z z4 = (Z) this.f10144R;
        z4.getClass();
        EnumMap enumMap = new EnumMap(b.class);
        enumMap.putAll(map);
        EnumMap enumMap2 = (EnumMap) z4.f1431d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) z4.c;
        if (set != null) {
            enumMap.put(b.POSSIBLE_FORMATS, set);
        }
        String str = (String) z4.e;
        if (str != null) {
            enumMap.put(b.CHARACTER_SET, str);
        }
        f fVar = new f();
        fVar.c(enumMap);
        int i = z4.f1430b;
        if (i == 0) {
            iVar = new i(fVar);
        } else if (i == 1) {
            iVar = new m(fVar);
        } else if (i != 2) {
            iVar = new i(fVar);
        } else {
            n nVar = new n(fVar);
            nVar.c = true;
            iVar = nVar;
        }
        kVar.f18366a = iVar;
        return iVar;
    }

    public final void g() {
        TextureView textureView;
        SurfaceView surfaceView;
        i();
        T2.R();
        Log.d("e", "pause()");
        this.i = -1;
        C1920d c1920d = this.f18337a;
        if (c1920d != null) {
            T2.R();
            if (c1920d.f) {
                c1920d.f18599a.d(c1920d.f18604l);
            } else {
                c1920d.f18602g = true;
            }
            c1920d.f = false;
            this.f18337a = null;
            this.f18340g = false;
        } else {
            this.c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f18345p == null && (surfaceView = this.e) != null) {
            surfaceView.getHolder().removeCallback(this.f18352w);
        }
        if (this.f18345p == null && (textureView = this.f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.m = null;
        this.f18343n = null;
        this.f18347r = null;
        Z z4 = this.h;
        o oVar = (o) z4.f1431d;
        if (oVar != null) {
            oVar.disable();
        }
        z4.f1431d = null;
        z4.c = null;
        z4.e = null;
        this.f18354y.j();
    }

    public j getDecoderFactory() {
        return this.f10144R;
    }

    public final void h() {
        i();
        if (this.f10141K == 1 || !this.f18340g) {
            return;
        }
        c cVar = new c(getCameraInstance(), f(), this.f10145S);
        this.f10143Q = cVar;
        cVar.f6476g = getPreviewFramingRect();
        c cVar2 = this.f10143Q;
        cVar2.getClass();
        T2.R();
        HandlerThread handlerThread = new HandlerThread("c");
        cVar2.c = handlerThread;
        handlerThread.start();
        cVar2.f6475d = new Handler(((HandlerThread) cVar2.c).getLooper(), (C.c) cVar2.i);
        cVar2.f6473a = true;
        C1920d c1920d = (C1920d) cVar2.f6474b;
        c1920d.h.post(new RunnableC1918b(0, c1920d, (L) cVar2.j));
    }

    public final void i() {
        c cVar = this.f10143Q;
        if (cVar != null) {
            cVar.getClass();
            T2.R();
            synchronized (cVar.h) {
                cVar.f6473a = false;
                ((Handler) cVar.f6475d).removeCallbacksAndMessages(null);
                ((HandlerThread) cVar.c).quit();
            }
            this.f10143Q = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.e, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setDecoderFactory(j jVar) {
        T2.R();
        this.f10144R = jVar;
        c cVar = this.f10143Q;
        if (cVar != null) {
            cVar.e = f();
        }
    }
}
