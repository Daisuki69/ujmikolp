package k2;

import d4.AbstractC1331a;

/* JADX INFO: loaded from: classes2.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17904b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17905d;
    public int e;
    public byte f;

    public final Z a() {
        String str;
        if (this.f == 7 && (str = this.f17904b) != null) {
            return new Z(str, this.e, this.f17903a, this.f17905d, this.c);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f17904b == null) {
            sb2.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
