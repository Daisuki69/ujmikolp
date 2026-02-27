package Nh;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f4491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4492b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f4493d;

    public v(Runnable runnable, Long l6, int i) {
        this.f4491a = runnable;
        this.f4492b = l6.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int iCompare = Long.compare(this.f4492b, vVar.f4492b);
        return iCompare == 0 ? Integer.compare(this.c, vVar.c) : iCompare;
    }
}
