package io.split.android.client.storage.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SplitQueryDaoImpl implements SplitQueryDao {
    private volatile Map<String, SplitEntity> mCachedSplitsMap;
    private final SplitRoomDatabase mDatabase;
    private final Thread mInitializationThread;
    private final Object mLock = new Object();
    private boolean mIsInitialized = false;
    private boolean mIsInvalidated = false;

    public SplitQueryDaoImpl(SplitRoomDatabase splitRoomDatabase) {
        this.mDatabase = splitRoomDatabase;
        Thread thread = new Thread(new androidx.window.layout.adapter.extensions.a(this, 17));
        this.mInitializationThread = thread;
        thread.setName("SplitMapPrefill");
        thread.start();
    }

    private boolean isValid() {
        return this.mIsInitialized && !this.mIsInvalidated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        Map<String, SplitEntity> mapLoadSplitsMap = loadSplitsMap();
        synchronized (this.mLock) {
            this.mCachedSplitsMap = mapLoadSplitsMap;
            this.mIsInitialized = true;
            this.mLock.notifyAll();
        }
    }

    private Map<String, SplitEntity> loadSplitsMap() {
        int i;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.mDatabase.query("SELECT name, body FROM splits", (Object[]) null);
                HashMap map = new HashMap(2000);
                int columnIndexOrThrow = getColumnIndexOrThrow(cursorQuery, AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndexOrThrow2 = getColumnIndexOrThrow(cursorQuery, TtmlNode.TAG_BODY);
                String[] strArr = new String[100];
                String[] strArr2 = new String[100];
                while (true) {
                    i = 0;
                    while (cursorQuery.moveToNext()) {
                        strArr[i] = cursorQuery.getString(columnIndexOrThrow);
                        strArr2[i] = cursorQuery.getString(columnIndexOrThrow2);
                        i++;
                        if (i == 100) {
                            for (int i4 = 0; i4 < 100; i4++) {
                                SplitEntity splitEntity = new SplitEntity();
                                splitEntity.setName(strArr[i4]);
                                splitEntity.setBody(strArr2[i4]);
                                map.put(strArr[i4], splitEntity);
                            }
                        }
                    }
                    break;
                }
                for (int i6 = 0; i6 < i; i6++) {
                    SplitEntity splitEntity2 = new SplitEntity();
                    splitEntity2.setName(strArr[i6]);
                    splitEntity2.setBody(strArr2[i6]);
                    map.put(strArr[i6], splitEntity2);
                }
                try {
                    cursorQuery.close();
                } catch (Exception unused) {
                }
                return map;
            } catch (Exception e) {
                Ri.a.g("Error executing loadSplitsMap query: " + e.getLocalizedMessage());
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused2) {
                    }
                }
                return new HashMap();
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception unused3) {
                }
            }
            throw th2;
        }
    }

    @Override // io.split.android.client.storage.db.SplitQueryDao
    public Map<String, SplitEntity> getAllAsMap() {
        if (isValid() && !this.mCachedSplitsMap.isEmpty()) {
            return new HashMap(this.mCachedSplitsMap);
        }
        synchronized (this.mLock) {
            try {
                if (isValid() && !this.mCachedSplitsMap.isEmpty()) {
                    return new HashMap(this.mCachedSplitsMap);
                }
                Thread thread = this.mInitializationThread;
                if (thread != null && thread.isAlive()) {
                    try {
                        this.mLock.wait(5000L);
                        if (isValid()) {
                            return new HashMap(this.mCachedSplitsMap);
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                Map<String, SplitEntity> mapLoadSplitsMap = loadSplitsMap();
                this.mCachedSplitsMap = mapLoadSplitsMap;
                this.mIsInitialized = true;
                return new HashMap(mapLoadSplitsMap);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getColumnIndexOrThrow(@NonNull Cursor cursor, @NonNull String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    @Override // io.split.android.client.storage.db.SplitQueryDao
    public void invalidate() {
        synchronized (this.mLock) {
            try {
                if (this.mCachedSplitsMap != null) {
                    this.mCachedSplitsMap.clear();
                }
                this.mIsInvalidated = true;
                this.mLock.notifyAll();
                Ri.a.k("Invalidated preloaded flags");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
