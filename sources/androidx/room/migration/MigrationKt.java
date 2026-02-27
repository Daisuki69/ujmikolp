package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class MigrationKt {
    public static final Migration Migration(int i, int i4, Function1<? super SupportSQLiteDatabase, Unit> function1) {
        return new MigrationImpl(i, i4, function1);
    }
}
