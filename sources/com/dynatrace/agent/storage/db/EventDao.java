package com.dynatrace.agent.storage.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import gj.InterfaceC1526a;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Dao
public interface EventDao {
    @Delete
    Object delete(List<EventRecord> list, InterfaceC1526a<? super Unit> interfaceC1526a);

    @Query("DELETE FROM events")
    Object deleteAll(InterfaceC1526a<? super Unit> interfaceC1526a);

    @Query("DELETE FROM events WHERE id IN (:recordIds)")
    Object deleteById(List<Long> list, InterfaceC1526a<? super Unit> interfaceC1526a);

    @Query("DELETE FROM events WHERE :retentionTime < :now - timestamp")
    Object deleteOutdated(long j, long j6, InterfaceC1526a<? super Unit> interfaceC1526a);

    @Query("SELECT id, timestamp, isPriorityData, eventSizeBytes FROM events WHERE isPriorityData = :isPriority LIMIT :limitRows")
    Object fetchEventMetadata(boolean z4, int i, InterfaceC1526a<? super List<EventMetadata>> interfaceC1526a);

    @Query("SELECT * FROM events WHERE id IN (:recordIds)")
    Object fetchEventRecordByIds(List<Long> list, InterfaceC1526a<? super List<EventRecord>> interfaceC1526a);

    @Query("SELECT * FROM events")
    Object getAll(InterfaceC1526a<? super List<EventRecord>> interfaceC1526a);

    @Insert
    Object put(EventRecord eventRecord, InterfaceC1526a<? super Unit> interfaceC1526a);
}
