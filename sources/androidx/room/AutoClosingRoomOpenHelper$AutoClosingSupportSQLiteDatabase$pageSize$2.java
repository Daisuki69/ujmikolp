package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2 extends k implements Function1<SupportSQLiteDatabase, Object> {
    final /* synthetic */ long $numBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2(long j) {
        super(1);
        this.$numBytes = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(SupportSQLiteDatabase db2) {
        j.g(db2, "db");
        db2.setPageSize(this.$numBytes);
        return null;
    }
}
