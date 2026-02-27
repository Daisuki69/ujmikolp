package androidx.work;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NoOpInputMergerFactory extends InputMergerFactory {
    public static final NoOpInputMergerFactory INSTANCE = new NoOpInputMergerFactory();

    private NoOpInputMergerFactory() {
    }

    /* JADX INFO: renamed from: createInputMerger, reason: collision with other method in class */
    public Void m138createInputMerger(String className) {
        j.g(className, "className");
        return null;
    }

    @Override // androidx.work.InputMergerFactory
    public /* bridge */ /* synthetic */ InputMerger createInputMerger(String str) {
        return (InputMerger) m138createInputMerger(str);
    }
}
