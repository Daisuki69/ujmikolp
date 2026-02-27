package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import cj.C1112C;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z5, boolean z8, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        j.g(typeConverters, "typeConverters");
        j.g(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z4;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z5;
        this.allowDestructiveMigrationOnDowngrade = z8;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean isMigrationRequired(int i, int i4) {
        Set<Integer> set;
        return (i <= i4 || !this.allowDestructiveMigrationOnDowngrade) && this.requireMigration && ((set = this.migrationNotRequiredFrom) == null || !set.contains(Integer.valueOf(i)));
    }

    public boolean isMigrationRequiredFrom(int i) {
        return isMigrationRequired(i, i + 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, boolean z5, Set<Integer> set) {
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        C1112C c1112c = C1112C.f9377a;
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, queryExecutor, (Intent) null, z5, false, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, (List<? extends Object>) c1112c, (List<? extends AutoMigrationSpec>) c1112c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z8, boolean z9, Set<Integer> set) {
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        Intent intent = z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null;
        C1112C c1112c = C1112C.f9377a;
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, intent, z8, z9, set, (String) null, (File) null, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, c1112c, c1112c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z8, boolean z9, Set<Integer> set, String str2, File file) {
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        Intent intent = z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null;
        C1112C c1112c = C1112C.f9377a;
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, intent, z8, z9, set, str2, file, (Callable<InputStream>) null, (RoomDatabase.PrepackagedDatabaseCallback) null, c1112c, c1112c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z8, boolean z9, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        Intent intent = z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null;
        C1112C c1112c = C1112C.f9377a;
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, intent, z8, z9, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, c1112c, c1112c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z8, boolean z9, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        Intent intent = z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null;
        C1112C c1112c = C1112C.f9377a;
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, intent, z8, z9, set, str2, file, callable, prepackagedDatabaseCallback, c1112c, c1112c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z8, boolean z9, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z8, z9, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, C1112C.f9377a);
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        j.g(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z4, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z8, boolean z9, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> typeConverters, List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z8, z9, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, typeConverters, autoMigrationSpecs);
        j.g(context, "context");
        j.g(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        j.g(migrationContainer, "migrationContainer");
        j.g(journalMode, "journalMode");
        j.g(queryExecutor, "queryExecutor");
        j.g(transactionExecutor, "transactionExecutor");
        j.g(typeConverters, "typeConverters");
        j.g(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
