package c2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1067j implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1067j f9268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1067j[] f9269b;

    static {
        EnumC1067j enumC1067j = new EnumC1067j("INSTANCE", 0);
        f9268a = enumC1067j;
        f9269b = new EnumC1067j[]{enumC1067j};
    }

    public static EnumC1067j valueOf(String str) {
        return (EnumC1067j) Enum.valueOf(EnumC1067j.class, str);
    }

    public static EnumC1067j[] values() {
        return (EnumC1067j[]) f9269b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
