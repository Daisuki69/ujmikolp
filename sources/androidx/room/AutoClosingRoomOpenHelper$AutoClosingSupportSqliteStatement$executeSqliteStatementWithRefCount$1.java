package androidx.room;

import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1<T> extends k implements Function1<SupportSQLiteDatabase, T> {
    final /* synthetic */ Function1<SupportSQLiteStatement, T> $block;
    final /* synthetic */ AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1(AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement autoClosingSupportSqliteStatement, Function1<? super SupportSQLiteStatement, ? extends T> function1) {
        super(1);
        this.this$0 = autoClosingSupportSqliteStatement;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final T invoke(SupportSQLiteDatabase db2) {
        j.g(db2, "db");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = db2.compileStatement(this.this$0.sql);
        this.this$0.doBinds(supportSQLiteStatementCompileStatement);
        return (T) this.$block.invoke(supportSQLiteStatementCompileStatement);
    }
}
