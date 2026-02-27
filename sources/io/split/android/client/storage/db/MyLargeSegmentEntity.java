package io.split.android.client.storage.db;

import androidx.room.Entity;
import io.split.android.client.storage.db.SegmentEntity;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = MyLargeSegmentDao.TABLE_NAME)
public class MyLargeSegmentEntity extends SegmentEntity {
    public static final SegmentEntity.Creator<MyLargeSegmentEntity> CREATOR = new SegmentEntity.Creator<MyLargeSegmentEntity>() { // from class: io.split.android.client.storage.db.MyLargeSegmentEntity.1
        @Override // io.split.android.client.storage.db.SegmentEntity.Creator
        public MyLargeSegmentEntity createEntity(String str, String str2, long j) {
            MyLargeSegmentEntity myLargeSegmentEntity = new MyLargeSegmentEntity();
            myLargeSegmentEntity.setUserKey(str);
            myLargeSegmentEntity.setSegmentList(str2);
            myLargeSegmentEntity.setUpdatedAt(j);
            return myLargeSegmentEntity;
        }
    };

    public static SegmentEntity.Creator<MyLargeSegmentEntity> creator() {
        return CREATOR;
    }
}
