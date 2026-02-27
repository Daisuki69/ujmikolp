package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface ImpressionDao {
    @Query("DELETE FROM impressions WHERE id IN (:ids)")
    void delete(List<Long> list);

    @Query("DELETE FROM impressions WHERE  status = :status AND created_at < :maxTimestamp AND EXISTS(SELECT 1 FROM impressions AS imp  WHERE imp.id = impressions.id LIMIT :maxRows)")
    int deleteByStatus(int i, long j, int i4);

    @Query("DELETE FROM impressions WHERE created_at < :timestamp")
    void deleteOutdated(long j);

    @Query("SELECT id, test_name, body, created_at, status FROM impressions")
    List<ImpressionEntity> getAll();

    @Query("SELECT id, test_name, body, created_at, status FROM impressions WHERE created_at >= :timestamp AND status = :status ORDER BY created_at LIMIT :maxRows")
    List<ImpressionEntity> getBy(long j, int i, int i4);

    @Insert(onConflict = 1)
    void insert(ImpressionEntity impressionEntity);

    @Insert(onConflict = 1)
    void insert(List<ImpressionEntity> list);

    @Query("UPDATE impressions SET status = :status  WHERE id IN (:ids)")
    void updateStatus(List<Long> list, int i);
}
