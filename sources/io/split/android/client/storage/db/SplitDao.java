package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface SplitDao {
    @Query("DELETE FROM splits WHERE name IN (:names)")
    void delete(List<String> list);

    @Query("DELETE FROM splits")
    void deleteAll();

    @Query("SELECT name, body, updated_at FROM splits")
    List<SplitEntity> getAll();

    @Insert(onConflict = 1)
    void insert(SplitEntity splitEntity);

    @Insert(onConflict = 1)
    void insert(List<SplitEntity> list);

    @Query("UPDATE splits SET name = :name, body = :body WHERE name = :formerName")
    void update(String str, String str2, String str3);
}
