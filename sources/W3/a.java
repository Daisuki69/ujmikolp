package W3;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(K3.a aVar, int i) {
        super(aVar);
        this.f6230d = i;
    }

    @Override // Ng.j
    public final String b() throws NotFoundException {
        if (((K3.a) this.f4431b).f2588b != 60) {
            throw NotFoundException.c;
        }
        StringBuilder sb2 = new StringBuilder();
        c(5, sb2);
        g(sb2, 45, 15);
        return sb2.toString();
    }

    @Override // W3.e
    public final void e(int i, StringBuilder sb2) {
        switch (this.f6230d) {
            case 0:
                sb2.append("(3103)");
                break;
            default:
                if (i >= 10000) {
                    sb2.append("(3203)");
                } else {
                    sb2.append("(3202)");
                }
                break;
        }
    }

    @Override // W3.e
    public final int f(int i) {
        switch (this.f6230d) {
            case 0:
                return i;
            default:
                return i < 10000 ? i : i - 10000;
        }
    }
}
