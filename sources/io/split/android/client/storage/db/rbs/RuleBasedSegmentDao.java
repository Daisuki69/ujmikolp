package io.split.android.client.storage.db.rbs;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface RuleBasedSegmentDao {
    @Query("DELETE FROM rule_based_segments WHERE name IN (:names)")
    void delete(List<String> list);

    @Query("DELETE FROM rule_based_segments")
    void deleteAll();

    @Query("SELECT name, body, updated_at FROM rule_based_segments")
    List<RuleBasedSegmentEntity> getAll();

    @Insert(onConflict = 1)
    void insert(RuleBasedSegmentEntity ruleBasedSegmentEntity);

    @Insert(onConflict = 1)
    void insert(List<RuleBasedSegmentEntity> list);

    @Query("UPDATE rule_based_segments SET name = :name, body = :body WHERE name = :formerName")
    void update(String str, String str2, String str3);
}
