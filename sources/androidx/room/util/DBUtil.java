package androidx.room.util;

import a.AbstractC0617a;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.media3.datasource.cache.c;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import cj.r;
import com.dynatrace.android.agent.Global;
import dj.C1404b;
import dj.C1406d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class DBUtil {
    public static final CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase db2) throws IOException {
        j.g(db2, "db");
        C1406d c1406dB = r.b();
        Cursor cursorQuery = db2.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                c1406dB.add(cursorQuery.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.f18162a;
        cursorQuery.close();
        ListIterator listIterator = r.a(c1406dB).listIterator(0);
        while (true) {
            C1404b c1404b = (C1404b) listIterator;
            if (!c1404b.hasNext()) {
                return;
            }
            String triggerName = (String) c1404b.next();
            j.f(triggerName, "triggerName");
            if (z.w(triggerName, 2, "room_fts_content_sync_", false)) {
                db2.execSQL("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static final void foreignKeyCheck(SupportSQLiteDatabase db2, String tableName) {
        j.g(db2, "db");
        j.g(tableName, "tableName");
        Cursor cursorQuery = db2.query("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (cursorQuery.getCount() > 0) {
                throw new SQLiteConstraintException(processForeignKeyCheckFailure(cursorQuery));
            }
            Unit unit = Unit.f18162a;
            AbstractC0617a.p(cursorQuery, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC0617a.p(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb2 = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(cursor.getString(0));
                sb2.append("'.\n");
            }
            String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                j.f(constraintIndex, "constraintIndex");
                String string = cursor.getString(2);
                j.f(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\nNumber of rows in violation: ");
        sb2.append(count);
        sb2.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c.A(sb2, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb2.append(Global.NEWLINE);
        }
        String string2 = sb2.toString();
        j.f(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public static final Cursor query(RoomDatabase db2, SupportSQLiteQuery sqLiteQuery, boolean z4) {
        j.g(db2, "db");
        j.g(sqLiteQuery, "sqLiteQuery");
        return query(db2, sqLiteQuery, z4, null);
    }

    public static final int readVersion(File databaseFile) throws IOException {
        j.g(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            AbstractC0617a.p(channel, null);
            return i;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC0617a.p(channel, th2);
                throw th3;
            }
        }
    }

    public static final Cursor query(RoomDatabase db2, SupportSQLiteQuery sqLiteQuery, boolean z4, CancellationSignal cancellationSignal) {
        j.g(db2, "db");
        j.g(sqLiteQuery, "sqLiteQuery");
        Cursor cursorQuery = db2.query(sqLiteQuery, cancellationSignal);
        if (!z4 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? CursorUtil.copyAndClose(cursorQuery) : cursorQuery;
    }
}
