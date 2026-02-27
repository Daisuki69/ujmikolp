package wj;

import cj.I;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20801b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20802d;

    public e(int i, int i4, int i6) {
        this.f20800a = i6;
        this.f20801b = i4;
        boolean z4 = false;
        if (i6 <= 0 ? i >= i4 : i <= i4) {
            z4 = true;
        }
        this.c = z4;
        this.f20802d = z4 ? i : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // cj.I
    public final int nextInt() {
        int i = this.f20802d;
        if (i != this.f20801b) {
            this.f20802d = this.f20800a + i;
            return i;
        }
        if (!this.c) {
            throw new NoSuchElementException();
        }
        this.c = false;
        return i;
    }
}
