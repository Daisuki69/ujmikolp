package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f18165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f18166b;

    public b(f baseKey, Function1 function1) {
        j.g(baseKey, "baseKey");
        this.f18165a = function1;
        this.f18166b = baseKey instanceof b ? ((b) baseKey).f18166b : baseKey;
    }
}
