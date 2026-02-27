package We;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: We.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0598b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f6378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f6379b;
    public final C0597a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6380d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6381g;
    public final AbstractC0598b h;
    public boolean i;
    public boolean j;

    public AbstractC0598b(A a8, Object obj, F f, int i, int i4, int i6, String str) {
        this.f6378a = a8;
        this.f6379b = f;
        this.c = obj == null ? null : new C0597a(this, obj, a8.h);
        this.f6380d = i;
        this.e = i4;
        this.f = i6;
        this.f6381g = str;
        this.h = this;
    }

    public void a() {
        this.j = true;
    }

    public abstract void b(Bitmap bitmap, int i);

    public abstract void c(Exception exc);

    public final Object d() {
        C0597a c0597a = this.c;
        if (c0597a == null) {
            return null;
        }
        return c0597a.get();
    }
}
