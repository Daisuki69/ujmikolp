package We;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import dOYHB6.tiZVw8.numX49;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class A {
    public static final y i = new y(Looper.getMainLooper(), 0);
    public static volatile A j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6342b;
    public final Si.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T3.l f6343d;
    public final I e;
    public final WeakHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakHashMap f6344g;
    public final ReferenceQueue h;

    public A(Context context, Si.b bVar, T3.l lVar, I i4) {
        this.f6342b = context;
        this.c = bVar;
        this.f6343d = lVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new C0606j(context, 1));
        arrayList.add(new C0605i(context));
        arrayList.add(new t(context, 0));
        arrayList.add(new C0606j(context, 0));
        arrayList.add(new C0599c(context));
        arrayList.add(new t(context, 1));
        arrayList.add(new w((x) bVar.f5730d, i4));
        this.f6341a = Collections.unmodifiableList(arrayList);
        this.e = i4;
        this.f = new WeakHashMap();
        this.f6344g = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.h = referenceQueue;
        new z(referenceQueue, i).start();
    }

    public static A d() {
        if (j == null) {
            synchronized (A.class) {
                try {
                    if (j == null) {
                        Context context = PicassoProvider.f15517a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        Context applicationContext = context.getApplicationContext();
                        x xVar = new x(applicationContext);
                        T3.l lVar = new T3.l(applicationContext);
                        D d10 = new D(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new N());
                        I i4 = new I(lVar);
                        j = new A(applicationContext, new Si.b(applicationContext, d10, i, xVar, lVar, i4), lVar, i4);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final void a(Object obj) {
        O.a();
        AbstractC0598b abstractC0598b = (AbstractC0598b) this.f.remove(obj);
        if (abstractC0598b != null) {
            abstractC0598b.a();
            HandlerC0609m handlerC0609m = (HandlerC0609m) this.c.i;
            handlerC0609m.sendMessage(handlerC0609m.obtainMessage(2, abstractC0598b));
        }
        if (obj instanceof ImageView) {
            ViewTreeObserverOnPreDrawListenerC0607k viewTreeObserverOnPreDrawListenerC0607k = (ViewTreeObserverOnPreDrawListenerC0607k) this.f6344g.remove((ImageView) obj);
            if (viewTreeObserverOnPreDrawListenerC0607k != null) {
                viewTreeObserverOnPreDrawListenerC0607k.f6407a.getClass();
                viewTreeObserverOnPreDrawListenerC0607k.c = null;
                WeakReference weakReference = viewTreeObserverOnPreDrawListenerC0607k.f6408b;
                ImageView imageView = (ImageView) weakReference.get();
                if (imageView == null) {
                    return;
                }
                weakReference.clear();
                imageView.removeOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0607k);
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0607k);
                }
            }
        }
    }

    public final void b(Bitmap bitmap, int i4, AbstractC0598b abstractC0598b, Exception exc) {
        if (abstractC0598b.j) {
            return;
        }
        if (!abstractC0598b.i) {
            this.f.remove(abstractC0598b.d());
        }
        if (bitmap == null) {
            abstractC0598b.c(exc);
        } else {
            if (i4 == 0) {
                throw new AssertionError(numX49.tnTj78("bkRP9"));
            }
            abstractC0598b.b(bitmap, i4);
        }
    }

    public final void c(AbstractC0598b abstractC0598b) {
        Object objD = abstractC0598b.d();
        if (objD != null) {
            WeakHashMap weakHashMap = this.f;
            if (weakHashMap.get(objD) != abstractC0598b) {
                a(objD);
                weakHashMap.put(objD, abstractC0598b);
            }
        }
        HandlerC0609m handlerC0609m = (HandlerC0609m) this.c.i;
        handlerC0609m.sendMessage(handlerC0609m.obtainMessage(1, abstractC0598b));
    }

    public final void e(String str) {
        Uri uri;
        if (str == null || (uri = Uri.parse(str)) == null) {
            return;
        }
        String string = uri.toString();
        p pVar = (p) this.f6343d.f5786b;
        for (String str2 : pVar.snapshot().keySet()) {
            if (str2.startsWith(string) && str2.length() > string.length() && str2.charAt(string.length()) == '\n') {
                pVar.remove(str2);
            }
        }
    }

    public final G f(int i4) {
        if (i4 != 0) {
            return new G(this, null, i4);
        }
        throw new IllegalArgumentException(numX49.tnTj78("bkRPP"));
    }

    public final G g(Uri uri) {
        return new G(this, uri, 0);
    }

    public final G h(String str) {
        if (str == null) {
            return new G(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return g(Uri.parse(str));
        }
        throw new IllegalArgumentException(numX49.tnTj78("bkRPb"));
    }

    public final Bitmap i(String str) {
        q qVar = (q) ((p) this.f6343d.f5786b).get(str);
        Bitmap bitmap = qVar != null ? qVar.f6415a : null;
        I i4 = this.e;
        if (bitmap != null) {
            i4.f6363b.sendEmptyMessage(0);
            return bitmap;
        }
        i4.f6363b.sendEmptyMessage(1);
        return bitmap;
    }
}
