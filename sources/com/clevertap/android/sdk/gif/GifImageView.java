package com.clevertap.android.sdk.gif;

import Ej.Z;
import M.a;
import M.c;
import M.d;
import M.e;
import M.f;
import M.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes2.dex */
public class GifImageView extends AppCompatImageView implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f9468b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f9469d;
    public final Handler e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9470g;
    public Bitmap h;
    public final d i;
    public final d j;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1L;
        this.e = new Handler(Looper.getMainLooper());
        this.i = new d(this, 0);
        this.j = new d(this, 1);
    }

    public final void a() {
        this.f = false;
        this.f9470g = true;
        this.f9467a = false;
        Thread thread = this.f9468b;
        if (thread != null) {
            thread.interrupt();
            this.f9468b = null;
        }
        this.e.post(this.i);
    }

    public final void b() {
        if ((this.f9467a || this.f) && this.f9469d != null && this.f9468b == null) {
            Thread thread = new Thread(this);
            this.f9468b = thread;
            thread.start();
        }
    }

    public int getFrameCount() {
        return this.f9469d.f3018g.f3039d;
    }

    public long getFramesDisplayDuration() {
        return this.c;
    }

    public int getGifHeight() {
        return this.f9469d.f3018g.i;
    }

    public int getGifWidth() {
        return this.f9469d.f3018g.f3042l;
    }

    public f getOnAnimationStop() {
        return null;
    }

    public g getOnFrameAvailable() {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
        L0:
            boolean r0 = r11.f9467a
            android.os.Handler r1 = r11.e
            if (r0 != 0) goto Lc
            boolean r0 = r11.f
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            M.a r0 = r11.f9469d
            M.c r2 = r0.f3018g
            int r3 = r2.f3039d
            r4 = -1
            r5 = 0
            if (r3 > 0) goto L18
        L16:
            r8 = r5
            goto L32
        L18:
            int r6 = r0.f
            int r7 = r3 + (-1)
            r8 = 1
            if (r6 != r7) goto L24
            int r7 = r0.i
            int r7 = r7 + r8
            r0.i = r7
        L24:
            int r2 = r2.j
            if (r2 == r4) goto L2d
            int r7 = r0.i
            if (r7 <= r2) goto L2d
            goto L16
        L2d:
            int r6 = r6 + 1
            int r6 = r6 % r3
            r0.f = r6
        L32:
            r2 = 0
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4f
            M.a r0 = r11.f9469d     // Catch: java.lang.Throwable -> L4f
            android.graphics.Bitmap r0 = r0.b()     // Catch: java.lang.Throwable -> L4f
            r11.h = r0     // Catch: java.lang.Throwable -> L4f
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L4f
            long r9 = r9 - r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 / r6
            M.d r0 = r11.j     // Catch: java.lang.Throwable -> L50
            r1.post(r0)     // Catch: java.lang.Throwable -> L50
            goto L50
        L4f:
            r9 = r2
        L50:
            r11.f = r5
            boolean r0 = r11.f9467a
            if (r0 == 0) goto L8b
            if (r8 != 0) goto L59
            goto L8b
        L59:
            M.a r0 = r11.f9469d     // Catch: java.lang.InterruptedException -> L86
            M.c r6 = r0.f3018g     // Catch: java.lang.InterruptedException -> L86
            int r7 = r6.f3039d     // Catch: java.lang.InterruptedException -> L86
            if (r7 <= 0) goto L75
            int r0 = r0.f     // Catch: java.lang.InterruptedException -> L86
            if (r0 >= 0) goto L66
            goto L75
        L66:
            if (r0 < 0) goto L76
            if (r0 >= r7) goto L76
            java.util.ArrayList r4 = r6.e     // Catch: java.lang.InterruptedException -> L86
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.InterruptedException -> L86
            M.b r0 = (M.b) r0     // Catch: java.lang.InterruptedException -> L86
            int r4 = r0.f3033b     // Catch: java.lang.InterruptedException -> L86
            goto L76
        L75:
            r4 = r5
        L76:
            long r4 = (long) r4     // Catch: java.lang.InterruptedException -> L86
            long r4 = r4 - r9
            int r0 = (int) r4     // Catch: java.lang.InterruptedException -> L86
            if (r0 <= 0) goto L86
            long r4 = r11.c     // Catch: java.lang.InterruptedException -> L86
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L82
            goto L83
        L82:
            long r4 = (long) r0     // Catch: java.lang.InterruptedException -> L86
        L83:
            java.lang.Thread.sleep(r4)     // Catch: java.lang.InterruptedException -> L86
        L86:
            boolean r0 = r11.f9467a
            if (r0 != 0) goto L0
            goto L8d
        L8b:
            r11.f9467a = r5
        L8d:
            boolean r0 = r11.f9470g
            if (r0 == 0) goto L96
            M.d r0 = r11.i
            r1.post(r0)
        L96:
            r0 = 0
            r11.f9468b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.gif.GifImageView.run():void");
    }

    public void setBytes(byte[] bArr) {
        a aVar = new a();
        this.f9469d = aVar;
        try {
            synchronized (aVar) {
                if (aVar.f3020l == null) {
                    aVar.f3020l = new Z(1);
                }
                Z z4 = aVar.f3020l;
                z4.n(bArr);
                c cVarH = z4.h();
                aVar.f3018g = cVarH;
                if (bArr != null) {
                    aVar.f(cVarH, bArr);
                }
            }
            boolean z5 = this.f9467a;
            if (z5) {
                b();
                return;
            }
            a aVar2 = this.f9469d;
            if (aVar2.f != 0 && -1 < aVar2.f3018g.f3039d) {
                aVar2.f = -1;
                if (z5) {
                    return;
                }
                this.f = true;
                b();
            }
        } catch (Exception unused) {
            this.f9469d = null;
        }
    }

    public void setFramesDisplayDuration(long j) {
        this.c = j;
    }

    public void setOnAnimationStart(e eVar) {
    }

    public void setOnAnimationStop(f fVar) {
    }

    public void setOnFrameAvailable(g gVar) {
    }
}
