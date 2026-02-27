package wg;

import Bj.H;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2438a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20782a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f20783b;

    public /* synthetic */ C2438a(c cVar) {
        this.f20783b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f20782a) {
            case 0:
                if (th2 != null) {
                    H.i(this.f20783b.f20787a, null);
                }
                break;
            default:
                if (th2 != null) {
                    this.f20783b.j.j(Lg.a.e);
                }
                break;
        }
        return Unit.f18162a;
    }

    public /* synthetic */ C2438a(c cVar, Kg.c cVar2) {
        this.f20783b = cVar;
    }
}
