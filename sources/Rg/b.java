package Rg;

import io.ktor.utils.io.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.k f5525b;
    public final /* synthetic */ io.ktor.utils.io.k c;

    public /* synthetic */ b(io.ktor.utils.io.k kVar, io.ktor.utils.io.k kVar2, int i) {
        this.f5524a = i;
        this.f5525b = kVar;
        this.c = kVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f5524a) {
            case 0:
                if (th2 != null) {
                    z.a(this.f5525b, th2);
                    z.a(this.c, th2);
                }
                break;
            default:
                if (th2 != null) {
                    this.f5525b.a(th2);
                    this.c.a(th2);
                }
                break;
        }
        return Unit.f18162a;
    }
}
