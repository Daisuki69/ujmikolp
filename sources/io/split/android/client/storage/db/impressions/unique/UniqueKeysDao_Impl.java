package io.split.android.client.storage.db.impressions.unique;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class UniqueKeysDao_Impl implements UniqueKeysDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<UniqueKeyEntity> __insertionAdapterOfUniqueKeyEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByStatus;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOutdated;

    public UniqueKeysDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfUniqueKeyEntity = new EntityInsertionAdapter<UniqueKeyEntity>(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.unique.UniqueKeysDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `unique_keys` (`id`,`user_key`,`feature_list`,`created_at`,`status`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, UniqueKeyEntity uniqueKeyEntity) {
                supportSQLiteStatement.bindLong(1, uniqueKeyEntity.getId());
                if (uniqueKeyEntity.getUserKey() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, uniqueKeyEntity.getUserKey());
                }
                if (uniqueKeyEntity.getFeatureList() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, uniqueKeyEntity.getFeatureList());
                }
                supportSQLiteStatement.bindLong(4, uniqueKeyEntity.getCreatedAt());
                supportSQLiteStatement.bindLong(5, uniqueKeyEntity.getStatus());
            }
        };
        this.__preparedStmtOfDeleteOutdated = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.unique.UniqueKeysDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM unique_keys WHERE created_at < ?";
            }
        };
        this.__preparedStmtOfDeleteByStatus = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.impressions.unique.UniqueKeysDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM unique_keys WHERE status = ? AND created_at < ? AND EXISTS(SELECT 1 FROM unique_keys AS imp WHERE imp.user_key = unique_keys.user_key LIMIT ?)";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public void delete(List<String> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM unique_keys WHERE user_key IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.__db.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                supportSQLiteStatementCompileStatement.bindNull(i);
            } else {
                supportSQLiteStatementCompileStatement.bindString(i, str);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public void deleteById(List<Long> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM unique_keys WHERE id IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.__db.compileStatement(sbNewStringBuilder.toString());
        int i = 1;
        for (Long l6 : list) {
            if (l6 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i);
            } else {
                supportSQLiteStatementCompileStatement.bindLong(i, l6.longValue());
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public int deleteByStatus(int i, long j, int i4) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteByStatus.acquire();
        supportSQLiteStatementAcquire.bindLong(1, i);
        supportSQLiteStatementAcquire.bindLong(2, j);
        supportSQLiteStatementAcquire.bindLong(3, i4);
        this.__db.beginTransaction();
        try {
            int iExecuteUpdateDelete = supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return iExecuteUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByStatus.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public void deleteOutdated(long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteOutdated.acquire();
        supportSQLiteStatementAcquire.bindLong(1, j);
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOutdated.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public List<UniqueKeyEntity> getAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, user_key, feature_list, created_at, status FROM unique_keys", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                UniqueKeyEntity uniqueKeyEntity = new UniqueKeyEntity();
                uniqueKeyEntity.setId(cursorQuery.getLong(0));
                uniqueKeyEntity.setUserKey(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                uniqueKeyEntity.setFeatureList(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                uniqueKeyEntity.setCreatedAt(cursorQuery.getLong(3));
                uniqueKeyEntity.setStatus(cursorQuery.getInt(4));
                arrayList.add(uniqueKeyEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public List<UniqueKeyEntity> getBy(long j, int i, int i4) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, user_key, feature_list, created_at, status FROM unique_keys WHERE created_at >= ? AND status = ? ORDER BY created_at LIMIT ?", 3);
        roomSQLiteQueryAcquire.bindLong(1, j);
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i4);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                UniqueKeyEntity uniqueKeyEntity = new UniqueKeyEntity();
                uniqueKeyEntity.setId(cursorQuery.getLong(0));
                uniqueKeyEntity.setUserKey(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                uniqueKeyEntity.setFeatureList(cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                uniqueKeyEntity.setCreatedAt(cursorQuery.getLong(3));
                uniqueKeyEntity.setStatus(cursorQuery.getInt(4));
                arrayList.add(uniqueKeyEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public long insert(UniqueKeyEntity uniqueKeyEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long jInsertAndReturnId = this.__insertionAdapterOfUniqueKeyEntity.insertAndReturnId(uniqueKeyEntity);
            this.__db.setTransactionSuccessful();
            return jInsertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public void updateStatus(List<Long> list, int i) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("UPDATE unique_keys SET status = ");
        sbNewStringBuilder.append(Global.QUESTION);
        sbNewStringBuilder.append("  WHERE id IN (");
        StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
        sbNewStringBuilder.append(")");
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = this.__db.compileStatement(sbNewStringBuilder.toString());
        supportSQLiteStatementCompileStatement.bindLong(1, i);
        int i4 = 2;
        for (Long l6 : list) {
            if (l6 == null) {
                supportSQLiteStatementCompileStatement.bindNull(i4);
            } else {
                supportSQLiteStatementCompileStatement.bindLong(i4, l6.longValue());
            }
            i4++;
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementCompileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // io.split.android.client.storage.db.impressions.unique.UniqueKeysDao
    public List<Long> insert(List<UniqueKeyEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> listInsertAndReturnIdsList = this.__insertionAdapterOfUniqueKeyEntity.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return listInsertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }
}
