package n;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import v.C2330e;
import z.AbstractC2540b;

/* JADX INFO: renamed from: n.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1880g {
    public HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f18461d;
    public HashMap e;
    public ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArrayCompat f18462g;
    public LongSparseArray h;
    public ArrayList i;
    public Rect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18464l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18465n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f18459a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f18460b = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18466o = 0;

    public final void a(String str) {
        AbstractC2540b.b(str);
        this.f18460b.add(str);
    }

    public final float b() {
        return (long) (((this.f18464l - this.f18463k) / this.m) * 1000.0f);
    }

    public final s.i c(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            s.i iVar = (s.i) this.f.get(i);
            String str2 = iVar.f19979a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith(numX49.tnTj78("b24Q")) && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return iVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("b24t"));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            sb2.append(((C2330e) it.next()).a(numX49.tnTj78("b24U")));
        }
        return sb2.toString();
    }
}
