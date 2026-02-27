package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1 extends k implements Function1<SupportSQLiteStatement, Object> {
    public static final AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1();

    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(SupportSQLiteStatement statement) {
        j.g(statement, "statement");
        statement.execute();
        return null;
    }
}
