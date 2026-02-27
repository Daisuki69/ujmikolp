package F3;

import C3.l;
import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1542b;
    public int c;

    public l a() {
        return new l(this.f1542b, this.c);
    }

    public String toString() {
        switch (this.f1541a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("<");
                sb2.append(this.f1542b);
                sb2.append(' ');
                return s.m(sb2, this.c, '>');
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb3 = new StringBuilder("GridSize{rows=");
                sb3.append(this.f1542b);
                sb3.append(", cols=");
                return s.m(sb3, this.c, '}');
            case 3:
                StringBuilder sb4 = new StringBuilder("Holder{row=");
                sb4.append(this.f1542b);
                sb4.append(", col=");
                return s.m(sb4, this.c, '}');
        }
    }

    public /* synthetic */ a(int i, int i4, int i6) {
        this.f1541a = i6;
        this.f1542b = i;
        this.c = i4;
    }
}
