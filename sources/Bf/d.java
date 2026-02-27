package Bf;

import We.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import yf.m;
import yf.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a {
    public ArrayList e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f437g;

    public d(p pVar, yf.e eVar) throws IOException {
        super(new c(pVar.J()));
        this.e = null;
        this.c = eVar;
        int iT = pVar.t(yf.j.f21184L0, null, -1);
        this.f = iT;
        if (iT == -1) {
            throw new IOException("/N entry missing in object stream");
        }
        if (iT < 0) {
            throw new IOException(s.f(iT, "Illegal /N entry in object stream: "));
        }
        int iT2 = pVar.t(yf.j.f21237n0, null, -1);
        this.f437g = iT2;
        if (iT2 == -1) {
            throw new IOException("/First entry missing in object stream");
        }
        if (iT2 < 0) {
            throw new IOException(s.f(iT2, "Illegal /First entry in object stream: "));
        }
    }

    public final void v() throws IOException {
        i iVar = this.f431b;
        try {
            TreeMap treeMap = new TreeMap();
            long position = iVar.getPosition();
            int i = this.f437g;
            long j = (position + ((long) i)) - 1;
            for (int i4 = 0; i4 < this.f && iVar.getPosition() < j; i4++) {
                treeMap.put(Integer.valueOf((int) p()), Long.valueOf(q()));
            }
            this.e = new ArrayList(treeMap.size());
            for (Map.Entry entry : treeMap.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                long position2 = iVar.getPosition();
                int i6 = iIntValue + i;
                if (i6 > 0 && position2 < i6) {
                    iVar.u(i6 - ((int) position2));
                }
                m mVar = new m(k());
                mVar.c = 0;
                mVar.f21271b = ((Long) entry.getValue()).longValue();
                this.e.add(mVar);
            }
        } finally {
            iVar.close();
        }
    }
}
