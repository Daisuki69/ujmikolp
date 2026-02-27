package io.split.android.client.storage.db;

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
public final class EventDao_Impl implements EventDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<EventEntity> __insertionAdapterOfEventEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByStatus;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOutdated;

    public EventDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfEventEntity = new EntityInsertionAdapter<EventEntity>(roomDatabase) { // from class: io.split.android.client.storage.db.EventDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `events` (`id`,`body`,`created_at`,`status`) VALUES (nullif(?, 0),?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, EventEntity eventEntity) {
                supportSQLiteStatement.bindLong(1, eventEntity.getId());
                if (eventEntity.getBody() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, eventEntity.getBody());
                }
                supportSQLiteStatement.bindLong(3, eventEntity.getCreatedAt());
                supportSQLiteStatement.bindLong(4, eventEntity.getStatus());
            }
        };
        this.__preparedStmtOfDeleteOutdated = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.EventDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM events WHERE created_at < ?";
            }
        };
        this.__preparedStmtOfDeleteByStatus = new SharedSQLiteStatement(roomDatabase) { // from class: io.split.android.client.storage.db.EventDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM events WHERE  status = ? AND created_at < ? AND EXISTS(SELECT 1 FROM events AS eve  WHERE eve.id = events.id LIMIT ?)";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.split.android.client.storage.db.EventDao
    public void delete(List<Long> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("DELETE FROM events WHERE id IN (");
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

    @Override // io.split.android.client.storage.db.EventDao
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

    @Override // io.split.android.client.storage.db.EventDao
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

    @Override // io.split.android.client.storage.db.EventDao
    public List<EventEntity> getAll() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, body, created_at, status FROM events", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                EventEntity eventEntity = new EventEntity();
                eventEntity.setId(cursorQuery.getLong(0));
                eventEntity.setBody(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                eventEntity.setCreatedAt(cursorQuery.getLong(2));
                eventEntity.setStatus(cursorQuery.getInt(3));
                arrayList.add(eventEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.EventDao
    public List<EventEntity> getBy(long j, int i, int i4) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, body, created_at, status FROM events WHERE created_at >= ? AND status = ? ORDER BY created_at LIMIT ?", 3);
        roomSQLiteQueryAcquire.bindLong(1, j);
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i4);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                EventEntity eventEntity = new EventEntity();
                eventEntity.setId(cursorQuery.getLong(0));
                eventEntity.setBody(cursorQuery.isNull(1) ? null : cursorQuery.getString(1));
                eventEntity.setCreatedAt(cursorQuery.getLong(2));
                eventEntity.setStatus(cursorQuery.getInt(3));
                arrayList.add(eventEntity);
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // io.split.android.client.storage.db.EventDao
    public void insert(EventEntity eventEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEventEntity.insert(eventEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // io.split.android.client.storage.db.EventDao
    public void updateStatus(List<Long> list, int i) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("UPDATE events SET status = ");
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

    @Override // io.split.android.client.storage.db.EventDao
    public void insert(List<EventEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfEventEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
