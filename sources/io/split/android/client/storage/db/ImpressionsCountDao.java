package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface ImpressionsCountDao {
    @Query("DELETE FROM impressions_count WHERE id IN (:ids)")
    void delete(List<Long> list);

    @Query("DELETE FROM impressions_count WHERE  status = :status AND created_at < :maxTimestamp AND EXISTS(SELECT 1 FROM impressions_count AS imp  WHERE imp.id = impressions_count.id LIMIT :maxRows)")
    int deleteByStatus(int i, long j, int i4);

    @Query("DELETE FROM impressions_count WHERE created_at < :timestamp")
    void deleteOutdated(long j);

    @Query("SELECT id, body, created_at, status FROM impressions_count")
    List<ImpressionsCountEntity> getAll();

    @Query("SELECT id, body, created_at, status FROM impressions_count WHERE created_at >= :timestamp AND status = :status ORDER BY created_at LIMIT :maxRows")
    List<ImpressionsCountEntity> getBy(long j, int i, int i4);

    @Insert(onConflict = 1)
    void insert(ImpressionsCountEntity impressionsCountEntity);

    @Insert(onConflict = 1)
    void insert(List<ImpressionsCountEntity> list);

    @Query("UPDATE impressions_count SET status = :status  WHERE id IN (:ids)")
    void updateStatus(List<Long> list, int i);
}
