package androidx.room.util;

import a.AbstractC0617a;
import android.database.Cursor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import cj.C1110A;
import cj.C1127m;
import cj.M;
import cj.P;
import cj.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dj.C1406d;
import dj.C1407e;
import dj.C1413k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQuery.getColumnCount() <= 0) {
                Map<String, TableInfo.Column> mapE = M.e();
                cursorQuery.close();
                return mapE;
            }
            int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex2 = cursorQuery.getColumnIndex(SessionDescription.ATTR_TYPE);
            int columnIndex3 = cursorQuery.getColumnIndex("notnull");
            int columnIndex4 = cursorQuery.getColumnIndex("pk");
            int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
            C1407e c1407e = new C1407e();
            while (cursorQuery.moveToNext()) {
                String name = cursorQuery.getString(columnIndex);
                String type = cursorQuery.getString(columnIndex2);
                boolean z4 = cursorQuery.getInt(columnIndex3) != 0;
                int i = cursorQuery.getInt(columnIndex4);
                String string = cursorQuery.getString(columnIndex5);
                j.f(name, "name");
                j.f(type, "type");
                c1407e.put(name, new TableInfo.Column(name, type, z4, i, string, 2));
            }
            C1407e c1407eB = c1407e.b();
            cursorQuery.close();
            return c1407eB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC0617a.p(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(TtmlNode.ATTR_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(TypedValues.TransitionType.S_FROM);
        int columnIndex4 = cursor.getColumnIndex(TypedValues.TransitionType.S_TO);
        C1406d c1406dB = r.b();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i4 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            j.f(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            j.f(string2, "cursor.getString(toColumnIndex)");
            c1406dB.add(new TableInfo.ForeignKeyWithSequence(i, i4, string, string2));
        }
        C1406d c1406dA = r.a(c1406dB);
        j.g(c1406dA, "<this>");
        if (c1406dA.size() <= 1) {
            return C1110A.V(c1406dA);
        }
        Object[] array = c1406dA.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C1127m.c(array);
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex(TtmlNode.ATTR_ID);
            int columnIndex2 = cursorQuery.getColumnIndex("seq");
            int columnIndex3 = cursorQuery.getColumnIndex("table");
            int columnIndex4 = cursorQuery.getColumnIndex("on_delete");
            int columnIndex5 = cursorQuery.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(cursorQuery);
            cursorQuery.moveToPosition(-1);
            C1413k c1413k = new C1413k();
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.getInt(columnIndex2) == 0) {
                    int i = cursorQuery.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = cursorQuery.getString(columnIndex3);
                    j.f(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorQuery.getString(columnIndex4);
                    j.f(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorQuery.getString(columnIndex5);
                    j.f(string3, "cursor.getString(onUpdateColumnIndex)");
                    c1413k.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            C1413k c1413kA = P.a(c1413k);
            cursorQuery.close();
            return c1413kA;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z4) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex(CmcdConfiguration.KEY_CONTENT_ID);
            int columnIndex3 = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = cursorQuery.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i = cursorQuery.getInt(columnIndex);
                        String columnName = cursorQuery.getString(columnIndex3);
                        String str2 = cursorQuery.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        j.f(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                j.f(collectionValues, "columnsMap.values");
                List listV = C1110A.V(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                j.f(collectionValues2, "ordersMap.values");
                TableInfo.Index index = new TableInfo.Index(str, z4, listV, C1110A.V(collectionValues2));
                AbstractC0617a.p(cursorQuery, null);
                return index;
            }
            AbstractC0617a.p(cursorQuery, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(SupportSQLiteDatabase supportSQLiteDatabase, String str) throws IOException {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex2 = cursorQuery.getColumnIndex("origin");
            int columnIndex3 = cursorQuery.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                C1413k c1413k = new C1413k();
                while (cursorQuery.moveToNext()) {
                    if ("c".equals(cursorQuery.getString(columnIndex2))) {
                        String name = cursorQuery.getString(columnIndex);
                        boolean z4 = true;
                        if (cursorQuery.getInt(columnIndex3) != 1) {
                            z4 = false;
                        }
                        j.f(name, "name");
                        TableInfo.Index index = readIndex(supportSQLiteDatabase, name, z4);
                        if (index == null) {
                            cursorQuery.close();
                            return null;
                        }
                        c1413k.add(index);
                    }
                }
                C1413k c1413kA = P.a(c1413k);
                cursorQuery.close();
                return c1413kA;
            }
            cursorQuery.close();
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(SupportSQLiteDatabase database, String tableName) {
        j.g(database, "database");
        j.g(tableName, "tableName");
        return new TableInfo(tableName, readColumns(database, tableName), readForeignKeys(database, tableName), readIndices(database, tableName));
    }
}
