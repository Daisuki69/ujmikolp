package q;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends e {
    public final PointF i;
    public final PointF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f19732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f19733l;
    public A.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public A.c f19734n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.f19732k = iVar;
        this.f19733l = iVar2;
        j(this.f19722d);
    }

    @Override // q.e
    public final Object f() {
        return l(0.0f);
    }

    @Override // q.e
    public final /* bridge */ /* synthetic */ Object g(A.a aVar, float f) {
        return l(f);
    }

    @Override // q.e
    public final void j(float f) {
        i iVar = this.f19732k;
        iVar.j(f);
        i iVar2 = this.f19733l;
        iVar2.j(f);
        this.i.set(((Float) iVar.f()).floatValue(), ((Float) iVar2.f()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19720a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC2157a) arrayList.get(i)).a();
            i++;
        }
    }

    public final PointF l(float f) {
        Float f3;
        i iVar;
        A.a aVarB;
        i iVar2;
        A.a aVarB2;
        Float f7 = null;
        if (this.m == null || (aVarB2 = (iVar2 = this.f19732k).b()) == null) {
            f3 = null;
        } else {
            iVar2.d();
            f3 = (Float) this.m.b(aVarB2.f4b, aVarB2.c);
        }
        if (this.f19734n != null && (aVarB = (iVar = this.f19733l).b()) != null) {
            iVar.d();
            f7 = (Float) this.f19734n.b(aVarB.f4b, aVarB.c);
        }
        PointF pointF = this.i;
        PointF pointF2 = this.j;
        if (f3 == null) {
            pointF2.set(pointF.x, 0.0f);
        } else {
            pointF2.set(f3.floatValue(), 0.0f);
        }
        if (f7 == null) {
            pointF2.set(pointF2.x, pointF.y);
            return pointF2;
        }
        pointF2.set(pointF2.x, f7.floatValue());
        return pointF2;
    }
}
