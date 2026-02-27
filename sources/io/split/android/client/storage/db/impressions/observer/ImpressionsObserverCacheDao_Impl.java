package io.split.android.client.storage.db.impressions.observer;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ImpressionsObserverCacheDao_Impl implements ImpressionsObserverCacheDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ImpressionsObserverCacheEntity> __insertionAdapterOfImpressionsObserverCacheEntity;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOldest;
    private final SharedSQLiteStatement __preparedStmtOfInsert;

    public ImpressionsObserverCacheDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfImpressionsObserverCacheEntity = new EntityInsertionAdapter<ImpressionsObserverCacheEntity>(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `impressions_observer_cache` (`hash`,`time`,`created_at`) VALUES (?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ImpressionsObserverCacheEntity impressionsObserverCacheEntity) {
                supportSQLiteStatement.bindLong(1, impressionsObserverCacheEntity.getHash());
                supportSQLiteStatement.bindLong(2, impressionsObserverCacheEntity.getTime());
                supportSQLiteStatement.bindLong(3, impressionsObserverCacheEntity.getCreatedAt());
            }
        };
        this.__preparedStmtOfInsert = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO impressions_observer_cache (hash, time, created_at) VALUES (?, ?, ?)";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM impressions_observer_cache WHERE hash = ?";
            }
        };
        this.__preparedStmtOfDeleteOldest = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM impressions_observer_cache WHERE created_at < ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao
    public void delete(Long l6) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDelete.acquire();
        if (l6 == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindLong(1, l6.longValue());
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao
    public void deleteOldest(long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteOldest.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j);
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOldest.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao
    public ImpressionsObserverCacheEntity get(Long l6) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT hash, time, created_at FROM impressions_observer_cache WHERE hash = ?", 1);
        if (l6 == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindLong(1, l6.longValue());
        }
        this.__db.assertNotSuspendingTransaction();
        ImpressionsObserverCacheEntity impressionsObserverCacheEntity = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                impressionsObserverCacheEntity = new ImpressionsObserverCacheEntity();
                impressionsObserverCacheEntity.setHash(cursorQuery.getLong(0));
                impressionsObserverCacheEntity.setTime(cursorQuery.getLong(1));
                impressionsObserverCacheEntity.setCreatedAt(cursorQuery.getLong(2));
            }
            return impressionsObserverCacheEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao
    public List<ImpressionsObserverCacheEntity> getAll(int i) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT hash, time, created_at FROM impressions_observer_cache ORDER BY created_at ASC LIMIT ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                ImpressionsObserverCacheEntity impressionsObserverCacheEntity = new ImpressionsObserverCacheEntity();
                impressionsObserverCacheEntity.setHash(cursorQuery.getLong(0));
                impressionsObserverCacheEntity.setTime(cursorQuery.getLong(1));
                impressionsObserverCacheEntity.setCreatedAt(cursorQuery.getLong(2));
                arrayList.add(impressionsObserverCacheEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao
    public void insert(List<ImpressionsObserverCacheEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfImpressionsObserverCacheEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.observer.ImpressionsObserverCacheDao
    public void insert(Long l6, Long l8, Long l10) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfInsert.acquire();
        if (l6 == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindLong(1, l6.longValue());
        }
        if (l8 == null) {
            supportSQLiteStatementAcquire.bindNull(2);
        } else {
            supportSQLiteStatementAcquire.bindLong(2, l8.longValue());
        }
        if (l10 == null) {
            supportSQLiteStatementAcquire.bindNull(3);
        } else {
            supportSQLiteStatementAcquire.bindLong(3, l10.longValue());
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeInsert();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfInsert.release(supportSQLiteStatementAcquire);
        }
    }
}
