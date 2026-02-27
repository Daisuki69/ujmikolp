package k3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: renamed from: k3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1760e implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18099a;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        for (int i4 = 0; i4 < i; i4++) {
            C1759d c1759d = new C1759d();
            c1759d.f18067b = null;
            c1759d.f18070d = null;
            c1759d.f = null;
            c1759d.h = null;
            c1759d.j = null;
            c1759d.f18081l = null;
            c1759d.f18083n = null;
            c1759d.f18087p = null;
            c1759d.f18091r = null;
            c1759d.f18093t = null;
            c1759d.f18095v = null;
            c1759d.f18097x = null;
            c1759d.f18052B = null;
            c1759d.f18054P = null;
            c1759d.f18056R = null;
            c1759d.f18058T = null;
            c1759d.f18060V = null;
            c1759d.f18061W = "";
            c1759d.f18062X = 0;
            c1759d.f18063Y = "";
            c1759d.f18066a0 = "";
            c1759d.f18069c0 = "";
            c1759d.f18072e0 = "";
            c1759d.f18075g0 = "";
            c1759d.f18077i0 = "";
            c1759d.f18078j0 = false;
            c1759d.f18080k0 = new ArrayList();
            c1759d.f18082l0 = new ArrayList();
            c1759d.m0 = false;
            c1759d.f18086o0 = "";
            c1759d.f18088p0 = false;
            c1759d.f18090q0 = false;
            c1759d.readExternal(objectInput);
            this.f18099a.add(c1759d);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ArrayList arrayList = this.f18099a;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C1759d) arrayList.get(i)).writeExternal(objectOutput);
        }
    }
}
