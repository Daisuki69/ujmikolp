package wj;

import cj.AbstractC1131q;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: wj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2441a extends AbstractC1131q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20798b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20799d;

    public C2441a(char c, char c10, int i) {
        this.f20797a = i;
        this.f20798b = c10;
        boolean z4 = false;
        if (i <= 0 ? j.i(c, c10) >= 0 : j.i(c, c10) <= 0) {
            z4 = true;
        }
        this.c = z4;
        this.f20799d = z4 ? c : c10;
    }

    @Override // cj.AbstractC1131q
    public final char a() {
        int i = this.f20799d;
        if (i != this.f20798b) {
            this.f20799d = this.f20797a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }
}
