package ih;

import ch.r;
import kh.InterfaceC1775b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ih.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1605c implements InterfaceC1775b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1605c f17149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1605c f17150b;
    public static final /* synthetic */ EnumC1605c[] c;

    static {
        EnumC1605c enumC1605c = new EnumC1605c("INSTANCE", 0);
        f17149a = enumC1605c;
        EnumC1605c enumC1605c2 = new EnumC1605c("NEVER", 1);
        f17150b = enumC1605c2;
        c = new EnumC1605c[]{enumC1605c, enumC1605c2};
    }

    public static void a(r rVar) {
        rVar.onSubscribe(f17149a);
        rVar.onComplete();
    }

    public static void c(Throwable th2, r rVar) {
        rVar.onSubscribe(f17149a);
        rVar.onError(th2);
    }

    public static EnumC1605c valueOf(String str) {
        return (EnumC1605c) Enum.valueOf(EnumC1605c.class, str);
    }

    public static EnumC1605c[] values() {
        return (EnumC1605c[]) c.clone();
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        return 2;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return true;
    }

    @Override // kh.InterfaceC1779f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        return null;
    }
}
