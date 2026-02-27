package ak;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7241a = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Zj.a it = (Zj.a) obj;
        j.g(it, "it");
        return Boolean.valueOf(it.h <= 0);
    }
}
