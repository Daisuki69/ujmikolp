package io.split.android.client.storage.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Dao
public interface MyLargeSegmentDao extends SegmentDao<MyLargeSegmentEntity> {
    public static final String TABLE_NAME = "my_large_segments";

    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("SELECT user_key, segment_list, updated_at FROM my_large_segments")
    List<MyLargeSegmentEntity> getAll();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("SELECT user_key, segment_list, updated_at FROM my_large_segments WHERE user_key = :userKey")
    MyLargeSegmentEntity getByUserKey(String str);

    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("SELECT user_key, segment_list, updated_at FROM my_large_segments WHERE user_key = :userKey")
    /* bridge */ /* synthetic */ MyLargeSegmentEntity getByUserKey(String str);

    @Insert(onConflict = 1)
    /* JADX INFO: renamed from: update, reason: avoid collision after fix types in other method */
    void update2(MyLargeSegmentEntity myLargeSegmentEntity);

    @Override // io.split.android.client.storage.db.SegmentDao
    @Insert(onConflict = 1)
    /* bridge */ /* synthetic */ void update(MyLargeSegmentEntity myLargeSegmentEntity);

    @Override // io.split.android.client.storage.db.SegmentDao
    @Query("UPDATE my_large_segments SET user_key = :userKey, segment_list = :segmentList WHERE user_key = :formerUserKey")
    void update(String str, String str2, String str3);
}
