package Dh;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f1155b;

    static {
        a aVar = new a("DISPOSED", 0);
        f1154a = aVar;
        f1155b = new a[]{aVar};
    }

    public static void a(AtomicReference atomicReference) {
        io.reactivex.rxjava3.disposables.b bVar;
        io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) atomicReference.get();
        a aVar = f1154a;
        if (bVar2 == aVar || (bVar = (io.reactivex.rxjava3.disposables.b) atomicReference.getAndSet(aVar)) == aVar || bVar == null) {
            return;
        }
        bVar.dispose();
    }

    public static boolean b(io.reactivex.rxjava3.disposables.b bVar) {
        return bVar == f1154a;
    }

    public static boolean c(AtomicReference atomicReference, io.reactivex.rxjava3.disposables.b bVar) {
        while (true) {
            io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) atomicReference.get();
            if (bVar2 == f1154a) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(bVar2, bVar)) {
                if (atomicReference.get() != bVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean d(AtomicReference atomicReference, io.reactivex.rxjava3.disposables.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() == f1154a) {
                    return false;
                }
                E1.c.k(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(io.reactivex.rxjava3.disposables.b bVar, io.reactivex.rxjava3.disposables.b bVar2) {
        if (bVar2 == null) {
            E1.c.k(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        E1.c.k(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1155b.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
    }
}
