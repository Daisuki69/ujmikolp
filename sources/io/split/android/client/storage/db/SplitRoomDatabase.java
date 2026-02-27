package io.split.android.client.storage.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import io.split.android.client.storage.db.attributes.AttributesDao;
import io.split.android.client.storage.db.attributes.AttributesEntity;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao;
import io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheEntity;
import io.split.android.client.storage.db.impressions.unique.UniqueKeyEntity;
import io.split.android.client.storage.db.impressions.unique.UniqueKeysDao;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentDao;
import io.split.android.client.storage.db.rbs.RuleBasedSegmentEntity;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
@Database(entities = {MySegmentEntity.class, SplitEntity.class, EventEntity.class, ImpressionEntity.class, GeneralInfoEntity.class, ImpressionsCountEntity.class, AttributesEntity.class, UniqueKeyEntity.class, ImpressionsObserverCacheEntity.class, MyLargeSegmentEntity.class, RuleBasedSegmentEntity.class}, version = 7)
public abstract class SplitRoomDatabase extends RoomDatabase {
    private static volatile Map<String, SplitRoomDatabase> mInstances = new ConcurrentHashMap();
    private volatile SplitQueryDao mSplitQueryDao;

    public static SplitRoomDatabase getDatabase(Context context, String str) {
        SplitRoomDatabase splitRoomDatabase;
        Objects.requireNonNull(context);
        Objects.requireNonNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        synchronized (SplitRoomDatabase.class) {
            splitRoomDatabase = mInstances.get(str);
            if (splitRoomDatabase == null) {
                splitRoomDatabase = (SplitRoomDatabase) Room.databaseBuilder(context.getApplicationContext(), SplitRoomDatabase.class, str).setJournalMode(RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING).fallbackToDestructiveMigration().build();
                try {
                    SupportSQLiteDatabase writableDatabase = splitRoomDatabase.getOpenHelper().getWritableDatabase();
                    writableDatabase.execSQL("PRAGMA cache_size = -3000");
                    writableDatabase.execSQL("PRAGMA automatic_index = ON");
                    writableDatabase.execSQL("PRAGMA foreign_keys = OFF");
                } catch (Exception unused) {
                    Ri.a.k("Failed to set optimized pragma");
                }
                mInstances.put(str, splitRoomDatabase);
                try {
                    splitRoomDatabase.getOpenHelper().getWritableDatabase();
                } catch (Exception e) {
                    Ri.a.k("Failed to force Room initialization: " + e.getMessage());
                }
                new Thread(new androidx.window.layout.adapter.extensions.a(str, 18)).start();
            }
        }
        return splitRoomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDatabase$0(String str) {
        try {
            mInstances.get(str).getSplitQueryDao();
        } catch (Exception unused) {
            Ri.a.k("Failed to preload query DAO");
        }
    }

    public abstract AttributesDao attributesDao();

    public abstract EventDao eventDao();

    public abstract GeneralInfoDao generalInfoDao();

    public SplitQueryDao getSplitQueryDao() {
        if (this.mSplitQueryDao == null) {
            synchronized (this) {
                try {
                    if (this.mSplitQueryDao == null) {
                        this.mSplitQueryDao = new SplitQueryDaoImpl(this);
                    }
                } finally {
                }
            }
        }
        return this.mSplitQueryDao;
    }

    public abstract ImpressionDao impressionDao();

    public abstract ImpressionsCountDao impressionsCountDao();

    public abstract ImpressionsObserverCacheDao impressionsObserverCacheDao();

    public abstract MyLargeSegmentDao myLargeSegmentDao();

    public abstract MySegmentDao mySegmentDao();

    public abstract RuleBasedSegmentDao ruleBasedSegmentDao();

    public abstract SplitDao splitDao();

    public abstract UniqueKeysDao uniqueKeysDao();
}
