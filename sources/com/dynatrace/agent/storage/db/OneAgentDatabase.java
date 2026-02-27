package com.dynatrace.agent.storage.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/* JADX INFO: loaded from: classes2.dex */
@Database(entities = {EventRecord.class}, version = 1)
public abstract class OneAgentDatabase extends RoomDatabase {
    public abstract EventDao eventDao();
}
