package X5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6537a = new d(0, f.class, "disposeAnonymousClient", "disposeAnonymousClient()V", 1);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Oh.c cVar = f.f6539a;
        if (cVar != null) {
            Ph.d.a(cVar);
        }
        f.f6539a = null;
        return Unit.f18162a;
    }
}
