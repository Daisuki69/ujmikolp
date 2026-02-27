package androidx.work.impl.model;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {
    public static SystemIdInfo a(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
        j.g(id, "id");
        return systemIdInfoDao.getSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    public static void b(SystemIdInfoDao systemIdInfoDao, WorkGenerationalId id) {
        j.g(id, "id");
        systemIdInfoDao.removeSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }
}
