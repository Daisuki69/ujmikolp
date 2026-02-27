package O1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O1.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0511g0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC0511g0 f4586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0511g0[] f4587b;

    static {
        EnumC0511g0 enumC0511g0 = new EnumC0511g0("INSTANCE", 0);
        f4586a = enumC0511g0;
        f4587b = new EnumC0511g0[]{enumC0511g0};
    }

    public static EnumC0511g0 valueOf(String str) {
        return (EnumC0511g0) Enum.valueOf(EnumC0511g0.class, str);
    }

    public static EnumC0511g0[] values() {
        return (EnumC0511g0[]) f4587b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        qk.i.p(false, "no calls to next() since the last call to remove()");
    }
}
