package io.split.android.client.storage.db.impressions.observer;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface ImpressionsObserverCacheDao {
    @Query("DELETE FROM impressions_observer_cache WHERE hash = :hash")
    void delete(Long l6);

    @Query("DELETE FROM impressions_observer_cache WHERE created_at < :timestamp")
    void deleteOldest(long j);

    @Query("SELECT hash, time, created_at FROM impressions_observer_cache WHERE hash = :hash")
    ImpressionsObserverCacheEntity get(Long l6);

    @Query("SELECT hash, time, created_at FROM impressions_observer_cache ORDER BY created_at ASC LIMIT :limit")
    List<ImpressionsObserverCacheEntity> getAll(int i);

    @Query("INSERT OR REPLACE INTO impressions_observer_cache (hash, time, created_at) VALUES (:hash, :time, :createdAt)")
    void insert(Long l6, Long l8, Long l10);

    @Insert(onConflict = 1)
    void insert(List<ImpressionsObserverCacheEntity> list);
}
