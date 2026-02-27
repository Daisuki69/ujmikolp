package nj;

import cj.C1128n;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18747b;
    public final /* synthetic */ C1128n c;

    public m(C1128n c1128n) {
        this.c = c1128n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f18746a == null && !this.f18747b) {
            String line = ((BufferedReader) this.c.f9395b).readLine();
            this.f18746a = line;
            if (line == null) {
                this.f18747b = true;
            }
        }
        return this.f18746a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f18746a;
        this.f18746a = null;
        kotlin.jvm.internal.j.d(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
