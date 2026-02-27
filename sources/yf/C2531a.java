package yf;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2531a extends b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21151a = new ArrayList();

    public final void f(b bVar) {
        this.f21151a.add(bVar);
    }

    public final b g(int i) {
        return (b) this.f21151a.get(i);
    }

    public final int i(int i, int i4) {
        ArrayList arrayList = this.f21151a;
        if (i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if (obj instanceof l) {
                return ((l) obj).i();
            }
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f21151a.iterator();
    }

    public final b k(int i) {
        b bVar = (b) this.f21151a.get(i);
        if (bVar instanceof m) {
            bVar = ((m) bVar).f21270a;
        }
        if (bVar instanceof k) {
            return null;
        }
        return bVar;
    }

    public final b m(int i) {
        return (b) this.f21151a.remove(i);
    }

    public final boolean q(b bVar) {
        return this.f21151a.remove(bVar);
    }

    public final float[] r() {
        int size = this.f21151a.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            b bVarK = k(i);
            fArr[i] = bVarK instanceof l ? ((l) bVarK).f() : 0.0f;
        }
        return fArr;
    }

    public final String toString() {
        return "COSArray{" + this.f21151a + "}";
    }
}
