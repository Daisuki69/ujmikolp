package O2;

import U2.A;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {
    public static final M2.a c = M2.a.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f4628b;

    public d(A a8) {
        this.f4628b = a8;
    }

    public static boolean d(A a8, int i) {
        if (a8 != null) {
            M2.a aVar = c;
            if (i > 1) {
                aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry entry : a8.D().entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String strTrim = str.trim();
                    if (strTrim.isEmpty()) {
                        aVar.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        aVar.f("counterId exceeded max length 100");
                    } else if (((Long) entry.getValue()) == null) {
                        aVar.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                aVar.f("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            }
            Iterator it = a8.J().iterator();
            while (it.hasNext()) {
                if (!d((A) it.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r7 = r7.E().entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r7.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        r8 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        O2.e.b((java.lang.String) r8.getKey(), (java.lang.String) r8.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        r0.f(r7.getLocalizedMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(U2.A r7, int r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.d.e(U2.A, int):boolean");
    }

    @Override // O2.e
    public final boolean a() {
        A a8 = this.f4628b;
        boolean zE = e(a8, 0);
        M2.a aVar = c;
        if (!zE) {
            aVar.f("Invalid Trace:" + a8.H());
            return false;
        }
        if (a8.C() <= 0) {
            Iterator it = a8.J().iterator();
            while (it.hasNext()) {
                if (((A) it.next()).C() > 0) {
                }
            }
            return true;
        }
        if (d(a8, 0)) {
            return true;
        }
        aVar.f("Invalid Counters for Trace:" + a8.H());
        return false;
    }
}
