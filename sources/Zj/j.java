package zj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21482b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21483d;
    public int e;

    public j(String string) {
        kotlin.jvm.internal.j.g(string, "string");
        this.f21481a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4;
        int i6 = this.f21482b;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.e < 0) {
            this.f21482b = 2;
            return false;
        }
        String str = this.f21481a;
        int length = str.length();
        int length2 = str.length();
        for (int i10 = this.c; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i4 = i10 + 1) < str.length() && str.charAt(i4) == '\n') ? 2 : 1;
                length = i10;
                this.f21482b = 1;
                this.e = i;
                this.f21483d = length;
                return true;
            }
        }
        i = -1;
        this.f21482b = 1;
        this.e = i;
        this.f21483d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f21482b = 0;
        int i = this.f21483d;
        int i4 = this.c;
        this.c = this.e + i;
        return this.f21481a.subSequence(i4, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
