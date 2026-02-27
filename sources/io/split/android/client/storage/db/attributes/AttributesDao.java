package io.split.android.client.storage.db.attributes;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface AttributesDao {
    @Query("DELETE FROM attributes WHERE user_key = :userKey")
    void deleteAll(String str);

    @Query("SELECT user_key, attributes, updated_at FROM attributes")
    List<AttributesEntity> getAll();

    @Query("SELECT user_key, attributes, updated_at FROM attributes WHERE user_key = :userKey")
    AttributesEntity getByUserKey(String str);

    @Insert(onConflict = 1)
    void update(AttributesEntity attributesEntity);

    @Query("UPDATE attributes SET user_key = :userKey, attributes = :attributes WHERE user_key = :formerUserKey")
    void update(String str, String str2, String str3);
}
