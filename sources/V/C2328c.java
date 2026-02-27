package v;

import We.C0600d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.collection.LongSparseArray;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.AbstractC1876c;
import n.C1880g;
import n.s;
import n.t;
import n.v;
import o.C1953a;
import q.p;
import r.C2179a;
import s.AbstractC2217b;
import s.C2221f;
import t.C2265b;
import z.AbstractC2540b;
import z.AbstractC2544f;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2328c extends AbstractC2327b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f20372A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Object f20373B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f20374C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Parcelable f20375D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Object f20376E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Object f20377F;

    public C2328c(s sVar, C2330e c2330e) {
        super(sVar, c2330e);
        this.f20373B = new C1953a(3, 0);
        this.f20374C = new Rect();
        this.f20375D = new Rect();
    }

    @Override // v.AbstractC2327b, s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        switch (this.f20372A) {
            case 0:
                super.d(colorFilter, cVar);
                if (colorFilter == v.f18530z) {
                    p pVar = new p(cVar, null);
                    this.f20373B = pVar;
                    pVar.a(this);
                    f((q.e) this.f20373B);
                }
                break;
            default:
                super.d(colorFilter, cVar);
                if (colorFilter == v.f18508F) {
                    this.f20376E = new p(cVar, null);
                } else if (colorFilter == v.f18511I) {
                    this.f20377F = new p(cVar, null);
                }
                break;
        }
    }

    @Override // v.AbstractC2327b, p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        switch (this.f20372A) {
            case 0:
                super.e(rectF, matrix, z4);
                ArrayList arrayList = (ArrayList) this.f20374C;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    RectF rectF2 = (RectF) this.f20375D;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    ((AbstractC2327b) arrayList.get(size)).e(rectF2, this.f20358l, true);
                    rectF.union(rectF2);
                }
                break;
            default:
                super.e(rectF, matrix, z4);
                if (s() != null) {
                    rectF.set(0.0f, 0.0f, AbstractC2544f.c() * r6.getWidth(), AbstractC2544f.c() * r6.getHeight());
                    this.f20358l.mapRect(rectF);
                }
                break;
        }
    }

    @Override // v.AbstractC2327b
    public final void j(Canvas canvas, Matrix matrix, int i) {
        switch (this.f20372A) {
            case 0:
                RectF rectF = (RectF) this.f20376E;
                C2330e c2330e = this.f20359n;
                rectF.set(0.0f, 0.0f, c2330e.f20385o, c2330e.f20386p);
                matrix.mapRect(rectF);
                boolean z4 = this.m.f18497q;
                ArrayList arrayList = (ArrayList) this.f20374C;
                boolean z5 = z4 && arrayList.size() > 1 && i != 255;
                if (z5) {
                    Paint paint = (Paint) this.f20377F;
                    paint.setAlpha(i);
                    AbstractC2544f.e(canvas, rectF, paint);
                } else {
                    canvas.save();
                }
                if (z5) {
                    i = 255;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!rectF.isEmpty() ? canvas.clipRect(rectF) : true) {
                        ((AbstractC2327b) arrayList.get(size)).g(canvas, matrix, i);
                    }
                }
                canvas.restore();
                AbstractC1876c.a();
                break;
            default:
                Bitmap bitmapS = s();
                if (bitmapS != null && !bitmapS.isRecycled()) {
                    float fC = AbstractC2544f.c();
                    C1953a c1953a = (C1953a) this.f20373B;
                    c1953a.setAlpha(i);
                    p pVar = (p) this.f20376E;
                    if (pVar != null) {
                        c1953a.setColorFilter((ColorFilter) pVar.f());
                    }
                    canvas.save();
                    canvas.concat(matrix);
                    int width = bitmapS.getWidth();
                    int height = bitmapS.getHeight();
                    Rect rect = (Rect) this.f20374C;
                    rect.set(0, 0, width, height);
                    int width2 = (int) (bitmapS.getWidth() * fC);
                    int height2 = (int) (bitmapS.getHeight() * fC);
                    Rect rect2 = (Rect) this.f20375D;
                    rect2.set(0, 0, width2, height2);
                    canvas.drawBitmap(bitmapS, rect, rect2, c1953a);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // v.AbstractC2327b
    public void p(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        switch (this.f20372A) {
            case 0:
                int i4 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) this.f20374C;
                    if (i4 < arrayList2.size()) {
                        ((AbstractC2327b) arrayList2.get(i4)).c(c2221f, i, arrayList, c2221f2);
                        i4++;
                    }
                    break;
                }
                break;
        }
    }

    @Override // v.AbstractC2327b
    public void q(boolean z4) {
        switch (this.f20372A) {
            case 0:
                super.q(z4);
                Iterator it = ((ArrayList) this.f20374C).iterator();
                while (it.hasNext()) {
                    ((AbstractC2327b) it.next()).q(z4);
                }
                break;
            default:
                super.q(z4);
                break;
        }
    }

    @Override // v.AbstractC2327b
    public void r(float f) {
        switch (this.f20372A) {
            case 0:
                super.r(f);
                q.e eVar = (q.e) this.f20373B;
                C2330e c2330e = this.f20359n;
                if (eVar != null) {
                    C1880g c1880g = this.m.f18489b;
                    f = ((((Float) eVar.f()).floatValue() * c2330e.f20379b.m) - c2330e.f20379b.f18463k) / ((c1880g.f18464l - c1880g.f18463k) + 0.01f);
                }
                if (((q.e) this.f20373B) == null) {
                    C1880g c1880g2 = c2330e.f20379b;
                    f -= c2330e.f20384n / (c1880g2.f18464l - c1880g2.f18463k);
                }
                if (c2330e.m != 0.0f) {
                    if (!numX49.tnTj78("bL9V").equals(c2330e.c)) {
                        f /= c2330e.m;
                    }
                }
                ArrayList arrayList = (ArrayList) this.f20374C;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((AbstractC2327b) arrayList.get(size)).r(f);
                }
                break;
            default:
                super.r(f);
                break;
        }
    }

    public Bitmap s() {
        C2179a c2179a;
        Bitmap bitmap;
        p pVar = (p) this.f20377F;
        if (pVar != null && (bitmap = (Bitmap) pVar.f()) != null) {
            return bitmap;
        }
        String str = this.f20359n.f20381g;
        s sVar = this.m;
        if (sVar.getCallback() == null) {
            c2179a = null;
        } else {
            C2179a c2179a2 = sVar.i;
            if (c2179a2 != null) {
                Drawable.Callback callback = sVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                Context context2 = c2179a2.f19823a;
                if ((context != null || context2 != null) && !context2.equals(context)) {
                    sVar.i = null;
                }
            }
            if (sVar.i == null) {
                sVar.i = new C2179a(sVar.getCallback(), sVar.j, sVar.f18489b.f18461d);
            }
            c2179a = sVar.i;
        }
        if (c2179a != null) {
            String str2 = c2179a.f19824b;
            t tVar = (t) c2179a.c.get(str);
            if (tVar != null) {
                Bitmap bitmap2 = tVar.f18502d;
                if (bitmap2 != null) {
                    return bitmap2;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String strTnTj78 = numX49.tnTj78("bL9S");
                String str3 = tVar.c;
                if (!str3.startsWith(strTnTj78) || str3.indexOf(numX49.tnTj78("bL9j")) <= 0) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                        }
                        try {
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c2179a.f19823a.getAssets().open(str2 + str3), null, options);
                            int i = tVar.f18500a;
                            int i4 = tVar.f18501b;
                            C0600d c0600d = AbstractC2544f.f21341a;
                            if (bitmapDecodeStream.getWidth() != i || bitmapDecodeStream.getHeight() != i4) {
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, i, i4, true);
                                bitmapDecodeStream.recycle();
                                bitmapDecodeStream = bitmapCreateScaledBitmap;
                            }
                            c2179a.a(str, bitmapDecodeStream);
                            return bitmapDecodeStream;
                        } catch (IllegalArgumentException e) {
                            AbstractC2540b.c(numX49.tnTj78("bL9i"), e);
                        }
                    } catch (IOException e7) {
                        AbstractC2540b.c(numX49.tnTj78("bL9E"), e7);
                    }
                } else {
                    try {
                        byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        synchronized (C2179a.f19822d) {
                            ((t) c2179a.c.get(str)).f18502d = bitmapDecodeByteArray;
                        }
                        return bitmapDecodeByteArray;
                    } catch (IllegalArgumentException e10) {
                        AbstractC2540b.c(numX49.tnTj78("bL9d"), e10);
                    }
                }
            }
        } else {
            C1880g c1880g = sVar.f18489b;
            t tVar2 = c1880g == null ? null : (t) c1880g.f18461d.get(str);
            if (tVar2 != null) {
                return tVar2.f18502d;
            }
        }
        return null;
    }

    public C2328c(s sVar, C2330e c2330e, List list, C1880g c1880g) {
        AbstractC2327b abstractC2327b;
        AbstractC2327b c2328c;
        String strTnTj78;
        super(sVar, c2330e);
        this.f20374C = new ArrayList();
        this.f20375D = new RectF();
        this.f20376E = new RectF();
        this.f20377F = new Paint();
        C2265b c2265b = c2330e.f20389s;
        if (c2265b != null) {
            q.e eVarF = c2265b.f();
            this.f20373B = eVarF;
            f(eVarF);
            ((q.e) this.f20373B).a(this);
        } else {
            this.f20373B = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(c1880g.i.size());
        int size = list.size() - 1;
        AbstractC2327b abstractC2327b2 = null;
        while (true) {
            if (size >= 0) {
                C2330e c2330e2 = (C2330e) list.get(size);
                int iC = AbstractC2217b.c(c2330e2.e);
                if (iC == 0) {
                    c2328c = new C2328c(sVar, c2330e2, (List) c1880g.c.get(c2330e2.f20381g), c1880g);
                } else if (iC == 1) {
                    c2328c = new h(sVar, c2330e2);
                } else if (iC == 2) {
                    c2328c = new C2328c(sVar, c2330e2);
                } else if (iC == 3) {
                    c2328c = new C2331f(sVar, c2330e2);
                } else if (iC == 4) {
                    c2328c = new C2332g(sVar, c2330e2, this);
                } else if (iC != 5) {
                    switch (c2330e2.e) {
                        case 1:
                            strTnTj78 = numX49.tnTj78("bL9B");
                            break;
                        case 2:
                            strTnTj78 = numX49.tnTj78("bL9k");
                            break;
                        case 3:
                            strTnTj78 = numX49.tnTj78("bL9Z");
                            break;
                        case 4:
                            strTnTj78 = numX49.tnTj78("bL9r");
                            break;
                        case 5:
                            strTnTj78 = numX49.tnTj78("bL9L");
                            break;
                        case 6:
                            strTnTj78 = numX49.tnTj78("bL92");
                            break;
                        case 7:
                            strTnTj78 = numX49.tnTj78("bL9b");
                            break;
                        default:
                            strTnTj78 = numX49.tnTj78("bL9P");
                            break;
                    }
                    AbstractC2540b.b(numX49.tnTj78("bL9u").concat(strTnTj78));
                    c2328c = null;
                } else {
                    c2328c = new i(sVar, c2330e2);
                }
                if (c2328c != null) {
                    longSparseArray.put(c2328c.f20359n.f20380d, c2328c);
                    if (abstractC2327b2 != null) {
                        abstractC2327b2.f20362q = c2328c;
                        abstractC2327b2 = null;
                    } else {
                        ((ArrayList) this.f20374C).add(0, c2328c);
                        int iC2 = AbstractC2217b.c(c2330e2.f20391u);
                        if (iC2 == 1 || iC2 == 2) {
                            abstractC2327b2 = c2328c;
                        }
                    }
                }
                size--;
            } else {
                for (int i = 0; i < longSparseArray.size(); i++) {
                    AbstractC2327b abstractC2327b3 = (AbstractC2327b) longSparseArray.get(longSparseArray.keyAt(i));
                    if (abstractC2327b3 != null && (abstractC2327b = (AbstractC2327b) longSparseArray.get(abstractC2327b3.f20359n.f)) != null) {
                        abstractC2327b3.f20363r = abstractC2327b;
                    }
                }
                return;
            }
        }
    }
}
