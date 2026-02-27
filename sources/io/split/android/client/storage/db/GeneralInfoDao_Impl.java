package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GeneralInfoDao_Impl implements GeneralInfoDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<GeneralInfoEntity> __insertionAdapterOfGeneralInfoEntity;

    public GeneralInfoDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfGeneralInfoEntity = new EntityInsertionAdapter<GeneralInfoEntity>(roomDatabase) { // from class: io.split.android.client.storage.db.GeneralInfoDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `general_info` (`name`,`stringValue`,`longValue`,`updated_at`) VALUES (?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, GeneralInfoEntity generalInfoEntity) {
                if (generalInfoEntity.getName() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, generalInfoEntity.getName());
                }
                if (generalInfoEntity.getStringValue() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, generalInfoEntity.getStringValue());
                }
                supportSQLiteStatement.bindLong(3, generalInfoEntity.getLongValue());
                supportSQLiteStatement.bindLong(4, generalInfoEntity.getUpdatedAt());
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.split.android.client.storage.db.GeneralInfoDao
    public GeneralInfoEntity getByName(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT name, stringValue, longValue, updated_at FROM general_info WHERE name = ?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        GeneralInfoEntity generalInfoEntity = null;
        String string = null;
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            if (cursorQuery.moveToFirst()) {
                GeneralInfoEntity generalInfoEntity2 = new GeneralInfoEntity();
                generalInfoEntity2.setName(cursorQuery.isNull(0) ? null : cursorQuery.getString(0));
                if (!cursorQuery.isNull(1)) {
                    string = cursorQuery.getString(1);
                }
                generalInfoEntity2.setStringValue(string);
                generalInfoEntity2.setLongValue(cursorQuery.getLong(2));
                generalInfoEntity2.setUpdatedAt(cursorQuery.getLong(3));
                generalInfoEntity = generalInfoEntity2;
            }
            return generalInfoEntity;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.GeneralInfoDao
    public void update(GeneralInfoEntity generalInfoEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGeneralInfoEntity.insert(generalInfoEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
