package S1;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class l {
    public static /* synthetic */ boolean a(Unsafe unsafe, p pVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(pVar, j, obj, obj2)) {
            if (unsafe.getObject(pVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
