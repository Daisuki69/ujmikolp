package m4;

import Ej.Z;
import M8.T2;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import com.paymaya.domain.store.C1258f0;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import e2.C1421c;
import java.util.ArrayList;
import n4.C1920d;
import n4.C1922f;
import n4.C1923g;
import n4.RunnableC1919c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends ViewGroup {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f18336B = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1920d f18337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WindowManager f18338b;
    public final Handler c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18339d;
    public SurfaceView e;
    public TextureView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18340g;
    public final Z h;
    public int i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F.i f18341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1923g f18342l;
    public p m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f18343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Rect f18344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f18345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Rect f18346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f18347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f18348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f18349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n4.i f18350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Oa.f f18352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1258f0 f18353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f18354y;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18339d = false;
        this.f18340g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.f18342l = new C1923g();
        this.f18346q = null;
        this.f18347r = null;
        this.f18348s = null;
        this.f18349t = 0.1d;
        this.f18350u = null;
        this.f18351v = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.f18352w = new Oa.f(barcodeView, 2);
        C1846b c1846b = new C1846b(barcodeView, 1);
        this.f18353x = new C1258f0(barcodeView, 24);
        this.f18354y = new d(barcodeView, 0);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.f18338b = (WindowManager) context.getSystemService("window");
        this.c = new Handler(c1846b);
        this.h = new Z(6, false);
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.f18337a == null || barcodeView.getDisplayRotation() == barcodeView.i) {
            return;
        }
        barcodeView.g();
        barcodeView.c();
    }

    private int getDisplayRotation() {
        return this.f18338b.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, H3.h.f2095a);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f18348s = new p(dimension, dimension2);
        }
        this.f18339d = typedArrayObtainStyledAttributes.getBoolean(3, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f18350u = new n4.h(0);
        } else if (integer == 2) {
            this.f18350u = new n4.h(1);
        } else if (integer == 3) {
            this.f18350u = new n4.h(2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c() {
        int i = 1;
        int i4 = 0;
        T2.R();
        Log.d("e", "resume()");
        if (this.f18337a != null) {
            Log.w("e", "initCamera called twice");
        } else {
            Context context = getContext();
            C1920d c1920d = new C1920d();
            c1920d.f = false;
            c1920d.f18602g = true;
            c1920d.i = new C1923g();
            RunnableC1919c runnableC1919c = new RunnableC1919c(c1920d, i4);
            c1920d.j = new RunnableC1919c(c1920d, i);
            c1920d.f18603k = new RunnableC1919c(c1920d, 2);
            c1920d.f18604l = new RunnableC1919c(c1920d, 3);
            T2.R();
            if (Z.f == null) {
                Z.f = new Z(8);
            }
            Z z4 = Z.f;
            c1920d.f18599a = z4;
            C1922f c1922f = new C1922f(context);
            c1920d.c = c1922f;
            c1922f.f18610g = c1920d.i;
            c1920d.h = new Handler();
            C1923g c1923g = this.f18342l;
            if (!c1920d.f) {
                c1920d.i = c1923g;
                c1922f.f18610g = c1923g;
            }
            this.f18337a = c1920d;
            c1920d.f18601d = this.c;
            T2.R();
            c1920d.f = true;
            c1920d.f18602g = false;
            synchronized (z4.e) {
                z4.f1430b++;
                z4.d(runnableC1919c);
            }
            this.i = getDisplayRotation();
        }
        if (this.f18345p != null) {
            e();
        } else {
            SurfaceView surfaceView = this.e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f18352w);
            } else {
                TextureView textureView = this.f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f.getSurfaceTexture();
                        this.f18345p = new p(this.f.getWidth(), this.f.getHeight());
                        e();
                    } else {
                        this.f.setSurfaceTextureListener(new c(this));
                    }
                }
            }
        }
        requestLayout();
        Z z5 = this.h;
        Context context2 = getContext();
        C1258f0 c1258f0 = this.f18353x;
        o oVar = (o) z5.f1431d;
        if (oVar != null) {
            oVar.disable();
        }
        z5.f1431d = null;
        z5.c = null;
        z5.e = null;
        Context applicationContext = context2.getApplicationContext();
        z5.e = c1258f0;
        z5.c = (WindowManager) applicationContext.getSystemService("window");
        o oVar2 = new o(z5, applicationContext);
        z5.f1431d = oVar2;
        oVar2.enable();
        z5.f1430b = ((WindowManager) z5.c).getDefaultDisplay().getRotation();
    }

    public final void d(C1421c c1421c) {
        if (this.f18340g || this.f18337a == null) {
            return;
        }
        Log.i("e", "Starting preview");
        C1920d c1920d = this.f18337a;
        c1920d.f18600b = c1421c;
        T2.R();
        if (!c1920d.f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
        c1920d.f18599a.d(c1920d.f18603k);
        this.f18340g = true;
        ((BarcodeView) this).h();
        this.f18354y.g();
    }

    public final void e() {
        Rect rect;
        float f;
        p pVar = this.f18345p;
        if (pVar == null || this.f18343n == null || (rect = this.f18344o) == null) {
            return;
        }
        if (this.e != null && pVar.equals(new p(rect.width(), this.f18344o.height()))) {
            SurfaceHolder holder = this.e.getHolder();
            C1421c c1421c = new C1421c(21);
            if (holder == null) {
                throw new IllegalArgumentException("surfaceHolder may not be null");
            }
            c1421c.f16555b = holder;
            d(c1421c);
            return;
        }
        TextureView textureView = this.f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f18343n != null) {
            int width = this.f.getWidth();
            int height = this.f.getHeight();
            p pVar2 = this.f18343n;
            float f3 = height;
            float f7 = width / f3;
            float f10 = pVar2.f18368a / pVar2.f18369b;
            float f11 = 1.0f;
            if (f7 < f10) {
                float f12 = f10 / f7;
                f = 1.0f;
                f11 = f12;
            } else {
                f = f7 / f10;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f11, f);
            float f13 = width;
            matrix.postTranslate((f13 - (f11 * f13)) / 2.0f, (f3 - (f * f3)) / 2.0f);
            this.f.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.f.getSurfaceTexture();
        C1421c c1421c2 = new C1421c(21);
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        c1421c2.c = surfaceTexture;
        d(c1421c2);
    }

    public C1920d getCameraInstance() {
        return this.f18337a;
    }

    public C1923g getCameraSettings() {
        return this.f18342l;
    }

    public Rect getFramingRect() {
        return this.f18346q;
    }

    public p getFramingRectSize() {
        return this.f18348s;
    }

    public double getMarginFraction() {
        return this.f18349t;
    }

    public Rect getPreviewFramingRect() {
        return this.f18347r;
    }

    public n4.i getPreviewScalingStrategy() {
        n4.i iVar = this.f18350u;
        return iVar != null ? iVar : this.f != null ? new n4.h(0) : new n4.h(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18339d) {
            TextureView textureView = new TextureView(getContext());
            this.f = textureView;
            textureView.setSurfaceTextureListener(new c(this));
            addView(this.f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.e = surfaceView;
        surfaceView.getHolder().addCallback(this.f18352w);
        addView(this.e);
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
        p pVar = new p(i6 - i, i10 - i4);
        this.m = pVar;
        C1920d c1920d = this.f18337a;
        if (c1920d != null && c1920d.e == null) {
            int displayRotation = getDisplayRotation();
            F.i iVar = new F.i(9, (byte) 0);
            iVar.f1504d = new n4.h(1);
            iVar.c = displayRotation;
            iVar.f1503b = pVar;
            this.f18341k = iVar;
            iVar.f1504d = getPreviewScalingStrategy();
            C1920d c1920d2 = this.f18337a;
            F.i iVar2 = this.f18341k;
            c1920d2.e = iVar2;
            c1920d2.c.h = iVar2;
            T2.R();
            if (!c1920d2.f) {
                throw new IllegalStateException("CameraInstance is not open");
            }
            c1920d2.f18599a.d(c1920d2.j);
            boolean z5 = this.f18351v;
            if (z5) {
                C1920d c1920d3 = this.f18337a;
                c1920d3.getClass();
                T2.R();
                if (c1920d3.f) {
                    c1920d3.f18599a.d(new H3.a(c1920d3, z5, 2));
                }
            }
        }
        SurfaceView surfaceView = this.e;
        if (surfaceView == null) {
            TextureView textureView = this.f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f18344o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.f18351v);
        return bundle;
    }

    public void setCameraSettings(C1923g c1923g) {
        this.f18342l = c1923g;
    }

    public void setFramingRectSize(p pVar) {
        this.f18348s = pVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f18349t = d10;
    }

    public void setPreviewScalingStrategy(n4.i iVar) {
        this.f18350u = iVar;
    }

    public void setTorch(boolean z4) {
        this.f18351v = z4;
        C1920d c1920d = this.f18337a;
        if (c1920d != null) {
            T2.R();
            if (c1920d.f) {
                c1920d.f18599a.d(new H3.a(c1920d, z4, 2));
            }
        }
    }

    public void setUseTextureView(boolean z4) {
        this.f18339d = z4;
    }
}
