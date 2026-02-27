package io.split.android.client.storage.db.impressions.unique;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface UniqueKeysDao {
    @Query("DELETE FROM unique_keys WHERE user_key IN (:userKeys)")
    void delete(List<String> list);

    @Query("DELETE FROM unique_keys WHERE id IN (:ids)")
    void deleteById(List<Long> list);

    @Query("DELETE FROM unique_keys WHERE status = :status AND created_at < :maxTimestamp AND EXISTS(SELECT 1 FROM unique_keys AS imp WHERE imp.user_key = unique_keys.user_key LIMIT :maxRows)")
    int deleteByStatus(int i, long j, int i4);

    @Query("DELETE FROM unique_keys WHERE created_at < :beforeTimestamp")
    void deleteOutdated(long j);

    @Query("SELECT id, user_key, feature_list, created_at, status FROM unique_keys")
    List<UniqueKeyEntity> getAll();

    @Query("SELECT id, user_key, feature_list, created_at, status FROM unique_keys WHERE created_at >= :fromTimestamp AND status = :status ORDER BY created_at LIMIT :maxRows")
    List<UniqueKeyEntity> getBy(long j, int i, int i4);

    @Insert(onConflict = 1)
    long insert(UniqueKeyEntity uniqueKeyEntity);

    @Insert(onConflict = 1)
    List<Long> insert(List<UniqueKeyEntity> list);

    @Query("UPDATE unique_keys SET status = :status  WHERE id IN (:ids)")
    void updateStatus(List<Long> list, int i);
}
