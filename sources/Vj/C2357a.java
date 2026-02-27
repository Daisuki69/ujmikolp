package vj;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.j;
import uj.AbstractC2322a;

/* JADX INFO: renamed from: vj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2357a extends AbstractC2322a {
    @Override // uj.AbstractC2324c
    public final int e(int i, int i4) {
        return ThreadLocalRandom.current().nextInt(i, i4);
    }

    @Override // uj.AbstractC2322a
    public final Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        j.f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
