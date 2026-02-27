package androidx.work.impl.model;

import Ej.InterfaceC0230h;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(@NonNull HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new a(this, 1));
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i, it.next());
            i++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<Data> arrayList = map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(cursorQuery.getBlob(0)));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(@NonNull HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            RelationUtil.recursiveFetchHashMap(map, true, new a(this, 0));
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryAcquire.bindString(i, it.next());
            i++;
        }
        Cursor cursorQuery = DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorQuery.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(cursorQuery.getString(0));
                }
            }
        } finally {
            cursorQuery.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1(HashMap map) {
        __fetchRelationshipWorkProgressAsandroidxWorkData(map);
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$__fetchRelationshipWorkTagAsjavaLangString$0(HashMap map) {
        __fetchRelationshipWorkTagAsjavaLangString(map);
        return Unit.f18162a;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        boolean z4;
        boolean z5;
        boolean z8;
        int i;
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.__db, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, TtmlNode.ATTR_ID);
            int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, DownloadService.KEY_STOP_REASON);
            int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
            int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
            int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
            int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
            int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
            int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i4 = columnIndex13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorQuery.moveToNext()) {
                int i6 = columnIndex12;
                String string = cursorQuery.getString(columnIndex);
                if (map.containsKey(string)) {
                    i = columnIndex11;
                } else {
                    i = columnIndex11;
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorQuery.getString(columnIndex);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i6;
                columnIndex11 = i;
            }
            int i10 = columnIndex11;
            int i11 = columnIndex12;
            cursorQuery.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(map);
            __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                long j6 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                long j7 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                boolean z9 = false;
                int i12 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                long j9 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                long j10 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                int i13 = i10;
                int i14 = i13 == -1 ? 0 : cursorQuery.getInt(i13);
                i10 = i13;
                int i15 = i11;
                int i16 = i15 == -1 ? 0 : cursorQuery.getInt(i15);
                i11 = i15;
                int i17 = i4;
                long j11 = i17 == -1 ? 0L : cursorQuery.getLong(i17);
                i4 = i17;
                int i18 = columnIndex14;
                int i19 = i18 == -1 ? 0 : cursorQuery.getInt(i18);
                columnIndex14 = i18;
                int i20 = columnIndex15;
                NetworkType networkTypeIntToNetworkType = i20 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i20));
                columnIndex15 = i20;
                int i21 = columnIndex16;
                NetworkRequestCompat networkRequest$work_runtime_release = i21 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i21));
                columnIndex16 = i21;
                int i22 = columnIndex17;
                if (i22 == -1) {
                    z4 = false;
                } else {
                    z4 = cursorQuery.getInt(i22) != 0;
                }
                columnIndex17 = i22;
                int i23 = columnIndex18;
                if (i23 == -1) {
                    z5 = false;
                } else {
                    z5 = cursorQuery.getInt(i23) != 0;
                }
                columnIndex18 = i23;
                int i24 = columnIndex19;
                if (i24 == -1) {
                    z8 = false;
                } else {
                    z8 = cursorQuery.getInt(i24) != 0;
                }
                columnIndex19 = i24;
                int i25 = columnIndex20;
                if (i25 != -1 && cursorQuery.getInt(i25) != 0) {
                    z9 = true;
                }
                columnIndex20 = i25;
                int i26 = columnIndex21;
                boolean z10 = z9;
                long j12 = i26 == -1 ? 0L : cursorQuery.getLong(i26);
                columnIndex21 = i26;
                int i27 = columnIndex22;
                long j13 = i27 != -1 ? cursorQuery.getLong(i27) : 0L;
                columnIndex22 = i27;
                int i28 = columnIndex23;
                columnIndex23 = i28;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j6, j7, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z4, z5, z8, z10, j12, j13, i28 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i28))), i12, backoffPolicyIntToBackoffPolicy, j9, j10, i14, i16, j11, i19, map.get(cursorQuery.getString(columnIndex)), map2.get(cursorQuery.getString(columnIndex))));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public InterfaceC0230h getWorkInfoPojosFlow(final SupportSQLiteQuery supportSQLiteQuery) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                boolean z4;
                boolean z5;
                boolean z8;
                int i;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, TtmlNode.ATTR_ID);
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, DownloadService.KEY_STOP_REASON);
                    int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i4 = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i6 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (map.containsKey(string)) {
                            i = columnIndex11;
                        } else {
                            i = columnIndex11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i6;
                        columnIndex11 = i;
                    }
                    int i10 = columnIndex11;
                    int i11 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j6 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j7 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        boolean z9 = false;
                        int i12 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                        long j9 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j10 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i13 = i10;
                        int i14 = i13 == -1 ? 0 : cursorQuery.getInt(i13);
                        i10 = i13;
                        int i15 = i11;
                        int i16 = i15 == -1 ? 0 : cursorQuery.getInt(i15);
                        i11 = i15;
                        int i17 = i4;
                        long j11 = i17 == -1 ? 0L : cursorQuery.getLong(i17);
                        i4 = i17;
                        int i18 = columnIndex14;
                        int i19 = i18 == -1 ? 0 : cursorQuery.getInt(i18);
                        columnIndex14 = i18;
                        int i20 = columnIndex15;
                        NetworkType networkTypeIntToNetworkType = i20 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i20));
                        columnIndex15 = i20;
                        int i21 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i21 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i21));
                        columnIndex16 = i21;
                        int i22 = columnIndex17;
                        if (i22 == -1) {
                            z4 = false;
                        } else {
                            z4 = cursorQuery.getInt(i22) != 0;
                        }
                        columnIndex17 = i22;
                        int i23 = columnIndex18;
                        if (i23 == -1) {
                            z5 = false;
                        } else {
                            z5 = cursorQuery.getInt(i23) != 0;
                        }
                        columnIndex18 = i23;
                        int i24 = columnIndex19;
                        if (i24 == -1) {
                            z8 = false;
                        } else {
                            z8 = cursorQuery.getInt(i24) != 0;
                        }
                        columnIndex19 = i24;
                        int i25 = columnIndex20;
                        if (i25 != -1 && cursorQuery.getInt(i25) != 0) {
                            z9 = true;
                        }
                        columnIndex20 = i25;
                        int i26 = columnIndex21;
                        boolean z10 = z9;
                        long j12 = i26 == -1 ? 0L : cursorQuery.getLong(i26);
                        columnIndex21 = i26;
                        int i27 = columnIndex22;
                        long j13 = i27 != -1 ? cursorQuery.getLong(i27) : 0L;
                        columnIndex22 = i27;
                        int i28 = columnIndex23;
                        columnIndex23 = i28;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j6, j7, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z4, z5, z8, z10, j12, j13, i28 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i28))), i12, backoffPolicyIntToBackoffPolicy, j9, j10, i14, i16, j11, i19, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            @Override // java.util.concurrent.Callable
            @Nullable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                boolean z4;
                boolean z5;
                boolean z8;
                int i;
                Cursor cursorQuery = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(cursorQuery, TtmlNode.ATTR_ID);
                    int columnIndex2 = CursorUtil.getColumnIndex(cursorQuery, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(cursorQuery, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(cursorQuery, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(cursorQuery, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(cursorQuery, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(cursorQuery, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(cursorQuery, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(cursorQuery, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(cursorQuery, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(cursorQuery, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(cursorQuery, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(cursorQuery, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(cursorQuery, DownloadService.KEY_STOP_REASON);
                    int columnIndex15 = CursorUtil.getColumnIndex(cursorQuery, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(cursorQuery, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(cursorQuery, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(cursorQuery, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(cursorQuery, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(cursorQuery, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(cursorQuery, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(cursorQuery, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(cursorQuery, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i4 = columnIndex13;
                    HashMap map2 = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        int i6 = columnIndex12;
                        String string = cursorQuery.getString(columnIndex);
                        if (map.containsKey(string)) {
                            i = columnIndex11;
                        } else {
                            i = columnIndex11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i6;
                        columnIndex11 = i;
                    }
                    int i10 = columnIndex11;
                    int i11 = columnIndex12;
                    cursorQuery.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : cursorQuery.getString(columnIndex);
                        WorkInfo.State stateIntToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(cursorQuery.getInt(columnIndex2));
                        Data dataFromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(cursorQuery.getBlob(columnIndex3));
                        long j = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        long j6 = columnIndex5 == -1 ? 0L : cursorQuery.getLong(columnIndex5);
                        long j7 = columnIndex6 == -1 ? 0L : cursorQuery.getLong(columnIndex6);
                        boolean z9 = false;
                        int i12 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorQuery.getInt(columnIndex8));
                        long j9 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j10 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        int i13 = i10;
                        int i14 = i13 == -1 ? 0 : cursorQuery.getInt(i13);
                        i10 = i13;
                        int i15 = i11;
                        int i16 = i15 == -1 ? 0 : cursorQuery.getInt(i15);
                        i11 = i15;
                        int i17 = i4;
                        long j11 = i17 == -1 ? 0L : cursorQuery.getLong(i17);
                        i4 = i17;
                        int i18 = columnIndex14;
                        int i19 = i18 == -1 ? 0 : cursorQuery.getInt(i18);
                        columnIndex14 = i18;
                        int i20 = columnIndex15;
                        NetworkType networkTypeIntToNetworkType = i20 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorQuery.getInt(i20));
                        columnIndex15 = i20;
                        int i21 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i21 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorQuery.getBlob(i21));
                        columnIndex16 = i21;
                        int i22 = columnIndex17;
                        if (i22 == -1) {
                            z4 = false;
                        } else {
                            z4 = cursorQuery.getInt(i22) != 0;
                        }
                        columnIndex17 = i22;
                        int i23 = columnIndex18;
                        if (i23 == -1) {
                            z5 = false;
                        } else {
                            z5 = cursorQuery.getInt(i23) != 0;
                        }
                        columnIndex18 = i23;
                        int i24 = columnIndex19;
                        if (i24 == -1) {
                            z8 = false;
                        } else {
                            z8 = cursorQuery.getInt(i24) != 0;
                        }
                        columnIndex19 = i24;
                        int i25 = columnIndex20;
                        if (i25 != -1 && cursorQuery.getInt(i25) != 0) {
                            z9 = true;
                        }
                        columnIndex20 = i25;
                        int i26 = columnIndex21;
                        boolean z10 = z9;
                        long j12 = i26 == -1 ? 0L : cursorQuery.getLong(i26);
                        columnIndex21 = i26;
                        int i27 = columnIndex22;
                        long j13 = i27 != -1 ? cursorQuery.getLong(i27) : 0L;
                        columnIndex22 = i27;
                        int i28 = columnIndex23;
                        columnIndex23 = i28;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j6, j7, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z4, z5, z8, z10, j12, j13, i28 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorQuery.getBlob(i28))), i12, backoffPolicyIntToBackoffPolicy, j9, j10, i14, i16, j11, i19, (ArrayList) map.get(cursorQuery.getString(columnIndex)), (ArrayList) map2.get(cursorQuery.getString(columnIndex))));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
        });
    }
}
