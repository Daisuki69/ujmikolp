package hf;

import com.google.firebase.messaging.r;
import df.C1356B;
import df.C1365g;
import df.InterfaceC1360b;
import df.InterfaceC1361c;
import gf.k;
import java.util.ArrayList;

/* JADX INFO: renamed from: hf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1564b implements InterfaceC1360b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f17034b;
    public final r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17035d;
    public final C1365g e;
    public final C1356B f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17036g;
    public final int h;
    public final int i;
    public int j;

    public C1564b(ArrayList arrayList, k kVar, r rVar, int i, C1365g c1365g, C1356B c1356b, int i4, int i6, int i10) {
        this.f17033a = arrayList;
        this.f17034b = kVar;
        this.c = rVar;
        this.f17035d = i;
        this.e = c1365g;
        this.f = c1356b;
        this.f17036g = i4;
        this.h = i6;
        this.i = i10;
    }

    public final df.k a(C1365g c1365g) {
        return b(c1365g, this.f17034b, this.c);
    }

    public final df.k b(C1365g c1365g, k kVar, r rVar) {
        ArrayList arrayList = this.f17033a;
        int size = arrayList.size();
        int i = this.f17035d;
        if (i >= size) {
            throw new AssertionError();
        }
        this.j++;
        r rVar2 = this.c;
        if (rVar2 != null && !((InterfaceC1565c) rVar2.e).connection().i(c1365g.f16439a)) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port");
        }
        if (rVar2 != null && this.j > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once");
        }
        int i4 = i + 1;
        C1564b c1564b = new C1564b(arrayList, kVar, rVar, i4, c1365g, this.f, this.f17036g, this.h, this.i);
        InterfaceC1361c interfaceC1361c = (InterfaceC1361c) arrayList.get(i);
        df.k kVarIntercept = interfaceC1361c.intercept(c1564b);
        if (rVar != null && i4 < arrayList.size() && c1564b.j != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC1361c + " must call proceed() exactly once");
        }
        if (kVarIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC1361c + " returned null");
        }
        if (kVarIntercept.f16453g != null) {
            return kVarIntercept;
        }
        throw new IllegalStateException("interceptor " + interfaceC1361c + " returned a response with no body");
    }
}
