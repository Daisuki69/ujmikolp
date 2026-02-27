package mx_com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import io.split.android.client.dtos.SerializableEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import mx_com.mixpanel.android.util.MPLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class MPDbAdapter {
    private static final String ANONYMOUS_PEOPLE_TIME_INDEX;
    public static final int AUTOMATIC_DATA_COLUMN_INDEX = 3;
    public static final int CREATED_AT_COLUMN_INDEX = 2;
    private static final String DATABASE_NAME = "mx_mixpanel";
    private static final int DATABASE_VERSION = 7;
    public static final int DATA_COLUMN_INDEX = 1;
    public static final int DB_OUT_OF_MEMORY_ERROR = -2;
    public static final int DB_UNDEFINED_CODE = -3;
    public static final int DB_UPDATE_ERROR = -1;
    private static final String EVENTS_TIME_INDEX;
    private static final String GROUPS_TIME_INDEX;
    public static final int ID_COLUMN_INDEX = 0;
    public static final String KEY_DATA = "data";
    private static final String LOGTAG = "MixpanelAPI.Database";
    private static final int MAX_DB_VERSION = 7;
    private static final int MIN_DB_VERSION = 4;
    private static final String PEOPLE_TIME_INDEX;
    public static final int TOKEN_COLUMN_INDEX = 4;
    private final MPDatabaseHelper mDb;
    private static final Map<Context, MPDbAdapter> sInstances = new HashMap();
    public static final String KEY_CREATED_AT = "created_at";
    public static final String KEY_AUTOMATIC_DATA = "automatic_data";
    public static final String KEY_TOKEN = "token";
    private static final String CREATE_EVENTS_TABLE = "CREATE TABLE " + Table.EVENTS.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + KEY_CREATED_AT + " INTEGER NOT NULL, " + KEY_AUTOMATIC_DATA + " INTEGER DEFAULT 0, " + KEY_TOKEN + " STRING NOT NULL DEFAULT '')";
    private static final String CREATE_PEOPLE_TABLE = "CREATE TABLE " + Table.PEOPLE.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + KEY_CREATED_AT + " INTEGER NOT NULL, " + KEY_AUTOMATIC_DATA + " INTEGER DEFAULT 0, " + KEY_TOKEN + " STRING NOT NULL DEFAULT '')";
    private static final String CREATE_GROUPS_TABLE = "CREATE TABLE " + Table.GROUPS.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + KEY_CREATED_AT + " INTEGER NOT NULL, " + KEY_AUTOMATIC_DATA + " INTEGER DEFAULT 0, " + KEY_TOKEN + " STRING NOT NULL DEFAULT '')";
    private static final String CREATE_ANONYMOUS_PEOPLE_TABLE = "CREATE TABLE " + Table.ANONYMOUS_PEOPLE.getName() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, " + KEY_CREATED_AT + " INTEGER NOT NULL, " + KEY_AUTOMATIC_DATA + " INTEGER DEFAULT 0, " + KEY_TOKEN + " STRING NOT NULL DEFAULT '')";

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb2.append(Table.EVENTS.getName());
        sb2.append(" (");
        sb2.append(KEY_CREATED_AT);
        sb2.append(");");
        EVENTS_TIME_INDEX = sb2.toString();
        PEOPLE_TIME_INDEX = "CREATE INDEX IF NOT EXISTS time_idx ON " + Table.PEOPLE.getName() + " (" + KEY_CREATED_AT + ");";
        GROUPS_TIME_INDEX = "CREATE INDEX IF NOT EXISTS time_idx ON " + Table.GROUPS.getName() + " (" + KEY_CREATED_AT + ");";
        ANONYMOUS_PEOPLE_TIME_INDEX = "CREATE INDEX IF NOT EXISTS time_idx ON " + Table.ANONYMOUS_PEOPLE.getName() + " (" + KEY_CREATED_AT + ");";
    }

    public enum Table {
        EVENTS("events"),
        PEOPLE("people"),
        ANONYMOUS_PEOPLE("anonymous_people"),
        GROUPS("groups");

        private final String mTableName;

        Table(String str) {
            this.mTableName = str;
        }

        public String getName() {
            return this.mTableName;
        }
    }

    private static class MPDatabaseHelper extends SQLiteOpenHelper {
        private final MPConfig mConfig;
        private final Context mContext;
        private final File mDatabaseFile;

        MPDatabaseHelper(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
            this.mDatabaseFile = context.getDatabasePath(str);
            this.mConfig = MPConfig.getInstance(context);
            this.mContext = context;
        }

        public void deleteDatabase() {
            close();
            this.mDatabaseFile.delete();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            MPLog.v(MPDbAdapter.LOGTAG, "Creating a new Mixpanel events DB");
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_EVENTS_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_PEOPLE_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_GROUPS_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_ANONYMOUS_PEOPLE_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.EVENTS_TIME_INDEX);
            sQLiteDatabase.execSQL(MPDbAdapter.PEOPLE_TIME_INDEX);
            sQLiteDatabase.execSQL(MPDbAdapter.GROUPS_TIME_INDEX);
            sQLiteDatabase.execSQL(MPDbAdapter.ANONYMOUS_PEOPLE_TIME_INDEX);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
            MPLog.v(MPDbAdapter.LOGTAG, "Upgrading app, replacing Mixpanel events DB");
            if (i >= 4 && i4 <= 7) {
                if (i == 4) {
                    migrateTableFrom4To5(sQLiteDatabase);
                    migrateTableFrom5To6(sQLiteDatabase);
                    migrateTableFrom6To7(sQLiteDatabase);
                }
                if (i == 5) {
                    migrateTableFrom5To6(sQLiteDatabase);
                    migrateTableFrom6To7(sQLiteDatabase);
                }
                if (i == 6) {
                    migrateTableFrom6To7(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.EVENTS.getName());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.PEOPLE.getName());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.GROUPS.getName());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.ANONYMOUS_PEOPLE.getName());
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_EVENTS_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_PEOPLE_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_GROUPS_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_ANONYMOUS_PEOPLE_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.EVENTS_TIME_INDEX);
            sQLiteDatabase.execSQL(MPDbAdapter.PEOPLE_TIME_INDEX);
            sQLiteDatabase.execSQL(MPDbAdapter.GROUPS_TIME_INDEX);
            sQLiteDatabase.execSQL(MPDbAdapter.ANONYMOUS_PEOPLE_TIME_INDEX);
        }

        public boolean aboveMemThreshold() {
            if (this.mDatabaseFile.exists()) {
                return this.mDatabaseFile.length() > Math.max(this.mDatabaseFile.getUsableSpace(), (long) this.mConfig.getMinimumDatabaseLimit()) || this.mDatabaseFile.length() > ((long) this.mConfig.getMaximumDatabaseLimit());
            }
            return false;
        }

        private void migrateTableFrom4To5(SQLiteDatabase sQLiteDatabase) {
            int i;
            String string;
            sQLiteDatabase.execSQL("ALTER TABLE " + Table.EVENTS.getName() + " ADD COLUMN " + MPDbAdapter.KEY_AUTOMATIC_DATA + " INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE " + Table.PEOPLE.getName() + " ADD COLUMN " + MPDbAdapter.KEY_AUTOMATIC_DATA + " INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE " + Table.EVENTS.getName() + " ADD COLUMN " + MPDbAdapter.KEY_TOKEN + " STRING NOT NULL DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE " + Table.PEOPLE.getName() + " ADD COLUMN " + MPDbAdapter.KEY_TOKEN + " STRING NOT NULL DEFAULT ''");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SELECT * FROM ");
            sb2.append(Table.EVENTS.getName());
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    String string2 = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1)).getJSONObject(SerializableEvent.PROPERTIES_FIELD).getString(MPDbAdapter.KEY_TOKEN);
                    sQLiteDatabase.execSQL("UPDATE " + Table.EVENTS.getName() + " SET " + MPDbAdapter.KEY_TOKEN + " = '" + string2 + "' WHERE _id = " + cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0));
                } catch (JSONException unused) {
                    sQLiteDatabase.delete(Table.EVENTS.getName(), "_id = 0", null);
                }
            }
            Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM " + Table.PEOPLE.getName(), null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    string = new JSONObject(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("data") >= 0 ? cursorRawQuery2.getColumnIndex("data") : 1)).getString("$token");
                    i = cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("_id") >= 0 ? cursorRawQuery2.getColumnIndex("_id") : 0);
                } catch (JSONException unused2) {
                    i = 0;
                }
                try {
                    sQLiteDatabase.execSQL("UPDATE " + Table.PEOPLE.getName() + " SET " + MPDbAdapter.KEY_TOKEN + " = '" + string + "' WHERE _id = " + i);
                } catch (JSONException unused3) {
                    sQLiteDatabase.delete(Table.PEOPLE.getName(), "_id = " + i, null);
                }
            }
        }

        private void migrateTableFrom5To6(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_GROUPS_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.GROUPS_TIME_INDEX);
        }

        private void migrateTableFrom6To7(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(MPDbAdapter.CREATE_ANONYMOUS_PEOPLE_TABLE);
            sQLiteDatabase.execSQL(MPDbAdapter.ANONYMOUS_PEOPLE_TIME_INDEX);
            File file = new File(this.mContext.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String str : file.list(new FilenameFilter() { // from class: mx_com.mixpanel.android.mpmetrics.MPDbAdapter.MPDatabaseHelper.1
                    @Override // java.io.FilenameFilter
                    public boolean accept(File file2, String str2) {
                        return str2.startsWith("mx_com.mixpanel.android.mpmetrics.MixpanelAPI_");
                    }
                })) {
                    SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(str.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                try {
                                    try {
                                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                                        String string2 = jSONObject.getString("$token");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("data", jSONObject.toString());
                                        contentValues.put(MPDbAdapter.KEY_CREATED_AT, Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put(MPDbAdapter.KEY_AUTOMATIC_DATA, (Boolean) false);
                                        contentValues.put(MPDbAdapter.KEY_TOKEN, string2);
                                        sQLiteDatabase.insert(Table.ANONYMOUS_PEOPLE.getName(), null, contentValues);
                                    } catch (JSONException unused) {
                                    }
                                } catch (Throwable th2) {
                                    sQLiteDatabase.endTransaction();
                                    throw th2;
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.remove("waiting_array");
                        editorEdit.apply();
                    }
                }
            }
        }
    }

    public MPDbAdapter(Context context) {
        this(context, DATABASE_NAME);
    }

    public MPDbAdapter(Context context, String str) {
        this.mDb = new MPDatabaseHelper(context, str);
    }

    public static MPDbAdapter getInstance(Context context) {
        MPDbAdapter mPDbAdapter;
        Map<Context, MPDbAdapter> map = sInstances;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (!map.containsKey(applicationContext)) {
                mPDbAdapter = new MPDbAdapter(applicationContext);
                map.put(applicationContext, mPDbAdapter);
            } else {
                mPDbAdapter = map.get(applicationContext);
            }
        }
        return mPDbAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[PHI: r2
  0x007e: PHI (r2v5 android.database.Cursor) = (r2v17 android.database.Cursor), (r2v18 android.database.Cursor) binds: [B:16:0x007c, B:25:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int addJSON(org.json.JSONObject r8, java.lang.String r9, mx_com.mixpanel.android.mpmetrics.MPDbAdapter.Table r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.aboveMemThreshold()
            java.lang.String r1 = "MixpanelAPI.Database"
            if (r0 == 0) goto Lf
            java.lang.String r8 = "There is not enough space left on the device or the data was over the maximum size limit so it was discarded"
            mx_com.mixpanel.android.util.MPLog.e(r1, r8)
            r8 = -2
            return r8
        Lf:
            java.lang.String r10 = r10.getName()
            r0 = -1
            r2 = 0
            mx_com.mixpanel.android.mpmetrics.MPDbAdapter$MPDatabaseHelper r3 = r7.mDb     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r4.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r5 = "data"
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r4.put(r5, r8)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r8 = "created_at"
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r4.put(r8, r5)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r8 = "token"
            r4.put(r8, r9)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r3.insert(r10, r2, r4)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r8.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r4 = "SELECT COUNT(*) FROM "
            r8.append(r4)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r8.append(r10)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r10 = " WHERE token='"
            r8.append(r10)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r8.append(r9)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r9 = "'"
            r8.append(r9)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            android.database.Cursor r8 = r3.rawQuery(r8, r2)     // Catch: java.lang.Throwable -> L75 java.lang.OutOfMemoryError -> L77 android.database.sqlite.SQLiteException -> L82
            r8.moveToFirst()     // Catch: java.lang.OutOfMemoryError -> L73 android.database.sqlite.SQLiteException -> L83 java.lang.Throwable -> L98
            r9 = 0
            int r0 = r8.getInt(r9)     // Catch: java.lang.OutOfMemoryError -> L73 android.database.sqlite.SQLiteException -> L83 java.lang.Throwable -> L98
            if (r8 == 0) goto L6d
            r8.close()
        L6d:
            mx_com.mixpanel.android.mpmetrics.MPDbAdapter$MPDatabaseHelper r8 = r7.mDb
            r8.close()
            goto L97
        L73:
            r2 = r8
            goto L77
        L75:
            r9 = move-exception
            goto L9a
        L77:
            java.lang.String r8 = "Out of memory when adding Mixpanel data to table"
            mx_com.mixpanel.android.util.MPLog.e(r1, r8)     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L6d
        L7e:
            r2.close()
            goto L6d
        L82:
            r8 = r2
        L83:
            java.lang.String r9 = "Could not add Mixpanel data to table"
            mx_com.mixpanel.android.util.MPLog.e(r1, r9)     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L8e
            r8.close()     // Catch: java.lang.Throwable -> L98
            goto L8f
        L8e:
            r2 = r8
        L8f:
            mx_com.mixpanel.android.mpmetrics.MPDbAdapter$MPDatabaseHelper r8 = r7.mDb     // Catch: java.lang.Throwable -> L75
            r8.deleteDatabase()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L6d
            goto L7e
        L97:
            return r0
        L98:
            r9 = move-exception
            r2 = r8
        L9a:
            if (r2 == 0) goto L9f
            r2.close()
        L9f:
            mx_com.mixpanel.android.mpmetrics.MPDbAdapter$MPDatabaseHelper r8 = r7.mDb
            r8.close()
            goto La6
        La5:
            throw r9
        La6:
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: mx_com.mixpanel.android.mpmetrics.MPDbAdapter.addJSON(org.json.JSONObject, java.lang.String, mx_com.mixpanel.android.mpmetrics.MPDbAdapter$Table):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    int pushAnonymousUpdatesToPeopleDb(String str, String str2) throws Throwable {
        Cursor cursorRawQuery;
        SQLiteDatabase writableDatabase;
        if (aboveMemThreshold()) {
            MPLog.e(LOGTAG, "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        int i = -1;
        ?? r72 = 0;
        r72 = 0;
        r72 = 0;
        Cursor cursor = null;
        try {
            try {
                try {
                    writableDatabase = this.mDb.getWritableDatabase();
                    cursorRawQuery = writableDatabase.rawQuery(new StringBuffer("SELECT * FROM " + Table.ANONYMOUS_PEOPLE.getName() + " WHERE " + KEY_TOKEN + " = '" + str + "'").toString(), null);
                } catch (Throwable th2) {
                    th = th2;
                    if (r72 != 0) {
                        r72.close();
                    }
                    this.mDb.close();
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                cursorRawQuery = null;
            }
            try {
                writableDatabase.beginTransaction();
                while (cursorRawQuery.moveToNext()) {
                    try {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(KEY_CREATED_AT, Long.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(KEY_CREATED_AT) >= 0 ? cursorRawQuery.getColumnIndex(KEY_CREATED_AT) : 2)));
                            contentValues.put(KEY_AUTOMATIC_DATA, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(KEY_AUTOMATIC_DATA) >= 0 ? cursorRawQuery.getColumnIndex(KEY_AUTOMATIC_DATA) : 3)));
                            contentValues.put(KEY_TOKEN, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(KEY_TOKEN) >= 0 ? cursorRawQuery.getColumnIndex(KEY_TOKEN) : 4));
                            JSONObject jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1));
                            jSONObject.put("$distinct_id", str2);
                            contentValues.put("data", jSONObject.toString());
                            writableDatabase.insert(Table.PEOPLE.getName(), null, contentValues);
                            int i4 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                            writableDatabase.delete(Table.ANONYMOUS_PEOPLE.getName(), "_id = " + i4, null);
                            i++;
                        } catch (JSONException unused) {
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (SQLiteException e7) {
                e = e7;
                MPLog.e(LOGTAG, "Could not push anonymous updates records from " + Table.ANONYMOUS_PEOPLE.getName() + ". Re-initializing database.", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                } else {
                    cursor = cursorRawQuery;
                }
                this.mDb.deleteDatabase();
                r72 = cursor;
                if (cursor != null) {
                    cursor.close();
                    r72 = cursor;
                }
            }
            this.mDb.close();
            return i;
        } catch (Throwable th3) {
            th = th3;
            r72 = str;
        }
    }

    int rewriteEventDataWithProperties(Map<String, String> map, String str) throws Throwable {
        Cursor cursorRawQuery;
        SQLiteDatabase writableDatabase;
        if (aboveMemThreshold()) {
            MPLog.e(LOGTAG, "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        int i = 0;
        Cursor cursor = null;
        try {
            try {
                writableDatabase = this.mDb.getWritableDatabase();
                cursorRawQuery = writableDatabase.rawQuery(new StringBuffer("SELECT * FROM " + Table.EVENTS.getName() + " WHERE " + KEY_TOKEN + " = '" + str + "'").toString(), null);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    writableDatabase.beginTransaction();
                    int i4 = 0;
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            try {
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    JSONObject jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1));
                                    JSONObject jSONObject2 = jSONObject.getJSONObject(SerializableEvent.PROPERTIES_FIELD);
                                    for (Map.Entry<String, String> entry : map.entrySet()) {
                                        jSONObject2.put(entry.getKey(), entry.getValue());
                                    }
                                    jSONObject.put(SerializableEvent.PROPERTIES_FIELD, jSONObject2);
                                    contentValues.put("data", jSONObject.toString());
                                    int i6 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                                    writableDatabase.update(Table.EVENTS.getName(), contentValues, "_id = " + i6, null);
                                    i4++;
                                } catch (JSONException unused) {
                                }
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            i = i4;
                            MPLog.e(LOGTAG, "Could not re-write events history. Re-initializing database.", e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            } else {
                                cursor = cursorRawQuery;
                            }
                            this.mDb.deleteDatabase();
                            if (cursor != null) {
                                cursor.close();
                            }
                            this.mDb.close();
                            return i;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    this.mDb.close();
                    return i4;
                } catch (SQLiteException e7) {
                    e = e7;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                this.mDb.close();
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorRawQuery = null;
        }
    }

    public void cleanupEvents(String str, Table table, String str2) {
        String name = table.getName();
        try {
            try {
                try {
                    this.mDb.getWritableDatabase().delete(name, new StringBuffer("_id <= " + str + " AND " + KEY_TOKEN + " = '" + str2 + "'").toString(), null);
                } catch (SQLiteException e) {
                    MPLog.e(LOGTAG, "Could not clean sent Mixpanel records from " + name + ". Re-initializing database.", e);
                    this.mDb.deleteDatabase();
                }
            } catch (Exception e7) {
                MPLog.e(LOGTAG, "Unknown exception. Could not clean sent Mixpanel records from " + name + ".Re-initializing database.", e7);
                this.mDb.deleteDatabase();
            }
        } finally {
            this.mDb.close();
        }
    }

    public void cleanupEvents(long j, Table table) {
        String name = table.getName();
        try {
            try {
                this.mDb.getWritableDatabase().delete(name, "created_at <= " + j, null);
            } catch (SQLiteException e) {
                MPLog.e(LOGTAG, "Could not clean timed-out Mixpanel records from " + name + ". Re-initializing database.", e);
                this.mDb.deleteDatabase();
            }
        } finally {
            this.mDb.close();
        }
    }

    public void cleanupAllEvents(Table table, String str) {
        String name = table.getName();
        try {
            try {
                this.mDb.getWritableDatabase().delete(name, "token = '" + str + "'", null);
            } catch (SQLiteException e) {
                MPLog.e(LOGTAG, "Could not clean timed-out Mixpanel records from " + name + ". Re-initializing database.", e);
                this.mDb.deleteDatabase();
            }
        } finally {
            this.mDb.close();
        }
    }

    public void deleteDB() {
        this.mDb.deleteDatabase();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] generateDataString(mx_com.mixpanel.android.mpmetrics.MPDbAdapter.Table r17, java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx_com.mixpanel.android.mpmetrics.MPDbAdapter.generateDataString(mx_com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String):java.lang.String[]");
    }

    public File getDatabaseFile() {
        return this.mDb.mDatabaseFile;
    }

    protected boolean aboveMemThreshold() {
        return this.mDb.aboveMemThreshold();
    }
}
