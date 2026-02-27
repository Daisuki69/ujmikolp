package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public interface AutoMigrationSpec {
    void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase);
}
