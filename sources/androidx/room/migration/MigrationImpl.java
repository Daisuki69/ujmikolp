package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class MigrationImpl extends Migration {
    private final Function1<SupportSQLiteDatabase, Unit> migrateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public MigrationImpl(int i, int i4, Function1<? super SupportSQLiteDatabase, Unit> function1) {
        super(i, i4);
        this.migrateCallback = function1;
    }

    public final Function1<SupportSQLiteDatabase, Unit> getMigrateCallback() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.migrateCallback.invoke(supportSQLiteDatabase);
    }
}
