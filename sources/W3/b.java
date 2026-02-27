package W3;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(K3.a aVar, int i) {
        super(aVar);
        this.f6231d = i;
    }

    @Override // Ng.j
    public final String b() throws NotFoundException {
        switch (this.f6231d) {
            case 0:
                if (((K3.a) this.f4431b).f2588b < 48) {
                    throw NotFoundException.c;
                }
                StringBuilder sb2 = new StringBuilder();
                c(8, sb2);
                U8.c cVar = (U8.c) this.c;
                int iM = U8.c.m(48, 2, (K3.a) cVar.f5964b);
                sb2.append("(392");
                sb2.append(iM);
                sb2.append(')');
                sb2.append(cVar.i(50, null).f6234b);
                return sb2.toString();
            case 1:
                if (((K3.a) this.f4431b).f2588b < 48) {
                    throw NotFoundException.c;
                }
                StringBuilder sb3 = new StringBuilder();
                c(8, sb3);
                U8.c cVar2 = (U8.c) this.c;
                int iM2 = U8.c.m(48, 2, (K3.a) cVar2.f5964b);
                sb3.append("(393");
                sb3.append(iM2);
                sb3.append(')');
                int iM3 = U8.c.m(50, 10, (K3.a) cVar2.f5964b);
                if (iM3 / 100 == 0) {
                    sb3.append('0');
                }
                if (iM3 / 10 == 0) {
                    sb3.append('0');
                }
                sb3.append(iM3);
                sb3.append(cVar2.i(60, null).f6234b);
                return sb3.toString();
            default:
                StringBuilder sbW = androidx.camera.core.impl.a.w("(01)");
                int length = sbW.length();
                U8.c cVar3 = (U8.c) this.c;
                sbW.append(U8.c.m(4, 4, (K3.a) cVar3.f5964b));
                d(sbW, 8, length);
                return cVar3.g(48, sbW);
        }
    }
}
