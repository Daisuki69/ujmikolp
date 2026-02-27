package ih;

import S1.s;
import fh.InterfaceC1486b;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;
import jh.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ih.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1604b implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1604b f17147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1604b[] f17148b;

    static {
        EnumC1604b enumC1604b = new EnumC1604b("DISPOSED", 0);
        f17147a = enumC1604b;
        f17148b = new EnumC1604b[]{enumC1604b};
    }

    public static boolean a(AtomicReference atomicReference) {
        InterfaceC1486b interfaceC1486b;
        InterfaceC1486b interfaceC1486b2 = (InterfaceC1486b) atomicReference.get();
        EnumC1604b enumC1604b = f17147a;
        if (interfaceC1486b2 == enumC1604b || (interfaceC1486b = (InterfaceC1486b) atomicReference.getAndSet(enumC1604b)) == enumC1604b) {
            return false;
        }
        if (interfaceC1486b == null) {
            return true;
        }
        interfaceC1486b.dispose();
        return true;
    }

    public static boolean b(InterfaceC1486b interfaceC1486b) {
        return interfaceC1486b == f17147a;
    }

    public static boolean c(AtomicReference atomicReference, InterfaceC1486b interfaceC1486b) {
        while (true) {
            InterfaceC1486b interfaceC1486b2 = (InterfaceC1486b) atomicReference.get();
            if (interfaceC1486b2 == f17147a) {
                if (interfaceC1486b == null) {
                    return false;
                }
                interfaceC1486b.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC1486b2, interfaceC1486b)) {
                if (atomicReference.get() != interfaceC1486b2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean d(AtomicReference atomicReference, InterfaceC1486b interfaceC1486b) {
        while (true) {
            InterfaceC1486b interfaceC1486b2 = (InterfaceC1486b) atomicReference.get();
            if (interfaceC1486b2 == f17147a) {
                if (interfaceC1486b == null) {
                    return false;
                }
                interfaceC1486b.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC1486b2, interfaceC1486b)) {
                if (atomicReference.get() != interfaceC1486b2) {
                    break;
                }
            }
            if (interfaceC1486b2 == null) {
                return true;
            }
            interfaceC1486b2.dispose();
            return true;
        }
    }

    public static boolean e(AtomicReference atomicReference, InterfaceC1486b interfaceC1486b) {
        e.b(interfaceC1486b, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC1486b)) {
            if (atomicReference.get() != null) {
                interfaceC1486b.dispose();
                if (atomicReference.get() == f17147a) {
                    return false;
                }
                s.r(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(InterfaceC1486b interfaceC1486b, InterfaceC1486b interfaceC1486b2) {
        if (interfaceC1486b2 == null) {
            s.r(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC1486b == null) {
            return true;
        }
        interfaceC1486b2.dispose();
        s.r(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static EnumC1604b valueOf(String str) {
        return (EnumC1604b) Enum.valueOf(EnumC1604b.class, str);
    }

    public static EnumC1604b[] values() {
        return (EnumC1604b[]) f17148b.clone();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
    }
}
