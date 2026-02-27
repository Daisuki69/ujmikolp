package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface EventDao {
    @Query("DELETE FROM events WHERE id IN (:ids)")
    void delete(List<Long> list);

    @Query("DELETE FROM events WHERE  status = :status AND created_at < :maxTimestamp AND EXISTS(SELECT 1 FROM events AS eve  WHERE eve.id = events.id LIMIT :maxRows)")
    int deleteByStatus(int i, long j, int i4);

    @Query("DELETE FROM events WHERE created_at < :updateAt")
    void deleteOutdated(long j);

    @Query("SELECT id, body, created_at, status FROM events")
    List<EventEntity> getAll();

    @Query("SELECT id, body, created_at, status FROM events WHERE created_at >= :updateAt AND status = :status ORDER BY created_at LIMIT :maxRows")
    List<EventEntity> getBy(long j, int i, int i4);

    @Insert(onConflict = 1)
    void insert(EventEntity eventEntity);

    @Insert(onConflict = 1)
    void insert(List<EventEntity> list);

    @Query("UPDATE events SET status = :status  WHERE id IN (:ids)")
    void updateStatus(List<Long> list, int i);
}
