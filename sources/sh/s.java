package sh;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f20111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20112b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f20113d;

    public s(Runnable runnable, Long l6, int i) {
        this.f20111a = runnable;
        this.f20112b = l6.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        long j = sVar.f20112b;
        long j6 = this.f20112b;
        int i = j6 < j ? -1 : j6 > j ? 1 : 0;
        if (i != 0) {
            return i;
        }
        int i4 = this.c;
        int i6 = sVar.c;
        if (i4 < i6) {
            return -1;
        }
        return i4 > i6 ? 1 : 0;
    }
}
