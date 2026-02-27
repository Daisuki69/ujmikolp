package com.dynatrace.agent.communication.mapper;

import com.dynatrace.agent.common.Mapper;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface DbRecordsToRequestBodyMapper extends Mapper<List<? extends EventRecord>, String> {
    int getDataVersion();
}
