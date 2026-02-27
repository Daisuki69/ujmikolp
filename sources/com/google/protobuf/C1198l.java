package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1198l {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f10106a = new Y(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10107b;

    static {
        new C1198l(0);
    }

    public C1198l() {
    }

    public static void b(C1193g c1193g, w0 w0Var, int i, Object obj) {
        if (w0Var == w0.e) {
            c1193g.t(i, 3);
            ((AbstractC1187a) obj).i(c1193g);
            c1193g.t(i, 4);
        }
        c1193g.t(i, w0Var.f10133b);
        switch (w0Var.ordinal()) {
            case 0:
                c1193g.q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c1193g.o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c1193g.w(((Long) obj).longValue());
                break;
            case 3:
                c1193g.w(((Long) obj).longValue());
                break;
            case 4:
                c1193g.r(((Integer) obj).intValue());
                break;
            case 5:
                c1193g.q(((Long) obj).longValue());
                break;
            case 6:
                c1193g.o(((Integer) obj).intValue());
                break;
            case 7:
                c1193g.k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C1192f)) {
                    c1193g.s((String) obj);
                } else {
                    c1193g.m((C1192f) obj);
                }
                break;
            case 9:
                ((AbstractC1187a) obj).i(c1193g);
                break;
            case 10:
                AbstractC1187a abstractC1187a = (AbstractC1187a) obj;
                c1193g.u(((AbstractC1203q) abstractC1187a).h(null));
                abstractC1187a.i(c1193g);
                break;
            case 11:
                if (!(obj instanceof C1192f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1193g.u(length);
                    c1193g.l(bArr, 0, length);
                } else {
                    c1193g.m((C1192f) obj);
                }
                break;
            case 12:
                c1193g.u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof U2.i)) {
                    c1193g.r(((Integer) obj).intValue());
                } else {
                    c1193g.r(((U2.i) obj).f5921a);
                }
                break;
            case 14:
                c1193g.o(((Integer) obj).intValue());
                break;
            case 15:
                c1193g.q(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1193g.u((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c1193g.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        Y y7;
        if (this.f10107b) {
            return;
        }
        int i = 0;
        while (true) {
            y7 = this.f10106a;
            if (i >= y7.f10076b.size()) {
                break;
            }
            Map.Entry entryC = y7.c(i);
            if (entryC.getValue() instanceof AbstractC1203q) {
                AbstractC1203q abstractC1203q = (AbstractC1203q) entryC.getValue();
                abstractC1203q.getClass();
                T t5 = T.c;
                t5.getClass();
                t5.a(abstractC1203q.getClass()).makeImmutable(abstractC1203q);
                abstractC1203q.o();
            }
            i++;
        }
        if (!y7.f10077d) {
            if (y7.f10076b.size() > 0) {
                y7.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = y7.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!y7.f10077d) {
            y7.c = y7.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y7.c);
            y7.f = y7.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(y7.f);
            y7.f10077d = true;
        }
        this.f10107b = true;
    }

    public final Object clone() {
        C1198l c1198l = new C1198l();
        Y y7 = this.f10106a;
        if (y7.f10076b.size() > 0) {
            Map.Entry entryC = y7.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = y7.d().iterator();
        if (!it.hasNext()) {
            return c1198l;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1198l) {
            return this.f10106a.equals(((C1198l) obj).f10106a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10106a.hashCode();
    }

    public C1198l(int i) {
        a();
        a();
    }
}
