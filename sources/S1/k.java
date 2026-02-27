package S1;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ boolean a(Unsafe unsafe, p pVar, long j, C0590d c0590d, C0590d c0590d2) {
        while (!unsafe.compareAndSwapObject(pVar, j, c0590d, c0590d2)) {
            if (unsafe.getObject(pVar, j) != c0590d) {
                return false;
            }
        }
        return true;
    }
}
