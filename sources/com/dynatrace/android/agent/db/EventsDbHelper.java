package com.dynatrace.android.agent.db;

import We.s;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import androidx.camera.core.impl.a;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.util.Utility;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class EventsDbHelper extends SQLiteOpenHelper {
    static final String COLUMN_APP_ID = "app_id";
    static final String COLUMN_BASIC_SEGMENT = "basic_segment";
    static final String COLUMN_EVENT_ID = "event_id";
    static final String COLUMN_EVENT_SEGMENT = "event_segment";
    static final String COLUMN_EVENT_START = "event_start";
    static final String COLUMN_MULTIPLICITY = "multiplicity";
    static final String COLUMN_ROW_ID = "id";
    static final String COLUMN_SEQUENCE_NUMBER = "sequence_nr";
    static final String COLUMN_SERVER_ID = "server_id";
    static final String COLUMN_SESSION_ID = "session_id";
    static final String COLUMN_SESSION_START = "session_start";
    static final String COLUMN_SR_PARAM = "sr_param";
    static final String COLUMN_VISITOR_ID = "visitor_id";
    private static final String DATABASE_CREATE = "CREATE table Events (id INTEGER PRIMARY KEY AUTOINCREMENT, visitor_id INTEGER NOT NULL, session_id INTEGER NOT NULL, sequence_nr INTEGER NOT NULL, basic_segment TEXT NOT NULL, event_segment TEXT NOT NULL, event_id INTEGER NOT NULL, session_start INTEGER NOT NULL, event_start INTEGER NOT NULL, multiplicity INTEGER NOT NULL,server_id INTEGER NOT NULL,app_id TEXT NOT NULL,sr_param TEXT);";
    static final String DB_NAME = "DTXDb";
    static final int DB_VERSION = 10;
    static final String TABLE_EVENT = "Events";
    private SQLiteStatement stmtDeleteByDate;
    private SQLiteStatement stmtDeleteByDateNoCrashes;
    private SQLiteStatement stmtDeleteByEventId;
    static final int CRASH_EVENT_ID = EventType.CRASH.getProtocolId();
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "EventsDbHelper");

    public EventsDbHelper(Context context) {
        super(context, DB_NAME, (SQLiteDatabase.CursorFactory) null, 10);
        this.stmtDeleteByDate = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ?");
        this.stmtDeleteByDateNoCrashes = getWritableDatabase().compileStatement("DELETE FROM Events WHERE session_start + event_start < ? AND event_id <> " + CRASH_EVENT_ID);
        this.stmtDeleteByEventId = getWritableDatabase().compileStatement("DELETE FROM Events WHERE event_id= ? AND id NOT IN (SELECT id FROM Events WHERE event_id= ? ORDER BY (session_start + event_start) DESC LIMIT ?)");
    }

    private void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, "could not delete table " + str, e);
            }
        }
    }

    private void recreate(SQLiteDatabase sQLiteDatabase, int i, int i4, String str) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, str + " Db.Table(DTXDb.Events) from version " + i + " to " + i4 + ".");
        }
        dropTable(sQLiteDatabase, TABLE_EVENT);
        onCreate(sQLiteDatabase);
    }

    public boolean deleteAllEvents() {
        return getWritableDatabase().delete(TABLE_EVENT, null, null) > 0;
    }

    public void deleteEventsByDate(long j, boolean z4) {
        SQLiteStatement sQLiteStatement = z4 ? this.stmtDeleteByDateNoCrashes : this.stmtDeleteByDate;
        sQLiteStatement.bindLong(1, j);
        int iExecuteUpdateDelete = sQLiteStatement.executeUpdateDelete();
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Rows deleted: " + iExecuteUpdateDelete);
        }
    }

    public int deleteEventsByEventId(int i, int i4) {
        long j = i;
        this.stmtDeleteByEventId.bindLong(1, j);
        this.stmtDeleteByEventId.bindLong(2, j);
        this.stmtDeleteByEventId.bindLong(3, i4);
        int iExecuteUpdateDelete = this.stmtDeleteByEventId.executeUpdateDelete();
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Rows deleted: " + iExecuteUpdateDelete);
        }
        return iExecuteUpdateDelete;
    }

    public void deleteEventsFromVisit(long j, int i) {
        getWritableDatabase().delete(TABLE_EVENT, "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(j), String.valueOf(i)});
    }

    public void deleteEventsWithMismatchAppId(String str) {
        getWritableDatabase().delete(TABLE_EVENT, "app_id!= ?", new String[]{str});
    }

    public void deleteSentEvents(long j, int i, int i4, int i6, long j6) {
        int iDelete = getWritableDatabase().delete(TABLE_EVENT, "visitor_id= ? AND session_id= ? AND sequence_nr= ? AND server_id= ? AND id<= ?", new String[]{String.valueOf(j), String.valueOf(i), String.valueOf(i4), String.valueOf(i6), String.valueOf(j6)});
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Rows removed: " + iDelete);
        }
    }

    public Cursor fetchEvents() {
        return fetchEvents(0L);
    }

    public void insertBatch(LinkedList<DatabaseWriteQueue.DatabaseRecord> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            for (DatabaseWriteQueue.DatabaseRecord databaseRecord : linkedList) {
                try {
                    Session session = databaseRecord.session;
                    int i = session.multiplicity;
                    if (i == -1) {
                        i = 1;
                    }
                    if (session.isActive()) {
                        Session session2 = databaseRecord.session;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(COLUMN_VISITOR_ID, Long.valueOf(session2.visitorId));
                        contentValues.put(COLUMN_SESSION_ID, Integer.valueOf(session2.sessionId));
                        contentValues.put(COLUMN_SEQUENCE_NUMBER, Integer.valueOf(session2.sequenceNumber));
                        contentValues.put(COLUMN_BASIC_SEGMENT, databaseRecord.sObvc);
                        contentValues.put(COLUMN_EVENT_SEGMENT, databaseRecord.sOa);
                        contentValues.put(COLUMN_EVENT_ID, Integer.valueOf(databaseRecord.eventId));
                        contentValues.put(COLUMN_SESSION_START, Long.valueOf(session2.sessionStartTime));
                        contentValues.put(COLUMN_EVENT_START, Long.valueOf(databaseRecord.eventStart));
                        contentValues.put(COLUMN_MULTIPLICITY, Integer.valueOf(i));
                        contentValues.put(COLUMN_SERVER_ID, Integer.valueOf(databaseRecord.serverId));
                        contentValues.put(COLUMN_APP_ID, databaseRecord.appId);
                        contentValues.put(COLUMN_SR_PARAM, session2.srBasicParam);
                        writableDatabase.insert(TABLE_EVENT, null, contentValues);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, "Error inserting batch record into database.", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (Global.DEBUG) {
            Utility.zlogD(TAG, "Creating Db.Table(DTXDb.Events)");
        }
        try {
            sQLiteDatabase.execSQL(DATABASE_CREATE);
        } catch (Exception e) {
            if (Global.DEBUG) {
                Utility.zlogE(TAG, DATABASE_CREATE, e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        recreate(sQLiteDatabase, i, i4, "Downgrading");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        recreate(sQLiteDatabase, i, i4, "Upgrading");
    }

    public boolean updateSrAndMultiplicity(Session session) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_MULTIPLICITY, Integer.valueOf(session.multiplicity));
        contentValues.put(COLUMN_SR_PARAM, session.srBasicParam);
        return getWritableDatabase().update(TABLE_EVENT, contentValues, "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(session.visitorId), String.valueOf(session.sessionId)}) > 0;
    }

    public Cursor fetchEvents(long j) {
        return getReadableDatabase().query(true, TABLE_EVENT, new String[]{"id", COLUMN_VISITOR_ID, COLUMN_SESSION_ID, COLUMN_SEQUENCE_NUMBER, COLUMN_BASIC_SEGMENT, COLUMN_EVENT_SEGMENT, COLUMN_EVENT_ID, COLUMN_SESSION_START, COLUMN_EVENT_START, COLUMN_MULTIPLICITY, COLUMN_SERVER_ID, COLUMN_APP_ID, COLUMN_SR_PARAM}, a.f(j, "id >= "), null, null, null, "visitor_id ASC, session_id ASC, sequence_nr ASC, server_id ASC, id ASC", null);
    }
}
