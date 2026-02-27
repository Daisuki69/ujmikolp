package io.split.android.client.storage.db;

import androidx.room.Entity;
import io.split.android.client.storage.db.SegmentEntity;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = MySegmentDao.TABLE_NAME)
public class MySegmentEntity extends SegmentEntity {
    private static final SegmentEntity.Creator<MySegmentEntity> CREATOR = new SegmentEntity.Creator<MySegmentEntity>() { // from class: io.split.android.client.storage.db.MySegmentEntity.1
        @Override // io.split.android.client.storage.db.SegmentEntity.Creator
        public MySegmentEntity createEntity(String str, String str2, long j) {
            MySegmentEntity mySegmentEntity = new MySegmentEntity();
            mySegmentEntity.setUserKey(str);
            mySegmentEntity.setSegmentList(str2);
            mySegmentEntity.setUpdatedAt(j);
            return mySegmentEntity;
        }
    };

    public static SegmentEntity.Creator<MySegmentEntity> creator() {
        return CREATOR;
    }
}
