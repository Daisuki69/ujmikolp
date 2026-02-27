package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1 extends k implements Function1<SupportSQLiteStatement, Long> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1();

    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(SupportSQLiteStatement obj) {
        j.g(obj, "obj");
        return Long.valueOf(obj.simpleQueryForLong());
    }
}
