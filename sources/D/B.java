package D;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC0173f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f798v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static WeakReference f799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static int f800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static int f801y;
    public long c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f802d = false;
    public final Object e = new Object();
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f803g = false;
    public boolean h = true;
    public boolean i = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f804k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f805l = false;
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f806n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f807o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f808p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f809q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f810r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f811s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f812t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f813u = false;

    public static Activity f() {
        WeakReference weakReference = f799w;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final synchronized void b() {
        this.f811s = null;
    }

    public final synchronized void c() {
        this.f810r = null;
    }

    public final synchronized void d() {
        this.f812t = null;
    }

    public final synchronized String e() {
        return this.f811s;
    }

    public final boolean g() {
        boolean z4;
        synchronized (this.f806n) {
            z4 = this.h;
        }
        return z4;
    }

    public final synchronized String h() {
        return this.f809q;
    }

    public final boolean i() {
        boolean z4;
        synchronized (this.e) {
            z4 = this.f802d;
        }
        return z4;
    }

    public final void j(boolean z4) {
        synchronized (this.e) {
            this.f802d = z4;
        }
    }

    public final synchronized void k(String str) {
        if (this.f811s == null) {
            this.f811s = str;
        }
    }

    public final void l(boolean z4) {
        synchronized (this.f806n) {
            this.f803g = z4;
        }
    }

    public final synchronized void m(String str) {
        if (this.f810r == null) {
            this.f810r = str;
        }
    }

    public final synchronized void n(String str) {
        if (this.f809q == null) {
            this.f809q = str;
        }
    }

    public final synchronized void o(JSONObject jSONObject) {
        if (this.f812t == null) {
            this.f812t = jSONObject;
        }
    }
}
