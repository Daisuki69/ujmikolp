package We;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class G {
    public static final AtomicInteger i = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f6358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f6359b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6360d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6361g;
    public Drawable h;

    public G(A a8, Uri uri, int i4) {
        a8.getClass();
        this.f6358a = a8;
        E e = new E();
        e.f6353g = uri;
        e.f6350a = i4;
        this.f6359b = e;
    }

    public final F a(long j) {
        i.getAndIncrement();
        E e = this.f6359b;
        if (e.f6351b && e.c == 0 && e.f6352d == 0) {
            throw new IllegalStateException(numX49.tnTj78("bkRw"));
        }
        if (e.f == 0) {
            e.f = 2;
        }
        F f = new F((Uri) e.f6353g, e.f6350a, (ArrayList) e.h, e.c, e.f6352d, e.f6351b, e.e, e.f);
        this.f6358a.getClass();
        return f;
    }

    public final void b(int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bkRc"));
        }
        this.e = i4;
    }

    public final Drawable c() {
        int i4 = this.f6360d;
        return i4 != 0 ? this.f6358a.f6342b.getDrawable(i4) : this.h;
    }

    public final void d(K k8) {
        Bitmap bitmapI;
        long jNanoTime = System.nanoTime();
        O.a();
        if (this.c) {
            throw new IllegalStateException(numX49.tnTj78("bkRm"));
        }
        E e = this.f6359b;
        boolean z4 = (((Uri) e.f6353g) == null && e.f6350a == 0) ? false : true;
        A a8 = this.f6358a;
        if (!z4) {
            a8.a(k8);
            k8.c(c());
            return;
        }
        F fA = a(jNanoTime);
        String strB = O.b(fA);
        if ((this.f & 1) != 0 || (bitmapI = a8.i(strB)) == null) {
            k8.c(c());
            a8.c(new L(this.f6358a, k8, fA, this.f, this.f6361g, this.e, strB));
        } else {
            a8.a(k8);
            k8.a(bitmapI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ImageView imageView, InterfaceC0604h interfaceC0604h) {
        Bitmap bitmapI;
        long jNanoTime = System.nanoTime();
        O.a();
        if (imageView == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bkRh"));
        }
        E e = this.f6359b;
        Uri uri = (Uri) e.f6353g;
        A a8 = this.f6358a;
        if (uri == null && e.f6350a == 0) {
            a8.a(imageView);
            B.a(imageView, c());
            return;
        }
        if (this.c) {
            if (e.c != 0 || e.f6352d != 0) {
                throw new IllegalStateException(numX49.tnTj78("bkRD"));
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                B.a(imageView, c());
                ViewTreeObserverOnPreDrawListenerC0607k viewTreeObserverOnPreDrawListenerC0607k = new ViewTreeObserverOnPreDrawListenerC0607k(this, imageView, interfaceC0604h);
                WeakHashMap weakHashMap = a8.f6344g;
                if (weakHashMap.containsKey(imageView)) {
                    a8.a(imageView);
                }
                weakHashMap.put(imageView, viewTreeObserverOnPreDrawListenerC0607k);
                return;
            }
            e.f(width, height);
        }
        F fA = a(jNanoTime);
        String strB = O.b(fA);
        if ((this.f & 1) != 0 || (bitmapI = a8.i(strB)) == null) {
            B.a(imageView, c());
            C0611o c0611o = new C0611o(this.f6358a, imageView, fA, this.f, this.f6361g, this.e, strB);
            c0611o.f6413k = interfaceC0604h;
            a8.c(c0611o);
            return;
        }
        a8.a(imageView);
        Context context = a8.f6342b;
        int i4 = B.e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new B(context, bitmapI, drawable, 1));
        a8.getClass();
        if (interfaceC0604h != null) {
            interfaceC0604h.onSuccess();
        }
    }

    public final void f(int... iArr) {
        this.f |= 1;
        if (iArr.length > 0) {
            for (int i4 : iArr) {
                if (i4 == 0) {
                    throw new IllegalArgumentException(numX49.tnTj78("bkRM"));
                }
                int i6 = this.f;
                int i10 = 1;
                if (i4 != 1) {
                    i10 = 2;
                    if (i4 != 2) {
                        throw null;
                    }
                }
                this.f = i6 | i10;
            }
        }
    }

    public final void g(int... iArr) {
        this.f6361g |= 1;
        if (iArr.length > 0) {
            for (int i4 : iArr) {
                if (i4 == 0) {
                    throw new IllegalArgumentException(numX49.tnTj78("bkRN"));
                }
                int i6 = this.f6361g;
                int i10 = 1;
                if (i4 != 1) {
                    i10 = 2;
                    if (i4 == 2) {
                        continue;
                    } else {
                        if (i4 != 3) {
                            throw null;
                        }
                        i10 = 4;
                    }
                }
                this.f6361g = i6 | i10;
            }
        }
    }

    public final void h(int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException(numX49.tnTj78("bkRa"));
        }
        if (this.h != null) {
            throw new IllegalStateException(numX49.tnTj78("bkR6"));
        }
        this.f6360d = i4;
    }

    public final void i(M m) {
        E e = this.f6359b;
        if (((ArrayList) e.h) == null) {
            e.h = new ArrayList(2);
        }
        ((ArrayList) e.h).add(m);
    }
}
