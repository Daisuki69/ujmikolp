package com.dynatrace.agent.storage.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import gj.InterfaceC1526a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class EventDao_Impl implements EventDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<EventRecord> __deletionAdapterOfEventRecord;
    private final EntityInsertionAdapter<EventRecord> __insertionAdapterOfEventRecord;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOutdated;

    public EventDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfEventRecord = new EntityInsertionAdapter<EventRecord>(roomDatabase) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "INSERT OR ABORT INTO `events` (`id`,`event`,`timestamp`,`isPriorityData`,`eventSizeBytes`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull EventRecord eventRecord) {
                supportSQLiteStatement.bindLong(1, eventRecord.getId());
                supportSQLiteStatement.bindString(2, eventRecord.getEvent());
                supportSQLiteStatement.bindLong(3, eventRecord.getTimestamp());
                supportSQLiteStatement.bindLong(4, eventRecord.isPriorityData() ? 1L : 0L);
                supportSQLiteStatement.bindLong(5, eventRecord.getEventSizeBytes());
            }
        };
        this.__deletionAdapterOfEventRecord = new EntityDeletionOrUpdateAdapter<EventRecord>(roomDatabase) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM `events` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull EventRecord eventRecord) {
                supportSQLiteStatement.bindLong(1, eventRecord.getId());
            }
        };
        this.__preparedStmtOfDeleteOutdated = new SharedSQLiteStatement(roomDatabase) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM events WHERE ? < ? - timestamp";
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            @NonNull
            public String createQuery() {
                return "DELETE FROM events";
            }
        };
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object delete(final List<EventRecord> list, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.6
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                EventDao_Impl.this.__db.beginTransaction();
                try {
                    EventDao_Impl.this.__deletionAdapterOfEventRecord.handleMultiple(list);
                    EventDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f18162a;
                } finally {
                    EventDao_Impl.this.__db.endTransaction();
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object deleteAll(InterfaceC1526a<? super Unit> interfaceC1526a) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.8
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = EventDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    EventDao_Impl.this.__db.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        EventDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.f18162a;
                    } finally {
                        EventDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    EventDao_Impl.this.__preparedStmtOfDeleteAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object deleteById(final List<Long> list, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.12
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
                sbNewStringBuilder.append("DELETE FROM events WHERE id IN (");
                StringUtil.appendPlaceholders(sbNewStringBuilder, list.size());
                sbNewStringBuilder.append(")");
                SupportSQLiteStatement supportSQLiteStatementCompileStatement = EventDao_Impl.this.__db.compileStatement(sbNewStringBuilder.toString());
                Iterator it = list.iterator();
                int i = 1;
                while (it.hasNext()) {
                    supportSQLiteStatementCompileStatement.bindLong(i, ((Long) it.next()).longValue());
                    i++;
                }
                EventDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementCompileStatement.executeUpdateDelete();
                    EventDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f18162a;
                } finally {
                    EventDao_Impl.this.__db.endTransaction();
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object deleteOutdated(final long j, final long j6, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.7
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = EventDao_Impl.this.__preparedStmtOfDeleteOutdated.acquire();
                supportSQLiteStatementAcquire.bindLong(1, j6);
                supportSQLiteStatementAcquire.bindLong(2, j);
                try {
                    EventDao_Impl.this.__db.beginTransaction();
                    try {
                        supportSQLiteStatementAcquire.executeUpdateDelete();
                        EventDao_Impl.this.__db.setTransactionSuccessful();
                        return Unit.f18162a;
                    } finally {
                        EventDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    EventDao_Impl.this.__preparedStmtOfDeleteOutdated.release(supportSQLiteStatementAcquire);
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object fetchEventMetadata(boolean z4, int i, InterfaceC1526a<? super List<EventMetadata>> interfaceC1526a) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT id, timestamp, isPriorityData, eventSizeBytes FROM events WHERE isPriorityData = ? LIMIT ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, z4 ? 1L : 0L);
        roomSQLiteQueryAcquire.bindLong(2, i);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<EventMetadata>>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.10
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<EventMetadata> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(EventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new EventMetadata(cursorQuery.getLong(0), cursorQuery.getLong(1), cursorQuery.getInt(2) != 0, cursorQuery.getInt(3)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object fetchEventRecordByIds(List<Long> list, InterfaceC1526a<? super List<EventRecord>> interfaceC1526a) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * FROM events WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<Long> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindLong(i, it.next().longValue());
            i++;
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<EventRecord>>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.11
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<EventRecord> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(EventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, TtmlNode.ATTR_ID);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "event");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPriorityData");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventSizeBytes");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new EventRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4) != 0, cursorQuery.getInt(columnIndexOrThrow5)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object getAll(InterfaceC1526a<? super List<EventRecord>> interfaceC1526a) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM events", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<EventRecord>>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.9
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<EventRecord> call() throws Exception {
                Cursor cursorQuery = DBUtil.query(EventDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, TtmlNode.ATTR_ID);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "event");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timestamp");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "isPriorityData");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "eventSizeBytes");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new EventRecord(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4) != 0, cursorQuery.getInt(columnIndexOrThrow5)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, interfaceC1526a);
    }

    @Override // com.dynatrace.agent.storage.db.EventDao
    public Object put(final EventRecord eventRecord, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: com.dynatrace.agent.storage.db.EventDao_Impl.5
            @Override // java.util.concurrent.Callable
            @NonNull
            public Unit call() throws Exception {
                EventDao_Impl.this.__db.beginTransaction();
                try {
                    EventDao_Impl.this.__insertionAdapterOfEventRecord.insert(eventRecord);
                    EventDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.f18162a;
                } finally {
                    EventDao_Impl.this.__db.endTransaction();
                }
            }
        }, interfaceC1526a);
    }
}
