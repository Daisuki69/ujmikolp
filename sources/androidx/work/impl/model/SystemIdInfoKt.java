package androidx.work.impl.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class SystemIdInfoKt {
    public static final SystemIdInfo systemIdInfo(WorkGenerationalId generationalId, int i) {
        j.g(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i);
    }
}
