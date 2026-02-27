package ih;

import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ih.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1603a extends AtomicReferenceArray implements InterfaceC1486b {
    public final boolean a(int i, InterfaceC1486b interfaceC1486b) {
        InterfaceC1486b interfaceC1486b2;
        do {
            interfaceC1486b2 = (InterfaceC1486b) get(i);
            if (interfaceC1486b2 == EnumC1604b.f17147a) {
                interfaceC1486b.dispose();
                return false;
            }
        } while (!compareAndSet(i, interfaceC1486b2, interfaceC1486b));
        if (interfaceC1486b2 == null) {
            return true;
        }
        interfaceC1486b2.dispose();
        return true;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        InterfaceC1486b interfaceC1486b;
        Object obj = get(0);
        EnumC1604b enumC1604b = EnumC1604b.f17147a;
        if (obj != enumC1604b) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (((InterfaceC1486b) get(i)) != enumC1604b && (interfaceC1486b = (InterfaceC1486b) getAndSet(i, enumC1604b)) != enumC1604b && interfaceC1486b != null) {
                    interfaceC1486b.dispose();
                }
            }
        }
    }
}
