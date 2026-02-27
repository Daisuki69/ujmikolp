package ag;

import cj.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ag.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0692b implements F, t.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7196b;

    public /* synthetic */ C0692b(int i, ArrayList arrayList) {
        this.f7195a = i;
        this.f7196b = arrayList;
    }

    @Override // cj.F
    public Object a(Object obj) {
        switch (this.f7195a) {
            case 0:
                return Integer.valueOf(((C0702l) obj).f7213a);
            default:
                return (String) obj;
        }
    }

    @Override // cj.F
    public Iterator b() {
        switch (this.f7195a) {
            case 0:
                return this.f7196b.iterator();
            default:
                return this.f7196b.iterator();
        }
    }

    @Override // t.e
    public q.e f() {
        ArrayList arrayList = this.f7196b;
        return ((A.a) arrayList.get(0)).c() ? new q.j(arrayList, 1) : new q.m(arrayList);
    }

    @Override // t.e
    public List g() {
        return this.f7196b;
    }

    @Override // t.e
    public boolean h() {
        ArrayList arrayList = this.f7196b;
        return arrayList.size() == 1 && ((A.a) arrayList.get(0)).c();
    }
}
