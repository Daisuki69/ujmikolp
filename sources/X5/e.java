package X5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e extends i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6538a = new e(0, f.class, "disposeUserClient", "disposeUserClient()V", 1);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Oh.c cVar = f.f6540b;
        if (cVar != null) {
            Ph.d.a(cVar);
        }
        f.f6540b = null;
        return Unit.f18162a;
    }
}
