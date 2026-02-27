package Cg;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg.a f770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f771b;
    public final Function1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f772d;

    public d(Rg.a key, Object config, Function1 function1) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(config, "config");
        this.f770a = key;
        this.f771b = config;
        this.c = function1;
        this.f772d = new A5.j(3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f772d.invoke();
    }
}
