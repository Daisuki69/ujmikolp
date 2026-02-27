package N1;

import G6.w;
import java.util.Iterator;
import java.util.NoSuchElementException;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3500b;
    public final CharSequence c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f3501d;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f3502g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3499a = 2;
    public int e = 0;

    public m(w wVar, n nVar, CharSequence charSequence) {
        this.f3502g = wVar;
        this.f3501d = nVar.f3503a;
        this.f = nVar.c;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i = this.f3499a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iC = AbstractC2217b.c(i);
        if (iC == 0) {
            return true;
        }
        if (iC == 2) {
            return false;
        }
        this.f3499a = 4;
        int i4 = this.e;
        while (true) {
            int length = this.e;
            if (length == -1) {
                this.f3499a = 3;
                string = null;
                break;
            }
            c cVar = (c) this.f3502g.f1822b;
            CharSequence charSequence = this.c;
            int length2 = charSequence.length();
            qk.i.n(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (cVar.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.e = -1;
            } else {
                this.e = length + 1;
            }
            int i6 = this.e;
            if (i6 == i4) {
                int i10 = i6 + 1;
                this.e = i10;
                if (i10 > charSequence.length()) {
                    this.e = -1;
                }
            } else {
                d dVar = this.f3501d;
                if (i4 < length) {
                    charSequence.charAt(i4);
                    dVar.getClass();
                }
                if (length > i4) {
                    charSequence.charAt(length - 1);
                    dVar.getClass();
                }
                int i11 = this.f;
                if (i11 == 1) {
                    length = charSequence.length();
                    this.e = -1;
                    if (length > i4) {
                        charSequence.charAt(length - 1);
                        dVar.getClass();
                    }
                } else {
                    this.f = i11 - 1;
                }
                string = charSequence.subSequence(i4, length).toString();
            }
        }
        this.f3500b = string;
        if (this.f3499a == 3) {
            return false;
        }
        this.f3499a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3499a = 2;
        String str = this.f3500b;
        this.f3500b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
