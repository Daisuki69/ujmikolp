package androidx.work.impl.model;

import Bj.A;
import Ej.InterfaceC0230h;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC0230h getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, A dispatcher, SupportSQLiteQuery query) {
        j.g(rawWorkInfoDao, "<this>");
        j.g(dispatcher, "dispatcher");
        j.g(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
