package k2;

import d4.AbstractC1331a;
import java.util.List;

/* JADX INFO: renamed from: k2.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1694D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17840b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17841d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17842g;
    public String h;
    public List i;
    public byte j;

    public final C1695E a() {
        String str;
        if (this.j == 63 && (str = this.f17840b) != null) {
            return new C1695E(this.f17839a, str, this.c, this.f17841d, this.e, this.f, this.f17842g, this.h, this.i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f17840b == null) {
            sb2.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }
}
