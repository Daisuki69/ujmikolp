package io.split.android.client.storage.db;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface SegmentDao<T> {
    List<T> getAll();

    T getByUserKey(String str);

    void update(T t5);

    void update(String str, String str2, String str3);
}
