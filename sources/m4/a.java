package M4;

import Q4.B;
import Q4.C0558b;
import Q4.C0560d;
import Q4.C0562f;
import Q4.C0564h;
import Q4.C0566j;
import Q4.C0568l;
import Q4.C0570n;
import Q4.D;
import Q4.G;
import Q4.I;
import Q4.K;
import Q4.N;
import Q4.p;
import Q4.r;
import Q4.u;
import Q4.w;
import Q4.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i) {
        super(0);
        this.f3059a = i;
        this.f3060b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3059a) {
            case 0:
                return new C0558b(this.f3060b.f3061a);
            case 1:
                return new C0560d(this.f3060b.f3061a);
            case 2:
                return new C0562f(this.f3060b.f3061a);
            case 3:
                return new C0564h(this.f3060b.f3061a);
            case 4:
                return new C0566j(this.f3060b.f3061a);
            case 5:
                b bVar = this.f3060b;
                return new C0568l(bVar.f3061a, bVar.f3062b, bVar.c, bVar.f3063d, bVar.e, bVar.f);
            case 6:
                b bVar2 = this.f3060b;
                return new C0570n(bVar2.f3061a, bVar2.f3062b, bVar2.c, bVar2.f3063d, bVar2.e, bVar2.f);
            case 7:
                return new p(this.f3060b.f3061a);
            case 8:
                return new r(this.f3060b.f3061a);
            case 9:
                return new u(this.f3060b.f3061a);
            case 10:
                return new w(this.f3060b.f3061a);
            case 11:
                return new y(this.f3060b.f3061a);
            case 12:
                return new B(this.f3060b.f3061a);
            case 13:
                return new D(this.f3060b.f3061a);
            case 14:
                return new G(this.f3060b.f3061a);
            case 15:
                return new I(this.f3060b.f3061a);
            case 16:
                b bVar3 = this.f3060b;
                return new K(bVar3.f3061a, bVar3.f3064g);
            default:
                return new N(this.f3060b.f3061a);
        }
    }
}
