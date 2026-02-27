package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface MySegmentDao extends SegmentDao<MySegmentEntity> {
    public static final String TABLE_NAME = "my_segments";

    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("SELECT user_key, segment_list, updated_at FROM my_segments")
    List<MySegmentEntity> getAll();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("SELECT user_key, segment_list, updated_at FROM my_segments WHERE user_key = :userKey")
    MySegmentEntity getByUserKey(String str);

    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("SELECT user_key, segment_list, updated_at FROM my_segments WHERE user_key = :userKey")
    /* bridge */ /* synthetic */ MySegmentEntity getByUserKey(String str);

    @Insert(onConflict = 1)
    /* JADX INFO: renamed from: update, reason: avoid collision after fix types in other method */
    void update2(MySegmentEntity mySegmentEntity);

    @Override // io.split.android.client.storage.db.SegmentDao
    @Insert(onConflict = 1)
    /* bridge */ /* synthetic */ void update(MySegmentEntity mySegmentEntity);

    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("UPDATE my_segments SET user_key = :userKey, segment_list = :segmentList WHERE user_key = :formerUserKey")
    void update(String str, String str2, String str3);
}
