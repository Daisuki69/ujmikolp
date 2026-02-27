package uj;

import java.util.Random;

/* JADX INFO: renamed from: uj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2322a extends AbstractC2324c {
    @Override // uj.AbstractC2324c
    public final int a(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // uj.AbstractC2324c
    public final float b() {
        return f().nextFloat();
    }

    @Override // uj.AbstractC2324c
    public final int c() {
        return f().nextInt();
    }

    @Override // uj.AbstractC2324c
    public final int d(int i) {
        return f().nextInt(i);
    }

    public abstract Random f();
}
