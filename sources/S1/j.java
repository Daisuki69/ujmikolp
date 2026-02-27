package S1;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ boolean a(Unsafe unsafe, p pVar, long j, o oVar, o oVar2) {
        while (!unsafe.compareAndSwapObject(pVar, j, oVar, oVar2)) {
            if (unsafe.getObject(pVar, j) != oVar) {
                return false;
            }
        }
        return true;
    }
}
