package com.tencent.could.huiyansdk.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.paymaya.R;
import com.tencent.could.aicamare.CameraHolder;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.e;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;

/* JADX INFO: loaded from: classes4.dex */
public class CameraDateBotGatherView extends RelativeLayout implements SurfaceHolder.Callback, com.tencent.could.huiyansdk.turing.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f15753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceView f15754b;
    public SurfaceHolder c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15755d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Point f15756g;
    public Path h;
    public CameraHolder i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RenderScript f15758l;
    public ScriptIntrinsicYuvToRGB m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ScriptIntrinsicBlur f15759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Type.Builder f15760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Type.Builder f15761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Allocation f15762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Allocation f15763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Allocation f15764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HandlerThread f15765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile Handler f15766u;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f15767a;

        public a(Bitmap bitmap) {
            this.f15767a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap = this.f15767a;
            if (bitmap != null) {
                CameraDateBotGatherView.this.f15753a.setImageBitmap(bitmap);
            }
        }
    }

    public CameraDateBotGatherView(Context context) {
        this(context, null);
    }

    public void b(byte[] bArr) {
        try {
            if (this.f15757k == 0 || this.j == 0) {
                Camera.Size cameraSize = this.i.getCameraSize();
                this.j = cameraSize.width;
                this.f15757k = cameraSize.height;
            }
            this.f15766u.post(new io.flutter.plugins.firebase.core.a(16, this, a(bArr, this.j, this.f15757k)));
        } catch (Exception e) {
            Log.e("CameraDateBotGatherView", "frame error! " + e.getLocalizedMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipPath(this.h);
        } else {
            canvas.clipPath(this.h, Region.Op.REPLACE);
        }
        super.dispatchDraw(canvas);
    }

    public View getTuringPreviewView() {
        return this.f15754b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        this.f15755d = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i4);
        this.e = size;
        Point point = this.f15756g;
        int i6 = this.f15755d >> 1;
        point.x = i6;
        int i10 = size >> 1;
        point.y = i10;
        if (i6 > i10) {
            i6 = i10;
        }
        this.f = i6;
        this.h.reset();
        Path path = this.h;
        Point point2 = this.f15756g;
        path.addCircle(point2.x, point2.y, this.f, Path.Direction.CCW);
        this.f -= Math.round(getResources().getDisplayMetrics().density * 1.9f);
        setMeasuredDimension(this.f15755d, this.e);
    }

    @Override // com.tencent.could.huiyansdk.turing.a
    public void setCameraHolder(CameraHolder cameraHolder) {
        this.i = cameraHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i4, int i6) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.c = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public CameraDateBotGatherView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.could.huiyansdk.turing.a
    public void a() {
        SurfaceHolder surfaceHolder;
        e.a.f15688a.a(1, "CameraDateBotGatherView", "start preview");
        CameraHolder cameraHolder = this.i;
        if (cameraHolder == null || (surfaceHolder = this.c) == null) {
            return;
        }
        cameraHolder.startPreview(surfaceHolder);
    }

    public CameraDateBotGatherView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = 0;
        this.f15757k = 0;
        a(context);
    }

    public final void a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(context.getResources().getLayout(R.layout.txy_camera_camera_bot_view_layout), this);
        if (viewInflate == null) {
            e.a.f15688a.a(2, "CameraDateBotGatherView", "create view is null!");
            return;
        }
        this.f15753a = (ImageView) viewInflate.findViewById(R.id.txy_huiyan_bot_image_view);
        SurfaceView surfaceView = (SurfaceView) viewInflate.findViewById(R.id.txy_bot_turing_view);
        this.f15754b = surfaceView;
        if (surfaceView != null) {
            SurfaceHolder holder = surfaceView.getHolder();
            this.c = holder;
            holder.addCallback(this);
        }
        this.f15756g = new Point();
        this.h = new Path();
        RenderScript renderScriptCreate = RenderScript.create(HuiYanBaseApi.a.f15622a.a());
        this.f15758l = renderScriptCreate;
        this.m = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        RenderScript renderScript = this.f15758l;
        this.f15759n = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        HandlerThread handlerThread = new HandlerThread("blur-image");
        this.f15765t = handlerThread;
        handlerThread.start();
        this.f15766u = new Handler(this.f15765t.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        Bitmap bitmap;
        int i = this.j / 2;
        int i4 = this.f15757k / 2;
        Bitmap bitmapCreateBitmap = null;
        try {
            if (this.f15760o == null) {
                RenderScript renderScript = this.f15758l;
                Type.Builder x6 = new Type.Builder(renderScript, Element.U8(renderScript)).setX(bArr.length);
                this.f15760o = x6;
                this.f15762q = Allocation.createTyped(this.f15758l, x6.create(), 1);
                RenderScript renderScript2 = this.f15758l;
                Type.Builder y7 = new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(i).setY(i4);
                this.f15761p = y7;
                Allocation allocationCreateTyped = Allocation.createTyped(this.f15758l, y7.create(), 1);
                this.f15763r = allocationCreateTyped;
                this.f15764s = Allocation.createTyped(this.f15758l, allocationCreateTyped.getType());
            }
            this.f15762q.copyFrom(bArr);
            this.m.setInput(this.f15762q);
            this.m.forEach(this.f15763r);
            this.f15759n.setRadius(7.5f);
            this.f15759n.setInput(this.f15763r);
            this.f15759n.forEach(this.f15764s);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i4, Bitmap.Config.ARGB_8888);
            this.f15764s.copyTo(bitmapCreateBitmap2);
            bitmap = bitmapCreateBitmap2;
        } catch (Exception e) {
            e = e;
            Log.e("CameraDateBotGatherView", "nv21ToBitmap happen some error: " + e.getLocalizedMessage());
            bitmap = null;
        } catch (OutOfMemoryError e7) {
            e = e7;
            Log.e("CameraDateBotGatherView", "nv21ToBitmap happen some error: " + e.getLocalizedMessage());
            bitmap = null;
        }
        synchronized (com.tencent.could.huiyansdk.view.a.class) {
        }
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.postRotate(90);
            matrix.postScale(0.2f, -0.2f);
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = bitmap;
                } else {
                    bitmap.recycle();
                }
            } catch (OutOfMemoryError e10) {
                Log.e("CameraDateBotGatherView", "rotateBitmapByDegree  OutOfMemoryError: " + e10.getLocalizedMessage());
            }
        }
        ImageView imageView = this.f15753a;
        if (imageView != null) {
            imageView.post(new a(bitmapCreateBitmap));
        }
    }

    public byte[] a(byte[] bArr, int i, int i4) {
        int i6 = i / 2;
        int i10 = i4 / 2;
        synchronized (com.tencent.could.huiyansdk.view.a.class) {
        }
        byte[] bArr2 = new byte[((i6 * i10) * 3) / 2];
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12 += 2) {
            for (int i13 = 0; i13 < i; i13 += 2) {
                bArr2[i11] = bArr[(i12 * i) + i13];
                i11++;
            }
        }
        for (int i14 = 0; i14 < i10; i14 += 2) {
            for (int i15 = 0; i15 < i; i15 += 4) {
                int i16 = (i14 * i) + (i * i4);
                bArr2[i11] = bArr[i16 + i15];
                bArr2[i11 + 1] = bArr[i15 + 1 + i16];
                i11 += 2;
            }
        }
        return bArr2;
    }
}
